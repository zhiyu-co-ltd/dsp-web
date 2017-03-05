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

 Date: 12/26/2016 16:07:42 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `T_Material_Text`
-- ----------------------------
DROP TABLE IF EXISTS `T_Material_Text`;
CREATE TABLE `T_Material_Text` (
  `id` int(8) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(125) NOT NULL COMMENT '物料名字',
  `material_id` varchar(128) NOT NULL COMMENT '物料ID',
  `ad_id` varchar(255) NOT NULL COMMENT '广告唯一标识',
  `size` varchar(125) NOT NULL COMMENT '物料大小',
  `content` varchar(128) NOT NULL COMMENT '文字链广告内容',
  `createtime` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
