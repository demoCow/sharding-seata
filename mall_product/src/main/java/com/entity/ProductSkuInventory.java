package com.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * product_sku_inventory
 * @author 
 */
public class ProductSkuInventory implements Serializable {
    /**
     * 商品sku库存表id
     */
    private String skuInventoryId;

    /**
     * 商品spu流水号
     */
    private String productSpuNum;

    /**
     * 商品sku流水号
     */
    private String productSkuNum;

    /**
     * 商品库存数量
     */
    private Integer skuInventoryQuantity;

    /**
     * 商品库存修改时间
     */
    private Date skuInventoryModifiedTime;

    /**
     * 商品所有者id(商铺\供应商)
     */
    private String spuOwnerId;

    private static final long serialVersionUID = 1L;

    public String getSkuInventoryId() {
        return skuInventoryId;
    }

    public void setSkuInventoryId(String skuInventoryId) {
        this.skuInventoryId = skuInventoryId;
    }

    public String getProductSpuNum() {
        return productSpuNum;
    }

    public void setProductSpuNum(String productSpuNum) {
        this.productSpuNum = productSpuNum;
    }

    public String getProductSkuNum() {
        return productSkuNum;
    }

    public void setProductSkuNum(String productSkuNum) {
        this.productSkuNum = productSkuNum;
    }

    public Integer getSkuInventoryQuantity() {
        return skuInventoryQuantity;
    }

    public void setSkuInventoryQuantity(Integer skuInventoryQuantity) {
        this.skuInventoryQuantity = skuInventoryQuantity;
    }

    public Date getSkuInventoryModifiedTime() {
        return skuInventoryModifiedTime;
    }

    public void setSkuInventoryModifiedTime(Date skuInventoryModifiedTime) {
        this.skuInventoryModifiedTime = skuInventoryModifiedTime;
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
        sb.append(", skuInventoryId=").append(skuInventoryId);
        sb.append(", productSpuNum=").append(productSpuNum);
        sb.append(", productSkuNum=").append(productSkuNum);
        sb.append(", skuInventoryQuantity=").append(skuInventoryQuantity);
        sb.append(", skuInventoryModifiedTime=").append(skuInventoryModifiedTime);
        sb.append(", spuOwnerId=").append(spuOwnerId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}