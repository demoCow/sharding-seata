package com.entity;

import java.io.Serializable;

/**
 * product_comment
 * @author 
 */
public class ProductComment implements Serializable {
    /**
     * 商品评论ID
     */
    private String commentId;

    /**
     * 商品SPUID
     */
    private String productSpuNum;

    /**
     * 订单主单流水号
     */
    private String orderMasterNum;

    /**
     * 订单分单流水号
     */
    private String orderHouseNum;

    /**
     * 用户安全表ID
     */
    private String memberSecurityId;

    /**
     * 是否匿名评论
     */
    private Short commentAnonymous;

    /**
     * 评论得分(0-5)
     */
    private Short commentScore;

    /**
     * 评论状态
     */
    private String commentStatus;

    /**
     * 评论创建/修改时间
     */
    private String commentModifiedTime;

    /**
     * 商品所有者id(商铺\供应商)
     */
    private String spuOwnerId;

    /**
     * 用户评论内容
     */
    private String commentContent;

    private static final long serialVersionUID = 1L;

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getProductSpuNum() {
        return productSpuNum;
    }

    public void setProductSpuNum(String productSpuNum) {
        this.productSpuNum = productSpuNum;
    }

    public String getOrderMasterNum() {
        return orderMasterNum;
    }

    public void setOrderMasterNum(String orderMasterNum) {
        this.orderMasterNum = orderMasterNum;
    }

    public String getOrderHouseNum() {
        return orderHouseNum;
    }

    public void setOrderHouseNum(String orderHouseNum) {
        this.orderHouseNum = orderHouseNum;
    }

    public String getMemberSecurityId() {
        return memberSecurityId;
    }

    public void setMemberSecurityId(String memberSecurityId) {
        this.memberSecurityId = memberSecurityId;
    }

    public Short getCommentAnonymous() {
        return commentAnonymous;
    }

    public void setCommentAnonymous(Short commentAnonymous) {
        this.commentAnonymous = commentAnonymous;
    }

    public Short getCommentScore() {
        return commentScore;
    }

    public void setCommentScore(Short commentScore) {
        this.commentScore = commentScore;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public String getCommentModifiedTime() {
        return commentModifiedTime;
    }

    public void setCommentModifiedTime(String commentModifiedTime) {
        this.commentModifiedTime = commentModifiedTime;
    }

    public String getSpuOwnerId() {
        return spuOwnerId;
    }

    public void setSpuOwnerId(String spuOwnerId) {
        this.spuOwnerId = spuOwnerId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commentId=").append(commentId);
        sb.append(", productSpuNum=").append(productSpuNum);
        sb.append(", orderMasterNum=").append(orderMasterNum);
        sb.append(", orderHouseNum=").append(orderHouseNum);
        sb.append(", memberSecurityId=").append(memberSecurityId);
        sb.append(", commentAnonymous=").append(commentAnonymous);
        sb.append(", commentScore=").append(commentScore);
        sb.append(", commentStatus=").append(commentStatus);
        sb.append(", commentModifiedTime=").append(commentModifiedTime);
        sb.append(", spuOwnerId=").append(spuOwnerId);
        sb.append(", commentContent=").append(commentContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}