package com.baps.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class AkptUser {
	@Id
	private String userName;
	private String password;
	
	
	//private int id;
	
	
/*	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}*/
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
