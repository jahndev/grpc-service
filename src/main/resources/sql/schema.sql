CREATE SCHEMA IF NOT EXISTS gbusiness;

CREATE USER 'gbusiness'@'localhost' IDENTIFIED BY 'gbusiness';

GRANT ALL PRIVILEGES ON gbusiness.* TO 'gbusiness'@'localhost' WITH GRANT OPTION;

USE gbusiness;

CREATE TABLE IF NOT EXISTS `Product` (
  `id` int(11) NOT NULL,
  `description` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `ProductTopic` (
  `id` int(11) NOT NULL,
  `productId` int(11) NOT NULL,
  `description` varchar(500) NOT NULL,
  PRIMARY KEY (`id`,`productId`),
  KEY `fk_ProductTopic_1_idx` (`productId`),
  CONSTRAINT `fk_ProductTopic_1` FOREIGN KEY (`productId`) REFERENCES `Product` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `gbusiness`.`Product`(`id`,`description`) VALUES (1,'Product 1');
INSERT INTO `gbusiness`.`Product`(`id`,`description`) VALUES (2,'Product 2');
INSERT INTO `gbusiness`.`Product`(`id`,`description`) VALUES (3,'Product 3');
INSERT INTO `gbusiness`.`Product`(`id`,`description`) VALUES (4,'Product 4');
INSERT INTO `gbusiness`.`Product`(`id`,`description`) VALUES (5,'Product 5');

INSERT INTO `gbusiness`.`ProductTopic`(`id`,`productId`,`description`)VALUES(1,1,'Topic 1 for Product 1');
INSERT INTO `gbusiness`.`ProductTopic`(`id`,`productId`,`description`)VALUES(2,1,'Topic 2 for Product 1');
INSERT INTO `gbusiness`.`ProductTopic`(`id`,`productId`,`description`)VALUES(3,2,'Topic 1 for Product 2');
INSERT INTO `gbusiness`.`ProductTopic`(`id`,`productId`,`description`)VALUES(4,2,'Topic 2 for Product 2');

CREATE TABLE `Agent` (
  `id` int(11) NOT NULL,
  `firstName` varchar(45) NOT NULL,
  `lastName` varchar(45) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `agentProfileAssignId` int(11) NOT NULL,
  `locationId` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_Agent_1_idx` (`agentProfileAssignId`),
  KEY `fk_Agent_2_idx` (`locationId`),
  CONSTRAINT `fk_Agent_1` FOREIGN KEY (`agentProfileAssignId`) REFERENCES `AgentProfileAssign` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Agent_2` FOREIGN KEY (`locationId`) REFERENCES `Location` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `AgentSlot`;
CREATE TABLE `AgentSlot` (
  `id` int(11) NOT NULL,
  `agentId` int(11) NOT NULL,
  `slotFrom` datetime NOT NULL,
  `slotTo` datetime NOT NULL,
  `status` varchar(10) NOT NULL,
  PRIMARY KEY (`id`,`agentId`),
  KEY `fk_AgentSlot_1_idx` (`agentId`),
  CONSTRAINT `fk_AgentSlot_1` FOREIGN KEY (`agentId`) REFERENCES `Agent` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;