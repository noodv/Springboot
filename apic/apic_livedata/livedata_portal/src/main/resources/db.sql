CREATE TABLE `testuser` (
  `UserID` varchar(50) NOT NULL,
  `UserName` varchar(50) DEFAULT NULL,
  `UserBirth` date DEFAULT NULL,
  `Descript` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`UserID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;