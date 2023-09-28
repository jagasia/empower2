package com.empower.demo.api;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.empower.demo.model.Candidate;

@FeignClient(name = "customer-api",url = "http://localhost:5000/candidate")
public interface CandidateApi {
	@PostMapping
	public Candidate create(@RequestBody Candidate candidate);
	
	@GetMapping
	public List<Candidate> read();
	
	@GetMapping("/{id}")
	public Candidate read(@PathVariable("id") Integer id);
	
	@PutMapping
	public Candidate update(@RequestBody Candidate candidate);
	
	@DeleteMapping("/{id}")
	public Candidate delete(@PathVariable("id") Integer id);
}
