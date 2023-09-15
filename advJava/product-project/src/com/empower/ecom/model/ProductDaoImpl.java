package com.empower.ecom.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {
	private Connection getMyConnection() throws SQLException
	{
		new org.h2.Driver();
		return DriverManager.getConnection("jdbc:h2:file:./data/sampledata","sa","");
	}
	
	public void createTable() throws SQLException
	{
		Connection con = getMyConnection();
		try {
			con.createStatement().execute("CREATE TABLE PRODUCT(ID INT PRIMARY KEY, NAME VARCHAR2(20), PRICE NUMBER(8,2))");
			System.out.println("Table is created now");
		}catch(Exception ex)
		{
			System.out.println("Table already exists: Note the below message\n"+ex);
		}
		con.close();
	}
	
	@Override
	public void create(Product product) throws SQLException {
		Connection con = getMyConnection();
		PreparedStatement st = con.prepareStatement("INSERT INTO PRODUCT VALUES(?,?,?)");
		st.setInt(1, product.getId());
		st.setString(2, product.getName());
		st.setDouble(3, product.getPrice());
		int no=st.executeUpdate();
		System.out.println(no+" of rows inserted");
		con.close();
	}
	@Override
	public List<Product> read()throws SQLException {
		Connection con = getMyConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM PRODUCT");
		List<Product> products=new ArrayList<>();
		while(rs.next())
		{
			Product product=new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3));
			products.add(product);
		}		
		con.close();
		return products;
	}
	@Override
	public Product read(Integer id)throws SQLException {
		Connection con = getMyConnection();
		PreparedStatement st = con.prepareStatement("SELECT * FROM PRODUCT WHERE ID=?");
		st.setInt(1, id);
		ResultSet rs = st.executeQuery();
		Product product=null;
		if(rs.next())
		{
			product=new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3));
		}
		con.close();
		return product;
	}
	@Override
	public void update(Product product)throws SQLException {
		System.out.println("DaoImpl update started");
		Connection con = getMyConnection();
		PreparedStatement st = con.prepareStatement("UPDATE PRODUCT SET NAME=?, PRICE=? WHERE ID=?");
		st.setString(1, product.getName());
		st.setDouble(2, product.getPrice());
		st.setInt(3, product.getId());

		int no=st.executeUpdate();
		System.out.println(no+" of rows inserted");
		con.close();
	}
	@Override
	public void delete(Integer id)throws SQLException {
		Connection con = getMyConnection();
		PreparedStatement st = con.prepareStatement("DELETE FROM PRODUCT WHERE ID=?");
		st.setInt(1, id);
		int no=st.executeUpdate();
		System.out.println(no+" of rows inserted");
		con.close();
	}
	
}
