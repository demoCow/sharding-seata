package com.service;

import com.dao.ProductSkuDao;
import com.dao.ProductSkuInventoryDao;
import com.entity.ProductSku;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.shardingsphere.transaction.annotation.ShardingTransactionType;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Auther cuichao
 * @Description: TestSerice
 * @Date: create in 2020/2/16 16:20
 */
@Service
public class TestService {

    @Autowired
    private ProductSkuInventoryDao inventoryDao;
    @Autowired
    private ProductSkuDao skuDao;


    @GlobalTransactional
    public void inv(){
        //inventoryDao.inventoryByOrder();
        System.err.println(1);
       // inventoryDao.inventoryByOrder3("435924699730411520");
        //inventoryDao.inventoryByOrder3("434823092640940034");
        inventoryDao.inventoryByOrder2();
        System.err.println(1);
        System.err.println(1);
        System.err.println(1);
        System.err.println(1);
        System.err.println(1);

        int i = 1/0;
    }


    @GlobalTransactional(timeoutMills = 600000)
    public void insd(ProductSku sku){
        skuDao.insertSelective(sku);
        System.err.println(1);
        int i = 10/0;
    }
}
