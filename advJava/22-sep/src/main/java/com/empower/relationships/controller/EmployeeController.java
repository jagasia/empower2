package com.empower.relationships.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.empower.relationships.model.Employee;
import com.empower.relationships.model.EmployeeService;

@RestController
@RequestMapping("emp")
public class EmployeeController {
	@Autowired
	private EmployeeService es;
	
	@PostMapping
	public Employee create(@RequestBody Employee employee) {
		return es.create(employee);
	}
	@GetMapping
	public List<Employee> read() {
		return es.read();
	}
	@GetMapping("/{id}")
	public Employee read(@PathVariable("id") Integer id) {
		return es.read(id);
	}
	@GetMapping("/name/{name}")
	public List<Employee> findEmployeesByName(@PathVariable("name") String name)
	{
		return es.findEmployeesByName(name);
	}
	
	@GetMapping("/salary/{from}/{to}")
	public List<Employee> findEmployeesBySalaryRange(@PathVariable("from")Double from,@PathVariable("to") Double to)
	{
		return es.findEmployeesBySalaryRange(from, to);
	}
	
	@PutMapping
	public Employee update(@RequestBody Employee employee) {
		return es.update(employee);
	}
	@DeleteMapping("/{id}")
	public Employee delete(@PathVariable("id") Integer id) {
		return es.delete(id);
	}
	

	
}
