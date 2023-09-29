package com.empower.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empower.test.entity.Candidate;
import com.empower.test.service.CandidateService;

@RestController
@RequestMapping("/candidate")
public class CandidateController {
	//complete the GET, GET/id, POST, PUT, DELETE
	@Autowired
	private CandidateService cs;
	
	@PostMapping
	public Candidate create(@RequestBody Candidate candidate) {
		return cs.create(candidate);
	}
	
	@GetMapping
	public List<Candidate> read() {
		return cs.read();
	}
	
	@GetMapping("/{id}")
	public Candidate read(@PathVariable("id") Integer id) {
		return cs.read(id);
	}
	
	@PutMapping
	public Candidate update(@RequestBody Candidate candidate) {
		return cs.update(candidate);
	}
	
	@DeleteMapping("/{id}")
	public Candidate delete(@PathVariable("id") Integer id) {
		return cs.delete(id);
	}
	
}
