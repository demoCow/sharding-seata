package com.entity;

import java.io.Serializable;

/**
 * product_spu_description
 * @author 
 */
public class ProductSpuDescriptionWithBLOBs extends ProductSpuDescription implements Serializable {
    /**
     * 商品网页版图文描述
     */
    private String spuWebDescription;

    /**
     * 商品移动端图文描述
     */
    private String spuMobileDescription;

    private static final long serialVersionUID = 1L;

    public String getSpuWebDescription() {
        return spuWebDescription;
    }

    public void setSpuWebDescription(String spuWebDescription) {
        this.spuWebDescription = spuWebDescription;
    }

    public String getSpuMobileDescription() {
        return spuMobileDescription;
    }

    public void setSpuMobileDescription(String spuMobileDescription) {
        this.spuMobileDescription = spuMobileDescription;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", spuWebDescription=").append(spuWebDescription);
        sb.append(", spuMobileDescription=").append(spuMobileDescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}