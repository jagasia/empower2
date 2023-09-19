package com.empower.ecom.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public void createCustomerTable()
	{
		try
		{
			jt.execute("create table customer (username varchar2(20) primary key, password varchar2(20), name varchar2(20), email varchar2(20), phone varchar2(20))");
			System.out.println("Table is created now");
		}catch(Exception ex)
		{
			System.out.println("Table already exists. Original exception is "+ex);
		}
		
	}
	
	@Override
	public void signup(Customer customer)
	{
		try {
			int no=jt.update("INSERT INTO CUSTOMER VALUES(?,?,?,?,?)", customer.getUsername(), customer.getPassword(), customer.getName(), customer.getEmail(), customer.getPassword());
			System.out.println(no+" row inserted");
		}catch(BadSqlGrammarException ex)
		{
			System.out.println("Table does not exist. Creating now.");
			createCustomerTable();
			System.out.println("Re-trying insert now");
			signup(customer);
		}
	}
	
	@Override
	public Customer login(String username, String password)
	{
		String sql="SELECT * FROM CUSTOMER WHERE username=?";
		Customer customer = jt.queryForObject(sql, new CustomerRowMapper(), username);
		if(customer!=null)
		{
			if(customer.getPassword().equals(password))
			{
				return customer;
			}
		}
		return null;
	}
}
