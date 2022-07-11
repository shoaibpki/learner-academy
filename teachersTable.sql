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

 Date: 11/07/2022 02:34:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for teachers
-- ----------------------------
DROP TABLE IF EXISTS `teachers`;
CREATE TABLE `teachers`  (
  `teacherId` int NOT NULL,
  `teacherName` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `contact` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `address` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `join_date` date NULL DEFAULT NULL,
  PRIMARY KEY (`teacherId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teachers
-- ----------------------------
INSERT INTO `teachers` VALUES (1, 'akther', '444444', 'dsfdkm233dld', '2022-07-18');
INSERT INTO `teachers` VALUES (2, 'Bhimeh', '45656', 'sfafdf', '2022-07-05');
INSERT INTO `teachers` VALUES (3, 'Dhruvik', '09979', 'hgfkjlk', '2022-07-18');
INSERT INTO `teachers` VALUES (4, 'Krishna', '87645', 'dfsfere', '2022-07-11');

SET FOREIGN_KEY_CHECKS = 1;
