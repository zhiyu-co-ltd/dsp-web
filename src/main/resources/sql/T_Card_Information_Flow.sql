/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50163
 Source Host           : localhost
 Source Database       : zhiyu

 Target Server Type    : MySQL
 Target Server Version : 50163
 File Encoding         : utf-8

 Date: 12/30/2016 11:54:31 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `T_Card_Information_Flow`
-- ----------------------------
DROP TABLE IF EXISTS `T_Card_Information_Flow`;
CREATE TABLE `T_Card_Information_Flow` (
  `id` int(8) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `material_id` varchar(128) NOT NULL COMMENT '物料ID',
  `ad_id` varchar(128) NOT NULL COMMENT '广告ID',
  `name` varchar(128) NOT NULL COMMENT '名字',
  `size` varchar(16) NOT NULL COMMENT '物料尺寸',
  `ad_title` varchar(128) NOT NULL COMMENT '广告标题',
  `ad_description` varchar(128) NOT NULL COMMENT '广告副标题',
  `icon_url` varchar(128) DEFAULT NULL COMMENT 'icon图片地址',
  `image_url` varchar(128) DEFAULT NULL COMMENT '大图图片地址',
  `createtime` datetime NOT NULL COMMENT '创建时间',
  `type` int(8) NOT NULL COMMENT '卡片信息流类型；0:卡片信息流；1:普通信息流',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
