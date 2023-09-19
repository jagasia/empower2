package com.empower.ecom.model;

public interface CustomerDao {

	void createCustomerTable();

	void signup(Customer customer);

	Customer login(String username, String password);

}