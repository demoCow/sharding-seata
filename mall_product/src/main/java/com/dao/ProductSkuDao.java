package com.dao;

import com.entity.ProductSku;

public interface ProductSkuDao {
    int deleteByPrimaryKey(String skuId);

    int insert(ProductSku record);

    int insertSelective(ProductSku record);

    ProductSku selectByPrimaryKey(String skuId);

    int updateByPrimaryKeySelective(ProductSku record);

    int updateByPrimaryKey(ProductSku record);
}