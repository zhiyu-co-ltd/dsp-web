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

 Date: 12/26/2016 16:08:02 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `T_Material_Image`
-- ----------------------------
DROP TABLE IF EXISTS `T_Material_Image`;
CREATE TABLE `T_Material_Image` (
  `id` int(8) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(128) NOT NULL COMMENT '名称',
  `status` int(8) NOT NULL DEFAULT '0' COMMENT '广告状态：0:待审核；1：审核中；2:审核通过；3:审核不通过；4:待投放；5:投放中；6:暂停；7:投放结束；8:下线',
  `ad_id` varchar(128) NOT NULL COMMENT '广告唯一标识',
  `material_id` varchar(128) NOT NULL,
  `image_url` varchar(128) NOT NULL COMMENT 'banner图片地址',
  `size` varchar(20) NOT NULL COMMENT 'banner图片尺寸',
  `createtime` datetime NOT NULL COMMENT '创建时间',
  `type` int(8) NOT NULL COMMENT '类型：0:banner;1:插屏；2:开屏',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
