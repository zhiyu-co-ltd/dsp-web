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

 Date: 12/26/2016 16:07:11 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `T_User`
-- ----------------------------
DROP TABLE IF EXISTS `T_User`;
CREATE TABLE `T_User` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `email` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '注册email',
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户密码',
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户昵称',
  `createtime` datetime NOT NULL COMMENT '注册时间',
  `phone` varchar(20) DEFAULT NULL COMMENT '用户手机号',
  `qq` varchar(255) DEFAULT NULL COMMENT '用户qq号',
  `weixin` varchar(255) DEFAULT NULL COMMENT '用户微信号',
  `type` int(8) NOT NULL DEFAULT '0' COMMENT '用户类型：0，注册用户；1，广告主用户；2:媒体主用户；3:广告主和媒体主用户',
  `user_id` varchar(127) NOT NULL COMMENT '用户ID唯一标识',
  `company_type` int(3) DEFAULT NULL COMMENT '企业类型：1，公司；0，个人',
  `ad_account_money` double(128,2) NOT NULL DEFAULT '0.00',
  `cost_today` double(128,2) NOT NULL DEFAULT '0.00' COMMENT '今日花费',
  `update_status` int(8) DEFAULT '1' COMMENT '余额和花费是否更新；1:未更新；0:已更新',
  `update_time` datetime DEFAULT NULL COMMENT '余额和花费更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
