CREATE TABLE `BookingStatus` (
  `StatusID` INT PRIMARY KEY AUTO_INCREMENT,
  `StatusName` VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE `PaymentStatus` (
  `StatusID` INT PRIMARY KEY AUTO_INCREMENT,
  `StatusName` VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE `ServiceProviderStatus` (
  `StatusID` INT PRIMARY KEY AUTO_INCREMENT,
  `StatusName` VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE `UserStatus` (
  `StatusID` INT PRIMARY KEY AUTO_INCREMENT,
  `StatusName` VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE `AdminStatus` (
  `StatusID` INT PRIMARY KEY AUTO_INCREMENT,
  `StatusName` VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE `TourStatus` (
  `StatusID` INT PRIMARY KEY AUTO_INCREMENT,
  `StatusName` VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE `ReviewStatus` (
  `StatusID` INT PRIMARY KEY AUTO_INCREMENT,
  `StatusName` VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE `ImageStatus` (
  `StatusID` INT PRIMARY KEY AUTO_INCREMENT,
  `StatusName` VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE `Users` (
  `UserID` INT PRIMARY KEY AUTO_INCREMENT,
  `Username` VARCHAR(50) UNIQUE NOT NULL,
  `Password` VARCHAR(255) NOT NULL,
  `Email` VARCHAR(100) UNIQUE NOT NULL,
  `FullName` VARCHAR(100) NOT NULL,
  `PhoneNumber` VARCHAR(20),
  `Address` VARCHAR(255),
  `ProfileImageID` INT,
  `StatusID` INT NOT NULL DEFAULT 1,
  `dbStatus` INT NOT NULL DEFAULT 1,
  `CreatedAt` DATETIME NOT NULL DEFAULT (CURRENT_TIMESTAMP),
  `UpdatedAt` DATETIME NOT NULL DEFAULT (CURRENT_TIMESTAMP)
);

CREATE TABLE `Admins` (
  `AdminID` INT PRIMARY KEY AUTO_INCREMENT,
  `Username` VARCHAR(50) UNIQUE NOT NULL,
  `Password` VARCHAR(255) NOT NULL,
  `Email` VARCHAR(100) UNIQUE NOT NULL,
  `FullName` VARCHAR(100) NOT NULL,
  `PhoneNumber` VARCHAR(20),
  `Role` VARCHAR(50) NOT NULL,
  `StatusID` INT NOT NULL DEFAULT 1,
  `dbStatus` INT NOT NULL DEFAULT 1,
  `CreatedAt` DATETIME NOT NULL DEFAULT (CURRENT_TIMESTAMP),
  `UpdatedAt` DATETIME NOT NULL DEFAULT (CURRENT_TIMESTAMP)
);

CREATE TABLE `Service_Providers` (
  `ProviderID` INT PRIMARY KEY AUTO_INCREMENT,
  `CompanyName` VARCHAR(255) UNIQUE NOT NULL,
  `CompanyRegistrationNumber` VARCHAR(100) UNIQUE NOT NULL,
  `TaxID` VARCHAR(50) UNIQUE NOT NULL,
  `CompanyAddress` VARCHAR(255) NOT NULL,
  `ContactPerson` VARCHAR(100) NOT NULL,
  `ContactEmail` VARCHAR(100) UNIQUE NOT NULL,
  `ContactPhone` VARCHAR(20) NOT NULL,
  `Website` VARCHAR(255),
  `CompanyDescription` TEXT,
  `LogoURL` VARCHAR(255),
  `SocialMediaLinks` TEXT,
  `BankAccountNumber` VARCHAR(50),
  `BankName` VARCHAR(100),
  `BankBranch` VARCHAR(100),
  `LicenseDocumentURL` VARCHAR(255),
  `StatusID` INT NOT NULL DEFAULT 1,
  `dbStatus` INT NOT NULL DEFAULT 1,
  `RejectionReason` TEXT,
  `CreatedAt` DATETIME NOT NULL DEFAULT (CURRENT_TIMESTAMP),
  `UpdatedAt` DATETIME NOT NULL DEFAULT (CURRENT_TIMESTAMP)
);

CREATE TABLE `Categories` (
  `CategoryID` INT PRIMARY KEY AUTO_INCREMENT,
  `Name` VARCHAR(100) UNIQUE NOT NULL,
  `Description` TEXT,
  `StatusID` INT NOT NULL DEFAULT 1,
  `dbStatus` INT NOT NULL DEFAULT 1,
  `CreatedAt` DATETIME NOT NULL DEFAULT (CURRENT_TIMESTAMP),
  `UpdatedAt` DATETIME NOT NULL DEFAULT (CURRENT_TIMESTAMP)
);

CREATE TABLE `Locations` (
  `LocationID` INT PRIMARY KEY AUTO_INCREMENT,
  `Name` VARCHAR(100) UNIQUE NOT NULL,
  `Description` TEXT,
  `Country` VARCHAR(100) NOT NULL,
  `City` VARCHAR(100) NOT NULL,
  `StatusID` INT NOT NULL DEFAULT 1,
  `dbStatus` INT NOT NULL DEFAULT 1,
  `CreatedAt` DATETIME NOT NULL DEFAULT (CURRENT_TIMESTAMP),
  `UpdatedAt` DATETIME NOT NULL DEFAULT (CURRENT_TIMESTAMP)
);

CREATE TABLE `Tours` (
  `TourID` INT PRIMARY KEY AUTO_INCREMENT,
  `ProviderID` INT NOT NULL,
  `CategoryID` INT NOT NULL,
  `LocationID` INT NOT NULL,
  `Name` VARCHAR(100) NOT NULL,
  `Description` TEXT,
  `Price` DECIMAL(10,2) NOT NULL,
  `Duration` VARCHAR(50) NOT NULL,
  `StartDate` DATE NOT NULL,
  `EndDate` DATE NOT NULL,
  `AvailableSlots` INT NOT NULL,
  `MainImageID` INT,
  `StatusID` INT NOT NULL DEFAULT 1,
  `dbStatus` INT NOT NULL DEFAULT 1,
  `CreatedAt` DATETIME NOT NULL DEFAULT (CURRENT_TIMESTAMP),
  `UpdatedAt` DATETIME NOT NULL DEFAULT (CURRENT_TIMESTAMP)
);

CREATE TABLE `Bookings` (
  `BookingID` INT PRIMARY KEY AUTO_INCREMENT,
  `UserID` INT NOT NULL,
  `TourID` INT NOT NULL,
  `BookingDate` DATETIME NOT NULL DEFAULT (CURRENT_TIMESTAMP),
  `StatusID` INT NOT NULL,
  `PhoneNumber` VARCHAR(20),
  `ContactName` VARCHAR(100),
  `dbStatus` INT NOT NULL DEFAULT 1,
  `PaymentID` INT,
  `CreatedAt` DATETIME NOT NULL DEFAULT (CURRENT_TIMESTAMP),
  `UpdatedAt` DATETIME NOT NULL DEFAULT (CURRENT_TIMESTAMP)
);

CREATE TABLE `Payments` (
  `PaymentID` INT PRIMARY KEY AUTO_INCREMENT,
  `BookingID` INT UNIQUE NOT NULL,
  `PaymentMethod` VARCHAR(50) NOT NULL,
  `StatusID` INT NOT NULL,
  `dbStatus` INT NOT NULL DEFAULT 1,
  `PaymentDate` DATETIME,
  `Amount` DECIMAL(10,2) NOT NULL,
  `CreatedAt` DATETIME NOT NULL DEFAULT (CURRENT_TIMESTAMP),
  `UpdatedAt` DATETIME NOT NULL DEFAULT (CURRENT_TIMESTAMP)
);

CREATE TABLE `Reviews` (
  `ReviewID` INT PRIMARY KEY AUTO_INCREMENT,
  `UserID` INT NOT NULL,
  `TourID` INT NOT NULL,
  `Rating` TINYINT NOT NULL,
  `Comment` TEXT,
  `StatusID` INT NOT NULL,
  `dbStatus` INT NOT NULL DEFAULT 1,
  `CreatedAt` DATETIME NOT NULL DEFAULT (CURRENT_TIMESTAMP),
  `UpdatedAt` DATETIME NOT NULL DEFAULT (CURRENT_TIMESTAMP)
);

CREATE TABLE `Images` (
  `ImageID` INT PRIMARY KEY AUTO_INCREMENT,
  `TourID` INT,
  `ProviderID` INT,
  `UserID` INT,
  `ImageData` LONGBLOB,
  `Caption` VARCHAR(255),
  `ImageType` VARCHAR(50) NOT NULL,
  `StatusID` INT NOT NULL,
  `dbStatus` INT NOT NULL DEFAULT 1,
  `CreatedAt` DATETIME NOT NULL DEFAULT (CURRENT_TIMESTAMP),
  `UpdatedAt` DATETIME NOT NULL DEFAULT (CURRENT_TIMESTAMP)
);

CREATE TABLE `Admin_Actions` (
  `ActionID` INT PRIMARY KEY AUTO_INCREMENT,
  `AdminID` INT NOT NULL,
  `ActionType` VARCHAR(100) NOT NULL,
  `ActionDetails` TEXT,
  `ActionTime` DATETIME NOT NULL DEFAULT (CURRENT_TIMESTAMP)
);

CREATE TABLE `Audit_Log` (
  `LogID` INT PRIMARY KEY AUTO_INCREMENT,
  `EntityType` VARCHAR(50) NOT NULL,
  `EntityID` INT NOT NULL,
  `ActionType` VARCHAR(50) NOT NULL,
  `PerformedByType` VARCHAR(50) NOT NULL,
  `PerformedByID` INT NOT NULL,
  `PerformedAt` DATETIME NOT NULL DEFAULT (CURRENT_TIMESTAMP),
  `BeforeData` TEXT,
  `AfterData` TEXT,
  `AdditionalInfo` TEXT
);

ALTER TABLE `Users` ADD FOREIGN KEY (`ProfileImageID`) REFERENCES `Images` (`ImageID`);

ALTER TABLE `Tours` ADD FOREIGN KEY (`ProviderID`) REFERENCES `Service_Providers` (`ProviderID`);

ALTER TABLE `Tours` ADD FOREIGN KEY (`CategoryID`) REFERENCES `Categories` (`CategoryID`);

ALTER TABLE `Tours` ADD FOREIGN KEY (`LocationID`) REFERENCES `Locations` (`LocationID`);

ALTER TABLE `Tours` ADD FOREIGN KEY (`MainImageID`) REFERENCES `Images` (`ImageID`);

ALTER TABLE `Bookings` ADD FOREIGN KEY (`UserID`) REFERENCES `Users` (`UserID`);

ALTER TABLE `Bookings` ADD FOREIGN KEY (`TourID`) REFERENCES `Tours` (`TourID`);

ALTER TABLE `Bookings` ADD FOREIGN KEY (`StatusID`) REFERENCES `BookingStatus` (`StatusID`);

ALTER TABLE `Bookings` ADD FOREIGN KEY (`PaymentID`) REFERENCES `Payments` (`PaymentID`);

ALTER TABLE `Payments` ADD FOREIGN KEY (`BookingID`) REFERENCES `Bookings` (`BookingID`);

ALTER TABLE `Payments` ADD FOREIGN KEY (`StatusID`) REFERENCES `PaymentStatus` (`StatusID`);

ALTER TABLE `Reviews` ADD FOREIGN KEY (`UserID`) REFERENCES `Users` (`UserID`);

ALTER TABLE `Reviews` ADD FOREIGN KEY (`TourID`) REFERENCES `Tours` (`TourID`);

ALTER TABLE `Reviews` ADD FOREIGN KEY (`StatusID`) REFERENCES `ReviewStatus` (`StatusID`);

ALTER TABLE `Images` ADD FOREIGN KEY (`TourID`) REFERENCES `Tours` (`TourID`);

ALTER TABLE `Images` ADD FOREIGN KEY (`ProviderID`) REFERENCES `Service_Providers` (`ProviderID`);

ALTER TABLE `Images` ADD FOREIGN KEY (`UserID`) REFERENCES `Users` (`UserID`);

ALTER TABLE `Images` ADD FOREIGN KEY (`StatusID`) REFERENCES `ImageStatus` (`StatusID`);

ALTER TABLE `Admin_Actions` ADD FOREIGN KEY (`AdminID`) REFERENCES `Admins` (`AdminID`);
