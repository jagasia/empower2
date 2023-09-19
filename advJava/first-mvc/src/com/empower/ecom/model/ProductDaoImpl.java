package com.empower.ecom.model;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class ProductDaoImpl {
	private JdbcTemplate jt;
	
	
	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	private void createTable()
	{
		try
		{
			jt.execute("CREATE TABLE PRODUCT (ID INT PRIMARY KEY, NAME VARCHAR2(20), PRICE NUMBER(7,2))");
			System.out.println("Table created now");
		}catch(Exception ex)
		{
			System.out.println("Table already exists");
		}
		
	}
	
	public void create(Product product) {
		String sql="INSERT INTO PRODUCT VALUES(?,?,?)";
		int no=jt.update(sql,product.getId(),product.getName(),product.getPrice());
		System.out.println(no+" row inserted");
	}
	
	public List<Product> read() {
		String sql="SELECT * FROM PRODUCT";
		return jt.query(sql, new ProductRowMapper());
	}
	
	public Product read(Integer id) {
		String sql="SELECT * FROM PRODUCT WHERE ID=?";
		return jt.queryForObject(sql, new ProductRowMapper(),id);
	}
	
	public void update(Product product) {
		String sql="UPDATE PRODUCT SET NAME=?, PRICE=? WHERE ID=?";
		int no=jt.update(sql,product.getName(),product.getPrice(),product.getId());
		System.out.println(no+" row updated");
	}

	public void delete(Integer id) {
		String sql="DELETE FROM PRODUCT WHERE ID=?";
		int no=jt.update(sql,id);
		System.out.println(no+" row deleted");
	}
}
