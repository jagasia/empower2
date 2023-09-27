package com.empower.ecom.util;

public class MyToken {
	private String token;
	
	public MyToken() {}

	public MyToken(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "MyToken [token=" + token + "]";
	}
	
	
	
}
