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

 Date: 12/26/2016 16:07:05 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `T_User_Info_Company`
-- ----------------------------
DROP TABLE IF EXISTS `T_User_Info_Company`;
CREATE TABLE `T_User_Info_Company` (
  `id` int(8) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` int(8) NOT NULL,
  `company_name` varchar(20) NOT NULL COMMENT '公司名称',
  `company_number` varchar(20) NOT NULL COMMENT '组织机构代码',
  `company_image` varchar(20) NOT NULL COMMENT '公司营业执照',
  `company_url` varchar(125) DEFAULT NULL COMMENT '企业网址',
  `company_address` varchar(125) DEFAULT NULL COMMENT '企业地址',
  `createtime` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
