DROP TABLE MAGAZINE;
DROP TABLE NEWSPAPER;
DROP TABLE VIDEOGAME;
DROP TABLE DVD;
DROP TABLE CD;
DROP TABLE COPY;
DROP TABLE GENERALITEM;
DROP TABLE MEDIUM;
DROP TABLE STATUS;

CREATE TABLE Medium (
    mediumID int GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
    mediumDescription varchar(30),
    PRIMARY KEY (mediumID)
);
CREATE TABLE GeneralItem (
	itemID int GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	mediumID int,
	title varchar(30),
	copyId int,
	PRIMARY KEY (itemID)
);

CREATE TABLE STATUS (
	statusID int GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	statusDesc varchar(30),
	PRIMARY KEY (statusID)
);
CREATE TABLE Copy (
	copyID int GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	itemID int,
	numCopies int,
	statusId int,
	PRIMARY KEY (copyId)	
);

CREATE TABLE CD (
	cdId int,
	numTracks int,
	artist varchar(30),
	musicType varchar(30),
	totalDuration int,
	itemID int,
	PRIMARY KEY(cdID),
	FOREIGN KEY (itemID) REFERENCES GeneralItem(itemID)
);

CREATE TABLE DVD (
	dvdId int,
	director varchar(30),
	videoType varchar(30),
	numChapters int,
	duration int,
	itemID int,
	PRIMARY KEY(dvdId),
	FOREIGN KEY (itemID) REFERENCES GeneralItem(itemID)
);

CREATE TABLE VideoGame(
	videoGameId int,
	company varchar(30),
	gameType varchar(30),
	multiplayerFlag varchar(30),
	consoleType varchar(30),
	itemID int,
	PRIMARY KEY(videoGameId),
	FOREIGN KEY (itemID) REFERENCES GeneralItem(itemID)
);

CREATE TABLE Newspaper(
	newspaperId int,
	newsDate date,
	relPeriod varchar(30),
	newsType varchar(30),
	itemID int,
	PRIMARY KEY(newspaperId),
	FOREIGN KEY (itemID) REFERENCES GeneralItem(itemID)
);

CREATE TABLE Magazine (
	magazineId int,
	data varchar(30),
	magazineType varchar(30),
	relPeriod varchar(30),
	itemID int,
	PRIMARY KEY(magazineId),
	FOREIGN KEY (itemID) REFERENCES GeneralItem(itemID)
);


