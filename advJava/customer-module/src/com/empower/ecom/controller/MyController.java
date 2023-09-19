package com.empower.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.empower.ecom.model.Customer;
import com.empower.ecom.model.CustomerDao;

@Controller
public class MyController {
	@Autowired
	private CustomerDao cdao;
	
	@GetMapping("/showLoginPage")
	public String showLoginPage()
	{
		return "login";
	}
	
	@GetMapping("/showSignupPage")
	public String showSignupPage()
	{
		return "signup";
	}
	
	@PostMapping("/add")
	@ResponseBody
	public String addCustomer(Customer customer)
	{
		cdao.signup(customer);
		return "Signup is successful. Click <a href=\"showLoginPage\">here</a> to login";
	}
	
	@PostMapping("/validateLogin")
	@ResponseBody
	public String validateLogin(String username, String password)
	{
		Customer customer = cdao.login(username, password);
		if(customer==null)
		{
			return "Login Failed. Click <a href=\"showLoginPage\">here</a> to login"; 
		}else
		{
			return "Welcome "+customer.getName();
		}
	}
	
}
