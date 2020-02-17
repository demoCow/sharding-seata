package com.dao;

import com.entity.ProductSpu;

public interface ProductSpuDao {
    int deleteByPrimaryKey(String spuId);

    int insert(ProductSpu record);

    int insertSelective(ProductSpu record);

    int insertSelectiveWithId(ProductSpu record);

    ProductSpu selectByPrimaryKey(String spuId);

    ProductSpu selectInfoById(String spu);

    int updateByPrimaryKeySelective(ProductSpu record);

    int updateByPrimaryKeyWithBLOBs(ProductSpu record);

    int updateByPrimaryKey(ProductSpu record);
}