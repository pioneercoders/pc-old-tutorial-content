-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.24


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema jdbc
--

CREATE DATABASE IF NOT EXISTS jdbc;
USE jdbc;

--
-- Definition of table `country_mst_tbl`
--

DROP TABLE IF EXISTS `country_mst_tbl`;
CREATE TABLE `country_mst_tbl` (
  `CODE` varchar(20) NOT NULL DEFAULT '',
  `NAME` varchar(45) DEFAULT NULL,
  `CONTINENT` varchar(45) DEFAULT NULL,
  `REGION` varchar(45) DEFAULT NULL,
  `POPULATION` bigint(20) unsigned DEFAULT NULL,
  `CAPITAL` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `country_mst_tbl`
--

/*!40000 ALTER TABLE `country_mst_tbl` DISABLE KEYS */;
INSERT INTO `country_mst_tbl` (`CODE`,`NAME`,`CONTINENT`,`REGION`,`POPULATION`,`CAPITAL`) VALUES 
 ('ABW','ARUBA','NORTHAMERICA','CARIBBEAN',10300,'129'),
 ('AFG','AFGANISTAN','ASIA','SOUTHERN AUSTRALIA',2270000,'12'),
 ('ARE','UNITED ARAB EMIRATES','ASIA','MIDDLEEAST',24000,'65'),
 ('ARG','ARGENTINA','SOUTHAMERICA','SOUTHAMERICA',370,'69');
/*!40000 ALTER TABLE `country_mst_tbl` ENABLE KEYS */;


--
-- Definition of table `employee_mst_tbl`
--

DROP TABLE IF EXISTS `employee_mst_tbl`;
CREATE TABLE `employee_mst_tbl` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(45) NOT NULL,
  `dob` varchar(45) NOT NULL,
  `mail_id` varchar(45) NOT NULL,
  `phoneno` int(20) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `employee_mst_tbl`
--

/*!40000 ALTER TABLE `employee_mst_tbl` DISABLE KEYS */;
INSERT INTO `employee_mst_tbl` (`id`,`emp_name`,`dob`,`mail_id`,`phoneno`) VALUES 
 (20,'gopi','20-02-1993','gopi@gmail.com',8754126),
 (22,'rajeshh','10-06-1993','2345@gmail.com',8542167),
 (30,'anand','12-01-1993','appaji@gmail.com',7451426),
 (40,'rajesh','20-06-1993','2345@gamil.com',777478512);
/*!40000 ALTER TABLE `employee_mst_tbl` ENABLE KEYS */;


--
-- Definition of table `user_mst_tbl`
--

DROP TABLE IF EXISTS `user_mst_tbl`;
CREATE TABLE `user_mst_tbl` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `USER_ID` varchar(255) DEFAULT NULL,
  `USER_PWD` varchar(255) DEFAULT NULL,
  `ROLE_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user_mst_tbl`
--

/*!40000 ALTER TABLE `user_mst_tbl` DISABLE KEYS */;
INSERT INTO `user_mst_tbl` (`ID`,`USER_ID`,`USER_PWD`,`ROLE_ID`) VALUES 
 (1,'sr12','sr',3);
/*!40000 ALTER TABLE `user_mst_tbl` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
