package com.empower.spring;


import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfiguration.class);
    	EmployeeDao edao = ctx.getBean(EmployeeDaoImpl.class);
//    	edao.create(new Employee(1, "Raja", "Sivakumar", 232323.0));
//    	edao.create(new Employee(2, "Abdul", "Rahee,", 232323.0));
//    	edao.create(new Employee(3, "Joseph", "arockiaraj", 232323.0));
//    	edao.create(new Employee(4, "Dinesh", "Srinivasan", 232323.0));
//    	edao.create(new Employee(5, "Dinesh", "Varadharajan", 232323.0));
//    	
//    	edao.delete(1);
//    	List<Employee> employees = edao.read();
//    	for(Employee e : employees)
//    	{
//    		System.out.println(e);
//    	}
    	
    	System.out.println(edao.read(3));
    	
//    	DriverManagerDataSource ds=new DriverManagerDataSource();
//    	ds.setDriverClassName("org.h2.Driver");
//    	ds.setUrl("jdbc:h2:file:./data/sampledata");
//    	ds.setUsername("sa");
//    	ds.setPassword("");
//
//    	JdbcTemplate jt=new JdbcTemplate();
//    	jt.setDataSource(ds);
//
//    	try  
//    	{
//        	jt.execute("CREATE TABLE EMPLOYEE (ID INT PRIMARY KEY, FIRST_NAME VARCHAR2(20), LAST_NAME VARCHAR2(20), SALARY NUMBER(7))");
//    	}catch(Exception ex)
//    	{
//    		System.out.println("Table already exists.");
//    	}

    	
        System.out.println( "Hello World!" );
    }
}
