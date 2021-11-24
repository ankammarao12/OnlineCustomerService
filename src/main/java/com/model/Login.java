package com.model;

import java.io.Serializable;

public class Login implements Serializable {
	
	private static final long serialVersionUID = -9168833388053422036L;
	
	
	private int username;
	private String password;
	public int getUsername() {
		return username;
	}
	public void setUsername(int username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserType getType() {
		return type;
	}
	public void setType(UserType type) {
		this.type = type;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	private UserType type;
	private boolean isActive;
	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + ", isActive=" + isActive + "]";
	}
	
}
