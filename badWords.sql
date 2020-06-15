-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: badwords
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `dirtywords`
--

DROP TABLE IF EXISTS `dirtywords`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dirtywords` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `word` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `word` (`word`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2298 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dirtywords`
--

LOCK TABLES `dirtywords` WRITE;
/*!40000 ALTER TABLE `dirtywords` DISABLE KEYS */;
INSERT INTO `dirtywords` VALUES (1,'anal'),(2,'anus'),(3,'arse'),(4,'ass'),(5,'balls'),(6,'ballsack'),(7,'bastard'),(8,'biatch'),(9,'bitch'),(10,'bloody'),(11,'blow job'),(12,'blowjob'),(13,'bollock'),(14,'bollok'),(15,'boner'),(16,'boob'),(17,'bugger'),(18,'bum'),(19,'butt'),(20,'buttplug'),(21,'clitoris'),(22,'cock'),(23,'coon'),(24,'crap'),(25,'cunt'),(26,'damn'),(27,'dick'),(28,'dildo'),(29,'dyke'),(30,'f u c k'),(31,'fag'),(32,'feck'),(33,'felching'),(34,'fellate'),(35,'fellatio'),(36,'flange'),(37,'fuck'),(38,'fudge packer'),(39,'fudgepacker'),(40,'God damn'),(41,'Goddamn'),(42,'hell'),(43,'homo'),(44,'jerk'),(45,'jizz'),(46,'knob end'),(47,'knobend'),(48,'labia'),(49,'lmao'),(50,'lmfao'),(51,'muff'),(52,'nigga'),(53,'nigger'),(54,'omg'),(55,'penis'),(56,'piss'),(57,'poop'),(58,'prick'),(59,'pube'),(60,'pussy'),(61,'queer'),(62,'s hit'),(63,'scrotum'),(64,'sex'),(65,'sh1t'),(66,'shit'),(67,'slut'),(68,'smegma'),(69,'spunk'),(70,'tit'),(71,'tosser'),(72,'turd'),(73,'twat'),(74,'vagina'),(75,'wank'),(76,'whore'),(77,'wtf');
/*!40000 ALTER TABLE `dirtywords` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-15 15:13:35
