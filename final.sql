-- MySQL dump 10.13  Distrib 5.7.22, for Win64 (x86_64)
--
-- Host: localhost    Database: final
-- ------------------------------------------------------
-- Server version	5.7.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_flight`
--

DROP TABLE IF EXISTS `tb_flight`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_flight` (
  `id` int(50) NOT NULL AUTO_INCREMENT COMMENT '航班机票唯一标识',
  `num` varchar(20) NOT NULL,
  `from` varchar(20) NOT NULL,
  `to` varchar(20) NOT NULL,
  `price` int(50) NOT NULL,
  `storage` int(50) NOT NULL,
  `company` varchar(20) NOT NULL,
  `type` varchar(20) NOT NULL,
  `depart` varchar(20) NOT NULL,
  `arrival` varchar(20) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_flight`
--

LOCK TABLES `tb_flight` WRITE;
/*!40000 ALTER TABLE `tb_flight` DISABLE KEYS */;
INSERT INTO `tb_flight` VALUES (1,'123','Ningbo','Beijing',1000,50,'HNN','plane','9:00','11:00'),(2,'456','Hangzhou','Guangzhou',800,30,'east','plane','13:00','15:00'),(3,'111','Shanghai','Shenzheng',1200,70,'CHN','plane','17:00','19:00');
/*!40000 ALTER TABLE `tb_flight` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_order`
--

DROP TABLE IF EXISTS `tb_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_order` (
  `id` int(50) NOT NULL AUTO_INCREMENT COMMENT '订单唯一标识',
  `username` varchar(20) NOT NULL,
  `num` varchar(20) NOT NULL,
  `createTime` varchar(20) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_order`
--

LOCK TABLES `tb_order` WRITE;
/*!40000 ALTER TABLE `tb_order` DISABLE KEYS */;
INSERT INTO `tb_order` VALUES (1,'1','123','2019-01-08'),(2,'1','456','2019-01-08'),(3,'','123','2019-01-08'),(4,'1','123','2019-01-09'),(5,'1','123','2019-01-09'),(6,'','123','2019-01-09'),(7,'4','123','2019-01-09'),(8,'11','123','2019-01-09'),(9,'11','111','2019-01-09'),(10,'5','456','2019-01-09'),(11,'5','111','2019-01-09'),(12,'2','123','2019-01-10'),(13,'2','123','2019-01-10'),(14,'1','111','2019-01-10'),(15,'111','123','2019-01-10'),(16,'111','111','2019-01-10');
/*!40000 ALTER TABLE `tb_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_user`
--

DROP TABLE IF EXISTS `tb_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_user` (
  `id` int(50) NOT NULL AUTO_INCREMENT COMMENT '用户唯一标识',
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_user`
--

LOCK TABLES `tb_user` WRITE;
/*!40000 ALTER TABLE `tb_user` DISABLE KEYS */;
INSERT INTO `tb_user` VALUES (1,'1','1','110','?','997812473@qq.com','1111'),(2,'2','2',NULL,NULL,NULL,NULL),(3,'3','123456',NULL,NULL,NULL,NULL),(4,'4','123456',NULL,NULL,NULL,NULL),(5,'11','111111','119','?','123456@qq.com','sry'),(6,'5','123456','120','?','1@qq.com','sry'),(7,'111','123456',NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `tb_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-01-10 15:42:27
