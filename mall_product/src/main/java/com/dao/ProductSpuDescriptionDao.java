package com.dao;

import com.entity.ProductSpuDescription;
import com.entity.ProductSpuDescriptionWithBLOBs;

public interface ProductSpuDescriptionDao {
    int deleteByPrimaryKey(String spuDesId);

    int insert(ProductSpuDescriptionWithBLOBs record);

    int insertSelective(ProductSpuDescriptionWithBLOBs record);

    ProductSpuDescriptionWithBLOBs selectByPrimaryKey(String spuDesId);

    int updateByPrimaryKeySelective(ProductSpuDescriptionWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ProductSpuDescriptionWithBLOBs record);

    int updateByPrimaryKey(ProductSpuDescription record);
}