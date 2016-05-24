/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : mhcms

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2016-05-24 20:00:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for vipcard
-- ----------------------------
DROP TABLE IF EXISTS `vipcard`;
CREATE TABLE `vipcard` (
  `vipcardId` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `vipcardName` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '会员卡名称',
  `vipcardType` int(10) DEFAULT NULL COMMENT '会员卡类型1青铜会员，2白银会员，3黄金会员，4钻石会员',
  `vipcardDesc` varchar(500) COLLATE utf8_bin DEFAULT NULL COMMENT '会员卡描述',
  `state` int(2) DEFAULT NULL COMMENT '1生效，-1无效',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `modifyTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`vipcardId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of vipcard
-- ----------------------------
INSERT INTO `vipcard` VALUES ('1', '青铜会员', '1', '消费100元会员，洗剪吹9折', '1', '2016-05-24 14:04:51', '2016-05-24 14:04:53');
INSERT INTO `vipcard` VALUES ('2', '白银会员', '2', '消费500元会员，洗剪吹8折', '1', '2016-05-24 14:04:54', '2016-05-24 14:04:55');
INSERT INTO `vipcard` VALUES ('3', '黄金会员', '3', '消费1000元会员，洗剪吹7折', '1', '2016-05-24 14:04:56', '2016-05-24 14:04:58');
INSERT INTO `vipcard` VALUES ('4', '钻石会员', '4', '消费2000元会员，洗剪吹6折', '1', '2016-05-24 14:04:59', '2016-05-24 14:05:01');
