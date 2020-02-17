package com;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther cuichao
 * @Description: ProductApplication
 * @Date: create in 2020/2/11 20:19
 */
@EnableFeignClients
@EnableEurekaClient
@MapperScan(basePackages = "com.dao")
@SpringBootApplication(exclude = {MybatisAutoConfiguration.class })
public class ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }
}
