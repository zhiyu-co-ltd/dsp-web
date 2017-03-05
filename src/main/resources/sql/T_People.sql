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

 Date: 12/26/2016 16:07:27 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `T_People`
-- ----------------------------
DROP TABLE IF EXISTS `T_People`;
CREATE TABLE `T_People` (
  `id` int(8) NOT NULL,
  `name` varchar(128) NOT NULL COMMENT '人群名称',
  `parents_id` varchar(128) NOT NULL,
  `people_id` varchar(128) NOT NULL COMMENT '用户群id',
  `createtime` datetime NOT NULL COMMENT '注册时间',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
