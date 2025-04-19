create index IX_CD3BF58 on Event (eventDate);

create index IX_F0276D3D on Event_Event (eventDate);

create index IX_F9C9B83B on Event_Registration (eventId, userId);
create index IX_AA982AFE on Event_Registration (userId);