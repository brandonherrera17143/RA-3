-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: pos_ra
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `codigo` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(60) DEFAULT NULL,
  `nit` int DEFAULT NULL,
  `correo` varchar(60) DEFAULT NULL,
  `Genero` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  UNIQUE KEY `correo` (`correo`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (1,'aaaaaaaaaa',3333,'aaaaaaaaaaaa','F'),(2,'brandon',64,'ba@gmail.com','M'),(5,'Paxon',100002,'pgambrell1@walmart.com','f'),(6,'Codi',100003,'cjervois2@joomla.org','m'),(7,'Margaretha',100004,'mfawdrey3@indiegogo.com','f'),(8,'Jamie',100005,'jbrosi4@redcross.org','f'),(9,'Giles',100006,'gcraydon5@surveymonkey.com','m'),(10,'Joye',100007,'jgrange6@disqus.com','m'),(11,'Amos',100008,'arulf7@ow.ly','f'),(12,'Karney',100009,'kfilyukov8@elpais.com','m'),(13,'Tasia',100010,'tmiklem9@seattletimes.com','f'),(14,'Adham',100011,'afoyea@a8.net','m'),(15,'Stephannie',100012,'sdrinnanb@reuters.com','m'),(16,'Steve',100013,'sstillyc@auda.org.au','f'),(17,'Anabel',100014,'ashoweringd@list-manage.com','f'),(18,'Mignon',100015,'mpatmoree@prnewswire.com','m'),(19,'Madelena',100016,'mtimmisf@stanford.edu','f'),(20,'Guillermo',100017,'gpondg@blogspot.com','f'),(21,'Marijo',100018,'mvardieh@dailymotion.com','m'),(22,'Zora',100019,'zbinesteadi@hhs.gov','m'),(23,'Tamra',100020,'tcotterellj@abc.net.au','f'),(24,'Helen',100021,'hsedenk@engadget.com','m'),(25,'Goldy',100022,'gbettlesonl@about.me','f'),(26,'Leila',100023,'ledworthyem@hibu.com','m'),(27,'Allx',100024,'abaudoun@aol.com','m'),(28,'Everett',100025,'ekunzeo@nba.com','f'),(29,'Ruthi',100026,'rsumblerp@shareasale.com','m'),(30,'Karlens',100027,'kdenizetq@loc.gov','m'),(31,'Rachel',100028,'rfurlowr@examiner.com','m'),(32,'tato prueba',4,'tato@gmail.com','f');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalle_venta`
--

DROP TABLE IF EXISTS `detalle_venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detalle_venta` (
  `id_detalle_venta` int NOT NULL AUTO_INCREMENT,
  `id_numeroFactura` int NOT NULL,
  `id_producto` int NOT NULL,
  `cantidad` int DEFAULT NULL,
  `precioUnitario` decimal(10,2) DEFAULT NULL,
  `totalDetalle` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id_detalle_venta`),
  KEY `fk_factura` (`id_numeroFactura`),
  KEY `fk_producto` (`id_producto`),
  CONSTRAINT `fk_factura` FOREIGN KEY (`id_numeroFactura`) REFERENCES `factura` (`numero_factura`),
  CONSTRAINT `fk_producto` FOREIGN KEY (`id_producto`) REFERENCES `productos` (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_venta`
--

LOCK TABLES `detalle_venta` WRITE;
/*!40000 ALTER TABLE `detalle_venta` DISABLE KEYS */;
INSERT INTO `detalle_venta` VALUES (1,1000,1,2,50.00,100.00),(2,1006,1,2,125.06,250.12),(3,1008,17,3,0.00,250.23),(4,1011,10,2,2.00,1554.92),(5,1012,1,2,125.06,250.12),(6,1016,1,0,125.06,0.00),(7,1017,8,4,100.02,400.08),(8,1017,13,2,5.71,11.42),(9,1018,3,3,697.88,2093.64),(10,1019,6,3,443.28,1329.84),(11,1019,4,3,692.84,2078.52),(12,1019,9,2,621.50,1243.00),(13,1020,8,2,100.02,200.04),(14,1020,9,2,621.50,1243.00),(15,1020,3,3,697.88,2093.64),(16,1020,24,1,501.09,501.09),(17,1021,4,2,692.84,1385.68),(18,1021,8,2,100.02,200.04),(19,1022,8,2,100.02,200.04),(20,1022,8,2,100.02,200.04),(21,1022,3,2,697.88,1395.76),(22,1022,24,2,501.09,1002.18),(23,1023,8,2,100.02,200.04),(24,1023,6,2,443.28,886.56),(25,1023,21,3,840.01,2520.03),(26,1023,15,1,401.61,401.61),(27,1024,12,4,570.74,2282.96),(28,1024,21,2,840.01,1680.02),(29,1024,23,4,192.86,771.44),(30,1024,18,1,978.92,978.92),(31,1024,5,2,906.07,1812.14);
/*!40000 ALTER TABLE `detalle_venta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura`
--

DROP TABLE IF EXISTS `factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `factura` (
  `numero_factura` int NOT NULL AUTO_INCREMENT,
  `fechaEmision` date DEFAULT NULL,
  `id_vendedor` int DEFAULT NULL,
  `id_cliente` int DEFAULT NULL,
  `totalFactura` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`numero_factura`),
  KEY `fk_vendedor` (`id_vendedor`),
  KEY `fk_cliente` (`id_cliente`),
  CONSTRAINT `fk_cliente` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`codigo`),
  CONSTRAINT `fk_vendedor` FOREIGN KEY (`id_vendedor`) REFERENCES `vendedores` (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=1025 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura`
--

LOCK TABLES `factura` WRITE;
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
INSERT INTO `factura` VALUES (1000,'2021-10-10',4,2,100.00),(1002,'2023-02-02',5,5,200.00),(1003,'2023-09-09',6,6,400.00),(1004,'2023-10-10',7,6,550.00),(1005,'2023-10-10',7,6,550.00),(1006,'2023-05-02',5,5,250.12),(1008,'2023-10-10',7,10,250.23),(1011,'2023-05-02',21,2,1554.92),(1012,'2023-05-02',21,2,250.12),(1013,'2023-05-02',21,2,0.00),(1014,'2023-05-02',21,2,0.00),(1015,'2023-05-02',21,2,0.00),(1016,'2023-05-02',21,2,0.00),(1017,'2023-05-04',21,8,411.50),(1018,'2023-05-04',21,1,2093.64),(1019,'2023-05-04',21,15,4651.36),(1020,'2023-05-04',21,9,4037.77),(1021,'2023-05-04',21,2,1585.72),(1022,'2023-05-04',21,1,2798.02),(1023,'2023-05-04',21,27,4008.24),(1024,'2023-05-04',7,26,7525.48);
/*!40000 ALTER TABLE `factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productos` (
  `codigo` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(60) DEFAULT NULL,
  `descripcion` varchar(100) DEFAULT NULL,
  `cantidad` int DEFAULT NULL,
  `precio` float(6,2) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1,'vatidora','para realizar mezclas',0,125.06),(3,'Oil - Grapeseed Oil','Bednar, King and Kilback',37,697.88),(4,'Tuna - Salad Premix','Green and Sons',39,692.84),(5,'Pails With Lids','Jakubowski-Kling',35,906.07),(6,'Sparkling Wine - Rose, Freixenet','Schowalter-Morissette',41,443.28),(7,'Milk - Skim','Graham, Miller and Weissnat',100,259.72),(8,'Herb Du Provence - Primerba','Emard, Haag and Larkin',25,100.02),(9,'Cookies - Englishbay Wht','Keebler, Bogisich and Mann',52,621.50),(10,'Coffee Cup 8oz 5338cd','Simonis-Mohr',0,777.46),(11,'Lettuce - Boston Bib','Cremin-Hintz',11,987.36),(12,'Noodles - Cellophane, Thin','Skiles, Block and Konopelski',62,570.74),(13,'Mushroom - King Eryingii','Kilback, Goyette and Padberg',62,5.71),(14,'Tortillas - Flour, 8','Mohr and Sons',38,774.83),(15,'Chevere Logs','Macejkovic, Heathcote and Keeling',36,401.61),(16,'Tea - Decaf Lipton','Ledner-Abshire',2,363.67),(17,'Lettuce - Iceberg','Osinski-Runolfsdottir',6,83.41),(18,'Chips Potato Salt Vinegar 43g','Mueller, Moen and Kirlin',40,978.92),(19,'Mushroom - Oyster, Fresh','Hudson-Beahan',44,962.29),(20,'Peas - Pigeon, Dry','Jakubowski, Morissette and Kulas',35,877.97),(21,'Gatorade - Xfactor Berry','Kassulke-Hand',74,840.01),(22,'Smoked Tongue','Haley LLC',30,667.36),(23,'Carrots - Mini, Stem On','Gislason, Runolfsson and Murazik',31,192.86),(24,'Cake - Pancake','Barrows Inc',50,501.09),(25,'Sauce - Vodka Blush','Torp, Howe and Daniel',30,382.20);
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sucursales`
--

DROP TABLE IF EXISTS `sucursales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sucursales` (
  `codigo` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(60) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `correo` varchar(60) DEFAULT NULL,
  `telefono` int DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  UNIQUE KEY `correo` (`correo`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sucursales`
--

LOCK TABLES `sucursales` WRITE;
/*!40000 ALTER TABLE `sucursales` DISABLE KEYS */;
INSERT INTO `sucursales` VALUES (2,'Wisoky-Bergnaum','71818 Meadow Vale Way','swoodeson0@imgur.com',2462328),(3,'Douglas-Larson','044 Independence Alley','rmadge1@newyorker.com',2456609),(4,'Metz-Reinger','279 Larry Lane','jitskovitz2@friendfeed.com',2495630),(5,'Kreiger and Sons','8 Novick Lane','eboraston3@apache.org',2400192),(6,'Jaskolski Inc','333 Bartelt Circle','rheinreich4@nsw.gov.au',2495829),(7,'Dickinson-Schoen','34 Delaware Way','afuster5@unblog.fr',2402859),(8,'Hermiston-Brekke','47391 Rowland Road','bsegot6@abc.net.au',2415390),(9,'Schamberger, Shields and Corwin','9552 Sommers Point','ehartburn7@about.me',2433697),(10,'Harvey Group','3730 Sundown Plaza','ctrees8@fema.gov',2442938),(11,'Deckow-Walter','62 Troy Street','jpim9@altervista.org',2463599),(12,'Bednar and Sons','07 Texas Pass','clevisa@linkedin.com',2452281),(13,'McCullough Group','898 Elka Center','dtronib@dailymail.co.uk',2437791),(14,'Harris, McKenzie and Hintz','66403 Morningstar Hill','gfoldc@amazonaws.com',2480766),(15,'Volkman-Kuphal','29 Leroy Alley','wdayleyd@tinypic.com',2467424),(16,'Rogahn, Bins and Wintheiser','80988 Ridgeview Hill','fjanoute@ycombinator.com',2414941),(17,'Collier-Kulas','86 Heath Plaza','jyounglovef@nymag.com',2446769),(18,'Johnston and Sons','0261 Nancy Trail','pharlingg@tinypic.com',2479013),(19,'Macejkovic-VonRueden','09 Lillian Hill','mespinhah@jiathis.com',2429016),(20,'Bailey Group','3586 Amoth Crossing','wgerriti@bloomberg.com',2495423),(21,'Shields-Dickens','64597 Walton Center','lwishamj@google.com.au',2480490),(22,'Mayer, Roob and Wiza','0 Manitowish Way','pbernardeschik@dion.ne.jp',2421944),(23,'O\'Reilly LLC','516 Forest Dale Crossing','sbirkinshawl@geocities.jp',2498929);
/*!40000 ALTER TABLE `sucursales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendedores`
--

DROP TABLE IF EXISTS `vendedores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vendedores` (
  `codigo` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(60) DEFAULT NULL,
  `caja` int DEFAULT NULL,
  `ventas` int DEFAULT NULL,
  `Genero` varchar(40) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendedores`
--

LOCK TABLES `vendedores` WRITE;
/*!40000 ALTER TABLE `vendedores` DISABLE KEYS */;
INSERT INTO `vendedores` VALUES (3,'aaaaaaaaaa',111111111,1111111,'f','aaaaaa1111111111'),(4,'Katleen',102,0,'m','e3699d375ded04880e3166dc55f89fde'),(5,'Felizio',103,0,'m','379094cd2c69562f8b8305439b49a613'),(6,'Arnie',104,0,'f','808cb3e29688a78c56610d2a457e5ee4'),(7,'Edwin',105,0,'f','4a562ffc4813726d83d0acdd854fc87d'),(8,'Laurens',106,0,'f','1a7417ff18ee9bfe6f04233dd7ec6908'),(9,'Allianora',107,0,'m','3910f2c2fc6b5bce7ed4d739ae576928'),(10,'Johnnie',108,0,'f','e1d6c5af6076cb6f1d21833b017f7acf'),(11,'Kala',109,0,'m','08621114b828e2910eb45cc0f1d5c11e'),(12,'Terrijo',110,0,'m','5713177c9d4678186b4f52fc58adfca7'),(13,'Broderick',111,0,'f','f00c4e0dbd8e53f198d650fc877d51c5'),(14,'Junia',112,0,'m','8623116fdaf6cec4a6f34cfdf33e8875'),(15,'Myrah',113,0,'m','e6ce0d8beebbcb4a35ceeb81d0fa993a'),(16,'Wendeline',114,0,'m','bebbd8a4c3b2f1498bf9ccd567e9390c'),(17,'Malcolm',115,0,'m','b24449675845d066d0b8b0823c8125e7'),(18,'Otis',116,0,'m','cc75ca180881baa4d6fa02673e247891'),(19,'Sanford',117,0,'m','47a30d30bcbe2a852751dbcc6f846a48'),(20,'Bar',118,0,'m','c635b159445bf65eaf68805aafbfe449'),(21,'tato',45,45,'m','0000');
/*!40000 ALTER TABLE `vendedores` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-04 12:48:47
