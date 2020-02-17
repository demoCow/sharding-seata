package com.entity;

import java.io.Serializable;

/**
 * product_spu_description
 * @author 
 */
public class ProductSpuDescription implements Serializable {
    /**
     * 商品spu描述表
     */
    private String spuDesId;

    /**
     * 上
     */
    private String productSkuNum;

    /**
     * 商品所有者id(商铺\供应商)
     */
    private String spuOwnerId;

    private static final long serialVersionUID = 1L;

    public String getSpuDesId() {
        return spuDesId;
    }

    public void setSpuDesId(String spuDesId) {
        this.spuDesId = spuDesId;
    }

    public String getProductSkuNum() {
        return productSkuNum;
    }

    public void setProductSkuNum(String productSkuNum) {
        this.productSkuNum = productSkuNum;
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
        sb.append(", spuDesId=").append(spuDesId);
        sb.append(", productSkuNum=").append(productSkuNum);
        sb.append(", spuOwnerId=").append(spuOwnerId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}