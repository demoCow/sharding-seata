package com.dao;

import com.entity.ProductSkuInventory;

public interface ProductSkuInventoryDao {
    int deleteByPrimaryKey(String skuInventoryId);

    int insert(ProductSkuInventory record);

    int insertSelective(ProductSkuInventory record);

    ProductSkuInventory selectByPrimaryKey(String skuInventoryId);

    int updateByPrimaryKeySelective(ProductSkuInventory record);

    int updateByPrimaryKey(ProductSkuInventory record);

    int inventoryByOrder3(String sku);

    int inventoryByOrder2();

    int inventoryByOrder();

    int inventoryByOrder1();

}