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

 Date: 12/26/2016 16:04:33 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `T_Adplan`
-- ----------------------------
DROP TABLE IF EXISTS `T_Adplan`;
CREATE TABLE `T_Adplan` (
  `id` int(8) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` varchar(127) NOT NULL COMMENT '用户唯一标识',
  `name` varchar(127) NOT NULL COMMENT '推广计划名称',
  `status` int(8) NOT NULL DEFAULT '0' COMMENT '推广计划状态；0:关闭；1：启用',
  `day_const` double(18,2) NOT NULL COMMENT '日限额',
  `realtime_money` double(18,2) NOT NULL COMMENT '实时余额',
  `createtime` TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `adplan_id` varchar(127) NOT NULL COMMENT '推广计划ID',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
