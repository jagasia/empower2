package com.empower.relationships.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.empower.relationships.model.Department;
import com.empower.relationships.model.DepartmentService;
import com.empower.relationships.model.Employee;
import com.empower.relationships.model.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeMvcController {
	@Autowired
	private EmployeeService es;
	@Autowired
	private DepartmentService ds;
	

	
	@GetMapping
	public ModelAndView showEmployeePage()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("employee");
		List<Department> departments = ds.read();
		mv.addObject("departments",departments);
		return mv;
	}
	
	
	@RequestMapping(value = "dml", method = RequestMethod.POST, params = "add")
	public ModelAndView add(Employee employee, @RequestParam("departmentId")Integer departmentId)
	{
		
		Department department = ds.read(departmentId);
		employee.setDepartment(department);
		es.create(employee);
		return showEmployeePage();
	}
	
	@RequestMapping(value = "dml", method = RequestMethod.POST, params = "update")
	public ModelAndView update(Employee employee)
	{
		es.update(employee);
		return showEmployeePage();
	}
	@RequestMapping(value = "dml", method = RequestMethod.POST, params = "delete")
	public ModelAndView delete(Employee employee)
	{
		es.delete(employee.getId());
		return showEmployeePage();
	}
	
}
