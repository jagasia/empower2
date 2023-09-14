package com.empower.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.empower.spring")
public class MyConfiguration {

	@Bean
	public Address add1()
	{
		return new Address("A123", "Bhoganahalli road", "Bengaluru", "560108");
	}
	
	@Bean
	public Address add2()
	{
		return new Address("B2", "Outer ring road", "Mysuru", "570109");
	}
	
	
}
