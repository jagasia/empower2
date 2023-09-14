package com.empower.spring;

import org.springframework.stereotype.Component;

@Component("add3")
public class Address {
	private String dno;
	private String street;
	private String city;
	private String pincode;
	public Address(String dno, String street, String city, String pincode) {
		super();
		this.dno = dno;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}
	
	public Address() {
		dno="5";
		street="Embassy tech village";
		city="Bengaluru";
	}

	public String getDno() {
		return dno;
	}

	public void setDno(String dno) {
		this.dno = dno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [dno=" + dno + ", street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
}
