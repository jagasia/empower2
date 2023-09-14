package com.empower.spring;

import java.util.List;

public interface EmployeeDao {

	void create(Employee employee);

	List<Employee> read();

	Employee read(Integer id);

	void update(Employee employee);

	void delete(Integer id);

}