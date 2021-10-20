CREATE DATABASE `goods` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

CREATE TABLE `s_goods` (
                           `goods_id` int NOT NULL,
                           `brank_id` int NOT NULL,
                           `goods_name` varchar(100) NOT NULL,
                           PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `s_brank` (
                           `brank_id` int NOT NULL AUTO_INCREMENT,
                           `brank_name` varchar(100) DEFAULT NULL,
                           PRIMARY KEY (`brank_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

