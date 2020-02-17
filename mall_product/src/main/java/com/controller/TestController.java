package com.controller;

import com.dao.ProductSkuDao;
import com.dao.ProductSkuInventoryDao;
import com.dao.ProductSpuDao;
import com.entity.ProductSku;
import com.entity.ProductSkuInventory;
import com.entity.ProductSpu;
import com.service.TestService;
import org.apache.shardingsphere.core.strategy.keygen.SnowflakeShardingKeyGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

/**
 * @Auther cuichao
 * @Description: TestController
 * @Date: create in 2020/2/13 14:57
 */
@RestController("test1")
@RequestMapping("/test")
public class TestController {

    private SnowflakeShardingKeyGenerator SpuGenerator = new SnowflakeShardingKeyGenerator();
    private SnowflakeShardingKeyGenerator SkuGenerator = new SnowflakeShardingKeyGenerator();


    @Autowired
    private ProductSpuDao spuDao;
    @Autowired
    private ProductSkuDao skuDao;
    @Autowired
    private TestService service;
    @Autowired
    private ProductSkuInventoryDao inventoryDao;

    @RequestMapping("insert")
    public void insert(){
        System.err.println("123" instanceof Comparable);

        for(Integer i=0 ; i < 10 ; i++){
            ProductSpu spu = new ProductSpu();
            spu.setSpuId(UUID.randomUUID().toString());
            spu.setSpuTitle("商品_"+i);
            spu.setSpuOwnerId("11");
            spuDao.insertSelectiveWithId(spu);
            System.out.println("----------"+spu.getSpuNum());
        }
    }
    //减库存
    @RequestMapping("/inv")
    public void inv(){
        service.inv();
    }


    @RequestMapping("/in")
    public void in(){
        String spu_num = "123456789";
        String spu_owner_id = "11";
        ProductSku sku = new ProductSku();
        sku.setSkuNum(spu_num);
        sku.setSkuPrice(new BigDecimal("66.88"));
        sku.setProductSpuNum(spu_num);
        sku.setSpuOwnerId(spu_owner_id);
        service.insd(sku);
    }



    @RequestMapping("insertFull")
    public void insertFull(){
        String spu_num = SpuGenerator.generateKey().toString();
        String spu_owner_id = "11";


        ProductSpu spu = new ProductSpu();
        spu.setSpuId(UUID.randomUUID().toString());
        spu.setSpuNum(spu_num);
        spu.setSpuTitle("商品_full");
        spu.setSpuOwnerId(spu_owner_id);

        ProductSku sku1 = new ProductSku();
        sku1.setSkuNum(SkuGenerator.generateKey().toString());
        sku1.setSkuPrice(new BigDecimal("77.88"));
        sku1.setProductSpuNum(spu_num);
        sku1.setSpuOwnerId(spu_owner_id);

        ProductSku sku2 = new ProductSku();
        sku2.setSkuNum(SkuGenerator.generateKey().toString());
        sku2.setSkuPrice(new BigDecimal("66.88"));
        sku2.setProductSpuNum(spu_num);
        sku2.setSpuOwnerId(spu_owner_id);

        spuDao.insertSelective(spu);
        skuDao.insertSelective(sku1);
        skuDao.insertSelective(sku2);


        ProductSkuInventory inventory1 = new ProductSkuInventory();
        inventory1.setProductSpuNum(spu_num);
        inventory1.setProductSkuNum(sku1.getSkuNum());
        inventory1.setSpuOwnerId(spu_owner_id);
        inventory1.setSkuInventoryQuantity(10);
        inventory1.setSkuInventoryModifiedTime(new Date());


        ProductSkuInventory inventory2 = new ProductSkuInventory();
        inventory2.setProductSpuNum(spu_num);
        inventory2.setProductSkuNum(sku2.getSkuNum());
        inventory2.setSpuOwnerId(spu_owner_id);
        inventory2.setSkuInventoryQuantity(10);
        inventory2.setSkuInventoryModifiedTime(new Date());


        inventoryDao.insertSelective(inventory1);
        inventoryDao.insertSelective(inventory2);
    }


    @RequestMapping("/info")
    public ProductSpu getInfo(){
        return spuDao.selectInfoById("434823092636745729");
    }

}
