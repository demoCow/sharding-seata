package com.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * product_picture
 * @author 
 */
public class ProductPicture implements Serializable {
    /**
     * 商品图片表
     */
    private String pictureId;

    /**
     * 商品spu流水号
     */
    private Integer productSpuNum;

    /**
     * 商品图片路径
     */
    private String picturePath;

    /**
     * 是否为主图(一般上传第一张图为主图)
     */
    private Short pictureMasterGraph;

    /**
     * 商品图片序号
     */
    private Short pictureOrder;

    /**
     * 商品图片最后修改时间
     */
    private Date pictureModifiedTime;

    /**
     * 商品所有者id(商铺\供应商)
     */
    private String spuOwnerId;

    private static final long serialVersionUID = 1L;

    public String getPictureId() {
        return pictureId;
    }

    public void setPictureId(String pictureId) {
        this.pictureId = pictureId;
    }

    public Integer getProductSpuNum() {
        return productSpuNum;
    }

    public void setProductSpuNum(Integer productSpuNum) {
        this.productSpuNum = productSpuNum;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public Short getPictureMasterGraph() {
        return pictureMasterGraph;
    }

    public void setPictureMasterGraph(Short pictureMasterGraph) {
        this.pictureMasterGraph = pictureMasterGraph;
    }

    public Short getPictureOrder() {
        return pictureOrder;
    }

    public void setPictureOrder(Short pictureOrder) {
        this.pictureOrder = pictureOrder;
    }

    public Date getPictureModifiedTime() {
        return pictureModifiedTime;
    }

    public void setPictureModifiedTime(Date pictureModifiedTime) {
        this.pictureModifiedTime = pictureModifiedTime;
    }

    public String getSpuOwnerId() {
        return spuOwnerId;
    }

    public void setSpuOwnerId(String spuOwnerId) {
        this.spuOwnerId = spuOwnerId;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pictureId=").append(pictureId);
        sb.append(", productSpuNum=").append(productSpuNum);
        sb.append(", picturePath=").append(picturePath);
        sb.append(", pictureMasterGraph=").append(pictureMasterGraph);
        sb.append(", pictureOrder=").append(pictureOrder);
        sb.append(", pictureModifiedTime=").append(pictureModifiedTime);
        sb.append(", spuOwnerId=").append(spuOwnerId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}