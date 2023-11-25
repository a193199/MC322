-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: dbinfox
-- ------------------------------------------------------
-- Server version	8.0.35

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
-- Table structure for table `tbos`
--

DROP TABLE IF EXISTS `tbos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbos` (
  `os` int NOT NULL AUTO_INCREMENT,
  `data_os` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `tipo` varchar(15) NOT NULL,
  `situacao` varchar(15) NOT NULL,
  `destino` varchar(100) NOT NULL,
  `dataini` int NOT NULL,
  `datafim` int NOT NULL,
  `valor` decimal(10,2) DEFAULT NULL,
  `idcli` int NOT NULL,
  `iddestino` int NOT NULL,
  PRIMARY KEY (`os`),
  KEY `idcli` (`idcli`),
  CONSTRAINT `tbos_ibfk_1` FOREIGN KEY (`idcli`) REFERENCES `tbclientes` (`idcli`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbos`
--

LOCK TABLES `tbos` WRITE;
/*!40000 ALTER TABLE `tbos` DISABLE KEYS */;
INSERT INTO `tbos` VALUES (5,'2023-11-25 01:26:10','orcamento','Em atraso','São Paulo',12,12,1.00,1,123),(6,'2023-11-25 01:28:52','orcamento','Em análise','São Paulo',12,0,1.00,1,145),(7,'2023-11-25 13:15:30','orcamento','Em análise','São Paulo',12,12,1250.00,1,1),(8,'2023-11-25 13:15:48','orcamento','Em análise','Rio de Janeiro',13,14,500.00,1,2),(10,'2023-11-25 13:51:24','orcamento','Em análise','Rio de Janeiro',12,12,500.00,1,2),(11,'2023-11-25 13:54:44','orcamento','Em análise','Natal',15,15,1000.00,2,4),(12,'2023-11-25 14:03:23','orcamento','Em análise','Piracicaba',15,15,750.00,2,10),(13,'2023-11-25 15:26:23','orcamento','Em análise','São Paulo',12,12,250.00,10,1);
/*!40000 ALTER TABLE `tbos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-25 18:52:18
