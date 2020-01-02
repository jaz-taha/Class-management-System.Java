# MySQL-Front 3.2  (Build 6.11)

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES 'latin1' */;

# Host: localhost    Database: test
# ------------------------------------------------------
# Server version 5.5.5-10.1.38-MariaDB

#
# Table structure for table emploiyer
#

DROP TABLE IF EXISTS `emploiyer`;
CREATE TABLE `emploiyer` (
  `Id` varchar(20) NOT NULL,
  `password` varchar(20) DEFAULT NULL,
  `Identifiant` varchar(30) DEFAULT NULL,
  `Position` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Dumping data for table emploiyer
#

INSERT INTO `emploiyer` (`Id`,`password`,`Identifiant`,`Position`) VALUES ('139','2','2','emploiyer');
INSERT INTO `emploiyer` (`Id`,`password`,`Identifiant`,`Position`) VALUES ('19','dd','waht','emploiyer');
INSERT INTO `emploiyer` (`Id`,`password`,`Identifiant`,`Position`) VALUES ('190','1','ahmed','emploiyer');
INSERT INTO `emploiyer` (`Id`,`password`,`Identifiant`,`Position`) VALUES ('66','sa','waht','emploiyer');

#
# Table structure for table listeeleve
#

DROP TABLE IF EXISTS `listeeleve`;
CREATE TABLE `listeeleve` (
  `Prenom` varchar(30) NOT NULL,
  `Nom` varchar(30) DEFAULT NULL,
  `Code` varchar(20) NOT NULL DEFAULT '0',
  `Date_n` date DEFAULT NULL,
  `Moy_S1` varchar(255) DEFAULT NULL,
  `Moy_S2` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`Code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Dumping data for table listeeleve
#

INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Argoubi','Amira','800','1999-12-04','10','10');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Ben Hassine','Aymen','801','1999-12-04','8','7');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Ben Naser','Ahmed Amine','802','1999-12-04','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Ayed','Abdelhedi','803','1999-12-04','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Abouda','Ibrahim','804','1999-12-04','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Abadelaziz','Firas','805','1999-12-04','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Bouatay','Nawress','806','1999-12-04','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Ben yarou','Nidhal','807','1999-12-04','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Berrima','Mongi','808','1999-12-04','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Ben hlel ','Amine','809','1999-12-04','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Ben Amor ','Ahlem','810','1999-12-04','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Chtourou','Saif','811','1999-12-04','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Dahmeni','Mohamed Hedi','812','1999-12-04','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Essyes','Omar','813','1999-12-04','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Ghrissi','Mohamed','814','1999-12-04','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Gunenna','Abederrahmen','815','1999-12-04','12','12');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Gallaoui ','Seif Eddine','816','1999-12-04','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Hassine','Anghame','817','1999-12-04','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Hamdi ','Lamia','818','1999-12-04','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Aroui','Hosni','819','1999-12-04','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Bergaoui ','Wael','820','1999-12-04','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Mrabet','Yahya','821','1999-12-04','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Joo ','Houssem','822','1999-12-04','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Kaabi','Firas','823','1999-12-04','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Rachah','Nacef','824','1999-12-04','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Klabi','Fatma','825','1999-12-04','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Souhili','Fatma','826','1999-12-04','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Geutif','Chaima','827','1999-12-04','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Labidi','Riadh','828','1999-12-04','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Tbini ','Amen','829','1999-12-04','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Tlig ','Houssine','830','1999-12-04','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Jaziri','Taha','832','1998-01-16','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Mannai','Azza','833','1998-05-08','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Zafrane ','Hamza','834','1999-12-04','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Sidiya','Rafa','835','1999-12-04','10.00','10.00');
INSERT INTO `listeeleve` (`Prenom`,`Nom`,`Code`,`Date_n`,`Moy_S1`,`Moy_S2`) VALUES ('Zaag','Katr Ennada','836','1999-12-04','17','10.00');

#
# Table structure for table listemat
#

DROP TABLE IF EXISTS `listemat`;
CREATE TABLE `listemat` (
  `Nom` varchar(20) NOT NULL,
  `Code_m` varchar(11) NOT NULL,
  `Coeff` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`Code_m`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Dumping data for table listemat
#

INSERT INTO `listemat` (`Nom`,`Code_m`,`Coeff`) VALUES ('francais','100','1');
INSERT INTO `listemat` (`Nom`,`Code_m`,`Coeff`) VALUES ('Culture de ','110','1');
INSERT INTO `listemat` (`Nom`,`Code_m`,`Coeff`) VALUES ('Théorie des','120','2');
INSERT INTO `listemat` (`Nom`,`Code_m`,`Coeff`) VALUES ('Atelier Bas','130','1');
INSERT INTO `listemat` (`Nom`,`Code_m`,`Coeff`) VALUES ('Programmation','20','1');
INSERT INTO `listemat` (`Nom`,`Code_m`,`Coeff`) VALUES ('Techniques ','30','1.5');
INSERT INTO `listemat` (`Nom`,`Code_m`,`Coeff`) VALUES ('Atelier de ','40','1');
INSERT INTO `listemat` (`Nom`,`Code_m`,`Coeff`) VALUES ('Système de ','50','1');
INSERT INTO `listemat` (`Nom`,`Code_m`,`Coeff`) VALUES ('Environneme','60','1');
INSERT INTO `listemat` (`Nom`,`Code_m`,`Coeff`) VALUES ('Réseaux','70','1');
INSERT INTO `listemat` (`Nom`,`Code_m`,`Coeff`) VALUES ('Administrat','80','1');
INSERT INTO `listemat` (`Nom`,`Code_m`,`Coeff`) VALUES ('Anglais','90','1');

#
# Table structure for table profs
#

DROP TABLE IF EXISTS `profs`;
CREATE TABLE `profs` (
  `Id` varchar(20) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `Identifiant` varchar(30) DEFAULT NULL,
  `Position` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Dumping data for table profs
#

INSERT INTO `profs` (`Id`,`password`,`Identifiant`,`Position`) VALUES ('1000','1','liza','profs');
INSERT INTO `profs` (`Id`,`password`,`Identifiant`,`Position`) VALUES ('311','1','ahmed','profs');
INSERT INTO `profs` (`Id`,`password`,`Identifiant`,`Position`) VALUES ('502','3','3','profs');
INSERT INTO `profs` (`Id`,`password`,`Identifiant`,`Position`) VALUES ('597','1','more','profs');
INSERT INTO `profs` (`Id`,`password`,`Identifiant`,`Position`) VALUES ('642','dd','dud','profs');
INSERT INTO `profs` (`Id`,`password`,`Identifiant`,`Position`) VALUES ('799','1','lizza','profs');

#
# Table structure for table student
#

DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `Id` varchar(20) NOT NULL,
  `password` varchar(20) DEFAULT NULL,
  `Identifiant` varchar(30) DEFAULT NULL,
  `Position` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Dumping data for table student
#

INSERT INTO `student` (`Id`,`password`,`Identifiant`,`Position`) VALUES ('1911','azz','azza bhima ','student');
INSERT INTO `student` (`Id`,`password`,`Identifiant`,`Position`) VALUES ('4555','dd','ddd','student');
INSERT INTO `student` (`Id`,`password`,`Identifiant`,`Position`) VALUES ('4556','1','1','student');
INSERT INTO `student` (`Id`,`password`,`Identifiant`,`Position`) VALUES ('4568','asma','asma','student');
INSERT INTO `student` (`Id`,`password`,`Identifiant`,`Position`) VALUES ('4736','azza','azza','student');
INSERT INTO `student` (`Id`,`password`,`Identifiant`,`Position`) VALUES ('5116','123','10','student');
INSERT INTO `student` (`Id`,`password`,`Identifiant`,`Position`) VALUES ('5222','1','omar','student');
INSERT INTO `student` (`Id`,`password`,`Identifiant`,`Position`) VALUES ('5229','FFF','GGG','student');
INSERT INTO `student` (`Id`,`password`,`Identifiant`,`Position`) VALUES ('6801','1','ahmed','student');
INSERT INTO `student` (`Id`,`password`,`Identifiant`,`Position`) VALUES ('7553','sam','nope','student');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
