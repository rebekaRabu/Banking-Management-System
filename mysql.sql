-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.41-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema test
--

CREATE DATABASE IF NOT EXISTS test;
USE test;

--
-- Definition of table `balance_sheet`
--

DROP TABLE IF EXISTS `balance_sheet`;
CREATE TABLE `balance_sheet` (
  `ID_No` int(10) unsigned NOT NULL auto_increment,
  `Acc` int(10) unsigned NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Balance` int(10) unsigned NOT NULL,
  PRIMARY KEY  USING BTREE (`ID_No`,`Acc`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `balance_sheet`
--

/*!40000 ALTER TABLE `balance_sheet` DISABLE KEYS */;
INSERT INTO `balance_sheet` (`ID_No`,`Acc`,`Name`,`Balance`) VALUES 
 (10001,1,'Sabbir ahmed',1000),
 (10002,2,'tofail',1900),
 (10003,3,'hasnain',3000),
 (10004,4,'Rebeka Sultana',800),
 (10005,5,'Lamha',1500),
 (10006,6,'Shahera',1200);
/*!40000 ALTER TABLE `balance_sheet` ENABLE KEYS */;


--
-- Definition of table `customer_information_table`
--

DROP TABLE IF EXISTS `customer_information_table`;
CREATE TABLE `customer_information_table` (
  `Acc` int(10) unsigned NOT NULL auto_increment,
  `Name` varchar(45) NOT NULL,
  `DOB` date NOT NULL,
  `Phone` int(10) unsigned NOT NULL,
  `Address` varchar(45) NOT NULL,
  `District` varchar(45) NOT NULL,
  `State` varchar(45) NOT NULL,
  `Gender` varchar(45) NOT NULL,
  `MaritalStatus` varchar(45) NOT NULL,
  `MotherName` varchar(45) NOT NULL,
  `FatherName` varchar(45) NOT NULL,
  `Balance` int(10) unsigned NOT NULL,
  `CurrentDate` date NOT NULL,
  PRIMARY KEY  (`Acc`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer_information_table`
--

/*!40000 ALTER TABLE `customer_information_table` DISABLE KEYS */;
INSERT INTO `customer_information_table` (`Acc`,`Name`,`DOB`,`Phone`,`Address`,`District`,`State`,`Gender`,`MaritalStatus`,`MotherName`,`FatherName`,`Balance`,`CurrentDate`) VALUES 
 (1,'Sabbir ahmed','1989-11-07',123456789,'450 keshorgang,','keshorgang','Dhaka','Male','Unmarried ','Hasna begum','sattar alli',1000,'2019-02-04'),
 (2,'tofail','1991-06-09',33333,'jatrabari','rajshhi','Rajshahi','Male','Unmarried ','jorina begum','sabbir ali',2000,'2019-02-02'),
 (3,'hasnain','1992-06-01',88888888,'jatrabari','barisal','Barisal','Male','Married ','hasina','hellal',3000,'2019-02-06'),
 (4,'Rebeka Sultana','1992-12-23',179632145,'143 norh mugdapara','Dhaka','Dhaka','Female','Unmarried ','Jhorna Begum','Sala Ahmed',1000,'2019-02-05'),
 (5,'Lamha','1994-01-15',198745632,'2556, Soni akhra, dhaka.','Dhaka','Dhaka','Female','Unmarried ','selina begum','jafor ali',1500,'2019-02-01'),
 (6,'shahera','1988-01-15',17896544,'145, Soni akhra, Barisal.','Barisal','Barisal','Female','Unmarried ','begum','ali mohammad',1200,'2019-02-03');
/*!40000 ALTER TABLE `customer_information_table` ENABLE KEYS */;


--
-- Definition of table `fd_form`
--

DROP TABLE IF EXISTS `fd_form`;
CREATE TABLE `fd_form` (
  `FD_Num` int(10) unsigned NOT NULL auto_increment,
  `AccountNO` int(10) unsigned NOT NULL,
  `Deposit_Amount` int(10) unsigned NOT NULL,
  `Interest_Rate` int(10) unsigned NOT NULL,
  `Interest_Amount` double NOT NULL,
  `Period` int(10) unsigned NOT NULL,
  `Date` date NOT NULL,
  PRIMARY KEY  (`FD_Num`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fd_form`
--

/*!40000 ALTER TABLE `fd_form` DISABLE KEYS */;
INSERT INTO `fd_form` (`FD_Num`,`AccountNO`,`Deposit_Amount`,`Interest_Rate`,`Interest_Amount`,`Period`,`Date`) VALUES 
 (500000,6,6000,10,1800,3,'2019-02-08'),
 (500001,1,100,10,20,2,'2019-02-01'),
 (500003,3,100000,20,40000,2,'2019-01-03'),
 (500004,4,100,10,20,2,'2019-02-03'),
 (500005,5,1000,10,200,2,'2019-02-04'),
 (500006,2,5000,10,1000,2,'2018-01-05'),
 (500007,7,10000,5,1500,3,'2019-02-03');
/*!40000 ALTER TABLE `fd_form` ENABLE KEYS */;


--
-- Definition of table `user_information`
--

DROP TABLE IF EXISTS `user_information`;
CREATE TABLE `user_information` (
  `ID` int(10) unsigned NOT NULL auto_increment,
  `Name` varchar(45) NOT NULL,
  `UserName` varchar(45) NOT NULL,
  `Password` int(10) unsigned NOT NULL,
  `Gender` varchar(45) NOT NULL,
  `DOB` date NOT NULL,
  `Phone` varchar(45) NOT NULL,
  `Address` varchar(45) NOT NULL,
  `UserType` varchar(45) NOT NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_information`
--

/*!40000 ALTER TABLE `user_information` DISABLE KEYS */;
INSERT INTO `user_information` (`ID`,`Name`,`UserName`,`Password`,`Gender`,`DOB`,`Phone`,`Address`,`UserType`) VALUES 
 (1,'rebeka sultana','rabu',123456,'Female','1992-12-23','01687319061','143 rajshahi','Employee'),
 (2,'Arif ahmed','arif',12,'Male','1980-08-03','01999999999','tongi','Employee');
/*!40000 ALTER TABLE `user_information` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
