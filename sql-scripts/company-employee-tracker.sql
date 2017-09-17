CREATE DATABASE IF NOT EXISTS `company_employee_tracker`;
USE `company_employee_tracker`;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;

CREATE TABLE `employees`(

 `id` int(11) NOT NULL AUTO_INCREMENT,
 `first_name` varchar(45) NOT NULL,
 `last_name` varchar(45) NOT NULL,
 `email` varchar(45) NOT NULL,
 PRIMARY KEY (`id`)
)  ENGINE=InnoDB AUTO_INCREMENT=1 
DEFAULT CHARSET=latin1;