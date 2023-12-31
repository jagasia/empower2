package com.empower.ecom.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductRowMapper implements RowMapper<Product>
{

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3));
	}

}
