package com.accenture.twittergradscreenplaycucumber.model;

public class LoginModel {
	private String username;
	private String password;
	
	
	public LoginModel(String username, String password) {
		this.username = username;
		this.password = password;
	}	
	public String getUser() {
		return username;
		
	}
	public String getPass() {
		return password;
	}
}
