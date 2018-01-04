CREATE KEYSPACE xsckeyspace WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 1 };


CREATE TABLE users (
  Id double PRIMARY KEY,			
  Reputation int,		
  CreationDate text,
  DisplayName text,
  EmailHash text,
  LastAccessDate text,
  Views int,
  UpVotes int,
  DownVotes	int	
);


insert into users( Id,				
  Reputation,		
  CreationDate	,
  DisplayName,	
  EmailHash	,	
  LastAccessDate,	
  Views	,		
  UpVotes	,	
  DownVotes	)
  values (
  47 ,
  180,
  '2010-07-28T19:18:40.863' ,
  'Stephen' ,
  '17816755bb7e644006e76cf58ee0abf6',
  '2010-08-08T16:39:01.533' ,
  2,
  14 ,
  2
  );
  
  
  
  
  
  
  

 Id				="47" 
 Reputation		="180"
 CreationDate	="2010-07-28T19:18:40.863" 
 DisplayName	="Stephen" 
 EmailHash		="17816755bb7e644006e76cf58ee0abf6" 
 LastAccessDate	="2010-08-08T16:39:01.533" 
 Views			="2" 
 UpVotes		="14" 
 DownVotes		="2" 
 
 
 
	