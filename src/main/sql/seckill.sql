/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : seckill

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2018-03-15 08:33:26

在Navicat中运行该代码就好，（其中的数据是最近测试的数据，运行之后该文件可要可不要）
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for seckill
-- ----------------------------
DROP TABLE IF EXISTS `seckill`;
CREATE TABLE `seckill` (
  `seckill_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '商品库存ID',
  `name` varchar(120) NOT NULL COMMENT '商品名称',
  `number` int(11) NOT NULL COMMENT '库存数量',
  `start_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '秒杀开始时间',
  `end_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '秒杀结束时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`seckill_id`),
  KEY `idx_start_time` (`start_time`),
  KEY `idx_end_time` (`end_time`),
  KEY `idx_create_time` (`create_time`)
) ENGINE=InnoDB AUTO_INCREMENT=1004 DEFAULT CHARSET=utf8 COMMENT='秒杀库存表';

-- ----------------------------
-- Records of seckill
-- ----------------------------
INSERT INTO `seckill` VALUES ('1000', '1000元秒杀iphone6', '97', '2018-03-02 16:00:09', '2019-01-02 00:00:00', '2018-03-01 17:26:00');
INSERT INTO `seckill` VALUES ('1001', '800元秒杀ipad', '200', '2016-01-01 00:00:00', '2016-01-02 00:00:00', '2018-03-01 17:26:00');
INSERT INTO `seckill` VALUES ('1002', '6600元秒杀mac book pro', '300', '2016-01-01 00:00:00', '2016-01-02 00:00:00', '2018-03-01 17:26:00');
INSERT INTO `seckill` VALUES ('1003', '7000元秒杀iMac', '400', '2016-01-01 00:00:00', '2016-01-02 00:00:00', '2018-03-01 17:26:00');

-- ----------------------------
-- Table structure for success_killed
-- ----------------------------
DROP TABLE IF EXISTS `success_killed`;
CREATE TABLE `success_killed` (
  `seckill_id` bigint(20) NOT NULL COMMENT '秒杀商品ID',
  `user_phone` bigint(20) NOT NULL COMMENT '用户手机号',
  `state` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '状态标识:-1:无效 0:成功 1:已付款 2:已发货',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`seckill_id`,`user_phone`),
  KEY `idx_create_time` (`create_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='秒杀成功明细表';

-- ----------------------------
-- Records of success_killed
-- ----------------------------
INSERT INTO `success_killed` VALUES ('1000', '13476199876', '-1', '2018-03-02 16:00:09');
INSERT INTO `success_killed` VALUES ('1000', '13567898065', '-1', '2018-03-02 15:48:38');
INSERT INTO `success_killed` VALUES ('1000', '13567898765', '-1', '2018-03-02 15:46:52');
INSERT INTO `success_killed` VALUES ('1000', '13678987654', '-1', '2018-03-02 09:56:44');
