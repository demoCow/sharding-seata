/*
 *  Copyright 1999-2019 Seata.io Group.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.config;

import io.seata.config.ConfigurationFactory;
import io.seata.rm.datasource.DataSourceProxy;
import io.seata.spring.annotation.GlobalTransactionScanner;
import io.seata.spring.annotation.datasource.DataSourceProxyHolder;
import io.seata.spring.util.SpringProxyUtils;
import io.seata.tm.api.FailureHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;

import javax.sql.DataSource;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * The type Global transaction scanner.
 *
 * @author jimin.jm @alibaba-inc.com
 * @date 2018 /12/28
 */
public class SpringGlobalTransactionScanner extends GlobalTransactionScanner {

    public SpringGlobalTransactionScanner(String txServiceGroup) {
        super(txServiceGroup, txServiceGroup, 3);
    }

    public SpringGlobalTransactionScanner(String txServiceGroup, int mode) {
        super(txServiceGroup, txServiceGroup, mode);
    }

    public SpringGlobalTransactionScanner(String applicationId, String txServiceGroup) {
        super(applicationId, txServiceGroup, 3);
    }

    public SpringGlobalTransactionScanner(String applicationId, String txServiceGroup, int mode) {
        super(applicationId, txServiceGroup, mode);
    }

    public SpringGlobalTransactionScanner(String applicationId, String txServiceGroup, FailureHandler failureHandlerHook) {
        super(applicationId, txServiceGroup, 3, failureHandlerHook);
    }

    public SpringGlobalTransactionScanner(String applicationId, String txServiceGroup, int mode, FailureHandler failureHandlerHook) {
        super(applicationId,txServiceGroup,mode,failureHandlerHook);
    }


    public void destroy() {

    }

    private void registerSpringShutdownHook() {

    }

    public void afterPropertiesSet() {

    }

    private void initClient() {

    }


    public Object postProcessAfterInitialization(final Object bean, String beanName) throws BeansException {

        if (bean instanceof DataSource && !(bean instanceof DataSourceProxy) && ConfigurationFactory.getInstance().getBoolean("client.support.spring.datasource.autoproxy", false)) {

            final DataSourceProxy dataSourceProxy = DataSourceProxyHolder.get().putDataSource((DataSource)bean);
            Class<?>[] interfaces = SpringProxyUtils.getAllInterfaces(bean);
            return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), interfaces, new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    Method m = BeanUtils.findDeclaredMethod(DataSourceProxy.class, method.getName(), method.getParameterTypes());
                    if (null != m) {
                        System.err.println(dataSourceProxy.getResourceId());
                        return m.invoke(dataSourceProxy, args);
                    } else {
                        boolean oldAccessible = method.isAccessible();

                        Object var6;
                        try {
                            method.setAccessible(true);
                            var6 = method.invoke(bean, args);
                        } finally {
                            method.setAccessible(oldAccessible);
                        }

                        return var6;
                    }
                }
            });
        } else {
            return super.postProcessAfterInitialization(bean, beanName);
        }
    }

}
