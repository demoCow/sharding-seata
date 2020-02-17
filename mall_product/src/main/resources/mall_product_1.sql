/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : 192.168.1.104:3306
 Source Schema         : mall_product_1

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 18/02/2020 02:34:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for product_comment_0
-- ----------------------------
DROP TABLE IF EXISTS `product_comment_0`;
CREATE TABLE `product_comment_0`  (
  `comment_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品评论ID',
  `product_spu_num` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品SPUID',
  `order_master_num` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单主单流水号',
  `order_house_num` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单分单流水号',
  `member_security_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户安全表ID',
  `comment_anonymous` smallint(255) NULL DEFAULT 1 COMMENT '是否匿名评论',
  `comment_score` smallint(255) NULL DEFAULT NULL COMMENT '评论得分(0-5)',
  `comment_content` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '用户评论内容',
  `comment_status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '评论状态',
  `comment_modified_time` varchar(0) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '评论创建/修改时间',
  `spu_owner_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品所有者id(商铺\\供应商)',
  PRIMARY KEY (`comment_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for product_comment_1
-- ----------------------------
DROP TABLE IF EXISTS `product_comment_1`;
CREATE TABLE `product_comment_1`  (
  `comment_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品评论ID',
  `product_spu_num` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品SPUID',
  `order_master_num` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单主单流水号',
  `order_house_num` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单分单流水号',
  `member_security_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户安全表ID',
  `comment_anonymous` smallint(255) NULL DEFAULT 1 COMMENT '是否匿名评论',
  `comment_score` smallint(255) NULL DEFAULT NULL COMMENT '评论得分(0-5)',
  `comment_content` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '用户评论内容',
  `comment_status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '评论状态',
  `comment_modified_time` varchar(0) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '评论创建/修改时间',
  `spu_owner_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品所有者id(商铺\\供应商)',
  PRIMARY KEY (`comment_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for product_picture_0
-- ----------------------------
DROP TABLE IF EXISTS `product_picture_0`;
CREATE TABLE `product_picture_0`  (
  `picture_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品图片表',
  `product_spu_num` int(11) NULL DEFAULT NULL COMMENT '商品spu流水号',
  `picture_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品图片路径',
  `picture_master_graph` smallint(255) NULL DEFAULT NULL COMMENT '是否为主图(一般上传第一张图为主图)',
  `picture_order` smallint(255) NULL DEFAULT NULL COMMENT '商品图片序号',
  `picture_modified_time` timestamp(0) NULL DEFAULT NULL COMMENT '商品图片最后修改时间',
  `spu_owner_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品所有者id(商铺\\供应商)',
  PRIMARY KEY (`picture_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for product_picture_1
-- ----------------------------
DROP TABLE IF EXISTS `product_picture_1`;
CREATE TABLE `product_picture_1`  (
  `picture_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品图片表',
  `product_spu_num` int(11) NULL DEFAULT NULL COMMENT '商品spu流水号',
  `picture_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品图片路径',
  `picture_master_graph` smallint(255) NULL DEFAULT NULL COMMENT '是否为主图(一般上传第一张图为主图)',
  `picture_order` smallint(255) NULL DEFAULT NULL COMMENT '商品图片序号',
  `picture_modified_time` timestamp(0) NULL DEFAULT NULL COMMENT '商品图片最后修改时间',
  `spu_owner_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品所有者id(商铺\\供应商)',
  PRIMARY KEY (`picture_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for product_sku_0
-- ----------------------------
DROP TABLE IF EXISTS `product_sku_0`;
CREATE TABLE `product_sku_0`  (
  `sku_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品skuID',
  `sku_num` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品sku流水号',
  `product_spu_num` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品spu流水号',
  `sku_spec_index` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品spu规则索引号(0_1_0对应相应的id)',
  `sku_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '商品价格',
  `sku_spec_kvs` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品sku规格键值对数组',
  `sku_bar_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品条形码',
  `spu_owner_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品所有者id(商铺\\供应商)',
  PRIMARY KEY (`sku_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for product_sku_1
-- ----------------------------
DROP TABLE IF EXISTS `product_sku_1`;
CREATE TABLE `product_sku_1`  (
  `sku_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品skuID',
  `sku_num` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品sku流水号',
  `product_spu_num` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品spu流水号',
  `sku_spec_index` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品spu规则索引号(0_1_0对应相应的id)',
  `sku_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '商品价格',
  `sku_spec_kvs` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品sku规格键值对数组',
  `sku_bar_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品条形码',
  `spu_owner_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品所有者id(商铺\\供应商)',
  PRIMARY KEY (`sku_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for product_sku_inventory_0
-- ----------------------------
DROP TABLE IF EXISTS `product_sku_inventory_0`;
CREATE TABLE `product_sku_inventory_0`  (
  `sku_inventory_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品sku库存表id',
  `product_spu_num` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品spu流水号',
  `product_sku_num` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品sku流水号',
  `sku_inventory_quantity` int(255) NULL DEFAULT NULL COMMENT '商品库存数量',
  `sku_inventory_modified_time` datetime(0) NULL DEFAULT NULL COMMENT '商品库存修改时间',
  `spu_owner_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品所有者id(商铺\\供应商)',
  PRIMARY KEY (`sku_inventory_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for product_sku_inventory_1
-- ----------------------------
DROP TABLE IF EXISTS `product_sku_inventory_1`;
CREATE TABLE `product_sku_inventory_1`  (
  `sku_inventory_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品sku库存表id',
  `product_spu_num` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品spu流水号',
  `product_sku_num` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品sku流水号',
  `sku_inventory_quantity` int(255) NULL DEFAULT NULL COMMENT '商品库存数量',
  `sku_inventory_modified_time` datetime(0) NULL DEFAULT NULL COMMENT '商品库存修改时间',
  `spu_owner_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品所有者id(商铺\\供应商)',
  PRIMARY KEY (`sku_inventory_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for product_spu_0
-- ----------------------------
DROP TABLE IF EXISTS `product_spu_0`;
CREATE TABLE `product_spu_0`  (
  `spu_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品SPUID',
  `spu_num` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品SPU流水号',
  `product_category_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品所属分类id',
  `product_brand_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品所属品牌id',
  `spu_owner_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品所有者id(商铺\\供应商)',
  `freight_template_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品应用的运费模板id',
  `spu_title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品标题',
  `spu_slogan` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品卖点',
  `spu_keywords` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品seo字段 热点词 没有搜索引擎钱可以当模糊查询用',
  `spu_fixed_price` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品一口价(list展示 价格区间最小值 后期有打折工具表可以设大值为市场价)',
  `spu_gross_inventory` int(255) NULL DEFAULT NULL COMMENT '商品总库存(所有sku累加库存)',
  `spu_spec_kvs` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品规格键值对json数组',
  `spu_parameter_details` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '商品参数详情json数组',
  `spu_bar_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品条形码',
  `spu_Inventory_count` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '库存计数方式 (下单后减库存 付款后减 )',
  `spu_comment_count` bigint(255) NULL DEFAULT NULL COMMENT '商品评论总数',
  `spu_status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品状态',
  `spu_put_on_way` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品上架方式(立即、定时、入库)',
  `spu_pub_time` datetime(0) NULL DEFAULT NULL COMMENT '商品发布时间(上架时间)',
  `spu_modified_time` datetime(0) NULL DEFAULT NULL COMMENT '商品修改时间',
  `spu_create_time` timestamp(0) NULL DEFAULT NULL COMMENT '商品创建时间',
  PRIMARY KEY (`spu_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for product_spu_1
-- ----------------------------
DROP TABLE IF EXISTS `product_spu_1`;
CREATE TABLE `product_spu_1`  (
  `spu_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品SPUID',
  `spu_num` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品SPU流水号',
  `product_category_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品所属分类id',
  `product_brand_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品所属品牌id',
  `spu_owner_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品所有者id(商铺\\供应商)',
  `freight_template_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品应用的运费模板id',
  `spu_title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品标题',
  `spu_slogan` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品卖点',
  `spu_keywords` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品seo字段 热点词 没有搜索引擎钱可以当模糊查询用',
  `spu_fixed_price` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品一口价(list展示 价格区间最小值 后期有打折工具表可以设大值为市场价)',
  `spu_gross_inventory` int(255) NULL DEFAULT NULL COMMENT '商品总库存(所有sku累加库存)',
  `spu_spec_kvs` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品规格键值对json数组',
  `spu_parameter_details` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '商品参数详情json数组',
  `spu_bar_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品条形码',
  `spu_Inventory_count` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '库存计数方式 (下单后减库存 付款后减 )',
  `spu_comment_count` bigint(255) NULL DEFAULT NULL COMMENT '商品评论总数',
  `spu_status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品状态',
  `spu_put_on_way` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品上架方式(立即、定时、入库)',
  `spu_pub_time` datetime(0) NULL DEFAULT NULL COMMENT '商品发布时间(上架时间)',
  `spu_modified_time` datetime(0) NULL DEFAULT NULL COMMENT '商品修改时间',
  `spu_create_time` timestamp(0) NULL DEFAULT NULL COMMENT '商品创建时间',
  PRIMARY KEY (`spu_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for product_spu_description_0
-- ----------------------------
DROP TABLE IF EXISTS `product_spu_description_0`;
CREATE TABLE `product_spu_description_0`  (
  `spu_des_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品spu描述表',
  `product_sku_num` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '上',
  `spu_web_description` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '商品网页版图文描述',
  `spu_mobile_description` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '商品移动端图文描述',
  `spu_owner_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品所有者id(商铺\\供应商)',
  PRIMARY KEY (`spu_des_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for product_spu_description_1
-- ----------------------------
DROP TABLE IF EXISTS `product_spu_description_1`;
CREATE TABLE `product_spu_description_1`  (
  `spu_des_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品spu描述表',
  `product_sku_num` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '上',
  `spu_web_description` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '商品网页版图文描述',
  `spu_mobile_description` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '商品移动端图文描述',
  `spu_owner_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品所有者id(商铺\\供应商)',
  PRIMARY KEY (`spu_des_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for undo_log
-- ----------------------------
DROP TABLE IF EXISTS `undo_log`;
CREATE TABLE `undo_log`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `branch_id` bigint(20) NOT NULL,
  `xid` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `context` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `rollback_info` longblob NOT NULL,
  `log_status` int(11) NOT NULL,
  `log_created` datetime(0) NULL,
  `log_modified` datetime(0) NULL,
  `ext` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `ux_undo_log`(`xid`, `branch_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
