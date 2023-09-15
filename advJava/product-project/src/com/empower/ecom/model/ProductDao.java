package com.empower.ecom.model;

import java.sql.SQLException;
import java.util.List;

public interface ProductDao {

	void create(Product product) throws SQLException;

	List<Product> read() throws SQLException;

	Product read(Integer id) throws SQLException;

	void update(Product product) throws SQLException;

	void delete(Integer id) throws SQLException;

}