package com.dao;

import com.entity.ProductComment;

public interface ProductCommentDao {
    int deleteByPrimaryKey(String commentId);

    int insert(ProductComment record);

    int insertSelective(ProductComment record);

    ProductComment selectByPrimaryKey(String commentId);

    int updateByPrimaryKeySelective(ProductComment record);

    int updateByPrimaryKeyWithBLOBs(ProductComment record);

    int updateByPrimaryKey(ProductComment record);
}