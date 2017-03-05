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

 Date: 12/26/2016 16:08:14 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `T_Financial`
-- ----------------------------
DROP TABLE IF EXISTS `T_Financial`;
CREATE TABLE `T_Financial` (
  `id` int(8) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `money` double(8,2) NOT NULL DEFAULT '0.00' COMMENT '金额',
  `createtime` datetime NOT NULL COMMENT '交易时间',
  `type` int(8) NOT NULL COMMENT '交易类型：1，充值；0:消费',
  `user_id` varchar(125) NOT NULL COMMENT '用户唯一标识',
  `description` varchar(128) DEFAULT NULL COMMENT '说明',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
