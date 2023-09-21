package com.empower.ecom.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping
	public String home()
	{
		return "Welcome to my first rest api";
	}
	
	@PostMapping
	public String add()
	{
		return "Added";
	}
	
	@PutMapping
	public String update()
	{
		return "Update";
	}
	
	@DeleteMapping
	public String delete()
	{
		return "Deleted";
	}
}
