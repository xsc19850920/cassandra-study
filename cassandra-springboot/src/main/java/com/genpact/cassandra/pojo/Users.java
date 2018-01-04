package com.genpact.cassandra.pojo;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table
public class Users {
	
	
	@PrimaryKey
	private long  Id;			
	private int Reputation	;	
	private String CreationDate	;
	private String DisplayName	;
	private String EmailHash	;	
	private String LastAccessDate;	
	private int Views			;
	private int UpVotes		;
	private int DownVotes	;
	
	@Override
	public String toString() {
		return "[user --> Id:"+Id+",Reputation:"+Reputation+",CreationDate:"+CreationDate+",DisplayName:"+DisplayName+",EmailHash:"+EmailHash+",LastAccessDate:"+LastAccessDate+",Views:"+Views+",UpVotes:"+UpVotes+",DownVotes:"+DownVotes+"]";
	}
	
	public Users() {
	}
	public Users(long id, int reputation, String creationDate,
			String displayName, String emailHash, String lastAccessDate,
			int views, int upVotes, int downVotes) {
		Id = id;
		Reputation = reputation;
		CreationDate = creationDate;
		DisplayName = displayName;
		EmailHash = emailHash;
		LastAccessDate = lastAccessDate;
		Views = views;
		UpVotes = upVotes;
		DownVotes = downVotes;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public int getReputation() {
		return Reputation;
	}
	public void setReputation(int reputation) {
		Reputation = reputation;
	}
	public String getCreationDate() {
		return CreationDate;
	}
	public void setCreationDate(String creationDate) {
		CreationDate = creationDate;
	}
	public String getDisplayName() {
		return DisplayName;
	}
	public void setDisplayName(String displayName) {
		DisplayName = displayName;
	}
	public String getEmailHash() {
		return EmailHash;
	}
	public void setEmailHash(String emailHash) {
		EmailHash = emailHash;
	}
	public String getLastAccessDate() {
		return LastAccessDate;
	}
	public void setLastAccessDate(String lastAccessDate) {
		LastAccessDate = lastAccessDate;
	}
	public int getViews() {
		return Views;
	}
	public void setViews(int views) {
		Views = views;
	}
	public int getUpVotes() {
		return UpVotes;
	}
	public void setUpVotes(int upVotes) {
		UpVotes = upVotes;
	}
	public int getDownVotes() {
		return DownVotes;
	}
	public void setDownVotes(int downVotes) {
		DownVotes = downVotes;
	}	

	
	
}
