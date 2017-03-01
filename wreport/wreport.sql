/*
Navicat MySQL Data Transfer

Source Server         : mydb
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : wreport

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2017-03-01 14:43:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for busi_emp_task_feedback
-- ----------------------------
DROP TABLE IF EXISTS `busi_emp_task_feedback`;
CREATE TABLE `busi_emp_task_feedback` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `USER_ID` int(11) DEFAULT NULL COMMENT '用户ID',
  `TASK_ID` int(11) DEFAULT NULL COMMENT '任务ID',
  `TASK_STAGE` varchar(50) DEFAULT NULL COMMENT '任务阶段；DEV：开发；TEST：测试；',
  `TASK_REMARK` varchar(255) DEFAULT NULL COMMENT '任务简要说明',
  `APPLY_HOURS` float(8,2) DEFAULT NULL COMMENT '填报工时',
  `APPLY_TIME` datetime DEFAULT NULL COMMENT '填报时间',
  `APPROVE_ID` int(11) DEFAULT NULL COMMENT '审核人',
  `APPROVE_TIME` datetime DEFAULT NULL COMMENT '审核时间',
  `APPROVE_STATUS` varchar(50) DEFAULT NULL COMMENT '审核状态；PASS：审核通过；REJECT：审核不通过；',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`ID`),
  KEY `FK_USER_ID` (`USER_ID`),
  KEY `FK_TASK_ID` (`TASK_ID`),
  KEY `FK_APPROVE_ID` (`APPROVE_ID`),
  CONSTRAINT `FK_APPROVE_ID` FOREIGN KEY (`APPROVE_ID`) REFERENCES `sys_user` (`ID`),
  CONSTRAINT `FK_TASK_ID` FOREIGN KEY (`TASK_ID`) REFERENCES `busi_task` (`ID`),
  CONSTRAINT `FK_USER_ID` FOREIGN KEY (`USER_ID`) REFERENCES `sys_user` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of busi_emp_task_feedback
-- ----------------------------
INSERT INTO `busi_emp_task_feedback` VALUES ('1', '1', '1', 'TEST', '测试阶段', '120.00', '2017-02-28 19:55:05', '1', '2017-02-28 19:55:13', 'PASS', null, null);
INSERT INTO `busi_emp_task_feedback` VALUES ('2', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `busi_emp_task_feedback` VALUES ('3', '1', '1', 'TEST', '测试阶段', '120.00', '2017-02-28 19:55:05', '1', '2017-02-28 19:55:13', 'PASS', null, null);

-- ----------------------------
-- Table structure for busi_task
-- ----------------------------
DROP TABLE IF EXISTS `busi_task`;
CREATE TABLE `busi_task` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `PROJECT_ID` int(11) NOT NULL COMMENT '项目代码',
  `TASK_CODE` varchar(100) NOT NULL COMMENT '任务代码',
  `TASK_NAME` varchar(100) NOT NULL COMMENT '任务名称',
  `REMARK` text COMMENT '详细描述',
  `DEV_MODE` varchar(50) DEFAULT NULL COMMENT '开发模式',
  `MEMBER` text COMMENT '项目成员',
  `STAGE` varchar(50) DEFAULT NULL COMMENT '项目阶段',
  `WORKLOAD` float(8,2) DEFAULT NULL COMMENT '总工作量（小时）',
  `START_TIME` datetime DEFAULT NULL COMMENT '开始时间',
  `END_TIME` datetime DEFAULT NULL COMMENT '截止时间',
  PRIMARY KEY (`ID`),
  KEY `FK_PROJECT_ID` (`PROJECT_ID`),
  CONSTRAINT `FK_PROJECT_ID` FOREIGN KEY (`PROJECT_ID`) REFERENCES `sys_project` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of busi_task
-- ----------------------------
INSERT INTO `busi_task` VALUES ('1', '1', 't001', '优化AMS', null, 'DEV', 'simon,jiansheng', 'DEV', '8.20', '2017-02-01 19:54:24', '2017-03-31 19:54:32');

-- ----------------------------
-- Table structure for sys_project
-- ----------------------------
DROP TABLE IF EXISTS `sys_project`;
CREATE TABLE `sys_project` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `PROJECT_CODE` varchar(100) NOT NULL COMMENT '项目代码',
  `PROJECT_NAME` varchar(100) NOT NULL COMMENT '项目名称',
  `OWNER_ID` varchar(200) NOT NULL COMMENT '项目负责人',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `U_PROJECT_CODE` (`PROJECT_CODE`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_project
-- ----------------------------
INSERT INTO `sys_project` VALUES ('1', '001', 'AMS', 'simon');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `USER_NAME` varchar(60) NOT NULL COMMENT '用户名',
  `PASSWD` varchar(32) NOT NULL COMMENT '密码',
  `ROLES` varchar(200) NOT NULL COMMENT '角色',
  `LAST_LOGIN_TIME` datetime DEFAULT NULL COMMENT '最后登录时间',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `U_USER_NAME` (`USER_NAME`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'simon', 'simon', 'admin', '2017-02-27 19:52:55');
