package com.empower.relationships.model;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository er;
	
	public Employee create(Employee employee) {
		return er.save(employee);
	}
	public List<Employee> read() {
		return er.findAll();
	}
	public Employee read(Integer id) {
		Optional<Employee> temp = er.findById(id);
		Employee e=null;
		if(temp.isPresent())
		{
			e=temp.get();
		}
		return e;
	}
	public Employee update(Employee employee) {
		Employee temp=read(employee.getId());
		if(temp!=null)
		{
			temp=employee;
			er.save(temp);
		}
		return temp;
	}
	public Employee delete(Integer id) {
		Employee temp=read(id);
		if(temp!=null)
		{
			er.save(temp);
		}
		return temp;
	}
	
	public List<Employee> findEmployeesByName(String name)
	{		
		return er.findByName(name);
	}
	
	public List<Employee> findEmployeesBySalaryRange(Double from, Double to)
	{
		return er.findEmployeesBySalaryRange(from, to);
	}
	
}
