create index IX_CD3BF58 on Event (eventDate);

create index IX_F0276D3D on Event_Event (eventDate);

create index IX_ED552A0B on Event_Registration (eventId, username[$COLUMN_LENGTH:75$]);
create index IX_A451F80E on Event_Registration (username[$COLUMN_LENGTH:75$]);