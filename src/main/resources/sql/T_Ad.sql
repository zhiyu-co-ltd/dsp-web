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

 Date: 12/30/2016 11:12:59 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `T_Ad`
-- ----------------------------
DROP TABLE IF EXISTS `T_Ad`;
CREATE TABLE `T_Ad` (
  `id` int(8) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` varchar(127) NOT NULL COMMENT '用户唯一标识',
  `adplan_id` varchar(127) NOT NULL COMMENT '推广计划id',
  `status` int(8) NOT NULL DEFAULT '0' COMMENT '广告状态：0:待审核；1：审核中；2:审核通过；3:审核不通过；4:待投放；5:投放中；6:暂停；7:投放结束；8:下线',
  `delivery_type` int(8) NOT NULL COMMENT '投放方式：0:cpc;1:cpm;2:cps;3:cpd;4:cpa;5:cpt;',
  `offer_price` double(8,2) NOT NULL COMMENT '广告出价',
  `telecom_operator` int(8) NOT NULL COMMENT '电信运营商；0:全部；1:移动；2:联通；3:电信',
  `network_type` int(8) NOT NULL COMMENT '联网方式：0：全部；1，Wi-Fi；2，3g,3:4g;4:2g',
  `operate_system` int(8) NOT NULL COMMENT '操作系统：0:不限；1:android；2.iOS；3:windows',
  `pdb_platform` varchar(127) NOT NULL COMMENT '投放平台：0:不限',
  `gender_type` int(8) NOT NULL COMMENT '性别：0:不限；1，女性；2:男性',
  `launch_area` varchar(257) NOT NULL COMMENT '投放区域：0:不限',
  `launch_people` varchar(257) NOT NULL COMMENT '投放人群：0:不限',
  `display_times` int(8) NOT NULL COMMENT '展示次数：0:不限',
  `launch_time_start` datetime NOT NULL COMMENT '投放开始时间',
  `launch_end_time` datetime NOT NULL COMMENT '投放结束时间',
  `ad_url` varchar(128) DEFAULT NULL COMMENT '投放广告URL；空：为展示类广告',
  `callback_url` varchar(128) DEFAULT NULL COMMENT '转换回传url',
  `daily_limit_money` double(128,2) NOT NULL COMMENT '日限额：0:不限定；',
  `delivery_time_type` int(8) NOT NULL COMMENT '投放时间段限制：0:全时间段；1:特定时间段；2:高级时间段',
  `delivery_time` varchar(255) NOT NULL COMMENT '投放时间段：0；全时间段；',
  `createtime` datetime NOT NULL COMMENT '创建时间',
  `ad_type` int(8) DEFAULT NULL COMMENT '广告类型：0:banner;1:插屏；2:开屏；3:文字链；4:信息流；5:视频',
  `name` varchar(125) NOT NULL COMMENT '广告名称',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
