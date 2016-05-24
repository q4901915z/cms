/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : mhcms

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2016-05-24 20:00:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `orderId` int(11) NOT NULL AUTO_INCREMENT,
  `vipuserName` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '会员姓名',
  `useMoney` decimal(10,4) DEFAULT NULL COMMENT '消费金额',
  `createTime` datetime DEFAULT NULL COMMENT '消费时间',
  PRIMARY KEY (`orderId`),
  KEY `INDEX_VIPUSERNAME` (`vipuserName`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of order
-- ----------------------------
