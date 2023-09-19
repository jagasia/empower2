package com.empower.ecom.model;

public class Customer {
	private String username;
	private String password;
	private String name;
	private String email;
	private String phone;
	
	public Customer() {}

	public Customer(String username, String password, String name, String email, String phone) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [username=" + username + ", password=" + password + ", name=" + name + ", email=" + email
				+ ", phone=" + phone + "]";
	}
	
	
}
