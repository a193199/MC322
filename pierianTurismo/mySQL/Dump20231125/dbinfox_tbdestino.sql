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
-- Table structure for table `tbdestino`
--

DROP TABLE IF EXISTS `tbdestino`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbdestino` (
  `iddestino` int NOT NULL,
  `estado` varchar(50) NOT NULL,
  `cidade` varchar(50) NOT NULL,
  `local` varchar(50) DEFAULT NULL,
  `categoria` varchar(50) DEFAULT NULL,
  `dataini` date DEFAULT NULL,
  `datafim` date DEFAULT NULL,
  PRIMARY KEY (`iddestino`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbdestino`
--

LOCK TABLES `tbdestino` WRITE;
/*!40000 ALTER TABLE `tbdestino` DISABLE KEYS */;
INSERT INTO `tbdestino` VALUES (1,'São Paulo','São Paulo','Pousada Sol','Relaxamento','2023-01-01','2023-12-29'),(2,'Rio de Janeiro','Rio de Janeiro','Hotel X','Cultura','2023-08-29','2021-08-29'),(3,'Minas Gerais','Belo Horizonte','Pousada Pão de Queijo','Aventura','2023-08-29','2021-08-29'),(4,'Paraná','Curitiba','Hotel Vina','Relaxamento','2021-08-29','2023-08-29'),(11,'São Paulo','São Paulo','Hotel X','Cultura','2021-08-29','2023-10-29'),(12,'São Paulo','Campinas','Pousada Amanhã','Aventura','2022-10-31','2028-08-29'),(13,'São Paulo','São Sebastião','Pousada Pé na Areia','Relaxamento','2023-12-29','2025-08-29'),(14,'São Paulo','Praia Grande','Airbnb','Relaxamento','2023-12-30','2027-08-29'),(15,'São Paulo','São Sebastião','Airbnb','Relaxamento',NULL,NULL),(23,'Rio de Janeiro','Angra dos Reis','Pousada Nadador','Aventura',NULL,NULL),(24,'Parana','Montanhas','Pousada montanhas','Aventura',NULL,NULL);
/*!40000 ALTER TABLE `tbdestino` ENABLE KEYS */;
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
