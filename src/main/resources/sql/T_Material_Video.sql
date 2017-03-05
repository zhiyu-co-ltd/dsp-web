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

 Date: 12/26/2016 16:07:35 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `T_Material_Video`
-- ----------------------------
DROP TABLE IF EXISTS `T_Material_Video`;
CREATE TABLE `T_Material_Video` (
  `id` int(8) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(128) NOT NULL COMMENT '物料名称',
  `material_id` varchar(128) NOT NULL COMMENT '物料唯一标识',
  `ad_id` varchar(128) NOT NULL COMMENT '广告ID',
  `size` varchar(128) NOT NULL COMMENT '物料尺寸',
  `type` int(8) NOT NULL COMMENT '视频类型；0:inapp；1:游戏；2：视频前贴片；3:视频后贴片',
  `video_url` varchar(128) NOT NULL COMMENT '视频URL',
  `image_url` varchar(128) NOT NULL COMMENT '图片url',
  `createtime` datetime NOT NULL COMMENT '创建时间',
  `play_time` int(8) NOT NULL COMMENT '播放时长；单位s',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
