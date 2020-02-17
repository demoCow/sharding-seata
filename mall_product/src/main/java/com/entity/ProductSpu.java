package com.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * product_spu
 * @author 
 */
public class ProductSpu implements Serializable {
    /**
     * 商品SPUID
     */
    private String spuId;

    /**
     * 商品SPU流水号
     */
    private String spuNum;

    /**
     * 商品所属分类id
     */
    private String productCategoryId;

    /**
     * 商品所属品牌id
     */
    private String productBrandId;

    /**
     * 商品所有者id(商铺\供应商)
     */
    private String spuOwnerId;

    /**
     * 商品应用的运费模板id
     */
    private String freightTemplateId;

    /**
     * 商品标题
     */
    private String spuTitle;

    /**
     * 商品卖点
     */
    private String spuSlogan;

    /**
     * 商品seo字段 热点词 没有搜索引擎钱可以当模糊查询用
     */
    private String spuKeywords;

    /**
     * 商品一口价(list展示 价格区间最小值 后期有打折工具表可以设大值为市场价)
     */
    private String spuFixedPrice;

    /**
     * 商品总库存(所有sku累加库存)
     */
    private Integer spuGrossInventory;

    /**
     * 商品规格键值对json数组
     */
    private String spuSpecKvs;

    /**
     * 商品条形码
     */
    private String spuBarCode;

    /**
     * 库存计数方式 (下单后减库存 付款后减 )
     */
    private String spuInventoryCount;

    /**
     * 商品评论总数
     */
    private Long spuCommentCount;

    /**
     * 商品状态
     */
    private String spuStatus;

    /**
     * 商品上架方式(立即、定时、入库)
     */
    private String spuPutOnWay;

    /**
     * 商品发布时间(上架时间)
     */
    private Date spuPubTime;

    /**
     * 商品修改时间
     */
    private Date spuModifiedTime;

    /**
     * 商品创建时间
     */
    private Date spuCreateTime;

    /**
     * 商品参数详情json数组
     */
    private String spuParameterDetails;


    private List<ProductSku> skus;



    private static final long serialVersionUID = 1L;

    public String getSpuId() {
        return spuId;
    }

    public void setSpuId(String spuId) {
        this.spuId = spuId;
    }

    public String getSpuNum() {
        return spuNum;
    }

    public void setSpuNum(String spuNum) {
        this.spuNum = spuNum;
    }

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getProductBrandId() {
        return productBrandId;
    }

    public void setProductBrandId(String productBrandId) {
        this.productBrandId = productBrandId;
    }

    public String getSpuOwnerId() {
        return spuOwnerId;
    }

    public void setSpuOwnerId(String spuOwnerId) {
        this.spuOwnerId = spuOwnerId;
    }

    public String getFreightTemplateId() {
        return freightTemplateId;
    }

    public void setFreightTemplateId(String freightTemplateId) {
        this.freightTemplateId = freightTemplateId;
    }

    public String getSpuTitle() {
        return spuTitle;
    }

    public void setSpuTitle(String spuTitle) {
        this.spuTitle = spuTitle;
    }

    public String getSpuSlogan() {
        return spuSlogan;
    }

    public void setSpuSlogan(String spuSlogan) {
        this.spuSlogan = spuSlogan;
    }

    public String getSpuKeywords() {
        return spuKeywords;
    }

    public void setSpuKeywords(String spuKeywords) {
        this.spuKeywords = spuKeywords;
    }

    public String getSpuFixedPrice() {
        return spuFixedPrice;
    }

    public void setSpuFixedPrice(String spuFixedPrice) {
        this.spuFixedPrice = spuFixedPrice;
    }

    public Integer getSpuGrossInventory() {
        return spuGrossInventory;
    }

    public void setSpuGrossInventory(Integer spuGrossInventory) {
        this.spuGrossInventory = spuGrossInventory;
    }

    public String getSpuSpecKvs() {
        return spuSpecKvs;
    }

    public void setSpuSpecKvs(String spuSpecKvs) {
        this.spuSpecKvs = spuSpecKvs;
    }

    public String getSpuBarCode() {
        return spuBarCode;
    }

    public void setSpuBarCode(String spuBarCode) {
        this.spuBarCode = spuBarCode;
    }

    public String getSpuInventoryCount() {
        return spuInventoryCount;
    }

    public void setSpuInventoryCount(String spuInventoryCount) {
        this.spuInventoryCount = spuInventoryCount;
    }

    public Long getSpuCommentCount() {
        return spuCommentCount;
    }

    public void setSpuCommentCount(Long spuCommentCount) {
        this.spuCommentCount = spuCommentCount;
    }

    public String getSpuStatus() {
        return spuStatus;
    }

    public void setSpuStatus(String spuStatus) {
        this.spuStatus = spuStatus;
    }

    public String getSpuPutOnWay() {
        return spuPutOnWay;
    }

    public void setSpuPutOnWay(String spuPutOnWay) {
        this.spuPutOnWay = spuPutOnWay;
    }

    public Date getSpuPubTime() {
        return spuPubTime;
    }

    public void setSpuPubTime(Date spuPubTime) {
        this.spuPubTime = spuPubTime;
    }

    public void setSpuModifiedTime(Date spuModifiedTime) {
        this.spuModifiedTime = spuModifiedTime;
    }


    public Date getSpuModifiedTime() {
        return spuModifiedTime;
    }


    public Date getSpuCreateTime() {
        return spuCreateTime;
    }

    public void setSpuCreateTime(Date spuCreateTime) {
        this.spuCreateTime = spuCreateTime;
    }

    public String getSpuParameterDetails() {
        return spuParameterDetails;
    }

    public void setSpuParameterDetails(String spuParameterDetails) {
        this.spuParameterDetails = spuParameterDetails;
    }

    public List<ProductSku> getSkus() {
        return skus;
    }

    public void setSkus(List<ProductSku> skus) {
        this.skus = skus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", spuId=").append(spuId);
        sb.append(", spuNum=").append(spuNum);
        sb.append(", productCategoryId=").append(productCategoryId);
        sb.append(", productBrandId=").append(productBrandId);
        sb.append(", spuOwnerId=").append(spuOwnerId);
        sb.append(", freightTemplateId=").append(freightTemplateId);
        sb.append(", spuTitle=").append(spuTitle);
        sb.append(", spuSlogan=").append(spuSlogan);
        sb.append(", spuKeywords=").append(spuKeywords);
        sb.append(", spuFixedPrice=").append(spuFixedPrice);
        sb.append(", spuGrossInventory=").append(spuGrossInventory);
        sb.append(", spuSpecKvs=").append(spuSpecKvs);
        sb.append(", spuBarCode=").append(spuBarCode);
        sb.append(", spuInventoryCount=").append(spuInventoryCount);
        sb.append(", spuCommentCount=").append(spuCommentCount);
        sb.append(", spuStatus=").append(spuStatus);
        sb.append(", spuPutOnWay=").append(spuPutOnWay);
        sb.append(", spuPubTime=").append(spuPubTime);
        sb.append(", spuModifiedTime=").append(spuModifiedTime);
        sb.append(", spuCreateTime=").append(spuCreateTime);
        sb.append(", spuParameterDetails=").append(spuParameterDetails);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}