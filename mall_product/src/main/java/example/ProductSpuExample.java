package example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductSpuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductSpuExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSpuIdIsNull() {
            addCriterion("spu_id is null");
            return (Criteria) this;
        }

        public Criteria andSpuIdIsNotNull() {
            addCriterion("spu_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpuIdEqualTo(String value) {
            addCriterion("spu_id =", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdNotEqualTo(String value) {
            addCriterion("spu_id <>", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdGreaterThan(String value) {
            addCriterion("spu_id >", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdGreaterThanOrEqualTo(String value) {
            addCriterion("spu_id >=", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdLessThan(String value) {
            addCriterion("spu_id <", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdLessThanOrEqualTo(String value) {
            addCriterion("spu_id <=", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdLike(String value) {
            addCriterion("spu_id like", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdNotLike(String value) {
            addCriterion("spu_id not like", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdIn(List<String> values) {
            addCriterion("spu_id in", values, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdNotIn(List<String> values) {
            addCriterion("spu_id not in", values, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdBetween(String value1, String value2) {
            addCriterion("spu_id between", value1, value2, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdNotBetween(String value1, String value2) {
            addCriterion("spu_id not between", value1, value2, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuNumIsNull() {
            addCriterion("spu_num is null");
            return (Criteria) this;
        }

        public Criteria andSpuNumIsNotNull() {
            addCriterion("spu_num is not null");
            return (Criteria) this;
        }

        public Criteria andSpuNumEqualTo(String value) {
            addCriterion("spu_num =", value, "spuNum");
            return (Criteria) this;
        }

        public Criteria andSpuNumNotEqualTo(String value) {
            addCriterion("spu_num <>", value, "spuNum");
            return (Criteria) this;
        }

        public Criteria andSpuNumGreaterThan(String value) {
            addCriterion("spu_num >", value, "spuNum");
            return (Criteria) this;
        }

        public Criteria andSpuNumGreaterThanOrEqualTo(String value) {
            addCriterion("spu_num >=", value, "spuNum");
            return (Criteria) this;
        }

        public Criteria andSpuNumLessThan(String value) {
            addCriterion("spu_num <", value, "spuNum");
            return (Criteria) this;
        }

        public Criteria andSpuNumLessThanOrEqualTo(String value) {
            addCriterion("spu_num <=", value, "spuNum");
            return (Criteria) this;
        }

        public Criteria andSpuNumLike(String value) {
            addCriterion("spu_num like", value, "spuNum");
            return (Criteria) this;
        }

        public Criteria andSpuNumNotLike(String value) {
            addCriterion("spu_num not like", value, "spuNum");
            return (Criteria) this;
        }

        public Criteria andSpuNumIn(List<String> values) {
            addCriterion("spu_num in", values, "spuNum");
            return (Criteria) this;
        }

        public Criteria andSpuNumNotIn(List<String> values) {
            addCriterion("spu_num not in", values, "spuNum");
            return (Criteria) this;
        }

        public Criteria andSpuNumBetween(String value1, String value2) {
            addCriterion("spu_num between", value1, value2, "spuNum");
            return (Criteria) this;
        }

        public Criteria andSpuNumNotBetween(String value1, String value2) {
            addCriterion("spu_num not between", value1, value2, "spuNum");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdIsNull() {
            addCriterion("product_category_id is null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdIsNotNull() {
            addCriterion("product_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdEqualTo(String value) {
            addCriterion("product_category_id =", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotEqualTo(String value) {
            addCriterion("product_category_id <>", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdGreaterThan(String value) {
            addCriterion("product_category_id >", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_category_id >=", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdLessThan(String value) {
            addCriterion("product_category_id <", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("product_category_id <=", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdLike(String value) {
            addCriterion("product_category_id like", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotLike(String value) {
            addCriterion("product_category_id not like", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdIn(List<String> values) {
            addCriterion("product_category_id in", values, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotIn(List<String> values) {
            addCriterion("product_category_id not in", values, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdBetween(String value1, String value2) {
            addCriterion("product_category_id between", value1, value2, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotBetween(String value1, String value2) {
            addCriterion("product_category_id not between", value1, value2, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdIsNull() {
            addCriterion("product_brand_id is null");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdIsNotNull() {
            addCriterion("product_brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdEqualTo(String value) {
            addCriterion("product_brand_id =", value, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdNotEqualTo(String value) {
            addCriterion("product_brand_id <>", value, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdGreaterThan(String value) {
            addCriterion("product_brand_id >", value, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_brand_id >=", value, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdLessThan(String value) {
            addCriterion("product_brand_id <", value, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdLessThanOrEqualTo(String value) {
            addCriterion("product_brand_id <=", value, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdLike(String value) {
            addCriterion("product_brand_id like", value, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdNotLike(String value) {
            addCriterion("product_brand_id not like", value, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdIn(List<String> values) {
            addCriterion("product_brand_id in", values, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdNotIn(List<String> values) {
            addCriterion("product_brand_id not in", values, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdBetween(String value1, String value2) {
            addCriterion("product_brand_id between", value1, value2, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdNotBetween(String value1, String value2) {
            addCriterion("product_brand_id not between", value1, value2, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdIsNull() {
            addCriterion("freight_template_id is null");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdIsNotNull() {
            addCriterion("freight_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdEqualTo(String value) {
            addCriterion("freight_template_id =", value, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdNotEqualTo(String value) {
            addCriterion("freight_template_id <>", value, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdGreaterThan(String value) {
            addCriterion("freight_template_id >", value, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdGreaterThanOrEqualTo(String value) {
            addCriterion("freight_template_id >=", value, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdLessThan(String value) {
            addCriterion("freight_template_id <", value, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdLessThanOrEqualTo(String value) {
            addCriterion("freight_template_id <=", value, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdLike(String value) {
            addCriterion("freight_template_id like", value, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdNotLike(String value) {
            addCriterion("freight_template_id not like", value, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdIn(List<String> values) {
            addCriterion("freight_template_id in", values, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdNotIn(List<String> values) {
            addCriterion("freight_template_id not in", values, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdBetween(String value1, String value2) {
            addCriterion("freight_template_id between", value1, value2, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andFreightTemplateIdNotBetween(String value1, String value2) {
            addCriterion("freight_template_id not between", value1, value2, "freightTemplateId");
            return (Criteria) this;
        }

        public Criteria andSpuTitleIsNull() {
            addCriterion("spu_title is null");
            return (Criteria) this;
        }

        public Criteria andSpuTitleIsNotNull() {
            addCriterion("spu_title is not null");
            return (Criteria) this;
        }

        public Criteria andSpuTitleEqualTo(String value) {
            addCriterion("spu_title =", value, "spuTitle");
            return (Criteria) this;
        }

        public Criteria andSpuTitleNotEqualTo(String value) {
            addCriterion("spu_title <>", value, "spuTitle");
            return (Criteria) this;
        }

        public Criteria andSpuTitleGreaterThan(String value) {
            addCriterion("spu_title >", value, "spuTitle");
            return (Criteria) this;
        }

        public Criteria andSpuTitleGreaterThanOrEqualTo(String value) {
            addCriterion("spu_title >=", value, "spuTitle");
            return (Criteria) this;
        }

        public Criteria andSpuTitleLessThan(String value) {
            addCriterion("spu_title <", value, "spuTitle");
            return (Criteria) this;
        }

        public Criteria andSpuTitleLessThanOrEqualTo(String value) {
            addCriterion("spu_title <=", value, "spuTitle");
            return (Criteria) this;
        }

        public Criteria andSpuTitleLike(String value) {
            addCriterion("spu_title like", value, "spuTitle");
            return (Criteria) this;
        }

        public Criteria andSpuTitleNotLike(String value) {
            addCriterion("spu_title not like", value, "spuTitle");
            return (Criteria) this;
        }

        public Criteria andSpuTitleIn(List<String> values) {
            addCriterion("spu_title in", values, "spuTitle");
            return (Criteria) this;
        }

        public Criteria andSpuTitleNotIn(List<String> values) {
            addCriterion("spu_title not in", values, "spuTitle");
            return (Criteria) this;
        }

        public Criteria andSpuTitleBetween(String value1, String value2) {
            addCriterion("spu_title between", value1, value2, "spuTitle");
            return (Criteria) this;
        }

        public Criteria andSpuTitleNotBetween(String value1, String value2) {
            addCriterion("spu_title not between", value1, value2, "spuTitle");
            return (Criteria) this;
        }

        public Criteria andSpuSloganIsNull() {
            addCriterion("spu_slogan is null");
            return (Criteria) this;
        }

        public Criteria andSpuSloganIsNotNull() {
            addCriterion("spu_slogan is not null");
            return (Criteria) this;
        }

        public Criteria andSpuSloganEqualTo(String value) {
            addCriterion("spu_slogan =", value, "spuSlogan");
            return (Criteria) this;
        }

        public Criteria andSpuSloganNotEqualTo(String value) {
            addCriterion("spu_slogan <>", value, "spuSlogan");
            return (Criteria) this;
        }

        public Criteria andSpuSloganGreaterThan(String value) {
            addCriterion("spu_slogan >", value, "spuSlogan");
            return (Criteria) this;
        }

        public Criteria andSpuSloganGreaterThanOrEqualTo(String value) {
            addCriterion("spu_slogan >=", value, "spuSlogan");
            return (Criteria) this;
        }

        public Criteria andSpuSloganLessThan(String value) {
            addCriterion("spu_slogan <", value, "spuSlogan");
            return (Criteria) this;
        }

        public Criteria andSpuSloganLessThanOrEqualTo(String value) {
            addCriterion("spu_slogan <=", value, "spuSlogan");
            return (Criteria) this;
        }

        public Criteria andSpuSloganLike(String value) {
            addCriterion("spu_slogan like", value, "spuSlogan");
            return (Criteria) this;
        }

        public Criteria andSpuSloganNotLike(String value) {
            addCriterion("spu_slogan not like", value, "spuSlogan");
            return (Criteria) this;
        }

        public Criteria andSpuSloganIn(List<String> values) {
            addCriterion("spu_slogan in", values, "spuSlogan");
            return (Criteria) this;
        }

        public Criteria andSpuSloganNotIn(List<String> values) {
            addCriterion("spu_slogan not in", values, "spuSlogan");
            return (Criteria) this;
        }

        public Criteria andSpuSloganBetween(String value1, String value2) {
            addCriterion("spu_slogan between", value1, value2, "spuSlogan");
            return (Criteria) this;
        }

        public Criteria andSpuSloganNotBetween(String value1, String value2) {
            addCriterion("spu_slogan not between", value1, value2, "spuSlogan");
            return (Criteria) this;
        }

        public Criteria andSpuKeywordsIsNull() {
            addCriterion("spu_keywords is null");
            return (Criteria) this;
        }

        public Criteria andSpuKeywordsIsNotNull() {
            addCriterion("spu_keywords is not null");
            return (Criteria) this;
        }

        public Criteria andSpuKeywordsEqualTo(String value) {
            addCriterion("spu_keywords =", value, "spuKeywords");
            return (Criteria) this;
        }

        public Criteria andSpuKeywordsNotEqualTo(String value) {
            addCriterion("spu_keywords <>", value, "spuKeywords");
            return (Criteria) this;
        }

        public Criteria andSpuKeywordsGreaterThan(String value) {
            addCriterion("spu_keywords >", value, "spuKeywords");
            return (Criteria) this;
        }

        public Criteria andSpuKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("spu_keywords >=", value, "spuKeywords");
            return (Criteria) this;
        }

        public Criteria andSpuKeywordsLessThan(String value) {
            addCriterion("spu_keywords <", value, "spuKeywords");
            return (Criteria) this;
        }

        public Criteria andSpuKeywordsLessThanOrEqualTo(String value) {
            addCriterion("spu_keywords <=", value, "spuKeywords");
            return (Criteria) this;
        }

        public Criteria andSpuKeywordsLike(String value) {
            addCriterion("spu_keywords like", value, "spuKeywords");
            return (Criteria) this;
        }

        public Criteria andSpuKeywordsNotLike(String value) {
            addCriterion("spu_keywords not like", value, "spuKeywords");
            return (Criteria) this;
        }

        public Criteria andSpuKeywordsIn(List<String> values) {
            addCriterion("spu_keywords in", values, "spuKeywords");
            return (Criteria) this;
        }

        public Criteria andSpuKeywordsNotIn(List<String> values) {
            addCriterion("spu_keywords not in", values, "spuKeywords");
            return (Criteria) this;
        }

        public Criteria andSpuKeywordsBetween(String value1, String value2) {
            addCriterion("spu_keywords between", value1, value2, "spuKeywords");
            return (Criteria) this;
        }

        public Criteria andSpuKeywordsNotBetween(String value1, String value2) {
            addCriterion("spu_keywords not between", value1, value2, "spuKeywords");
            return (Criteria) this;
        }

        public Criteria andSpuFixedPriceIsNull() {
            addCriterion("spu_fixed_price is null");
            return (Criteria) this;
        }

        public Criteria andSpuFixedPriceIsNotNull() {
            addCriterion("spu_fixed_price is not null");
            return (Criteria) this;
        }

        public Criteria andSpuFixedPriceEqualTo(String value) {
            addCriterion("spu_fixed_price =", value, "spuFixedPrice");
            return (Criteria) this;
        }

        public Criteria andSpuFixedPriceNotEqualTo(String value) {
            addCriterion("spu_fixed_price <>", value, "spuFixedPrice");
            return (Criteria) this;
        }

        public Criteria andSpuFixedPriceGreaterThan(String value) {
            addCriterion("spu_fixed_price >", value, "spuFixedPrice");
            return (Criteria) this;
        }

        public Criteria andSpuFixedPriceGreaterThanOrEqualTo(String value) {
            addCriterion("spu_fixed_price >=", value, "spuFixedPrice");
            return (Criteria) this;
        }

        public Criteria andSpuFixedPriceLessThan(String value) {
            addCriterion("spu_fixed_price <", value, "spuFixedPrice");
            return (Criteria) this;
        }

        public Criteria andSpuFixedPriceLessThanOrEqualTo(String value) {
            addCriterion("spu_fixed_price <=", value, "spuFixedPrice");
            return (Criteria) this;
        }

        public Criteria andSpuFixedPriceLike(String value) {
            addCriterion("spu_fixed_price like", value, "spuFixedPrice");
            return (Criteria) this;
        }

        public Criteria andSpuFixedPriceNotLike(String value) {
            addCriterion("spu_fixed_price not like", value, "spuFixedPrice");
            return (Criteria) this;
        }

        public Criteria andSpuFixedPriceIn(List<String> values) {
            addCriterion("spu_fixed_price in", values, "spuFixedPrice");
            return (Criteria) this;
        }

        public Criteria andSpuFixedPriceNotIn(List<String> values) {
            addCriterion("spu_fixed_price not in", values, "spuFixedPrice");
            return (Criteria) this;
        }

        public Criteria andSpuFixedPriceBetween(String value1, String value2) {
            addCriterion("spu_fixed_price between", value1, value2, "spuFixedPrice");
            return (Criteria) this;
        }

        public Criteria andSpuFixedPriceNotBetween(String value1, String value2) {
            addCriterion("spu_fixed_price not between", value1, value2, "spuFixedPrice");
            return (Criteria) this;
        }

        public Criteria andSpuGrossInventoryIsNull() {
            addCriterion("spu_gross_inventory is null");
            return (Criteria) this;
        }

        public Criteria andSpuGrossInventoryIsNotNull() {
            addCriterion("spu_gross_inventory is not null");
            return (Criteria) this;
        }

        public Criteria andSpuGrossInventoryEqualTo(Integer value) {
            addCriterion("spu_gross_inventory =", value, "spuGrossInventory");
            return (Criteria) this;
        }

        public Criteria andSpuGrossInventoryNotEqualTo(Integer value) {
            addCriterion("spu_gross_inventory <>", value, "spuGrossInventory");
            return (Criteria) this;
        }

        public Criteria andSpuGrossInventoryGreaterThan(Integer value) {
            addCriterion("spu_gross_inventory >", value, "spuGrossInventory");
            return (Criteria) this;
        }

        public Criteria andSpuGrossInventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("spu_gross_inventory >=", value, "spuGrossInventory");
            return (Criteria) this;
        }

        public Criteria andSpuGrossInventoryLessThan(Integer value) {
            addCriterion("spu_gross_inventory <", value, "spuGrossInventory");
            return (Criteria) this;
        }

        public Criteria andSpuGrossInventoryLessThanOrEqualTo(Integer value) {
            addCriterion("spu_gross_inventory <=", value, "spuGrossInventory");
            return (Criteria) this;
        }

        public Criteria andSpuGrossInventoryIn(List<Integer> values) {
            addCriterion("spu_gross_inventory in", values, "spuGrossInventory");
            return (Criteria) this;
        }

        public Criteria andSpuGrossInventoryNotIn(List<Integer> values) {
            addCriterion("spu_gross_inventory not in", values, "spuGrossInventory");
            return (Criteria) this;
        }

        public Criteria andSpuGrossInventoryBetween(Integer value1, Integer value2) {
            addCriterion("spu_gross_inventory between", value1, value2, "spuGrossInventory");
            return (Criteria) this;
        }

        public Criteria andSpuGrossInventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("spu_gross_inventory not between", value1, value2, "spuGrossInventory");
            return (Criteria) this;
        }

        public Criteria andSpuSpecKvsIsNull() {
            addCriterion("spu_spec_kvs is null");
            return (Criteria) this;
        }

        public Criteria andSpuSpecKvsIsNotNull() {
            addCriterion("spu_spec_kvs is not null");
            return (Criteria) this;
        }

        public Criteria andSpuSpecKvsEqualTo(String value) {
            addCriterion("spu_spec_kvs =", value, "spuSpecKvs");
            return (Criteria) this;
        }

        public Criteria andSpuSpecKvsNotEqualTo(String value) {
            addCriterion("spu_spec_kvs <>", value, "spuSpecKvs");
            return (Criteria) this;
        }

        public Criteria andSpuSpecKvsGreaterThan(String value) {
            addCriterion("spu_spec_kvs >", value, "spuSpecKvs");
            return (Criteria) this;
        }

        public Criteria andSpuSpecKvsGreaterThanOrEqualTo(String value) {
            addCriterion("spu_spec_kvs >=", value, "spuSpecKvs");
            return (Criteria) this;
        }

        public Criteria andSpuSpecKvsLessThan(String value) {
            addCriterion("spu_spec_kvs <", value, "spuSpecKvs");
            return (Criteria) this;
        }

        public Criteria andSpuSpecKvsLessThanOrEqualTo(String value) {
            addCriterion("spu_spec_kvs <=", value, "spuSpecKvs");
            return (Criteria) this;
        }

        public Criteria andSpuSpecKvsLike(String value) {
            addCriterion("spu_spec_kvs like", value, "spuSpecKvs");
            return (Criteria) this;
        }

        public Criteria andSpuSpecKvsNotLike(String value) {
            addCriterion("spu_spec_kvs not like", value, "spuSpecKvs");
            return (Criteria) this;
        }

        public Criteria andSpuSpecKvsIn(List<String> values) {
            addCriterion("spu_spec_kvs in", values, "spuSpecKvs");
            return (Criteria) this;
        }

        public Criteria andSpuSpecKvsNotIn(List<String> values) {
            addCriterion("spu_spec_kvs not in", values, "spuSpecKvs");
            return (Criteria) this;
        }

        public Criteria andSpuSpecKvsBetween(String value1, String value2) {
            addCriterion("spu_spec_kvs between", value1, value2, "spuSpecKvs");
            return (Criteria) this;
        }

        public Criteria andSpuSpecKvsNotBetween(String value1, String value2) {
            addCriterion("spu_spec_kvs not between", value1, value2, "spuSpecKvs");
            return (Criteria) this;
        }

        public Criteria andSpuBarCodeIsNull() {
            addCriterion("spu_bar_code is null");
            return (Criteria) this;
        }

        public Criteria andSpuBarCodeIsNotNull() {
            addCriterion("spu_bar_code is not null");
            return (Criteria) this;
        }

        public Criteria andSpuBarCodeEqualTo(String value) {
            addCriterion("spu_bar_code =", value, "spuBarCode");
            return (Criteria) this;
        }

        public Criteria andSpuBarCodeNotEqualTo(String value) {
            addCriterion("spu_bar_code <>", value, "spuBarCode");
            return (Criteria) this;
        }

        public Criteria andSpuBarCodeGreaterThan(String value) {
            addCriterion("spu_bar_code >", value, "spuBarCode");
            return (Criteria) this;
        }

        public Criteria andSpuBarCodeGreaterThanOrEqualTo(String value) {
            addCriterion("spu_bar_code >=", value, "spuBarCode");
            return (Criteria) this;
        }

        public Criteria andSpuBarCodeLessThan(String value) {
            addCriterion("spu_bar_code <", value, "spuBarCode");
            return (Criteria) this;
        }

        public Criteria andSpuBarCodeLessThanOrEqualTo(String value) {
            addCriterion("spu_bar_code <=", value, "spuBarCode");
            return (Criteria) this;
        }

        public Criteria andSpuBarCodeLike(String value) {
            addCriterion("spu_bar_code like", value, "spuBarCode");
            return (Criteria) this;
        }

        public Criteria andSpuBarCodeNotLike(String value) {
            addCriterion("spu_bar_code not like", value, "spuBarCode");
            return (Criteria) this;
        }

        public Criteria andSpuBarCodeIn(List<String> values) {
            addCriterion("spu_bar_code in", values, "spuBarCode");
            return (Criteria) this;
        }

        public Criteria andSpuBarCodeNotIn(List<String> values) {
            addCriterion("spu_bar_code not in", values, "spuBarCode");
            return (Criteria) this;
        }

        public Criteria andSpuBarCodeBetween(String value1, String value2) {
            addCriterion("spu_bar_code between", value1, value2, "spuBarCode");
            return (Criteria) this;
        }

        public Criteria andSpuBarCodeNotBetween(String value1, String value2) {
            addCriterion("spu_bar_code not between", value1, value2, "spuBarCode");
            return (Criteria) this;
        }

        public Criteria andSpuInventoryCountIsNull() {
            addCriterion("spu_Inventory_count is null");
            return (Criteria) this;
        }

        public Criteria andSpuInventoryCountIsNotNull() {
            addCriterion("spu_Inventory_count is not null");
            return (Criteria) this;
        }

        public Criteria andSpuInventoryCountEqualTo(String value) {
            addCriterion("spu_Inventory_count =", value, "spuInventoryCount");
            return (Criteria) this;
        }

        public Criteria andSpuInventoryCountNotEqualTo(String value) {
            addCriterion("spu_Inventory_count <>", value, "spuInventoryCount");
            return (Criteria) this;
        }

        public Criteria andSpuInventoryCountGreaterThan(String value) {
            addCriterion("spu_Inventory_count >", value, "spuInventoryCount");
            return (Criteria) this;
        }

        public Criteria andSpuInventoryCountGreaterThanOrEqualTo(String value) {
            addCriterion("spu_Inventory_count >=", value, "spuInventoryCount");
            return (Criteria) this;
        }

        public Criteria andSpuInventoryCountLessThan(String value) {
            addCriterion("spu_Inventory_count <", value, "spuInventoryCount");
            return (Criteria) this;
        }

        public Criteria andSpuInventoryCountLessThanOrEqualTo(String value) {
            addCriterion("spu_Inventory_count <=", value, "spuInventoryCount");
            return (Criteria) this;
        }

        public Criteria andSpuInventoryCountLike(String value) {
            addCriterion("spu_Inventory_count like", value, "spuInventoryCount");
            return (Criteria) this;
        }

        public Criteria andSpuInventoryCountNotLike(String value) {
            addCriterion("spu_Inventory_count not like", value, "spuInventoryCount");
            return (Criteria) this;
        }

        public Criteria andSpuInventoryCountIn(List<String> values) {
            addCriterion("spu_Inventory_count in", values, "spuInventoryCount");
            return (Criteria) this;
        }

        public Criteria andSpuInventoryCountNotIn(List<String> values) {
            addCriterion("spu_Inventory_count not in", values, "spuInventoryCount");
            return (Criteria) this;
        }

        public Criteria andSpuInventoryCountBetween(String value1, String value2) {
            addCriterion("spu_Inventory_count between", value1, value2, "spuInventoryCount");
            return (Criteria) this;
        }

        public Criteria andSpuInventoryCountNotBetween(String value1, String value2) {
            addCriterion("spu_Inventory_count not between", value1, value2, "spuInventoryCount");
            return (Criteria) this;
        }

        public Criteria andSpuCommentCountIsNull() {
            addCriterion("spu_comment_count is null");
            return (Criteria) this;
        }

        public Criteria andSpuCommentCountIsNotNull() {
            addCriterion("spu_comment_count is not null");
            return (Criteria) this;
        }

        public Criteria andSpuCommentCountEqualTo(Long value) {
            addCriterion("spu_comment_count =", value, "spuCommentCount");
            return (Criteria) this;
        }

        public Criteria andSpuCommentCountNotEqualTo(Long value) {
            addCriterion("spu_comment_count <>", value, "spuCommentCount");
            return (Criteria) this;
        }

        public Criteria andSpuCommentCountGreaterThan(Long value) {
            addCriterion("spu_comment_count >", value, "spuCommentCount");
            return (Criteria) this;
        }

        public Criteria andSpuCommentCountGreaterThanOrEqualTo(Long value) {
            addCriterion("spu_comment_count >=", value, "spuCommentCount");
            return (Criteria) this;
        }

        public Criteria andSpuCommentCountLessThan(Long value) {
            addCriterion("spu_comment_count <", value, "spuCommentCount");
            return (Criteria) this;
        }

        public Criteria andSpuCommentCountLessThanOrEqualTo(Long value) {
            addCriterion("spu_comment_count <=", value, "spuCommentCount");
            return (Criteria) this;
        }

        public Criteria andSpuCommentCountIn(List<Long> values) {
            addCriterion("spu_comment_count in", values, "spuCommentCount");
            return (Criteria) this;
        }

        public Criteria andSpuCommentCountNotIn(List<Long> values) {
            addCriterion("spu_comment_count not in", values, "spuCommentCount");
            return (Criteria) this;
        }

        public Criteria andSpuCommentCountBetween(Long value1, Long value2) {
            addCriterion("spu_comment_count between", value1, value2, "spuCommentCount");
            return (Criteria) this;
        }

        public Criteria andSpuCommentCountNotBetween(Long value1, Long value2) {
            addCriterion("spu_comment_count not between", value1, value2, "spuCommentCount");
            return (Criteria) this;
        }

        public Criteria andSpuStatusIsNull() {
            addCriterion("spu_status is null");
            return (Criteria) this;
        }

        public Criteria andSpuStatusIsNotNull() {
            addCriterion("spu_status is not null");
            return (Criteria) this;
        }

        public Criteria andSpuStatusEqualTo(String value) {
            addCriterion("spu_status =", value, "spuStatus");
            return (Criteria) this;
        }

        public Criteria andSpuStatusNotEqualTo(String value) {
            addCriterion("spu_status <>", value, "spuStatus");
            return (Criteria) this;
        }

        public Criteria andSpuStatusGreaterThan(String value) {
            addCriterion("spu_status >", value, "spuStatus");
            return (Criteria) this;
        }

        public Criteria andSpuStatusGreaterThanOrEqualTo(String value) {
            addCriterion("spu_status >=", value, "spuStatus");
            return (Criteria) this;
        }

        public Criteria andSpuStatusLessThan(String value) {
            addCriterion("spu_status <", value, "spuStatus");
            return (Criteria) this;
        }

        public Criteria andSpuStatusLessThanOrEqualTo(String value) {
            addCriterion("spu_status <=", value, "spuStatus");
            return (Criteria) this;
        }

        public Criteria andSpuStatusLike(String value) {
            addCriterion("spu_status like", value, "spuStatus");
            return (Criteria) this;
        }

        public Criteria andSpuStatusNotLike(String value) {
            addCriterion("spu_status not like", value, "spuStatus");
            return (Criteria) this;
        }

        public Criteria andSpuStatusIn(List<String> values) {
            addCriterion("spu_status in", values, "spuStatus");
            return (Criteria) this;
        }

        public Criteria andSpuStatusNotIn(List<String> values) {
            addCriterion("spu_status not in", values, "spuStatus");
            return (Criteria) this;
        }

        public Criteria andSpuStatusBetween(String value1, String value2) {
            addCriterion("spu_status between", value1, value2, "spuStatus");
            return (Criteria) this;
        }

        public Criteria andSpuStatusNotBetween(String value1, String value2) {
            addCriterion("spu_status not between", value1, value2, "spuStatus");
            return (Criteria) this;
        }

        public Criteria andSpuPutOnWayIsNull() {
            addCriterion("spu_put_on_way is null");
            return (Criteria) this;
        }

        public Criteria andSpuPutOnWayIsNotNull() {
            addCriterion("spu_put_on_way is not null");
            return (Criteria) this;
        }

        public Criteria andSpuPutOnWayEqualTo(String value) {
            addCriterion("spu_put_on_way =", value, "spuPutOnWay");
            return (Criteria) this;
        }

        public Criteria andSpuPutOnWayNotEqualTo(String value) {
            addCriterion("spu_put_on_way <>", value, "spuPutOnWay");
            return (Criteria) this;
        }

        public Criteria andSpuPutOnWayGreaterThan(String value) {
            addCriterion("spu_put_on_way >", value, "spuPutOnWay");
            return (Criteria) this;
        }

        public Criteria andSpuPutOnWayGreaterThanOrEqualTo(String value) {
            addCriterion("spu_put_on_way >=", value, "spuPutOnWay");
            return (Criteria) this;
        }

        public Criteria andSpuPutOnWayLessThan(String value) {
            addCriterion("spu_put_on_way <", value, "spuPutOnWay");
            return (Criteria) this;
        }

        public Criteria andSpuPutOnWayLessThanOrEqualTo(String value) {
            addCriterion("spu_put_on_way <=", value, "spuPutOnWay");
            return (Criteria) this;
        }

        public Criteria andSpuPutOnWayLike(String value) {
            addCriterion("spu_put_on_way like", value, "spuPutOnWay");
            return (Criteria) this;
        }

        public Criteria andSpuPutOnWayNotLike(String value) {
            addCriterion("spu_put_on_way not like", value, "spuPutOnWay");
            return (Criteria) this;
        }

        public Criteria andSpuPutOnWayIn(List<String> values) {
            addCriterion("spu_put_on_way in", values, "spuPutOnWay");
            return (Criteria) this;
        }

        public Criteria andSpuPutOnWayNotIn(List<String> values) {
            addCriterion("spu_put_on_way not in", values, "spuPutOnWay");
            return (Criteria) this;
        }

        public Criteria andSpuPutOnWayBetween(String value1, String value2) {
            addCriterion("spu_put_on_way between", value1, value2, "spuPutOnWay");
            return (Criteria) this;
        }

        public Criteria andSpuPutOnWayNotBetween(String value1, String value2) {
            addCriterion("spu_put_on_way not between", value1, value2, "spuPutOnWay");
            return (Criteria) this;
        }

        public Criteria andSpuPubTimeIsNull() {
            addCriterion("spu_pub_time is null");
            return (Criteria) this;
        }

        public Criteria andSpuPubTimeIsNotNull() {
            addCriterion("spu_pub_time is not null");
            return (Criteria) this;
        }

        public Criteria andSpuPubTimeEqualTo(Date value) {
            addCriterion("spu_pub_time =", value, "spuPubTime");
            return (Criteria) this;
        }

        public Criteria andSpuPubTimeNotEqualTo(Date value) {
            addCriterion("spu_pub_time <>", value, "spuPubTime");
            return (Criteria) this;
        }

        public Criteria andSpuPubTimeGreaterThan(Date value) {
            addCriterion("spu_pub_time >", value, "spuPubTime");
            return (Criteria) this;
        }

        public Criteria andSpuPubTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("spu_pub_time >=", value, "spuPubTime");
            return (Criteria) this;
        }

        public Criteria andSpuPubTimeLessThan(Date value) {
            addCriterion("spu_pub_time <", value, "spuPubTime");
            return (Criteria) this;
        }

        public Criteria andSpuPubTimeLessThanOrEqualTo(Date value) {
            addCriterion("spu_pub_time <=", value, "spuPubTime");
            return (Criteria) this;
        }

        public Criteria andSpuPubTimeIn(List<Date> values) {
            addCriterion("spu_pub_time in", values, "spuPubTime");
            return (Criteria) this;
        }

        public Criteria andSpuPubTimeNotIn(List<Date> values) {
            addCriterion("spu_pub_time not in", values, "spuPubTime");
            return (Criteria) this;
        }

        public Criteria andSpuPubTimeBetween(Date value1, Date value2) {
            addCriterion("spu_pub_time between", value1, value2, "spuPubTime");
            return (Criteria) this;
        }

        public Criteria andSpuPubTimeNotBetween(Date value1, Date value2) {
            addCriterion("spu_pub_time not between", value1, value2, "spuPubTime");
            return (Criteria) this;
        }

        public Criteria andTemplateModifiedTimeIsNull() {
            addCriterion("template_modified_time is null");
            return (Criteria) this;
        }

        public Criteria andTemplateModifiedTimeIsNotNull() {
            addCriterion("template_modified_time is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateModifiedTimeEqualTo(Date value) {
            addCriterion("template_modified_time =", value, "templateModifiedTime");
            return (Criteria) this;
        }

        public Criteria andTemplateModifiedTimeNotEqualTo(Date value) {
            addCriterion("template_modified_time <>", value, "templateModifiedTime");
            return (Criteria) this;
        }

        public Criteria andTemplateModifiedTimeGreaterThan(Date value) {
            addCriterion("template_modified_time >", value, "templateModifiedTime");
            return (Criteria) this;
        }

        public Criteria andTemplateModifiedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("template_modified_time >=", value, "templateModifiedTime");
            return (Criteria) this;
        }

        public Criteria andTemplateModifiedTimeLessThan(Date value) {
            addCriterion("template_modified_time <", value, "templateModifiedTime");
            return (Criteria) this;
        }

        public Criteria andTemplateModifiedTimeLessThanOrEqualTo(Date value) {
            addCriterion("template_modified_time <=", value, "templateModifiedTime");
            return (Criteria) this;
        }

        public Criteria andTemplateModifiedTimeIn(List<Date> values) {
            addCriterion("template_modified_time in", values, "templateModifiedTime");
            return (Criteria) this;
        }

        public Criteria andTemplateModifiedTimeNotIn(List<Date> values) {
            addCriterion("template_modified_time not in", values, "templateModifiedTime");
            return (Criteria) this;
        }

        public Criteria andTemplateModifiedTimeBetween(Date value1, Date value2) {
            addCriterion("template_modified_time between", value1, value2, "templateModifiedTime");
            return (Criteria) this;
        }

        public Criteria andTemplateModifiedTimeNotBetween(Date value1, Date value2) {
            addCriterion("template_modified_time not between", value1, value2, "templateModifiedTime");
            return (Criteria) this;
        }

        public Criteria andTemplateCreateTimeIsNull() {
            addCriterion("template_create_time is null");
            return (Criteria) this;
        }

        public Criteria andTemplateCreateTimeIsNotNull() {
            addCriterion("template_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateCreateTimeEqualTo(Date value) {
            addCriterion("template_create_time =", value, "templateCreateTime");
            return (Criteria) this;
        }

        public Criteria andTemplateCreateTimeNotEqualTo(Date value) {
            addCriterion("template_create_time <>", value, "templateCreateTime");
            return (Criteria) this;
        }

        public Criteria andTemplateCreateTimeGreaterThan(Date value) {
            addCriterion("template_create_time >", value, "templateCreateTime");
            return (Criteria) this;
        }

        public Criteria andTemplateCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("template_create_time >=", value, "templateCreateTime");
            return (Criteria) this;
        }

        public Criteria andTemplateCreateTimeLessThan(Date value) {
            addCriterion("template_create_time <", value, "templateCreateTime");
            return (Criteria) this;
        }

        public Criteria andTemplateCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("template_create_time <=", value, "templateCreateTime");
            return (Criteria) this;
        }

        public Criteria andTemplateCreateTimeIn(List<Date> values) {
            addCriterion("template_create_time in", values, "templateCreateTime");
            return (Criteria) this;
        }

        public Criteria andTemplateCreateTimeNotIn(List<Date> values) {
            addCriterion("template_create_time not in", values, "templateCreateTime");
            return (Criteria) this;
        }

        public Criteria andTemplateCreateTimeBetween(Date value1, Date value2) {
            addCriterion("template_create_time between", value1, value2, "templateCreateTime");
            return (Criteria) this;
        }

        public Criteria andTemplateCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("template_create_time not between", value1, value2, "templateCreateTime");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}