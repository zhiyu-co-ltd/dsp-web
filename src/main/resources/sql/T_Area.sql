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

 Date: 12/26/2016 16:08:30 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `T_Area`
-- ----------------------------
DROP TABLE IF EXISTS `T_Area`;
CREATE TABLE `T_Area` (
  `id` int(8) NOT NULL AUTO_INCREMENT COMMENT '主键d',
  `name` varchar(127) NOT NULL COMMENT '区域名称',
  `area_id` varchar(127) NOT NULL COMMENT '区域唯一标识',
  `parent_id` varchar(127) NOT NULL COMMENT '上级父id',
  `createtime` datetime NOT NULL COMMENT '时间',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
