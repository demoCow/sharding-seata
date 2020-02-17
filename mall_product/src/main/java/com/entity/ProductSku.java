package com.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * product_sku
 * @author 
 */
public class ProductSku implements Serializable {
    /**
     * 商品skuID
     */
    private String skuId;

    /**
     * 商品sku流水号
     */
    private String skuNum;

    /**
     * 商品spu流水号
     */
    private String productSpuNum;

    /**
     * 商品spu规则索引号(0_1_0对应相应的id)
     */
    private String skuSpecIndex;

    /**
     * 商品价格
     */
    private BigDecimal skuPrice;

    /**
     * 商品sku规格键值对数组
     */
    private String skuSpecKvs;

    /**
     * 商品条形码
     */
    private String skuBarCode;

    /**
     * 商品所有者id(商铺\供应商)
     */
    private String spuOwnerId;

    private ProductSkuInventory inventory;


    private static final long serialVersionUID = 1L;

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getSkuNum() {
        return skuNum;
    }

    public void setSkuNum(String skuNum) {
        this.skuNum = skuNum;
    }

    public String getProductSpuNum() {
        return productSpuNum;
    }

    public void setProductSpuNum(String productSpuNum) {
        this.productSpuNum = productSpuNum;
    }

    public String getSkuSpecIndex() {
        return skuSpecIndex;
    }

    public void setSkuSpecIndex(String skuSpecIndex) {
        this.skuSpecIndex = skuSpecIndex;
    }

    public BigDecimal getSkuPrice() {
        return skuPrice;
    }

    public void setSkuPrice(BigDecimal skuPrice) {
        this.skuPrice = skuPrice;
    }

    public String getSkuSpecKvs() {
        return skuSpecKvs;
    }

    public void setSkuSpecKvs(String skuSpecKvs) {
        this.skuSpecKvs = skuSpecKvs;
    }

    public String getSkuBarCode() {
        return skuBarCode;
    }

    public void setSkuBarCode(String skuBarCode) {
        this.skuBarCode = skuBarCode;
    }

    public String getSpuOwnerId() {
        return spuOwnerId;
    }

    public void setSpuOwnerId(String spuOwnerId) {
        this.spuOwnerId = spuOwnerId;
    }

    public ProductSkuInventory getInventory() {
        return inventory;
    }

    public void setInventory(ProductSkuInventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", skuId=").append(skuId);
        sb.append(", skuNum=").append(skuNum);
        sb.append(", productSpuNum=").append(productSpuNum);
        sb.append(", skuSpecIndex=").append(skuSpecIndex);
        sb.append(", skuPrice=").append(skuPrice);
        sb.append(", skuSpecKvs=").append(skuSpecKvs);
        sb.append(", skuBarCode=").append(skuBarCode);
        sb.append(", spuOwnerId=").append(spuOwnerId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}