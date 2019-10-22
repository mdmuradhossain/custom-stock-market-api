CREATE DATABASE  IF NOT EXISTS `stock_market`;
USE `stock_market`;

--
-- Table structure for table `company`
--

DROP TABLE IF EXISTS `company`;

CREATE TABLE `company` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `trading_code` varchar(10) DEFAULT NULL,
  `company_name` varchar(45) DEFAULT NULL,
  `price` double(20,4) DEFAULT NULL,
  `change` double(20,4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `company`
--

INSERT INTO `company` VALUES 
	(1,'T5J465465','Beximco',834642.00,10.00),
	(2,'6875675KF','Square',98547654.00,34.58),
	(3,'13DW94348','City Group',57849348.00,23.08),
	(4,'74353MG73','Bashundhara Group',7587438468.54,67.88),
	(5,'32SL7487','Acme',7853843643.00,12.33);

