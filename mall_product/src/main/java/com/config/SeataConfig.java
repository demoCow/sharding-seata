package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SeataConfig {


   /* @Bean
    public ProductSku ProductSku(ShardingDataSource shardingDataSource, SeataATShardingTransactionManager transactionManager){
        Map<String, DataSource> dataSourceMap = shardingDataSource.getDataSourceMap();
        *//*for (String s : dataSourceMap.keySet()) {
            DataSource dataSource = dataSourceMap.get(s);
            System.err.println(dataSource.getClass());
        }
        System.err.println(shardingDataSource == null);*//*


        System.err.println("tradadasdadsada:"+transactionManager == null );

        return null;
    }*/


    @Bean
    public GlobalTransactionScanner globalTransactionScanner(){
        /**
         * 以下参数为是无效参数,具体可以查看该类源码
         */
        return new GlobalTransactionScanner("mall_tx_group");
    }
}
