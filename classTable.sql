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

 Date: 11/07/2022 02:32:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class`  (
  `classId` int NOT NULL,
  `className` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  INDEX `classId`(`classId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of class
-- ----------------------------
INSERT INTO `class` VALUES (1, 'Year One');
INSERT INTO `class` VALUES (2, 'Year Two');
INSERT INTO `class` VALUES (3, 'Year Three');
INSERT INTO `class` VALUES (4, 'Year Four');
INSERT INTO `class` VALUES (5, 'Year Five');

SET FOREIGN_KEY_CHECKS = 1;
