package com.genpact.cassandra.pojo;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table
public class Users {
	@PrimaryKey
	private int user_id;
	private String fname;
	private String lname;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Users(int user_id, String fname, String lname) {
		this.user_id = user_id;
		this.fname = fname;
		this.lname = lname;
	}
	public Users() {
	}
	
	@Override
	public String toString() {
		return "[User --> user_id:"+user_id+",fname:"+fname+",lname:"+lname+"]";
	}
	
}
