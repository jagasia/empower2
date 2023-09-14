package com.empower.spring;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com")
public class MyConfiguration {
	
	@Bean
	public DataSource dataSource()
	{
    	DriverManagerDataSource ds=new DriverManagerDataSource();
    	ds.setDriverClassName("org.h2.Driver");
    	ds.setUrl("jdbc:h2:file:./data/sampledata");
    	ds.setUsername("sa");
    	ds.setPassword("");
    	return ds;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate()
	{
		DataSource ds = dataSource();
		JdbcTemplate jt=new JdbcTemplate();
		jt.setDataSource(ds);
		return jt;
	}
}
