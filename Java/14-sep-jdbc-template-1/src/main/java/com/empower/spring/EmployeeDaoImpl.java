package com.empower.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public void create(Employee employee) {
		int no=jt.update("INSERT INTO EMPLOYEE VALUES(?,?,?,?)",employee.getId(),employee.getFirstName(),employee.getLastName(),employee.getSalary());
		System.out.println(no+" row inserted");
	}
	@Override
	public List<Employee> read() {
		return jt.query("SELECT * FROM EMPLOYEE", new EmployeeRowMapper());
	}
	@Override
	public Employee read(Integer id) {
		return jt.queryForObject("SELECT * FROM EMPLOYEE WHERE ID=?", new EmployeeRowMapper(),id);
	}
	@Override
	public void update(Employee employee) {
		int no=jt.update("UPDATE EMPLOYEE SET FIRST_NAME=?, LAST_NAME=?, SALARY=? WHERE ID=?",employee.getFirstName(),employee.getLastName(),employee.getSalary(),employee.getId());
		System.out.println(no+" row updated");
	}
	@Override
	public void delete(Integer id) {
		int no=jt.update("DELETE FROM EMPLOYEE WHERE ID=?",id);
		System.out.println(no+" row deleted");
	}
	
}
