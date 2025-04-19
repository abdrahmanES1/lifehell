create table Event (
	eventId LONG not null primary key,
	title VARCHAR(75) null,
	description VARCHAR(75) null,
	eventDate DATE null,
	location VARCHAR(75) null,
	capacity INTEGER
);

create table Event_Event (
	eventId LONG not null primary key,
	title VARCHAR(75) null,
	description VARCHAR(75) null,
	eventDate DATE null,
	location VARCHAR(75) null,
	capacity INTEGER,
	availableSeats INTEGER
);

create table Event_Participant (
	participantId LONG not null primary key,
	eventId LONG,
	name VARCHAR(75) null,
	email VARCHAR(75) null
);

create table Event_Registration (
	registrationId LONG not null primary key,
	eventId LONG,
	userId LONG,
	createDate DATE null
);