package com.config;

import io.seata.config.ConfigurationFactory;
import io.seata.spring.annotation.GlobalLock;
import io.seata.spring.annotation.GlobalTransactional;
import io.seata.spring.annotation.GlobalTransactionalInterceptor;
import io.seata.spring.annotation.MethodDesc;
import io.seata.spring.tcc.TccActionInterceptor;
import io.seata.spring.util.SpringProxyUtils;
import io.seata.spring.util.TCCBeanParserUtils;
import io.seata.tm.api.DefaultFailureHandlerImpl;
import io.seata.tm.api.FailureHandler;
import org.aopalliance.intercept.MethodInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.Advisor;
import org.springframework.aop.TargetSource;
import org.springframework.aop.framework.AdvisedSupport;
import org.springframework.aop.framework.autoproxy.AbstractAutoProxyCreator;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/**
 * @Auther cuichao
 * @Description: GlobalTransactionScanner
 * 由于sharding-JDBC 对外提供SPI来拓展借口在seata-at包已经实现(SeataATShardingTransactionManager) 对Rm、Tm的初始化
 * 因此需要重写并覆盖这部分的内容取消掉Rm、Tm初始化，交由Sharding自己的SPI事务管理器处理
 * 构造器的applicationId ,txServiceGroup 由于使用SPI starter包的源故已经被 classpath://seata.conf 文件取代在这里属于
 * 理解性字段暂未用到
 * @Date: create in 2020/2/16 14:05
 */
public class GlobalTransactionScanner extends AbstractAutoProxyCreator implements InitializingBean, ApplicationContextAware, DisposableBean {

    private static final long serialVersionUID = 1L;

    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalTransactionScanner.class);

    private static final int AT_MODE = 1;
    private static final int MT_MODE = 2;

    private static final int ORDER_NUM = 1024;
    private static final int DEFAULT_MODE = AT_MODE + MT_MODE;

    private static final Set<String> PROXYED_SET = new HashSet<>();
    private static final FailureHandler DEFAULT_FAIL_HANDLER = new DefaultFailureHandlerImpl();

    private MethodInterceptor interceptor;

    private final String applicationId;
    private final String txServiceGroup;
    private final int mode;
    private final boolean disableGlobalTransaction =
            ConfigurationFactory.getInstance().getBoolean("service.disableGlobalTransaction", false);

    private final FailureHandler failureHandlerHook;

    private ApplicationContext applicationContext;

    public GlobalTransactionScanner(String txServiceGroup) {
        this(txServiceGroup, txServiceGroup, DEFAULT_MODE);
    }


    public GlobalTransactionScanner(String txServiceGroup, int mode) {
        this(txServiceGroup, txServiceGroup, mode);
    }


    public GlobalTransactionScanner(String applicationId, String txServiceGroup) {
        this(applicationId, txServiceGroup, DEFAULT_MODE);
    }


    public GlobalTransactionScanner(String applicationId, String txServiceGroup, int mode) {
        this(applicationId, txServiceGroup, mode, DEFAULT_FAIL_HANDLER);
    }


    public GlobalTransactionScanner(String applicationId, String txServiceGroup, FailureHandler failureHandlerHook) {
        this(applicationId, txServiceGroup, DEFAULT_MODE, failureHandlerHook);
    }


    public GlobalTransactionScanner(String applicationId, String txServiceGroup, int mode,
                                    FailureHandler failureHandlerHook) {
        setOrder(ORDER_NUM);
        setProxyTargetClass(true);
        this.applicationId = applicationId;
        this.txServiceGroup = txServiceGroup;
        this.mode = mode;
        this.failureHandlerHook = failureHandlerHook;
    }

    public void destroy() {
        //原始类注销相关类和RPC连接
    }
    @Override
    protected Object wrapIfNecessary(Object bean, String beanName, Object cacheKey) {
        if (disableGlobalTransaction) {
            return bean;
        }
        try {
            synchronized (PROXYED_SET) {
                if (PROXYED_SET.contains(beanName)) {
                    return bean;
                }
                interceptor = null;
                //check TCC proxy
                if (TCCBeanParserUtils.isTccAutoProxy(bean, beanName, applicationContext)) {
                    //TCC interceptor， proxy bean of sofa:reference/dubbo:reference, and LocalTCC
                    interceptor = new TccActionInterceptor(TCCBeanParserUtils.getRemotingDesc(beanName));
                } else {
                    Class<?> serviceInterface = SpringProxyUtils.findTargetClass(bean);
                    Class<?>[] interfacesIfJdk = SpringProxyUtils.findInterfaces(bean);

                    if (!existsAnnotation(new Class[] {serviceInterface})
                            && !existsAnnotation(interfacesIfJdk)) {
                        return bean;
                    }

                    if (interceptor == null) {
                        interceptor = new GlobalTransactionalInterceptor(failureHandlerHook);
                    }
                }

                LOGGER.info(
                        "Bean[" + bean.getClass().getName() + "] with name [" + beanName + "] would use interceptor ["
                                + interceptor.getClass().getName() + "]");
                if (!AopUtils.isAopProxy(bean)) {
                    bean = super.wrapIfNecessary(bean, beanName, cacheKey);
                } else {
                    AdvisedSupport advised = SpringProxyUtils.getAdvisedSupport(bean);
                    Advisor[] advisor = this.buildAdvisors(beanName, this.getAdvicesAndAdvisorsForBean((Class)null, (String)null, (TargetSource)null));
                    Advisor[] var7 = advisor;
                    int var8 = advisor.length;

                    for(int var9 = 0; var9 < var8; ++var9) {
                        Advisor avr = var7[var9];
                        advised.addAdvisor(0, avr);
                    }
                }
                PROXYED_SET.add(beanName);
                return bean;
            }
        } catch (Exception exx) {
            throw new RuntimeException(exx);
        }
    }


    private boolean existsAnnotation(Class<?>[] classes) {
        if (classes != null && classes.length > 0) {
            for (Class clazz : classes) {
                if (clazz == null) {
                    continue;
                }
                Method[] methods = clazz.getMethods();
                for (Method method : methods) {
                    GlobalTransactional trxAnno = method.getAnnotation(GlobalTransactional.class);
                    if (trxAnno != null) {
                        return true;
                    }

                    GlobalLock lockAnno = method.getAnnotation(GlobalLock.class);
                    if (lockAnno != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    private MethodDesc makeMethodDesc(GlobalTransactional anno, Method method) {
        return new MethodDesc(anno, method);
    }



    @Override
    protected Object[] getAdvicesAndAdvisorsForBean(Class<?> aClass, String s, TargetSource targetSource) throws BeansException {
        return new Object[] {interceptor};
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        if (disableGlobalTransaction) {
            if (LOGGER.isInfoEnabled()) {
                LOGGER.info("Global transaction is disabled.");
            }
            return;
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        this.setBeanFactory(applicationContext);
    }
}
