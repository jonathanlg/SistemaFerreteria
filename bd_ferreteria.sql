-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: bd_ferreteria
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `accesos`
--

DROP TABLE IF EXISTS `accesos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `accesos` (
  `acc_codigo` int(11) NOT NULL AUTO_INCREMENT,
  `acc_usuario` int(11) NOT NULL,
  `acc_nombre` varchar(50) DEFAULT NULL,
  `acc_user` varchar(15) DEFAULT NULL,
  `acc_perfil` varchar(15) DEFAULT NULL,
  `acc_descripcion` varchar(50) DEFAULT NULL,
  `acc_tipoacceso` varchar(8) DEFAULT NULL,
  `acc_fecha` datetime DEFAULT NULL,
  PRIMARY KEY (`acc_codigo`),
  KEY `FK_h35td65hiplk2maioyk17qut6` (`acc_usuario`),
  CONSTRAINT `FK_h35td65hiplk2maioyk17qut6` FOREIGN KEY (`acc_usuario`) REFERENCES `usuario` (`usu_codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=68 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accesos`
--

LOCK TABLES `accesos` WRITE;
/*!40000 ALTER TABLE `accesos` DISABLE KEYS */;
INSERT INTO `accesos` VALUES (16,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez ingresó al sistema','Entrada','2016-10-16 17:23:13'),(17,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez salió del sistema','Salida','2016-10-16 17:24:30'),(18,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez ingresó al sistema','Entrada','2016-10-16 17:26:31'),(19,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez salió del sistema','Salida','2016-10-16 17:26:44'),(20,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez ingresó al sistema','Entrada','2016-10-16 17:38:37'),(21,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez salió del sistema','Salida','2016-10-16 17:39:31'),(22,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez ingresó al sistema','Entrada','2016-10-16 17:40:24'),(23,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez salió del sistema','Salida','2016-10-16 17:42:15'),(24,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez ingresó al sistema','Entrada','2016-10-16 17:44:02'),(25,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez salió del sistema','Salida','2016-10-16 17:44:41'),(26,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez ingresó al sistema','Entrada','2016-10-16 17:45:16'),(27,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez salió del sistema','Salida','2016-10-16 17:45:31'),(28,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez ingresó al sistema','Entrada','2016-10-26 22:57:36'),(29,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez ingresó al sistema','Entrada','2016-10-26 22:59:27'),(30,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez ingresó al sistema','Entrada','2016-10-26 23:00:23'),(31,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez ingresó al sistema','Entrada','2016-10-26 23:05:03'),(32,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez salió del sistema','Salida','2016-10-26 23:09:28'),(33,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez ingresó al sistema','Entrada','2016-10-26 23:47:34'),(34,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez salió del sistema','Salida','2016-10-26 23:49:07'),(35,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez ingresó al sistema','Entrada','2016-10-26 23:50:40'),(36,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez salió del sistema','Salida','2016-10-26 23:51:54'),(37,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez ingresó al sistema','Entrada','2016-10-26 23:53:32'),(38,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez salió del sistema','Salida','2016-10-26 23:55:51'),(39,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez ingresó al sistema','Entrada','2016-10-30 21:56:35'),(40,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez salió del sistema','Salida','2016-10-30 22:02:25'),(41,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez ingresó al sistema','Entrada','2016-10-30 22:03:22'),(42,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez salió del sistema','Salida','2016-10-30 22:17:18'),(43,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez ingresó al sistema','Entrada','2016-10-30 22:17:24'),(44,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez ingresó al sistema','Entrada','2016-10-30 22:20:23'),(45,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez salió del sistema','Salida','2016-10-30 22:25:30'),(46,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez ingresó al sistema','Entrada','2016-10-30 22:26:23'),(47,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez salió del sistema','Salida','2016-10-30 22:32:11'),(48,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez ingresó al sistema','Entrada','2016-10-30 22:32:17'),(49,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez salió del sistema','Salida','2016-10-30 22:33:51'),(50,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez ingresó al sistema','Entrada','2016-10-30 22:33:59'),(51,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez salió del sistema','Salida','2016-10-30 22:41:02'),(52,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez ingresó al sistema','Entrada','2016-11-12 21:31:09'),(53,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez salió del sistema','Salida','2016-11-12 21:36:02'),(54,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez ingresó al sistema','Entrada','2016-11-12 21:39:28'),(55,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez salió del sistema','Salida','2016-11-12 21:41:18'),(56,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez ingresó al sistema','Entrada','2016-11-12 21:42:48'),(57,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez salió del sistema','Salida','2016-11-12 22:13:35'),(58,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez ingresó al sistema','Entrada','2016-11-12 22:13:41'),(59,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez salió del sistema','Salida','2016-11-12 23:42:42'),(60,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez ingresó al sistema','Entrada','2019-01-24 18:57:57'),(61,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez salió del sistema','Salida','2019-01-24 18:58:49'),(62,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez ingresó al sistema','Entrada','2019-01-24 19:41:41'),(63,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez salió del sistema','Salida','2019-01-24 19:45:18'),(64,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez ingresó al sistema','Entrada','2019-03-15 14:09:47'),(65,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez ingresó al sistema','Entrada','2019-08-16 20:29:15'),(66,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez ingresó al sistema','Entrada','2019-09-08 19:35:50'),(67,1,'JONATHAN M. LOPEZ','jlopez','1','jlopez salió del sistema','Salida','2019-09-08 19:44:56');
/*!40000 ALTER TABLE `accesos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `articulo`
--

DROP TABLE IF EXISTS `articulo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `articulo` (
  `art_codigo` int(11) NOT NULL,
  `art_descripcion` varchar(40) DEFAULT NULL,
  `art_marca` int(11) NOT NULL,
  `art_proveedor` int(11) NOT NULL,
  `art_efectivo` double DEFAULT NULL,
  `art_montocalculado` double DEFAULT NULL,
  `art_tarjeta` double DEFAULT NULL,
  `art_costo` double DEFAULT NULL,
  `art_fechacompra` date DEFAULT NULL,
  `art_unidad` int(11) NOT NULL,
  `art_rubro` int(11) NOT NULL,
  `art_stock` int(11) DEFAULT NULL,
  `art_indicador` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`art_codigo`),
  KEY `FK_t5y4c1a0ayi0cu6nd9wdjstor` (`art_marca`),
  KEY `FK_j015rcw4lm95y4tmr6pme2oef` (`art_proveedor`),
  KEY `FK_s3x1dtniad59aw8qylv31d7ku` (`art_rubro`),
  KEY `FK_lv2lipk09h5glk8urdvmqw9ai` (`art_unidad`),
  CONSTRAINT `FK_j015rcw4lm95y4tmr6pme2oef` FOREIGN KEY (`art_proveedor`) REFERENCES `proveedor` (`pro_codigo`),
  CONSTRAINT `FK_lv2lipk09h5glk8urdvmqw9ai` FOREIGN KEY (`art_unidad`) REFERENCES `unidad` (`uni_codigo`),
  CONSTRAINT `FK_s3x1dtniad59aw8qylv31d7ku` FOREIGN KEY (`art_rubro`) REFERENCES `rubro` (`rub_codigo`),
  CONSTRAINT `FK_t5y4c1a0ayi0cu6nd9wdjstor` FOREIGN KEY (`art_marca`) REFERENCES `marca` (`mar_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `articulo`
--

LOCK TABLES `articulo` WRITE;
/*!40000 ALTER TABLE `articulo` DISABLE KEYS */;
INSERT INTO `articulo` VALUES (1,'PASADOR PARA CARPINTERO PALANCA DE BRONC',1,1,42,40,0,45,'2014-11-04',1,1,124,'S'),(2,'PASADOR PARA CARPINTERO PALANCA DE PLATA',4,6,313,300,0,306,'2014-10-06',3,5,226,'S'),(3,'PASADOR PARA HERRERO PALANCA DE BRONCE 1',4,8,584,575,0,581,'2014-11-09',2,4,68,'S'),(4,'PASADOR PARA HERRERO PALANCA DE BRONCE 2',2,7,233,230,0,236,'2014-04-24',3,5,106,'S'),(5,'PERILLA CHICA PARA BISAGRA',4,8,33,27,0,33,'2014-04-24',1,2,517,'S'),(6,'PERILLA GRANDE PARA BISAGRA',3,3,86,85,0,91,'2014-05-15',2,2,107,'S'),(7,'PERNO PARA BISAGRA 100',1,5,323,320,0,326,'2014-06-19',3,5,414,'S'),(8,'PERNO PARA BISAGRA 124',3,4,343,335,0,341,'2014-04-24',1,2,425,'S'),(9,'PERNO PARA BISAGRA 145',4,6,67,55,0,61,'2014-04-24',2,3,641,'S'),(10,'PERNO PARA BISAGRA 175',2,7,323,325,0,331,'2014-04-24',3,1,113,'S'),(11,'PERNO PARA BISAGRA 78',3,8,42,40,0,46,'2014-04-24',1,5,520,'S'),(12,'PUÑO FIJO CON CHAPON BRONCE PLATIL',3,5,32,28,0,34,'2014-05-15',2,2,50,'S'),(13,'PUÑO FIJO CON CHAPON DON ARAGON BRONCE',2,3,223,220,0,226,'2014-04-24',3,3,653,'S'),(14,'PUÑO GIRATORIA CON CHAPON DON ARAGON BRO',1,1,554,250,0,256,'2014-04-24',3,2,665,'S'),(15,'PUÑO GIRATORIA CON CHAPON DON ARAGON BRO',4,2,333,325,0,331,'2014-04-24',3,5,619,'S'),(16,'RULEMAN PARA BISAGRA BRONCE CHICO 18',3,4,46,40,0,46,'2014-04-24',2,1,340,'S'),(17,'RULEMAN PARA BISAGRA BRONCE GRANDE 21',2,6,586,580,0,586,'2014-04-24',1,3,724,'S'),(18,'RULEMAN PARA BISAGRA CHICO 18MM',1,7,765,760,0,766,'2014-04-24',1,4,149,'S'),(19,'RULEMAN PARA BISAGRA GRANDE 21MM',3,8,322,320,0,326,'2014-04-24',2,5,729,'S'),(20,'SOPORTE PARA ESTANTE BLANCO 75X100',4,6,243,240,0,246,'2014-11-09',3,3,96,'S'),(21,'TACHAS BRONCEADAS',2,3,355,350,0,356,'2014-04-24',3,2,728,'S'),(22,'TACHAS NIQUELADAS',3,2,78,75,0,81,'2014-08-24',1,1,100,'S'),(23,'TANQUE  NAFTA  AUTO RE-12 SALIDA H/BAUL',4,4,534,530,0,536,'2014-04-24',1,5,421,'S'),(24,'TORNILLO DE BRONCE 17X17 GOTA SEBO',2,5,54,50,0,56,'2014-04-24',2,3,208,'S'),(25,'TORNILLO DE BRONCE 20X20 GOTA SEBO',3,4,23,20,0,26,'2014-04-24',3,2,423,'S'),(26,'TUERCA DE BRONCE ESTAMPADAS 1/4',4,9,24,21,0,27,'2014-05-15',3,3,105,'S'),(27,'TUERCA DE BRONCE ESTAMPADAS 5/32',2,3,32,28,0,34,'2014-04-24',1,5,134,'S'),(28,'TUERCA Y ESPARRAGO DE SEGURIDAD',3,1,234,230,0,236,'2014-04-24',1,2,430,'S'),(29,'PERNO PARA BISAGRA 78',3,2,134,130,0,136,'2014-07-19',2,3,150,'S'),(30,'PINCEL TODO USO CERDA NEGRA 2.1/2',2,1,334,220,0,226,'2014-04-24',3,4,239,'S'),(31,'ARANDELA DE COBRE 24',4,3,343,240,0,246,'2014-04-24',3,5,407,'S'),(32,'ARANDELA DE COBRE 8',1,6,34,29,0,35,'2014-05-15',2,4,214,'S'),(33,'ARANDELA DE FIBRA 24',2,6,54,38,0,44,'2014-04-24',1,3,123,'S'),(34,'ARANDELA DE FIBRA 8',2,5,86,80,0,86,'2014-05-15',2,4,43,'S'),(35,'DISCO DIAMANTADO LASER LS-AB ECONOMY 4',3,6,543,540,0,546,'2014-04-24',3,2,224,'S'),(36,'DISCO DIAMANTADO LASER LS ECONOMY 9',2,4,323,320,0,326,'2014-04-24',1,5,243,'S'),(37,'MARIPOSA DE BRONCE MACHO 3/8X1',4,2,233,230,0,236,'2014-04-24',2,3,259,'S'),(38,'PASADOR CON TRABA POSICION EMPAVONADO 35',2,4,325,320,0,326,'2014-04-24',3,4,215,'S'),(39,'PASADOR DE EMBUTIR C/CAJA',2,6,333,331,0,337,'2014-04-24',2,1,226,'S'),(40,'PASADOR PARA CARPINTERO PALANCA DE BRONC',4,5,233,321,0,327,'2014-07-19',1,1,60,'S'),(41,'ACEITE ENV.TAMBOR  SUPERDIESEL 15W40 T20',2,4,629,626,0,632,'2014-04-24',3,5,254,'S'),(42,'AGRO 3M X 200MIC',3,3,554,550,0,556,'2014-04-24',2,3,736,'S'),(43,'AGRO 4M X 200MIC',3,4,291,281,0,287,'2014-04-24',1,4,243,'S'),(44,'AGRO 6M X 200MIC',2,6,385,380,0,386,'2014-04-24',2,4,87,'S'),(45,'ARANDELA DE ALUMINIO 12',4,7,496,480,0,486,'2014-05-15',3,2,212,'S'),(46,'ARANDELA DE ALUMINIO 24',2,3,271,265,0,271,'2014-08-24',2,5,482,'S'),(47,'ARANDELA DE ALUMINIO 4',4,7,328,325,0,331,'2014-04-24',1,3,735,'S'),(48,'ARANDELA DE BRONCE 3/8',3,4,138,130,0,136,'2014-04-24',2,3,216,'S'),(49,'PRISIONERO PARA MANIJA GIRATORIA',4,4,348,340,0,346,'2014-04-24',2,4,224,'S'),(50,'PRISIONERO PARA PERNO FLOTANTE',3,5,128,115,0,121,'2014-04-24',1,3,327,'S'),(51,'PUÑO DOBLE BALANCIN CON CHAPON DON ARAGO',3,5,450,435,0,441,'2014-04-24',2,5,209,'S'),(52,'ABRAZADERA STANDART 110 X 130 BANDA 9MM',5,9,11.86,11.76,12.26,11.76,'2014-05-20',4,5,228,'S'),(53,'ACOPLE COMPLETO A BOLILLA 1/2',7,6,14.5,14.4,14.9,14.4,'2014-05-20',4,5,219,'S'),(54,'ADAPTADOR P/BAYONETAS',9,3,26.02,25.92,26.42,25.92,'2014-10-05',4,3,116,'S'),(55,'AMOLADORA 1/2 HP HP. ECONOMICA ',8,5,232.85,232.75,233.25,232.75,'2014-05-20',4,4,130,'S'),(56,'ANTIPARRA PVC UCU 321B',5,7,10.77,10.67,11.17,10.67,'2014-05-20',4,6,132,'S'),(57,'BASE GIRATORIA P/MORSA NR-4',6,8,12.58,12.48,12.98,12.48,'2014-05-20',4,6,127,'S'),(58,'CABLE DE ACERO 6X7 MM',8,1,31.72,31.62,32.12,31.62,'2014-05-20',1,3,103,'S'),(59,'CADENA ESLABON DERECHO N 30',5,6,63.75,63.65,64.15,63.65,'2014-05-25',1,3,144,'S'),(60,'CANDADO N 30 DOBLE TRABA BRONCE',5,10,70.41,70.31,70.81,70.31,'2014-05-20',4,3,186,'S'),(61,'ROLLO DE CABLE DE COBRE',5,1,282.58,282.48,282.98,282.48,'2014-09-29',1,9,893,'S'),(62,'ARGOLLAS PLASTICAS 30CM',9,2,43.3,43.2,43.7,43.2,'2014-10-05',1,2,679,'S'),(63,'CREMALLERA METALICA',8,1,119.7,119.6,120.1,119.6,'2014-10-05',4,5,425,'S'),(64,'TELA ALGODON MALLA',9,1,161.2,161.1,161.6,161.1,'2014-10-05',2,10,986,'S'),(65,'GRADUADOR PROFESIONAL FABER',8,1,81.57,81.47,81.97,81.47,'2014-10-05',4,4,791,'S'),(66,'CABLE AUDIO BLANCO/GRIS 2X0.75',9,7,63.66,63.56,64.06,63.56,'2014-10-05',1,9,1982,'S'),(67,'CABLE COAXIAL ANTENA TV ECONOMICA 5M',9,7,60.15,60.05,60.55,60.05,'2014-11-06',1,9,59,'S'),(68,'ADAPTADOR 10-16A C/TT 1303-3 TOMAS',9,1,12.48,12.38,12.88,12.38,'2014-10-05',4,9,775,'S'),(69,'ADAPTADOR 10A 1206-2 T+LUZ',9,8,11.14,11.04,11.54,11.04,'2014-10-05',4,9,762,'S'),(70,'CLAVIJA BIPOLAR GOMA 16A 1133 NEGRO',9,8,14.64,14.54,15.04,14.54,'2014-10-05',4,9,763,'S'),(71,'ABRELATAS DE TENAZAS',9,7,41.5,41.4,41.9,41.4,'2014-10-12',4,5,989,'S'),(72,'ABRELATAS EXPLORADOR',9,1,38.74,38.64,39.14,38.64,'2014-10-12',4,6,965,'S'),(73,'ABRELATAS GIRATORIO',9,1,48.04,47.94,48.44,47.94,'2014-10-12',4,6,949,'S');
/*!40000 ALTER TABLE `articulo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `caja`
--

DROP TABLE IF EXISTS `caja`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `caja` (
  `ca_id` int(11) NOT NULL,
  `ca_fecha` date DEFAULT NULL,
  `ca_inicial` double DEFAULT NULL,
  `ca_final` double DEFAULT NULL,
  `ca_diferencia` double DEFAULT NULL,
  PRIMARY KEY (`ca_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `caja`
--

LOCK TABLES `caja` WRITE;
/*!40000 ALTER TABLE `caja` DISABLE KEYS */;
INSERT INTO `caja` VALUES (1,'2016-10-16',0,0,0),(2,'2016-10-16',100,0,0),(3,'2016-10-26',152,0,0),(4,'2016-10-30',560,996.61,436.61),(5,'2016-11-13',100,0,0),(6,'2019-03-15',100,0,0),(7,'2019-09-08',100,0,0);
/*!40000 ALTER TABLE `caja` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categcompra`
--

DROP TABLE IF EXISTS `categcompra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `categcompra` (
  `ccp_codigo` int(11) NOT NULL,
  `ccp_nombre` varchar(15) DEFAULT NULL,
  `ccp_indicador` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`ccp_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categcompra`
--

LOCK TABLES `categcompra` WRITE;
/*!40000 ALTER TABLE `categcompra` DISABLE KEYS */;
INSERT INTO `categcompra` VALUES (1,'INSUMOS','S'),(2,'OTROS','S');
/*!40000 ALTER TABLE `categcompra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `clientes` (
  `cli_codigo` int(11) NOT NULL,
  `cli_razonsocial` varchar(50) DEFAULT NULL,
  `cli_contacto` varchar(50) DEFAULT NULL,
  `cli_vendedor` int(11) NOT NULL,
  `cli_telefono` varchar(9) DEFAULT NULL,
  `cli_celular` varchar(11) DEFAULT NULL,
  `cli_fax` varchar(9) DEFAULT NULL,
  `cli_rubro` int(11) NOT NULL,
  `cli_ruc` varchar(12) DEFAULT NULL,
  `cli_limitecuenta` double DEFAULT NULL,
  `cli_direccion` varchar(50) DEFAULT NULL,
  `cli_email` varchar(50) DEFAULT NULL,
  `cli_web` varchar(50) DEFAULT NULL,
  `cli_transporte` int(11) NOT NULL,
  `cli_provincia` int(11) NOT NULL,
  `cli_zona` int(11) NOT NULL,
  `cli_descuento` double DEFAULT NULL,
  `cli_tipopago` varchar(20) DEFAULT NULL,
  `cli_observacion` varchar(200) DEFAULT NULL,
  `cli_indicador` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`cli_codigo`),
  KEY `FK_9hlpmajigf49y02prk1qvqwmi` (`cli_provincia`),
  KEY `FK_pvoju072l1buu36qrnxthy6hx` (`cli_rubro`),
  KEY `FK_brb3ipo0ndmd8f98yti4sm5ts` (`cli_transporte`),
  KEY `FK_bcq2a7qtd89u2ot6epr25yp9k` (`cli_vendedor`),
  KEY `FK_b39woyh1acq7eka226mtltucp` (`cli_zona`),
  CONSTRAINT `FK_9hlpmajigf49y02prk1qvqwmi` FOREIGN KEY (`cli_provincia`) REFERENCES `provincias` (`prv_codigo`),
  CONSTRAINT `FK_b39woyh1acq7eka226mtltucp` FOREIGN KEY (`cli_zona`) REFERENCES `zona` (`zon_codigo`),
  CONSTRAINT `FK_bcq2a7qtd89u2ot6epr25yp9k` FOREIGN KEY (`cli_vendedor`) REFERENCES `vendedor` (`ven_codigo`),
  CONSTRAINT `FK_brb3ipo0ndmd8f98yti4sm5ts` FOREIGN KEY (`cli_transporte`) REFERENCES `transporte` (`tra_codigo`),
  CONSTRAINT `FK_pvoju072l1buu36qrnxthy6hx` FOREIGN KEY (`cli_rubro`) REFERENCES `rubro` (`rub_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (1,'INDUSTRIAS TONINO','JOSE',4,'5485018','893527492','1923',1,'9217239827',1200,'CALLE 5 MZ. E LT. 4 URB. EL NARANJITO - P. PIEDRA','informes@tonico.com','www.tonino-peru.com',2,1,1,11,'EFECTIVO','CLIENTE EXIGENTE','S'),(2,'REPRESENTACIONES CENTER S.A.','JUAQUIN',3,'3264400','939987238','9019',5,'1927491274',1200,'AVENID SALAVERRY, 206 URB. EL PINO - SAN LUIS','informes@alumniocenter.compe','www.aluminiocenter.com.pe',2,1,1,11,'TARJETA','CLIENTE EXIGENTE','S'),(3,'JR STEEL COMPANY S.A.C','RAFAEL',6,'3432987','897283490','9021',1,'9072140820',1400,'PARINACOCHAS, 940','informes@jrsteelcompany.com','www.jrsteelcompany.com',3,1,5,12,'EFECTIVO','CLIENTE LEJANO','S'),(4,'COMERCIAL DEL ACERO - SUCURSAL DE EL CERCADO','ESTEVAN',6,'4332543','892423223','1231',3,'7453646343',1250,'AVENIDA ARGENTINA, 2017 2051 - C. LIMA','informes@comasa.com.pe','www.comasa.com.pe',2,1,5,9,'TARJETA','CLIENTE MOROSO','S'),(5,'AFIDERSA S. A. C.','XIMENA',8,'8305472','984533453','2341',5,'3645757657',1500,'AVENIDA HUAROCHIRI MZ. C LT. 17, SANTA ANITA','informes@acerofidersa.com','www.acerosafidersa.com',2,1,3,15,'EFECTIVO','NINGUNA','S'),(6,'JAHESA - SUCURSAL DE CERCADO CALLAO','ROXANA',1,'4645701','745346346','1232',6,'5234253464',1300,'CALLE LAMBDA, 180','informes@jahesa.com','www.jahesa.com',3,2,4,12,'TARJETA','NINGUNA','S'),(7,'ANGULOS RANURADOS ESTILOS Y DISEÑOS S.R.L.','PABLO',1,'4714562','898675678','2311',5,'8658363464',1250,'AVENIDA JOSÉ PARDO DE ZELA, 807','informes@angulosred.com','www.angulosred.com',2,1,4,6,'TARJETA','NINGUNA','S'),(8,'IMEGUEZA - SUCURSAL DE PUENTE PIEDRA','CARLOS',4,'5502066','979863247','9812',5,'9817293901',1400,'MZ. A3 LT. 3 AS. ALAMEDA DEL NORTE','informes@imeguezaperu.com','www.imeguezaperu.com',2,1,1,12,'TARJETA','NINGUNA','S'),(9,'POLINSUMOS - SUCURSAL DE LURÍN','URSULA',1,'5132930','643647475','2143',2,'7547456454',1250,'CALLE LOS FRESNOS - LURIN','informes@polinsumos.com','www.polinsumos.com',1,1,2,11,'TARJETA','NINGUNA','S'),(10,'Q PLAST S.A.C.','JORGE',1,'6473828','892667477','2488',2,'1084932904',1350,'AVENIDA MARISCAL OSCAR R. BENAVIDES, 643 C. LIMA','informes@aplasticos.com','www.aplasticos.com',3,2,5,10,'EFECTIVO','NINGUNA','S'),(11,'FUMINSUMOS S.A.','RAUL',8,'2398392','939279787','1298',8,'2384989823',14550,'AV. BRAZIL CALLE 34','fuminsumos@gmail.com','www.fuminsumos.com',2,1,3,12,'TARJETA',' ','S'),(12,'INVERSIONES YORDAN','JONATHAN',1,'2342354','828783398','8797',6,'3257932042',1000,'LOS FALCONES CALLE 23. SMP','informes@inver-yordan.com',' ',1,1,1,0,'EFECTIVO',' ','S'),(13,'ELECTRO INDUSTRIAS S.A.C','JOSE',9,'6876878','998847737','9238',9,'9892432453',2000,'AV. ENCALADA 234 - LURIN','electroindustrias@gmail.com',' ',4,1,2,12,'EFECTIVO',' ','S'),(14,'DE VICENTE CONSTRUCTORA S.A.C','MARIA',1,'4164801',' ','2398',3,'1029487598',2000,'AV. COSTANERA 2650 - SAN MIGUEL','informes@dvc.com.pe','www.dvc.com.pe',4,1,3,15,'EFECTIVO','EMPRESA CON EXPERIENCIA EN EDIFICACIONES.','S'),(15,'ARQUIZIONE','ESTEVAN',4,'7245558',' ','2309',1,'9298349199',35000,'CALLE JUAN ALFARO 195 - MIRAFLORES','consultas@arquizione.com','www.arquizione.com ',3,1,4,12,'EFECTIVO','LA COMPAÑÍA CUENTA CON UNA SÓLIDA EXPERIENCIA EN LOS CAMPOS DEL DISEÑO ARQUITECTÓNICO','S'),(16,'ABYSEM S.A.C.','MANUEL',5,'5985589',' ',' ',8,'9234875854',2000,'BELLAVISTA CALLAO CALLE 2','www.abysemsac.com','informes@abysem.com',3,2,4,10,'EFECTIVO','NINGUNA','S'),(17,'COMERCIAL MIRLO S.A.C','ISABEL',7,'0','998194180',' ',4,'8732738172',1500,'JIRON AZANGARO 977 - CERCADO LIMA',' ',' ',2,1,5,12,'EFECTIVO',' ','S');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comision`
--

DROP TABLE IF EXISTS `comision`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `comision` (
  `com_codigo` int(11) NOT NULL,
  `com_vendedor` int(11) DEFAULT NULL,
  `com_total` double DEFAULT NULL,
  PRIMARY KEY (`com_codigo`),
  KEY `FK_aa11gkbghqx6ss6aoi5kndy9s` (`com_vendedor`),
  CONSTRAINT `FK_aa11gkbghqx6ss6aoi5kndy9s` FOREIGN KEY (`com_vendedor`) REFERENCES `vendedor` (`ven_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comision`
--

LOCK TABLES `comision` WRITE;
/*!40000 ALTER TABLE `comision` DISABLE KEYS */;
/*!40000 ALTER TABLE `comision` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compras`
--

DROP TABLE IF EXISTS `compras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `compras` (
  `com_codigo` int(11) NOT NULL,
  `com_proveedor` int(11) NOT NULL,
  `com_categoria` int(11) NOT NULL,
  `com_condpago` varchar(20) DEFAULT NULL,
  `com_fecha` date DEFAULT NULL,
  `com_hora` time DEFAULT NULL,
  `com_total` double DEFAULT NULL,
  `com_indicador` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`com_codigo`),
  KEY `FK_stcegdvyxka09mrlf5yvs4lq0` (`com_categoria`),
  KEY `FK_9pq9s8hf3i6kryp57qeu7usts` (`com_proveedor`),
  CONSTRAINT `FK_9pq9s8hf3i6kryp57qeu7usts` FOREIGN KEY (`com_proveedor`) REFERENCES `proveedor` (`pro_codigo`),
  CONSTRAINT `FK_stcegdvyxka09mrlf5yvs4lq0` FOREIGN KEY (`com_categoria`) REFERENCES `categcompra` (`ccp_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compras`
--

LOCK TABLES `compras` WRITE;
/*!40000 ALTER TABLE `compras` DISABLE KEYS */;
INSERT INTO `compras` VALUES (1,5,2,'CHEQUE','2014-03-05','20:13:51',4268,'S'),(2,6,1,'CHEQUE','2014-02-05','23:42:12',1076,'S'),(3,3,1,'CUENTA CORRIENTE','2014-09-05','00:08:23',3629,'S'),(4,1,2,'CUENTA CORRIENTE','2014-12-05','23:45:26',1722,'S'),(5,8,2,'TARJETA','2014-11-17','00:08:13',1695,'S'),(6,4,2,'CUENTA CORRIENTE','2014-11-17','23:49:26',4766,'S'),(7,2,2,'EFECTIVO','2014-11-17','18:39:04',4208,'S'),(8,7,2,'TARJETA','2014-11-17','22:40:21',2205,'S'),(9,9,2,'CHEQUE','2014-11-17','00:36:03',2667,'S'),(10,10,2,'EFECTIVO','2014-12-05','00:36:54',2316,'S'),(11,4,2,'CUENTA CORRIENTE','2014-11-17','22:22:53',976.94,'S'),(12,9,2,'CUENTA CORRIENTE','2014-12-05','20:49:19',2114.82,'S'),(13,3,1,'CHEQUE','2014-11-17','20:52:04',1776,'S'),(14,6,2,'EFECTIVO','2014-12-05','15:46:29',1970,'S'),(15,8,2,'CHEQUE','2014-11-17','17:28:39',2027,'S'),(16,12,2,'EFECTIVO','2014-12-05','23:57:45',3034,'S'),(17,13,2,'EFECTIVO','2014-04-11','17:45:48',5643.32,'S'),(18,11,2,'EFECTIVO','2014-06-11','16:22:30',1745.06,'S'),(19,14,1,'TARJETA','2014-06-11','16:26:40',5437,'S'),(20,12,2,'EFECTIVO','2014-07-11','23:47:03',9196,'S'),(21,10,1,'EFECTIVO','2014-09-11','22:20:05',2760.23,'S'),(22,13,2,'EFECTIVO','2014-09-11','22:23:25',3091.56,'S'),(23,9,1,'EFECTIVO','2016-10-30','22:27:58',159.04,'S'),(24,3,1,'CHEQUE','2013-11-16','04:05:43',1294,'S');
/*!40000 ALTER TABLE `compras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalle_compras`
--

DROP TABLE IF EXISTS `detalle_compras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `detalle_compras` (
  `dc_codigo` int(11) NOT NULL AUTO_INCREMENT,
  `dc_articulo` int(11) NOT NULL,
  `com_codigo` int(11) NOT NULL,
  `dc_cantidad` int(11) DEFAULT NULL,
  `dc_precio` double DEFAULT NULL,
  `dc_monto` double NOT NULL,
  PRIMARY KEY (`dc_codigo`),
  KEY `FK_bh3nq904pjh9xtq4o5tjcueeu` (`dc_articulo`),
  KEY `FK_48cm4plru6vepsuc7fmgoxpoh` (`com_codigo`),
  CONSTRAINT `FK_48cm4plru6vepsuc7fmgoxpoh` FOREIGN KEY (`com_codigo`) REFERENCES `compras` (`com_codigo`),
  CONSTRAINT `FK_bh3nq904pjh9xtq4o5tjcueeu` FOREIGN KEY (`dc_articulo`) REFERENCES `articulo` (`art_codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=108 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_compras`
--

LOCK TABLES `detalle_compras` WRITE;
/*!40000 ALTER TABLE `detalle_compras` DISABLE KEYS */;
INSERT INTO `detalle_compras` VALUES (1,1,10,4,42,168),(2,2,14,4,313,1252),(3,3,4,2,584,1168),(4,4,2,2,233,466),(5,4,8,2,233,466),(6,5,7,2,33,66),(7,5,8,5,33,165),(8,5,9,2,33,66),(9,6,6,2,86,172),(10,6,10,4,86,344),(11,7,1,2,323,646),(12,7,5,2,323,646),(13,7,9,2,323,646),(14,8,16,4,343,1372),(15,9,10,2,67,134),(16,11,1,1,42,42),(17,13,2,2,223,446),(18,13,12,2,223,446),(19,17,6,3,586,1758),(20,17,7,4,586,2344),(21,18,7,2,765,1530),(22,22,12,2,78,156),(23,24,4,1,54,54),(24,26,2,4,24,96),(25,29,7,2,134,268),(26,29,8,4,134,536),(27,29,9,1,134,134),(28,29,13,2,134,268),(29,29,15,3,134,402),(30,31,3,1,343,343),(31,31,10,2,343,686),(32,31,12,4,343,1372),(33,31,13,1,343,343),(34,32,2,2,34,68),(35,32,4,1,34,34),(36,32,11,4,34,136),(37,32,14,2,34,68),(38,37,4,2,233,466),(39,37,13,5,233,1165),(40,38,1,2,325,650),(41,38,5,2,325,650),(42,38,14,2,325,650),(43,38,15,5,325,1625),(44,39,11,2,333,666),(45,40,9,2,233,466),(46,41,1,4,629,2516),(47,41,3,4,629,2516),(48,44,3,2,385,770),(49,44,6,4,385,1540),(50,46,5,1,271,271),(51,46,9,5,271,1355),(52,47,6,2,328,656),(53,47,10,3,328,984),(54,48,1,3,138,414),(55,48,8,1,138,138),(56,49,16,4,348,1392),(57,50,5,1,128,128),(58,50,6,5,128,640),(59,51,8,2,450,900),(60,52,11,4,11.86,47.44),(61,59,11,2,63.75,127.5),(62,60,12,2,70.41,140.82),(63,70,16,2,14.64,29.28),(64,71,16,3,41.5,124.5),(65,72,16,3,38.74,116.22),(66,42,17,5,554,2770),(67,37,17,6,233,1398),(68,72,17,6,38.74,232.44),(69,3,17,2,584,1168),(70,68,17,6,12.48,74.88),(71,72,18,5,38.74,193.7),(72,71,18,2,41.5,83),(73,16,18,5,46,230),(74,73,18,6,48.04,288.24),(75,46,18,3,271,813),(76,53,18,5,14.5,72.5),(77,56,18,6,10.77,64.62),(78,6,19,6,86,516),(79,41,19,6,629,3774),(80,27,19,2,32,64),(81,1,19,5,42,210),(82,43,19,3,291,873),(83,37,20,4,233,932),(84,45,20,2,496,992),(85,3,20,5,584,2920),(86,18,20,4,765,3060),(87,36,20,4,323,1292),(88,4,21,4,233,932),(89,29,21,6,134,804),(90,46,21,3,271,813),(91,60,21,3,70.41,211.23),(92,23,22,3,534,1602),(93,48,22,2,138,276),(94,70,22,4,14.64,58.56),(95,44,22,3,385,1155),(102,27,23,3,32,96),(103,56,23,2,10.77,21.54),(104,71,23,1,41.5,41.5),(105,5,24,1,33,33),(106,27,24,3,32,96),(107,37,24,5,233,1165);
/*!40000 ALTER TABLE `detalle_compras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalle_factura`
--

DROP TABLE IF EXISTS `detalle_factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `detalle_factura` (
  `df_codigo` int(11) NOT NULL AUTO_INCREMENT,
  `fac_codigo` int(11) NOT NULL,
  `df_articulo` int(11) NOT NULL,
  `df_cantidad` int(11) DEFAULT NULL,
  `df_precarticulo` double DEFAULT NULL,
  `df_total` double DEFAULT NULL,
  PRIMARY KEY (`df_codigo`),
  KEY `FK_t1enral1912uk9ee016769s51` (`df_articulo`),
  KEY `FK_ef12itv9w3eiq4krgokhllrtr` (`fac_codigo`),
  CONSTRAINT `FK_ef12itv9w3eiq4krgokhllrtr` FOREIGN KEY (`fac_codigo`) REFERENCES `factura` (`fac_codigo`),
  CONSTRAINT `FK_t1enral1912uk9ee016769s51` FOREIGN KEY (`df_articulo`) REFERENCES `articulo` (`art_codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=279 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_factura`
--

LOCK TABLES `detalle_factura` WRITE;
/*!40000 ALTER TABLE `detalle_factura` DISABLE KEYS */;
INSERT INTO `detalle_factura` VALUES (1,1,7,1,323,323),(2,1,17,3,586,1758),(3,1,42,2,554,1108),(4,2,7,4,323,1292),(5,2,10,2,323,646),(6,2,15,2,333,666),(7,2,23,3,534,1602),(8,2,38,1,325,325),(9,3,7,2,323,646),(10,3,10,3,323,969),(11,3,17,3,586,1758),(12,3,23,1,530,530),(13,3,38,3,325,975),(14,3,46,2,271,542),(15,4,25,4,23,92),(16,4,40,2,233,466),(17,4,43,2,291,582),(18,5,14,2,554,1108),(19,5,23,2,534,1068),(20,5,32,2,34,68),(21,5,49,2,348,696),(22,6,2,2,313,626),(23,6,45,2,496,992),(24,6,50,1,128,128),(25,6,51,3,450,1350),(26,7,1,2,42,84),(27,7,14,2,554,1108),(28,7,48,2,138,276),(29,7,49,1,348,348),(30,8,1,1,42,42),(31,8,2,2,313,626),(32,8,22,2,78,156),(33,8,49,1,348,348),(34,8,50,2,128,256),(35,9,1,2,42,84),(36,9,29,2,134,268),(37,9,32,2,34,68),(38,9,49,1,348,348),(39,10,8,2,343,686),(40,10,34,2,86,172),(41,10,40,2,233,466),(42,10,43,2,291,582),(43,11,6,2,86,172),(44,11,44,2,385,770),(45,11,45,2,496,992),(46,12,2,2,313,626),(47,12,3,2,584,1168),(48,12,21,2,355,710),(49,12,33,3,54,162),(50,12,50,1,128,128),(51,13,1,3,42,126),(52,13,6,2,86,172),(53,13,39,3,333,999),(54,13,46,2,271,542),(55,13,50,1,128,128),(56,14,3,3,584,1752),(57,14,8,2,343,686),(58,14,22,2,78,156),(59,14,33,5,54,270),(60,14,47,4,328,1312),(61,15,6,2,86,172),(62,15,10,3,323,969),(63,15,23,2,534,1068),(64,15,29,2,134,268),(65,16,28,2,234,468),(66,16,47,4,328,1312),(67,16,49,4,348,1392),(68,16,58,2,31.72,63.44),(69,17,14,3,554,1662),(70,17,49,4,348,1392),(71,17,58,2,31.72,63.44),(72,17,59,1,63.75,63.75),(73,18,1,5,42,210),(74,18,21,2,355,710),(75,18,45,4,496,1984),(76,18,50,2,128,256),(77,18,59,2,63.75,127.5),(78,18,60,4,70.41,281.64),(79,19,5,3,33,99),(80,19,25,1,23,23),(81,19,38,2,325,650),(82,20,5,4,33,132),(83,20,6,3,86,258),(84,20,22,4,78,312),(85,20,54,2,26.02,52.04),(86,21,21,7,355,2485),(87,21,38,3,325,975),(88,21,45,5,496,2480),(89,21,57,8,12.58,100.64),(90,22,16,3,46,138),(91,22,24,3,54,162),(92,22,25,3,23,69),(93,22,59,4,63.75,255),(94,23,2,4,313,1252),(95,23,43,4,291,1164),(96,23,53,4,14.5,58),(97,24,5,4,33,132),(98,24,24,3,54,162),(99,24,41,5,629,3145),(100,25,61,100,282.58,28258),(101,26,16,7,46,322),(102,26,24,3,54,162),(103,26,32,4,34,136),(104,26,56,4,10.77,43.08),(105,26,61,7,282.58,1978.06),(106,27,6,6,86,516),(107,27,32,5,34,170),(108,27,56,20,10.77,215.4),(109,27,65,6,81.57,489.42),(110,27,68,12,12.48,149.76),(111,27,70,30,14.64,439.2),(112,28,44,6,385,2310),(113,28,52,12,11.86,142.32),(114,28,56,6,10.77,64.62),(115,28,62,12,43.3,519.6),(116,28,63,3,119.7,359.1),(117,29,24,5,54,270),(118,29,63,4,119.7,478.8),(119,29,64,12,161.2,1934.4),(120,29,66,6,63.66,381.96),(121,29,69,4,11.14,44.56),(122,29,70,6,14.64,87.84),(123,30,27,6,32,192),(124,30,38,3,325,975),(125,30,63,6,119.7,718.2),(126,30,68,6,12.48,74.88),(127,30,69,6,11.14,66.84),(128,30,70,12,14.64,175.68),(129,31,19,4,322,1288),(130,31,28,3,234,702),(131,31,56,5,10.77,53.85),(132,31,73,6,48.04,288.24),(133,32,24,5,54,270),(134,32,57,6,12.58,75.48),(135,32,68,5,12.48,62.4),(136,32,73,6,48.04,288.24),(137,33,38,4,325,1300),(138,33,58,7,31.72,222.04),(139,33,73,4,48.04,192.16),(140,33,72,4,38.74,154.96),(141,33,71,6,41.5,249),(142,33,69,6,11.14,66.84),(143,34,6,6,86,516),(144,34,42,7,554,3878),(145,34,58,6,31.72,190.32),(146,34,72,6,38.74,232.44),(147,34,73,6,48.04,288.24),(148,35,21,6,355,2130),(149,35,45,3,496,1488),(150,35,39,6,333,1998),(151,35,48,3,138,414),(152,35,53,6,14.5,87),(153,36,44,12,385,4620),(154,36,24,6,54,324),(155,36,58,3,31.72,95.16),(156,36,49,7,348,2436),(157,37,31,6,343,2058),(158,37,72,3,38.74,116.22),(159,37,34,3,86,258),(160,37,73,5,48.04,240.2),(161,37,9,4,67,268),(162,38,37,5,233,1165),(163,38,40,4,233,932),(164,38,69,3,11.14,33.42),(165,38,39,5,333,1665),(166,38,67,6,60.15,360.9),(167,38,68,2,12.48,24.96),(168,39,39,3,333,999),(169,39,57,4,12.58,50.32),(170,39,72,4,38.74,154.96),(171,39,3,2,584,1168),(172,39,15,5,333,1665),(173,39,46,2,271,542),(174,40,33,3,54,162),(175,40,46,2,271,542),(176,40,51,5,450,2250),(177,40,45,2,496,992),(178,40,72,5,38.74,193.7),(179,40,30,2,334,668),(180,41,35,4,543,2172),(181,41,42,2,554,1108),(182,41,4,2,233,466),(183,41,62,5,43.3,216.5),(184,41,50,2,128,256),(185,42,27,2,32,64),(186,42,21,3,355,1065),(187,42,3,3,584,1752),(188,42,46,6,271,1626),(189,42,41,4,629,2516),(190,42,69,5,11.14,55.7),(191,43,7,4,323,1292),(192,43,46,4,271,1084),(193,43,72,2,38.74,77.48),(194,43,73,5,48.04,240.2),(195,43,1,2,42,84),(196,43,70,5,14.64,73.2),(197,43,40,4,233,932),(198,44,43,2,291,582),(199,44,40,4,233,932),(200,44,51,1,450,450),(201,44,45,1,496,496),(202,44,73,5,48.04,240.2),(203,44,66,5,63.66,318.3),(204,44,67,5,60.15,300.75),(205,45,36,5,323,1615),(206,45,24,2,54,108),(207,45,37,2,233,466),(208,45,69,6,11.14,66.84),(209,45,71,2,41.5,83),(210,46,44,5,385,1925),(211,46,51,2,450,900),(212,46,73,2,48.04,96.08),(213,46,36,6,323,1938),(214,46,38,3,325,975),(215,46,43,1,291,291),(216,47,31,4,343,1372),(217,47,26,3,24,72),(218,47,54,2,26.02,52.04),(219,47,24,2,54,108),(220,47,63,4,119.7,478.8),(221,47,68,6,12.48,74.88),(222,47,42,3,554,1662),(223,48,37,4,233,932),(224,48,51,4,450,1800),(225,48,62,4,43.3,173.2),(226,48,72,3,38.74,116.22),(227,48,40,3,233,699),(228,48,43,3,291,873),(229,49,33,2,54,108),(230,49,47,2,328,656),(231,49,50,6,128,768),(232,49,71,3,41.5,124.5),(233,49,66,2,63.66,127.32),(234,49,32,2,34,68),(235,50,31,6,343,2058),(236,50,46,4,271,1084),(237,50,69,2,11.14,22.28),(238,50,64,2,161.2,322.4),(239,50,73,2,48.04,96.08),(240,51,40,5,233,1165),(241,51,68,2,12.48,24.96),(242,51,63,5,119.7,598.5),(243,51,65,3,81.57,244.71),(244,51,31,3,343,1029),(245,51,56,3,10.77,32.31),(246,52,38,4,325,1300),(247,52,69,4,11.14,44.56),(248,52,70,6,14.64,87.84),(249,52,1,2,42,84),(250,52,32,6,34,204),(251,52,17,1,586,586),(252,53,43,1,291,291),(253,53,24,5,54,270),(254,53,56,6,10.77,64.62),(255,53,63,2,119.7,239.4),(256,53,73,5,48.04,240.2),(257,6,54,3,86,258),(258,39,54,5,333,1665),(260,55,56,4,10.77,43.08),(261,55,73,2,48.04,96.08),(262,56,43,3,291,873),(263,56,70,6,14.64,87.84),(264,56,19,2,322,644),(265,56,73,2,48.04,96.08),(266,57,25,1,23,23),(267,57,45,5,496,2480),(268,57,48,7,138,966),(269,58,38,1,325,325),(270,58,70,4,14.64,58.56),(271,58,53,1,14.5,14.5),(272,58,2,3,313,939),(273,59,6,1,86,86),(274,59,21,3,355,1065),(275,59,18,3,765,2295),(276,60,10,3,323,969),(277,60,32,4,34,136),(278,60,45,3,496,1488);
/*!40000 ALTER TABLE `detalle_factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalle_presupuesto`
--

DROP TABLE IF EXISTS `detalle_presupuesto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `detalle_presupuesto` (
  `dp_codigo` int(11) NOT NULL AUTO_INCREMENT,
  `pre_codigo` int(11) NOT NULL,
  `dp_articulo` int(11) NOT NULL,
  `dp_cantidad` int(11) DEFAULT NULL,
  `dp_precarticulo` double DEFAULT NULL,
  `dp_total` double DEFAULT NULL,
  PRIMARY KEY (`dp_codigo`),
  KEY `FK_le48fhfsi7vtlrhi58pbhx8oh` (`dp_articulo`),
  KEY `FK_gybg52stp72st32yssbbod72q` (`pre_codigo`),
  CONSTRAINT `FK_gybg52stp72st32yssbbod72q` FOREIGN KEY (`pre_codigo`) REFERENCES `presupuesto` (`pre_codigo`),
  CONSTRAINT `FK_le48fhfsi7vtlrhi58pbhx8oh` FOREIGN KEY (`dp_articulo`) REFERENCES `articulo` (`art_codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=96 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_presupuesto`
--

LOCK TABLES `detalle_presupuesto` WRITE;
/*!40000 ALTER TABLE `detalle_presupuesto` DISABLE KEYS */;
INSERT INTO `detalle_presupuesto` VALUES (1,1,14,2,554,1108),(2,1,38,1,325,325),(3,1,40,2,233,466),(4,1,44,3,385,1155),(5,2,12,4,32,128),(6,2,46,2,271,542),(7,2,49,2,348,696),(8,3,11,2,42,84),(9,3,28,2,234,468),(10,3,39,2,333,666),(11,3,43,1,291,291),(12,3,51,2,450,900),(13,4,1,1,42,42),(14,4,19,2,322,644),(15,4,20,2,243,486),(16,4,32,2,34,68),(17,5,6,2,86,172),(18,5,30,2,334,668),(19,5,38,1,325,325),(20,5,47,1,328,328),(21,5,49,2,348,696),(22,5,50,2,128,256),(23,5,51,2,450,900),(24,6,2,1,313,313),(25,6,5,2,33,66),(26,6,32,2,34,68),(27,6,36,3,323,969),(28,6,37,4,233,932),(29,6,51,1,450,450),(30,7,5,2,33,66),(31,7,13,2,223,446),(32,7,40,5,233,1165),(33,7,48,4,138,552),(34,7,49,2,348,696),(35,8,4,2,233,466),(36,8,25,3,23,69),(37,8,29,2,134,268),(38,8,45,3,496,1488),(39,9,31,3,343,1029),(40,9,56,3,10.77,32.31),(41,9,58,2,31.72,63.44),(42,9,60,5,70.41,352.05),(43,10,28,4,234,936),(44,10,29,2,134,268),(45,10,31,6,343,2058),(46,10,44,2,385,770),(47,11,1,3,42,126),(48,11,36,4,323,1292),(49,11,48,5,138,690),(50,12,6,4,86,344),(51,12,36,2,323,646),(52,12,38,7,325,2275),(53,12,41,5,629,3145),(54,13,15,6,333,1998),(55,13,45,2,496,992),(56,13,67,12,60.15,721.8),(57,13,69,6,11.14,66.84),(58,14,35,6,543,3258),(59,14,41,3,629,1887),(60,14,28,6,234,1404),(61,14,27,2,32,64),(62,15,5,4,33,132),(63,15,34,3,86,258),(64,15,43,4,291,1164),(65,15,72,7,38.74,271.18),(66,15,71,2,41.5,83),(67,15,31,2,343,686),(68,16,25,4,23,92),(69,16,37,2,233,466),(70,16,52,4,11.86,47.44),(71,16,27,4,32,128),(72,16,72,4,38.74,154.96),(73,16,59,5,63.75,318.75),(74,16,61,5,282.58,1412.9),(75,17,48,4,138,552),(76,17,43,5,291,1455),(77,17,2,4,313,1252),(78,17,67,4,60.15,240.6),(79,17,50,5,128,640),(80,17,73,2,48.04,96.08),(81,18,25,2,23,46),(82,18,39,5,333,1665),(83,18,41,5,629,3145),(84,18,44,3,385,1155),(85,18,73,2,48.04,96.08),(89,19,43,1,291,291),(90,19,41,1,629,629),(91,19,68,2,12.48,24.96),(92,19,64,2,161.2,322.4),(93,20,37,1,233,233),(94,20,60,1,70.41,70.41),(95,20,73,1,48.04,48.04);
/*!40000 ALTER TABLE `detalle_presupuesto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalle_salida`
--

DROP TABLE IF EXISTS `detalle_salida`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `detalle_salida` (
  `ds_codigo` int(11) NOT NULL AUTO_INCREMENT,
  `ds_articulo` int(11) NOT NULL,
  `sal_codigo` int(11) NOT NULL,
  `ds_motivo` int(11) NOT NULL,
  `ds_cantidad` int(11) DEFAULT NULL,
  `ds_precio` double DEFAULT NULL,
  `ds_monto` double DEFAULT NULL,
  PRIMARY KEY (`ds_codigo`),
  KEY `FK_5ydl0uprw6cavf77owd04vssr` (`ds_articulo`),
  KEY `FK_k2irveob1j9swournc0mmtob7` (`ds_motivo`),
  KEY `FK_a5q3wscipkwxkj3ehafc2y19q` (`sal_codigo`),
  CONSTRAINT `FK_5ydl0uprw6cavf77owd04vssr` FOREIGN KEY (`ds_articulo`) REFERENCES `articulo` (`art_codigo`),
  CONSTRAINT `FK_a5q3wscipkwxkj3ehafc2y19q` FOREIGN KEY (`sal_codigo`) REFERENCES `salidas` (`sal_codigo`),
  CONSTRAINT `FK_k2irveob1j9swournc0mmtob7` FOREIGN KEY (`ds_motivo`) REFERENCES `motivo` (`mot_codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_salida`
--

LOCK TABLES `detalle_salida` WRITE;
/*!40000 ALTER TABLE `detalle_salida` DISABLE KEYS */;
INSERT INTO `detalle_salida` VALUES (1,1,1,2,3,42,126),(2,1,15,2,2,42,84),(3,2,4,2,2,313,626),(4,2,6,2,2,313,626),(5,4,5,2,2,233,466),(6,4,6,1,3,233,699),(7,4,9,3,4,233,932),(8,5,5,1,3,33,99),(9,5,10,3,1,33,33),(10,6,10,2,2,86,172),(11,7,3,1,2,323,646),(12,7,7,3,2,323,646),(13,7,14,2,3,323,969),(14,8,13,1,3,343,1029),(15,17,11,2,2,586,1172),(16,20,7,2,2,243,486),(17,20,12,3,4,243,972),(18,21,8,1,2,355,710),(19,24,7,1,1,54,54),(20,26,5,1,2,24,48),(21,26,13,3,2,24,48),(22,30,3,1,1,334,334),(23,31,9,1,5,343,1715),(24,31,11,3,3,343,1029),(25,34,15,3,4,86,344),(26,35,3,1,2,543,1086),(27,37,16,3,4,233,932),(28,38,2,2,2,325,650),(29,38,13,2,5,325,1625),(30,39,14,1,4,333,1332),(31,40,8,3,1,233,233),(32,42,2,3,1,554,554),(33,44,16,1,2,385,770),(34,47,4,3,1,328,328),(35,48,3,1,2,138,276),(36,48,4,1,2,138,276),(37,49,2,1,1,348,348),(38,50,6,2,2,128,256),(39,51,2,1,2,450,900),(40,51,12,1,1,450,450),(41,58,12,2,2,31.72,63),(42,58,14,1,5,31.72,159),(43,59,9,2,2,63.75,128),(44,66,15,2,3,63.66,191),(45,68,15,3,4,12.48,50),(46,72,16,2,2,38.74,77),(47,35,17,2,3,543,1629),(48,44,17,3,2,385,770),(49,73,17,1,1,48.04,48.04),(50,66,17,1,2,63.66,127.32),(51,23,18,3,1,534,534),(52,39,18,1,2,333,666),(55,4,19,2,1,233,233);
/*!40000 ALTER TABLE `detalle_salida` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detallegasto`
--

DROP TABLE IF EXISTS `detallegasto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `detallegasto` (
  `dg_codigo` int(11) NOT NULL,
  `dg_descripcion` varchar(15) DEFAULT NULL,
  `dg_indicador` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`dg_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detallegasto`
--

LOCK TABLES `detallegasto` WRITE;
/*!40000 ALTER TABLE `detallegasto` DISABLE KEYS */;
INSERT INTO `detallegasto` VALUES (1,'PAGO ELECT.','S'),(2,'ADELANTO','S');
/*!40000 ALTER TABLE `detallegasto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalleingreso`
--

DROP TABLE IF EXISTS `detalleingreso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `detalleingreso` (
  `di_codigo` int(11) NOT NULL,
  `di_descripcion` varchar(20) DEFAULT NULL,
  `di_indicador` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`di_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalleingreso`
--

LOCK TABLES `detalleingreso` WRITE;
/*!40000 ALTER TABLE `detalleingreso` DISABLE KEYS */;
INSERT INTO `detalleingreso` VALUES (1,'COBROS','S');
/*!40000 ALTER TABLE `detalleingreso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detallenotacredito`
--

DROP TABLE IF EXISTS `detallenotacredito`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `detallenotacredito` (
  `dn_codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nc_codigo` int(11) NOT NULL,
  `dn_articulo` int(11) NOT NULL,
  `dn_cantidad` int(11) DEFAULT NULL,
  `dn_precarticulo` double DEFAULT NULL,
  `dn_total` double DEFAULT NULL,
  PRIMARY KEY (`dn_codigo`),
  KEY `FK_hvni840d18orwdqhp8d2hv60v` (`dn_articulo`),
  KEY `FK_6xpyvc707e6if9lqqqf8hxdkb` (`nc_codigo`),
  CONSTRAINT `FK_6xpyvc707e6if9lqqqf8hxdkb` FOREIGN KEY (`nc_codigo`) REFERENCES `notacredito` (`nc_codigo`),
  CONSTRAINT `FK_hvni840d18orwdqhp8d2hv60v` FOREIGN KEY (`dn_articulo`) REFERENCES `articulo` (`art_codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=70 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detallenotacredito`
--

LOCK TABLES `detallenotacredito` WRITE;
/*!40000 ALTER TABLE `detallenotacredito` DISABLE KEYS */;
INSERT INTO `detallenotacredito` VALUES (1,1,7,2,323,646),(2,1,10,3,320,960),(3,1,17,3,580,1740),(4,1,23,1,530,530),(5,1,38,3,325,975),(6,1,46,2,271,542),(7,2,7,1,323,323),(8,2,17,3,586,1758),(9,2,42,4,554,2216),(10,3,7,2,323,646),(11,3,10,2,323,646),(12,3,15,2,333,666),(13,3,23,3,530,1590),(14,3,38,2,325,650),(15,4,8,2,343,686),(16,4,34,2,84,168),(17,4,40,2,233,466),(18,4,43,1,291,291),(19,5,38,2,325,650),(20,5,45,2,490,980),(21,5,50,1,128,128),(22,5,51,2,450,900),(23,6,1,1,42,42),(24,6,2,1,313,313),(25,6,49,2,348,696),(26,6,50,2,128,256),(27,7,3,3,584,1752),(28,7,8,2,343,686),(29,7,22,2,78,156),(30,7,33,2,54,108),(31,7,47,3,328,984),(32,8,2,4,313,1252),(33,8,43,2,291,582),(34,8,53,4,15,58),(35,9,27,6,32,192),(36,9,38,6,325,1950),(37,9,63,6,120,718.2),(38,9,68,6,12,74.88),(39,9,69,6,11,66.84),(40,9,70,6,15,87.84),(41,10,19,4,322,1288),(42,10,28,3,234,702),(43,10,56,5,11,53.85),(44,10,73,3,48,144.12),(45,11,24,5,54,270),(46,11,68,5,12,62.4),(47,11,73,3,48,144.12),(48,11,22,2,78,156),(59,12,14,3,554,1662),(60,12,49,4,348,1392),(61,12,58,2,31.72,63.44),(62,13,6,2,86,172),(63,13,44,2,385,770),(64,13,45,1,496,496),(65,14,1,3,42,126),(66,14,6,2,86,172),(67,14,39,1,333,333),(68,14,46,2,271,542),(69,14,50,1,128,128);
/*!40000 ALTER TABLE `detallenotacredito` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura`
--

DROP TABLE IF EXISTS `factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `factura` (
  `fac_codigo` int(11) NOT NULL,
  `fac_cliente` int(11) NOT NULL,
  `fac_vendedor` int(11) NOT NULL,
  `fac_descuento` double DEFAULT NULL,
  `fac_tipopago` varchar(15) DEFAULT NULL,
  `fac_fecha` date DEFAULT NULL,
  `fac_hora` time DEFAULT NULL,
  `fac_neto` double DEFAULT NULL,
  `fac_total` double DEFAULT NULL,
  `fac_indicador` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`fac_codigo`),
  KEY `FK_dky5u189t3q02k8c4k3pu2x1n` (`fac_cliente`),
  KEY `FK_1x2rtuap5dn3dbg7d851ujkmr` (`fac_vendedor`),
  CONSTRAINT `FK_1x2rtuap5dn3dbg7d851ujkmr` FOREIGN KEY (`fac_vendedor`) REFERENCES `vendedor` (`ven_codigo`),
  CONSTRAINT `FK_dky5u189t3q02k8c4k3pu2x1n` FOREIGN KEY (`fac_cliente`) REFERENCES `clientes` (`cli_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura`
--

LOCK TABLES `factura` WRITE;
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
INSERT INTO `factura` VALUES (1,5,4,478.35,'Efectivo','2014-03-05','20:09:45',3189,2710.65,'S'),(2,4,5,407.79,'Tarjeta','2014-03-05','20:11:27',4531,4123.21,'S'),(3,3,2,650.4,'Efectivo','2014-03-05','20:22:05',5420,4878,'S'),(4,9,4,125.4,'Tarjeta','2014-10-05','12:22:59',1140,1014.6,'S'),(5,10,5,235.2,'Efectivo','2014-10-05','14:29:05',2940,2704.8,'S'),(6,7,2,185.76,'Tarjeta','2014-11-05','14:56:20',3096,2910.24,'S'),(7,6,5,217.92,'Tarjeta','2014-11-05','15:34:29',1816,1598.08,'S'),(8,8,4,171.36,'Tarjeta','2014-11-05','23:01:35',1428,1256.64,'S'),(9,2,6,84.48,'Tarjeta','2014-11-05','23:04:42',768,683.52,'S'),(10,1,2,209.66,'Efectivo','2014-11-05','23:06:29',1906,1696.34,'S'),(11,2,2,212.74,'Tarjeta','2014-11-05','20:55:41',1934,1721.26,'S'),(12,5,4,419.1,'Efectivo','2014-11-05','00:30:24',2794,2374.9,'S'),(13,10,2,157.36,'Efectivo','2014-11-05','00:33:37',1967,1809.64,'S'),(14,1,8,459.36,'Efectivo','2014-11-05','00:44:31',4176,3716.64,'S'),(15,5,8,371.55,'Efectivo','2014-11-05','17:39:00',2477,2105.45,'S'),(16,7,4,194.13,'Tarjeta','2014-11-05','23:29:15',3235.44,3041.31,'S'),(17,2,5,349.93,'Tarjeta','2014-11-05','16:14:31',3181.19,2831.26,'S'),(18,10,8,285.53,'Efectivo','2014-11-05','11:17:00',3569.14,3283.61,'S'),(19,5,5,115.8,'Efectivo','2014-11-05','12:58:56',772,656.2,'S'),(20,11,6,90.48,'Tarjeta','2014-11-05','13:07:27',754.04,663.56,'S'),(21,9,6,845.69,'Tarjeta','2014-11-05','15:51:45',6040.64,5194.95,'S'),(22,7,4,37.44,'Tarjeta','2014-11-05','17:13:50',624,586.56,'S'),(23,6,6,296.88,'Tarjeta','2014-11-05','17:27:00',2474,2177.12,'S'),(24,1,6,378.29,'Efectivo','2014-11-05','17:38:45',3439,3060.71,'S'),(25,12,8,0,'Efectivo','2014-11-05','21:19:49',28258,28258,'S'),(26,13,8,316.94,'Efectivo','2014-11-05','00:05:37',2641.14,2324.2,'S'),(27,13,9,237.57,'Efectivo','2014-11-05','22:50:56',1979.78,1762,'S'),(28,8,9,407.48,'Tarjeta','2014-11-05','22:53:25',3395.64,2988.16,'S'),(29,14,9,479.63,'Efectivo','2014-11-05','02:19:15',3197.56,2717.93,'S'),(30,14,9,330.39,'Efectivo','2014-11-05','15:30:59',2202.6,1872.21,'S'),(31,15,9,279.85,'Efectivo','2014-11-05','20:26:05',2332.09,2052.24,'S'),(32,13,5,83.53,'Efectivo','2014-11-05','20:30:54',696.12,612.59,'S'),(33,10,8,218.5,'Efectivo','2014-11-05','17:43:37',2185,1966.5,'S'),(34,6,9,612.6,'Tarjeta','2014-11-05','17:48:49',5105,4492.4,'S'),(35,8,8,734.04,'Tarjeta','2014-11-05','00:30:10',6117,5382.96,'S'),(36,4,9,672.76,'Tarjeta','2014-11-05','23:35:50',7475.16,6802.4,'S'),(37,8,9,352.85,'Tarjeta','2014-11-05','23:41:04',2940.42,2587.57,'S'),(38,13,9,501.75,'Efectivo','2014-11-05','23:47:23',4181.28,3679.53,'S'),(39,10,8,457.93,'Efectivo','2014-11-05','11:08:01',4579.28,4121.35,'S'),(40,14,8,721.16,'Efectivo','2014-07-11','11:10:09',4807.7,4086.54,'S'),(41,12,4,0,'Efectivo','2014-07-11','23:45:32',4218.5,4218.5,'S'),(42,10,6,707.87,'Efectivo','2014-08-11','10:43:41',7078.7,6370.83,'S'),(43,7,5,226.97,'Tarjeta','2014-08-11','23:16:16',3782.88,3555.91,'S'),(44,8,5,398.31,'Tarjeta','2014-08-11','23:20:43',3319.25,2920.94,'S'),(45,16,8,233.88,'Efectivo','2014-08-11','23:34:39',2338.84,2104.96,'S'),(46,17,8,735.01,'Efectivo','2014-08-11','23:35:42',6125.08,5390.07,'S'),(47,16,9,381.97,'Efectivo','2014-09-11','11:14:21',3819.72,3437.75,'S'),(48,6,9,551.21,'Tarjeta','2014-09-11','11:16:12',4593.42,4042.21,'S'),(49,14,4,277.77,'Efectivo','2014-09-11','17:07:42',1851.82,1574.05,'S'),(50,5,4,537.41,'Efectivo','2014-09-11','17:09:26',3582.76,3045.35,'S'),(51,3,8,371.34,'Efectivo','2014-09-11','17:14:08',3094.48,2723.14,'S'),(52,14,8,345.96,'Efectivo','2014-10-11','11:11:28',2306.4,1960.44,'S'),(53,9,8,121.57,'Tarjeta','2014-10-11','11:13:13',1105.22,983.65,'S'),(54,13,2,233.43,'Efectivo','2016-10-26','23:51:12',1945.28,1711.85,'S'),(55,12,2,0,'Efectivo','2016-10-26','23:54:02',139.16,139.16,'S'),(56,9,10,187.1,'Tarjeta','2016-10-30','21:57:38',1700.92,1513.82,'S'),(57,11,10,416.28,'Tarjeta','2016-10-30','22:38:24',3469,3052.72,'S'),(58,10,2,133.71,'Efectivo','2016-10-30','22:39:01',1337.06,1203.35,'S'),(59,6,2,413.52,'Tarjeta','2016-11-13','03:31:39',3446,3032.48,'S'),(60,7,2,155.58,'Tarjeta','2019-03-15','14:11:23',2593,2437.42,'S');
/*!40000 ALTER TABLE `factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gastos`
--

DROP TABLE IF EXISTS `gastos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `gastos` (
  `ga_codigo` int(11) NOT NULL,
  `ga_fecha` date DEFAULT NULL,
  `ga_descripcion` int(11) NOT NULL,
  `ga_nombre` varchar(50) DEFAULT NULL,
  `ga_importe` double DEFAULT NULL,
  `ga_observacion` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ga_codigo`),
  KEY `FK_dcivm7r9f4nod7ou78r98f4jy` (`ga_descripcion`),
  CONSTRAINT `FK_dcivm7r9f4nod7ou78r98f4jy` FOREIGN KEY (`ga_descripcion`) REFERENCES `detallegasto` (`dg_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gastos`
--

LOCK TABLES `gastos` WRITE;
/*!40000 ALTER TABLE `gastos` DISABLE KEYS */;
INSERT INTO `gastos` VALUES (0,'2016-10-30',1,'N',0,'N'),(1,'2016-10-30',1,'PAGO DE RECIBO DE LUZ',892.1,'ACTUALIZADO');
/*!40000 ALTER TABLE `gastos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `imagen`
--

DROP TABLE IF EXISTS `imagen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `imagen` (
  `img_cod` int(11) NOT NULL DEFAULT '0',
  `img_fondo` varchar(100) DEFAULT NULL,
  `img_estado` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`img_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `imagen`
--

LOCK TABLES `imagen` WRITE;
/*!40000 ALTER TABLE `imagen` DISABLE KEYS */;
INSERT INTO `imagen` VALUES (1,'carga.jpg','N'),(2,'Tornillos2.jpg','N'),(3,'Tornillos1.jpg','N'),(4,'llaves.jpg','N'),(5,'Sinceles.jpg','S');
/*!40000 ALTER TABLE `imagen` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ingreso`
--

DROP TABLE IF EXISTS `ingreso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ingreso` (
  `ing_codigo` int(11) NOT NULL,
  `ing_fecha` date DEFAULT NULL,
  `ing_descripcion` int(11) NOT NULL,
  `ing_cliente` int(11) NOT NULL,
  `ing_importe` double DEFAULT NULL,
  `ing_observaciones` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`ing_codigo`),
  KEY `FK_8n06hbjtd7xpogv4cwd3hgmru` (`ing_cliente`),
  KEY `FK_2gypx8bpsoun0qqiebgxicl4s` (`ing_descripcion`),
  CONSTRAINT `FK_2gypx8bpsoun0qqiebgxicl4s` FOREIGN KEY (`ing_descripcion`) REFERENCES `detalleingreso` (`di_codigo`),
  CONSTRAINT `FK_8n06hbjtd7xpogv4cwd3hgmru` FOREIGN KEY (`ing_cliente`) REFERENCES `clientes` (`cli_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ingreso`
--

LOCK TABLES `ingreso` WRITE;
/*!40000 ALTER TABLE `ingreso` DISABLE KEYS */;
INSERT INTO `ingreso` VALUES (0,'2016-10-30',1,1,0,'N'),(1,'2016-10-30',1,13,586.2,'N');
/*!40000 ALTER TABLE `ingreso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marca`
--

DROP TABLE IF EXISTS `marca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `marca` (
  `mar_codigo` int(11) NOT NULL,
  `mar_nombre` varchar(15) DEFAULT NULL,
  `mar_indicador` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`mar_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marca`
--

LOCK TABLES `marca` WRITE;
/*!40000 ALTER TABLE `marca` DISABLE KEYS */;
INSERT INTO `marca` VALUES (1,'SOLO','S'),(2,'CATERPILAR','S'),(3,'VULCANO','S'),(4,'KOLLER','S'),(5,'ZINCSO','S'),(6,'PATCO','S'),(7,'SAFETY','S'),(8,'INCORESA','S'),(9,'GENERICO','S');
/*!40000 ALTER TABLE `marca` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `motivo`
--

DROP TABLE IF EXISTS `motivo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `motivo` (
  `mot_codigo` int(11) NOT NULL,
  `mot_nombre` varchar(15) DEFAULT NULL,
  `mot_indicador` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`mot_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `motivo`
--

LOCK TABLES `motivo` WRITE;
/*!40000 ALTER TABLE `motivo` DISABLE KEYS */;
INSERT INTO `motivo` VALUES (1,'PERDIDA','S'),(2,'ROBO','S'),(3,'DEFECTUOSO','S');
/*!40000 ALTER TABLE `motivo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notacredito`
--

DROP TABLE IF EXISTS `notacredito`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `notacredito` (
  `nc_codigo` int(11) NOT NULL,
  `nc_cliente` int(11) NOT NULL,
  `nc_factura` int(11) NOT NULL,
  `nc_descuendo` double DEFAULT NULL,
  `nc_fecha` date DEFAULT NULL,
  `nc_hora` time NOT NULL,
  `nc_total` double DEFAULT NULL,
  `nc_indicador` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`nc_codigo`),
  KEY `FK_p88iie4ljtub2yihi0n4o97ak` (`nc_cliente`),
  KEY `FK_32aogotqs4q2yu3yn7wnh4rgp` (`nc_factura`),
  CONSTRAINT `FK_32aogotqs4q2yu3yn7wnh4rgp` FOREIGN KEY (`nc_factura`) REFERENCES `factura` (`fac_codigo`),
  CONSTRAINT `FK_p88iie4ljtub2yihi0n4o97ak` FOREIGN KEY (`nc_cliente`) REFERENCES `clientes` (`cli_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notacredito`
--

LOCK TABLES `notacredito` WRITE;
/*!40000 ALTER TABLE `notacredito` DISABLE KEYS */;
INSERT INTO `notacredito` VALUES (1,3,3,647.16,'2014-07-15','00:11:18',4745.84,'S'),(2,5,1,644.55,'2014-07-31','00:21:54',3652.45,'S'),(3,4,2,377.82,'2014-07-15','00:22:40',3820.18,'S'),(4,1,10,177.21,'2014-10-30','00:23:00',1433.79,'S'),(5,7,6,159.48,'2014-07-15','00:24:09',2498.52,'S'),(6,8,8,156.84,'2014-05-05','00:24:34',1150.16,'S'),(7,1,14,405.46,'2014-07-15','00:46:52',3280.54,'S'),(8,6,23,227.04,'2014-03-18','17:31:30',1664.96,'S'),(9,14,30,463.46,'2014-07-15','00:00:14',2626.3,'S'),(10,15,31,262.56,'2014-01-11','20:33:08',1925.41,'S'),(11,13,32,75.9,'2014-07-15','11:14:00',556.62,'S'),(12,17,2,342.92,'2016-10-30','22:20:44',2774.52,'S'),(13,11,2,158.18,'2016-10-30','22:32:39',1279.82,'S'),(14,13,10,130.1,'2016-11-13','04:16:40',1170.9,'S');
/*!40000 ALTER TABLE `notacredito` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `perfil`
--

DROP TABLE IF EXISTS `perfil`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `perfil` (
  `per_id` int(11) NOT NULL,
  `per_nombre` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`per_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perfil`
--

LOCK TABLES `perfil` WRITE;
/*!40000 ALTER TABLE `perfil` DISABLE KEYS */;
INSERT INTO `perfil` VALUES (1,'ADMINISTRADOR'),(2,'Venta'),(3,'Compras'),(4,'Almacen');
/*!40000 ALTER TABLE `perfil` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `presupuesto`
--

DROP TABLE IF EXISTS `presupuesto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `presupuesto` (
  `pre_codigo` int(11) NOT NULL,
  `pre_cliente` int(11) NOT NULL,
  `pre_vendedor` int(11) NOT NULL,
  `pre_descuento` double DEFAULT NULL,
  `pre_tipopago` varchar(15) DEFAULT NULL,
  `pre_fecha` date DEFAULT NULL,
  `pre_hora` time NOT NULL,
  `pre_total` double DEFAULT NULL,
  `pre_indicador` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`pre_codigo`),
  KEY `FK_puixem2wy5ktpm8fg3gqk461p` (`pre_cliente`),
  CONSTRAINT `FK_puixem2wy5ktpm8fg3gqk461p` FOREIGN KEY (`pre_cliente`) REFERENCES `clientes` (`cli_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `presupuesto`
--

LOCK TABLES `presupuesto` WRITE;
/*!40000 ALTER TABLE `presupuesto` DISABLE KEYS */;
INSERT INTO `presupuesto` VALUES (1,3,2,366.48,'Efectivo','2014-03-05','20:15:03',2687.52,'R'),(2,5,4,204.9,'Tarjeta','2014-11-05','12:21:05',1161.1,'A'),(3,1,4,264.99,'Efectivo','2014-11-05','14:27:01',2144.01,'A'),(4,2,2,148.8,'Efectivo','2014-10-05','14:57:49',1091.2,'A'),(5,4,5,301.05,'Tarjeta','2014-12-05','23:57:35',3043.95,'A'),(6,8,2,335.76,'Tarjeta','2014-12-05','23:45:53',2462.24,'R'),(7,6,4,351,'Tarjeta','2014-12-05','00:38:11',2574,'A'),(8,10,8,183.28,'Efectivo','2014-11-07','17:42:05',2107.72,'A'),(9,7,8,88.61,'Efectivo','2014-11-07','22:30:29',1388.19,'A'),(10,4,8,362.88,'Tarjeta','2014-11-07','11:19:08',3669.12,'A'),(11,2,5,231.88,'Tarjeta','2014-11-07','10:44:14',1876.12,'R'),(12,3,6,769.2,'Efectivo','2014-11-07','15:54:57',5640.8,'A'),(13,13,9,453.44,'Efectivo','2014-12-10','15:34:15',3325.2,'A'),(14,11,5,793.56,'Tarjeta','2014-06-11','00:39:03',5819.44,'A'),(15,14,5,389.13,'Efectivo','2014-07-11','23:48:53',2205.05,'A'),(16,15,6,314.41,'Efectivo','2014-08-11','10:47:16',2305.64,'A'),(17,4,5,381.21,'Tarjeta','2014-08-11','23:18:42',3854.47,'A'),(18,8,9,732.85,'Tarjeta','2014-09-11','11:17:39',5374.23,'A'),(19,2,11,152.08,'Tarjeta','2016-10-30','22:13:57',1115.28,'S'),(20,2,8,42.17,'Tarjeta','2016-10-30','22:34:15',309.28,'S');
/*!40000 ALTER TABLE `presupuesto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `proveedor` (
  `pro_codigo` int(11) NOT NULL,
  `pro_razonsocial` varchar(50) DEFAULT NULL,
  `pro_ruc` varchar(11) DEFAULT NULL,
  `pro_contacto` varchar(30) DEFAULT NULL,
  `pro_celular` varchar(11) DEFAULT NULL,
  `pro_telefono` varchar(9) DEFAULT NULL,
  `pro_fax` varchar(8) DEFAULT NULL,
  `pro_direccion` varchar(50) DEFAULT NULL,
  `pro_provincia` int(11) NOT NULL,
  `pro_email` varchar(50) DEFAULT NULL,
  `pro_web` varchar(50) DEFAULT NULL,
  `pro_observacion` varchar(100) DEFAULT NULL,
  `pro_indicador` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`pro_codigo`),
  KEY `FK_k49hpk8you5qpj2j1w2qo4wtk` (`pro_provincia`),
  CONSTRAINT `FK_k49hpk8you5qpj2j1w2qo4wtk` FOREIGN KEY (`pro_provincia`) REFERENCES `provincias` (`prv_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedor`
--

LOCK TABLES `proveedor` WRITE;
/*!40000 ALTER TABLE `proveedor` DISABLE KEYS */;
INSERT INTO `proveedor` VALUES (1,'ARDILES IMPORT S.A.C','6436353343','JOSE','983453453','3190660 ','1232','AVENIDA SANTA MARÍA, 210',1,'informes@ardiles.com.pe','www.ardilesimport.com','NINGUNA','S'),(2,'JEPESA REPRESENTACIONES S.R.L.','6436353343','MARIA','898382689','5617466','4121','CALLE LOS TUCANES, 153 URB. SAN JOSE-BELLAVISTA',2,'informes@jepesa.com','www.jepesa.com','NINGUNA','S'),(3,'FEDIVEN S.A.C. - SUCURSAL DE SAN LUIS','5325322','PEDRO','984352333','4732464  ','2311','AVENIDA CIRCUNVALACIÓN, 2094',1,'informes@fediven.com.pe','www.fediven.com','NINGUNA','S'),(4,'INDUSTRIAL COMERCIAL SANTA ADELAIDA S.A.','9388748327','ESTELA','938829884','6116868','5332','AVENIDA COLONIAL, 2479 - CERCADO DE LIMA',1,'informes@icsa.com.pe','www.icsa.com.pe','NINGUNA','S'),(5,'DISTRIBUIDORA INCORESA - SUCURSAL DE EL CERCADO','5445446454','ESTHEPANY','873435233','6197373 ','4322','AVENIDA SANTA BERNARDITA, 024 URB. PALOMINO',1,'informes@incoresa.com.pe','www.incoresa.com.pe','NINGUNA','S'),(6,'LINIAN CORP S.A.C. - SUCURSAL DE BREÑA','1988392837','CARLOS','848382934','4333296','5413','JIRÓN PARIACOTO, 989 - BREÑA',1,'informes@liniasac.com','www.liniansac.com','EXIGENTE','S'),(7,'TRUCK ACCESORIES S.A.C. - LOCAL COMERCIAL','6523534534','SAMUEL','898232523','5354546','3423','AVENIDA MÉXICO, 889 891 - LA VICTORIA ',1,'informes@truckaccesoriesperu.com.pe','www.truckaccesoriesperu.com','NINGUNA','S'),(8,'COMPER','4757567567','ERICKA','957833763','2248602','2112','AVENIDA NICOLÁS ARRIOLA, 290 OF. 105 - LA VICTORIA',1,'informes@compersrl.com','www.compersrl.com','NINGUNA','S'),(9,'VIDRIERIA SANTA CATALINA SAC','4635353523','ROSARIO','982423534','5632342','1232','AVENIDA CANADÁ, 860 URB. SANTA CATALINA',1,'atencionalcliente@vidstacatalina.com','www.vidstacatalina.com','NINGUNA','S'),(10,'SAFETY FILMS PERU SAC','6436353252','FRANK','798434535','5723534','6324','C. CARLOS JIMÉNEZ MZ. K LT. 5 LA CAMPIÑA',1,'informes@safetyfilms.pe','www.safetyfilms.pe','LEJANO','S'),(11,'TUBERIAS JACINTO S.A','2184089238','ROBERTO','987987987','2837982','8921','AV. FLORES 345, LA VICTORIA',1,'tuberiasjacinto@gmail.com',' ',' ','S'),(12,'DELBAY S.A','2394804093','ERNESTO','893481932','5943823','3498','AV. ALFREDO MENDIOLA 642',1,'delbay@hotmail.com',' ',' ','S'),(13,'VIALUMAZ E.I.R.L','2034430930','PEPE','899293209','5103994','7979','JR. PACARITAMBO',1,'vialumaz@gmail.com',' ',' ','S'),(14,'MASTERCOM','1238043909','ROSAURA','9893298','6839928','9128','AV. AVIACION 4230 OF 301-SURQUILLO',1,'informes@mastercom.com.pe','www.mastercon.com.pe/',' ','S');
/*!40000 ALTER TABLE `proveedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `provincias`
--

DROP TABLE IF EXISTS `provincias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `provincias` (
  `prv_codigo` int(11) NOT NULL,
  `prv_nombre` varchar(15) DEFAULT NULL,
  `prv_indicador` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`prv_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `provincias`
--

LOCK TABLES `provincias` WRITE;
/*!40000 ALTER TABLE `provincias` DISABLE KEYS */;
INSERT INTO `provincias` VALUES (1,'LIMA','S'),(2,'CALLAO','S');
/*!40000 ALTER TABLE `provincias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `retiro`
--

DROP TABLE IF EXISTS `retiro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `retiro` (
  `re_codigo` int(11) NOT NULL,
  `re_fecha` date DEFAULT NULL,
  `re_descripcion` int(11) NOT NULL,
  `re_nombre` varchar(25) DEFAULT NULL,
  `re_importe` double DEFAULT NULL,
  PRIMARY KEY (`re_codigo`),
  KEY `FK_rjwpxfywdtmsa50yeqr13k8i8` (`re_descripcion`),
  CONSTRAINT `FK_rjwpxfywdtmsa50yeqr13k8i8` FOREIGN KEY (`re_descripcion`) REFERENCES `detallegasto` (`dg_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `retiro`
--

LOCK TABLES `retiro` WRITE;
/*!40000 ALTER TABLE `retiro` DISABLE KEYS */;
INSERT INTO `retiro` VALUES (0,'2016-10-30',1,'d',4),(1,'2016-10-30',2,'ADELANTO PARA PEPE',250);
/*!40000 ALTER TABLE `retiro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rubro`
--

DROP TABLE IF EXISTS `rubro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `rubro` (
  `rub_codigo` int(11) NOT NULL,
  `rub_nombre` varchar(15) DEFAULT NULL,
  `rub_indicador` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`rub_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rubro`
--

LOCK TABLES `rubro` WRITE;
/*!40000 ALTER TABLE `rubro` DISABLE KEYS */;
INSERT INTO `rubro` VALUES (1,'MADERAS','S'),(2,'PLASTICOS','S'),(3,'CONTRUCCION','S'),(4,'CARPINTERIA','S'),(5,'METALES','S'),(6,'GASFITERIA','S'),(7,'VIDRIOS','S'),(8,'ELECTRICIDAD','S'),(9,'JARDINERIA','S'),(10,'TELAS','S');
/*!40000 ALTER TABLE `rubro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salidas`
--

DROP TABLE IF EXISTS `salidas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `salidas` (
  `sal_codigo` int(11) NOT NULL,
  `sal_fecha` date DEFAULT NULL,
  `sal_hora` time NOT NULL,
  `sal_monto` double DEFAULT NULL,
  `sal_indicador` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`sal_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salidas`
--

LOCK TABLES `salidas` WRITE;
/*!40000 ALTER TABLE `salidas` DISABLE KEYS */;
INSERT INTO `salidas` VALUES (1,'2014-03-05','20:07:29',126,'S'),(2,'2014-11-05','14:25:34',2452,'S'),(3,'2014-11-05','17:04:50',2342,'S'),(4,'2014-12-05','23:47:06',1230,'S'),(5,'2014-12-05','20:52:08',613,'S'),(6,'2014-12-05','14:18:52',1581,'S'),(7,'2014-12-05','22:38:25',1186,'S'),(8,'2014-12-05','17:37:00',943,'S'),(9,'2014-12-05','22:15:18',2774.5,'S'),(10,'2014-12-05','13:10:02',205,'S'),(11,'2014-12-05','20:56:11',2201,'S'),(12,'2014-12-05','15:11:55',1485.44,'S'),(13,'2014-12-05','15:43:37',2702,'S'),(14,'2014-12-05','23:50:29',2459.6,'S'),(15,'2014-08-10','23:27:59',668.9,'S'),(16,'2014-12-05','23:56:03',1779.48,'S'),(17,'2014-08-11','10:35:56',2574.36,'S'),(18,'2014-09-11','17:16:33',1200,'S'),(19,'2014-12-05','03:34:38',233,'S');
/*!40000 ALTER TABLE `salidas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stock`
--

DROP TABLE IF EXISTS `stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `stock` (
  `sto_articulo` int(11) DEFAULT NULL,
  `sto_cantidad` int(11) DEFAULT NULL,
  `sto_indicador` varchar(2) NOT NULL,
  KEY `FK_he4wfujiuyarcem8r8pdytqx2` (`sto_articulo`),
  CONSTRAINT `FK_he4wfujiuyarcem8r8pdytqx2` FOREIGN KEY (`sto_articulo`) REFERENCES `articulo` (`art_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock`
--

LOCK TABLES `stock` WRITE;
/*!40000 ALTER TABLE `stock` DISABLE KEYS */;
INSERT INTO `stock` VALUES (1,50,'S'),(2,50,'S'),(3,50,'S'),(4,50,'S'),(5,50,'S'),(6,50,'S'),(7,50,'S'),(8,50,'S'),(9,50,'S'),(10,50,'S'),(11,50,'S'),(12,50,'S'),(13,50,'S'),(14,50,'S'),(15,50,'S'),(16,50,'S'),(17,50,'S'),(18,50,'S'),(19,50,'S'),(20,50,'S'),(21,50,'S'),(22,50,'S'),(23,50,'S'),(24,50,'S'),(25,50,'S'),(26,50,'S'),(27,50,'S'),(28,50,'S'),(29,50,'S'),(30,50,'S'),(31,50,'S'),(32,50,'S'),(33,50,'S'),(34,50,'S'),(35,50,'S'),(36,50,'S'),(37,50,'S'),(38,50,'S'),(39,50,'S'),(40,50,'S'),(41,50,'S'),(42,50,'S'),(43,50,'S'),(44,50,'S'),(45,50,'S'),(46,50,'S'),(47,50,'S'),(48,50,'S'),(49,50,'S'),(50,50,'S'),(51,50,'S'),(52,50,'S'),(53,50,'S'),(54,50,'S'),(55,50,'S'),(56,50,'S'),(57,50,'S'),(58,50,'S'),(59,50,'S'),(60,50,'S'),(61,50,'S'),(62,50,'S'),(63,50,'S'),(64,50,'S'),(65,50,'S'),(66,50,'S'),(67,50,'S'),(68,50,'S'),(69,50,'S'),(70,50,'S'),(71,50,'S'),(72,50,'S'),(73,50,'S');
/*!40000 ALTER TABLE `stock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transporte`
--

DROP TABLE IF EXISTS `transporte`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `transporte` (
  `tra_codigo` int(11) NOT NULL,
  `tra_nombre` varchar(15) DEFAULT NULL,
  `tra_indicador` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`tra_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transporte`
--

LOCK TABLES `transporte` WRITE;
/*!40000 ALTER TABLE `transporte` DISABLE KEYS */;
INSERT INTO `transporte` VALUES (1,'EL RAPIDO','S'),(2,'EL NITROSO','S'),(3,'EL FUGAZ','S'),(4,'EL ESCARABAJO','S');
/*!40000 ALTER TABLE `transporte` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `unidad`
--

DROP TABLE IF EXISTS `unidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `unidad` (
  `uni_codigo` int(11) NOT NULL,
  `uni_nombre` varchar(15) DEFAULT NULL,
  `uni_indicador` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`uni_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `unidad`
--

LOCK TABLES `unidad` WRITE;
/*!40000 ALTER TABLE `unidad` DISABLE KEYS */;
INSERT INTO `unidad` VALUES (1,'METROS','S'),(2,'KILOGRAMO','S'),(3,'PULGADAS','S'),(4,'UNIDADES','S');
/*!40000 ALTER TABLE `unidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `usuario` (
  `usu_codigo` int(11) NOT NULL,
  `usu_nombre` varchar(30) DEFAULT NULL,
  `usu_perfil` int(11) DEFAULT NULL,
  `usu_usuario` varchar(50) DEFAULT NULL,
  `usu_password` varchar(50) DEFAULT NULL,
  `usu_indicador` varchar(2) DEFAULT NULL,
  `usu_ip` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`usu_codigo`),
  KEY `FK_blulqdnea7qvd8bsu3n4qx4uf` (`usu_perfil`),
  CONSTRAINT `FK_blulqdnea7qvd8bsu3n4qx4uf` FOREIGN KEY (`usu_perfil`) REFERENCES `perfil` (`per_id`),
  CONSTRAINT `FK_m4aq6m6hfvhd4706rsealqnbq` FOREIGN KEY (`usu_codigo`) REFERENCES `vendedor` (`ven_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'JONATHAN M. LOPEZ',1,'jlopez','b06e188688ee904809bc4f1fda16aed8','S','192.168.1.63'),(2,'NOELIA CALLE QUIROZ',2,'ncalle','376199b95700ef9ad5b8b9cd2e565fc8','S','10.10.62.2'),(3,'RAUL SANTOS GARLAND',3,'rsantos','c2f004a05fffa487f826003604b87de1','S','10.10.62.2'),(4,'ROSA M. PATIÑO AGUILAR',3,'rpatiño','d2200b3c9b3d1e7a1effb538d8e23be2','S','10.10.62.2'),(5,'JENNIFER C. ASTON RAMOS',3,'jaston','63adada0c38fcb3eb4f11548d046dfc7','S','10.10.62.2'),(6,'GIANELLA R. GONZALES PRADA',3,'ggonzales','ab40b2a3fc91109d30c1e3fd5c7be3fe','S','10.10.62.2'),(7,'ANDRE PEÑALOZA DE SOUSA',4,'apeñaloza','dd573120e473c889140e34e817895495','S','10.10.62.2'),(8,'MARISOL CASTRO AGUIRRE',3,'mcastro','987f6c3ed52eea0e00f48f838d330911','S','10.10.62.2'),(9,'JOSE IZQUIERDO MORALES',4,'joseim','90e528618534d005b1a7e7b7a367813f','S','10.10.62.2'),(10,'ESTEVAN RAMIREZ SALCEDO',2,'eramirez','73ac3cb2bbaa6f2a277417a260779cec','S','10.10.62.2');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendedor`
--

DROP TABLE IF EXISTS `vendedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `vendedor` (
  `ven_codigo` int(11) NOT NULL,
  `ven_nombre` varchar(50) DEFAULT NULL,
  `ven_direccion` varchar(40) DEFAULT NULL,
  `ven_telefono` varchar(9) DEFAULT NULL,
  `ven_celular` varchar(11) DEFAULT NULL,
  `ven_sueldo` double DEFAULT NULL,
  `ven_provincia` int(11) NOT NULL,
  `ven_zona` int(11) NOT NULL,
  `ven_comision` double DEFAULT NULL,
  `ven_email` varchar(40) DEFAULT NULL,
  `ven_observacion` varchar(200) NOT NULL,
  `ven_imagen` varchar(10) DEFAULT NULL,
  `ven_indicador` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`ven_codigo`),
  KEY `FK_lk5fk47d6wh4i1afpkuml9m4f` (`ven_provincia`),
  KEY `FK_n980i5eap1by8yv28daab1h33` (`ven_zona`),
  CONSTRAINT `FK_lk5fk47d6wh4i1afpkuml9m4f` FOREIGN KEY (`ven_provincia`) REFERENCES `provincias` (`prv_codigo`),
  CONSTRAINT `FK_n980i5eap1by8yv28daab1h33` FOREIGN KEY (`ven_zona`) REFERENCES `zona` (`zon_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendedor`
--

LOCK TABLES `vendedor` WRITE;
/*!40000 ALTER TABLE `vendedor` DISABLE KEYS */;
INSERT INTO `vendedor` VALUES (1,'JONATHAN M. LOPEZ GAMARRA','COMAS CALLE HEROES DEL CENEPA 243','7399939','979183889',2000,1,1,10,'jmlopezg108@gmail.com','PUNTUAL Y RESPONSABLE',NULL,'S'),(2,'NOELIA CALLE QUIROZ','URB. CASIMIRO 345 - SAN LUIS','4554323','989343523',800,1,3,10,'noeliacq@hotmail.com','LE GUSTA CANTAR',NULL,'S'),(3,'RAUL SANTOS GARLAND','URB. GIRASOL 234 - LOS OLIVOS','7823883','893273478',800,1,1,10,'raulsg@gmail.com','PUNTUAL',NULL,'S'),(4,'ROSA M. PATIÑO AGUILAR','CALLE DONAL 344 - CHORRILLOS','5792920','900239843',800,1,1,10,'parosa@gmail.com','SIMPATICA',NULL,'S'),(5,'JENNIFER C. ASTON RAMOS','URB. GRAU 344 - LOS OLIVOS','7839929','983829383',800,1,1,10,'jennifer12@hotmail.com','PERSUASIVA',NULL,'S'),(6,'GIANELLA R. GONZALES PRADA','AV. OCLLO 345, LINCE','5923993','989379346',800,1,3,10,'gonzalesg@hotmail.com','NINGUNA',NULL,'S'),(7,'ANDRE PEÑALOZA DE SOUSA','AV. GENERAL ALMEDARIZ 234 MIRAFLORES','7838298','899293399',2000,1,4,11,'apeñaloza@hotmail.com','NINGUNA',NULL,'S'),(8,'MARISOL CASTRO AGUIRRE','AV. CASIMIRO 233 - URB. GIRASOLES, COMAS','5654323','755432323',800,1,1,3,'mcastro@gmail.com','NINGUNA',NULL,'S'),(9,'JOSE IZQUIERDO MORALES','URB. ALAMO 345 - COMAS','8980234','023482304',900,1,1,10,'joseim@gmail.com','NINGUNA',NULL,'S'),(10,'ESTEVAN RAMIREZ SALCEDO','URB. PINAR 352 - LOS OLIVOS','7623534','896524356',900,1,1,10,'ramirez@gmail.com',' ',NULL,'S');
/*!40000 ALTER TABLE `vendedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zona`
--

DROP TABLE IF EXISTS `zona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `zona` (
  `zon_codigo` int(11) NOT NULL,
  `zon_nombre` varchar(15) DEFAULT NULL,
  `zon_indicador` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`zon_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zona`
--

LOCK TABLES `zona` WRITE;
/*!40000 ALTER TABLE `zona` DISABLE KEYS */;
INSERT INTO `zona` VALUES (1,'NORTE','S'),(2,'SUR','S'),(3,'ESTE','S'),(4,'OESTE','S'),(5,'CENTRO','S');
/*!40000 ALTER TABLE `zona` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-09-08 21:13:32
