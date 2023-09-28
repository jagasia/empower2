package com.empower.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@GetMapping
	public String home()
	{
		return "Hi welcome to my webservice";
	}
	
	@GetMapping("/employee")
	public Employee getEmployee()
	{
		return new Employee(5435, "Ram", "Kumar", 1234567.0);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
