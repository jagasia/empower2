package com.empower.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.empower.demo.Candidate;

@RestController
@RequestMapping("/client")
public class MyController {
	
	@GetMapping
	public Candidate home()
	{
		//i am going to access
		//http://localhost:5000/candidate
		RestTemplate rt=new RestTemplate();
		ResponseEntity<Candidate> c = rt.getForEntity("http://localhost:5000/candidate/1", Candidate.class);
		Candidate candidate=c.getBody();
		return candidate;
	}
}
