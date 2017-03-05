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

 Date: 12/26/2016 16:07:16 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `T_Picture_Information_Flow`
-- ----------------------------
DROP TABLE IF EXISTS `T_Picture_Information_Flow`;
CREATE TABLE `T_Picture_Information_Flow` (
  `id` int(8) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(128) NOT NULL COMMENT '名称',
  `size` varchar(128) NOT NULL COMMENT '尺寸',
  `marerial_id` varchar(128) NOT NULL COMMENT '物料id',
  `ad_id` varchar(128) NOT NULL COMMENT '广告ID',
  `createtime` datetime NOT NULL COMMENT '创建时间',
  ` ad_title1` varchar(128) NOT NULL COMMENT '广告语1',
  ` ad_title2` varchar(128) NOT NULL COMMENT '广告语2',
  ` ad_title3` varchar(128) NOT NULL COMMENT '广告语3',
  `ad_title4` varchar(128) DEFAULT NULL COMMENT '广告语4；允许为空',
  `ad_title5` varchar(128) DEFAULT NULL COMMENT '广告语5；',
  `ad_title6` varchar(128) DEFAULT NULL COMMENT '广告语6',
  `ad_title7` varchar(128) DEFAULT NULL COMMENT '广告语7',
  `ad_title8` varchar(128) DEFAULT NULL COMMENT '广告语8',
  `ad_title9` varchar(128) DEFAULT NULL COMMENT '广告语9',
  `type` int(8) NOT NULL COMMENT '图片信息流类型；0:一行三列；1:两行三列；2:三行三列',
  `image_url1` varchar(128) NOT NULL COMMENT '组图1',
  `image_url2` varchar(128) NOT NULL COMMENT '组图2',
  `image_url3` varchar(128) NOT NULL COMMENT '组图3',
  `image_url4` varchar(128) DEFAULT NULL COMMENT '组图4；允许为空',
  `image_url5` varchar(128) DEFAULT NULL COMMENT '组图5',
  `image_url6` varchar(128) DEFAULT NULL COMMENT '组图6',
  `image_url7` varchar(128) DEFAULT NULL COMMENT '组图7',
  `image_url8` varchar(128) DEFAULT NULL COMMENT '组图8',
  `image_url9` varchar(128) DEFAULT NULL COMMENT '组图9',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
