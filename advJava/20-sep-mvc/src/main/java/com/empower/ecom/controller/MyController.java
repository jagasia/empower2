package com.empower.ecom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	@GetMapping
	public String home()
	{
		return "index";
	}
	
	@GetMapping("/showLogin")
	public String showLoginPage()
	{
		return "login";
	}
	
	@GetMapping("/showSignup")
	public String showSignupPage()
	{
		return "signup";
	}
}
