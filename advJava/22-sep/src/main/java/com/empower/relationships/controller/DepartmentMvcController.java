package com.empower.relationships.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.empower.relationships.model.Department;
import com.empower.relationships.model.DepartmentService;
import com.empower.relationships.model.Employee;

@Controller
@RequestMapping("department")
public class DepartmentMvcController {
	@Autowired
	private DepartmentService ds;
	
	@GetMapping
	public ModelAndView showDepartmentPage() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("department");
		List<Department> departments = ds.read();
		mv.addObject("departments", departments);
		return mv;
	}
	
	@RequestMapping(value = "dml", method = RequestMethod.POST, params = "add")
	public ModelAndView add(Department department)
	{
		ds.create(department);
		return showDepartmentPage();
	}
	
	@RequestMapping(value = "dml", method = RequestMethod.POST, params = "update")
	public ModelAndView update(Department department)
	{
		ds.update(department);
		return showDepartmentPage();
	}
	@RequestMapping(value = "dml", method = RequestMethod.POST, params = "delete")
	public ModelAndView delete(Department department)
	{
		ds.delete(department.getId());
		return showDepartmentPage();
	}
	
	@GetMapping("/select/{id}")
	public ModelAndView select(@PathVariable("id") Integer id)
	{
		Department department = ds.read(id);
		List<Employee> employees = department.getEmployees();
		ModelAndView mv=new ModelAndView();
		mv.addObject("department",department);
		mv.addObject("employees",employees);
		mv.setViewName("viewEmployees");
		return mv;
	}
}
