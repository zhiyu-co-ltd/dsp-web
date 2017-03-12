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
-- Table structure for table `t_stat_ad_relation`
--

DROP TABLE IF EXISTS `t_stat_ad_relation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_stat_ad_relation` (
  `id` int(8) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` varchar(127) NOT NULL COMMENT '用户ID',
  `user_email` varchar(127) DEFAULT NULL COMMENT '用户email',
  `user_name` varchar(127) DEFAULT NULL COMMENT '用户名',
  `ad_id` varchar(127) NOT NULL COMMENT '广告ID',
  `ad_plan_id` varchar(127) DEFAULT NULL COMMENT '广告计划ID',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_stat_ad_relation`
--

LOCK TABLES `t_stat_ad_relation` WRITE;
/*!40000 ALTER TABLE `t_stat_ad_relation` DISABLE KEYS */;
INSERT INTO `t_stat_ad_relation` VALUES (2,'123',NULL,NULL,'aid1',NULL);
/*!40000 ALTER TABLE `t_stat_ad_relation` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-12 18:07:45
