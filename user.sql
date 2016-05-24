/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : mhcms

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2016-05-24 20:00:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(40) NOT NULL COMMENT '账户名',
  `password` varchar(255) NOT NULL COMMENT '密码',
  `realName` varchar(255) DEFAULT NULL COMMENT '真实姓名',
  `phone` varchar(255) DEFAULT NULL COMMENT '手机号码',
  `type` int(11) NOT NULL COMMENT '用户类型,1店员;2老板;3超级管理员',
  `state` int(11) DEFAULT NULL COMMENT '账号是否有效,-1无效，1有效',
  `lastLoginTime` datetime DEFAULT NULL COMMENT '最后登录时间',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `modifyTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`userId`),
  UNIQUE KEY `USERNAME_UNIQUE` (`userName`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '15138985009', '111111', '秦旭洋', '15138985009', '3', '1', '2016-05-24 14:31:17', '2016-05-24 14:31:14', '2016-05-24 14:31:18');
