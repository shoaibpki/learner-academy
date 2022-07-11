/*
 Navicat Premium Data Transfer

 Source Server         : MyConnection
 Source Server Type    : MySQL
 Source Server Version : 80029
 Source Host           : localhost:3306
 Source Schema         : learner_academy

 Target Server Type    : MySQL
 Target Server Version : 80029
 File Encoding         : 65001

 Date: 11/07/2022 02:35:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for subject
-- ----------------------------
DROP TABLE IF EXISTS `subject`;
CREATE TABLE `subject`  (
  `subjectId` int NOT NULL,
  `subjectName` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`subjectId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of subject
-- ----------------------------
INSERT INTO `subject` VALUES (1, 'math');
INSERT INTO `subject` VALUES (2, 'english');
INSERT INTO `subject` VALUES (3, 'science');
INSERT INTO `subject` VALUES (4, 'ssstudies');
INSERT INTO `subject` VALUES (5, 'computer');
INSERT INTO `subject` VALUES (6, 'physics');
INSERT INTO `subject` VALUES (7, 'chemistry');
INSERT INTO `subject` VALUES (8, 'biology');

SET FOREIGN_KEY_CHECKS = 1;
