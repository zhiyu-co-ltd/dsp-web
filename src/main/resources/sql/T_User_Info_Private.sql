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

 Date: 12/26/2016 16:06:59 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `T_User_Info_Private`
-- ----------------------------
DROP TABLE IF EXISTS `T_User_Info_Private`;
CREATE TABLE `T_User_Info_Private` (
  `real_name` varchar(20) NOT NULL COMMENT '用户真实姓名',
  `id` int(8) NOT NULL AUTO_INCREMENT COMMENT '主键Id',
  `user_id` int(11) NOT NULL,
  `authentication_type` int(11) NOT NULL COMMENT '证件类型；0：身份证；1:驾驶证；2:护照',
  `authentication_number` varchar(20) NOT NULL COMMENT '证件号码',
  `authentication_imag_1` varchar(20) NOT NULL COMMENT '证件照正面',
  `authentication_imag_2` varchar(20) NOT NULL COMMENT '证件反面',
  `phone_number` varchar(20) NOT NULL COMMENT '联系电话',
  `url` varchar(40) DEFAULT '' COMMENT '网页地址',
  `address` varchar(40) DEFAULT NULL COMMENT '用户地址',
  `createtime` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
