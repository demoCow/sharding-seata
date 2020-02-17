package com.dao;

import com.entity.ProductPicture;

public interface ProductPictureDao {
    int deleteByPrimaryKey(String pictureId);

    int insert(ProductPicture record);

    int insertSelective(ProductPicture record);

    ProductPicture selectByPrimaryKey(String pictureId);

    int updateByPrimaryKeySelective(ProductPicture record);

    int updateByPrimaryKey(ProductPicture record);
}