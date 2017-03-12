-- MySQL dump 10.16  Distrib 10.1.20-MariaDB, for osx10.11 (x86_64)
--
-- Host: dsp    Database: dsp
-- ------------------------------------------------------
-- Server version	10.1.20-MariaDB

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
-- Table structure for table `t_stat_gather_info`
--

DROP TABLE IF EXISTS `t_stat_gather_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_stat_gather_info` (
  `id` int(8) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `aid` varchar(127) NOT NULL COMMENT '广告标示',
  `sid` varchar(127) NOT NULL COMMENT '广告位标示',
  `mid` varchar(127) NOT NULL COMMENT '物料标示',
  `pv` int(8) NOT NULL DEFAULT '0' COMMENT '展现',
  `clk` int(8) NOT NULL DEFAULT '0' COMMENT '点击',
  `inst` int(8) NOT NULL DEFAULT '0' COMMENT '安装',
  `cost` decimal(18,6) NOT NULL COMMENT '花费',
  `day` int(8) NOT NULL COMMENT '日期 yyyymmdd 用int类型',
  `hour` int(2) NOT NULL COMMENT '0～23 用int类型',
  `week` int(2) DEFAULT NULL COMMENT '0～54 用int类型。linux week',
  `month` int(2) DEFAULT NULL COMMENT '1～12 用int类型',
  `year` varchar(4) DEFAULT NULL COMMENT 'yyyy 用int类型',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_stat_gather_info`
--

LOCK TABLES `t_stat_gather_info` WRITE;
/*!40000 ALTER TABLE `t_stat_gather_info` DISABLE KEYS */;
INSERT INTO `t_stat_gather_info` VALUES (1,'aid1','sid1','mid1',0,0,0,100.000000,20170312,13,NULL,NULL,NULL),(2,'aid1','sid1','mid1',0,0,0,200.000000,20170312,14,NULL,NULL,NULL),(3,'aid1','sid1','mid1',0,0,0,200.000000,20170311,14,NULL,NULL,NULL),(4,'aid1','sid1','mid1',0,0,0,200.000000,20170311,13,NULL,NULL,NULL);
/*!40000 ALTER TABLE `t_stat_gather_info` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-12 18:08:03
