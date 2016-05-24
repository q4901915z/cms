/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : mhcms

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2016-05-24 20:00:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for vipuser
-- ----------------------------
DROP TABLE IF EXISTS `vipuser`;
CREATE TABLE `vipuser` (
  `vipuserId` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `vipuserName` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `vipuserPhone` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `vipcardType` int(11) DEFAULT NULL,
  `useMoney` decimal(11,4) DEFAULT NULL COMMENT '使用次数',
  `remainMoney` decimal(11,4) DEFAULT NULL,
  `state` int(2) DEFAULT NULL COMMENT '状态，1有效，-1无效',
  `createTime` datetime DEFAULT NULL,
  `modifyTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`vipuserId`),
  KEY `INDEX_VIPUSERNAME` (`vipuserName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of vipuser
-- ----------------------------
