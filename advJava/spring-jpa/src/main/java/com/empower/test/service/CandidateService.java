package com.empower.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empower.test.entity.Candidate;
import com.empower.test.repository.CandidateRepository;

@Service
public class CandidateService {
	//write the code for adding, deleting, updating candidates
	//write the code to find candidate by id and retrieve all candidates
	@Autowired
	private CandidateRepository cr;
	
	public Candidate create(Candidate candidate) {
		return cr.save(candidate);
	}
	public List<Candidate> read() {
		return cr.findAll();
	}
	public Candidate read(Integer id) {
		Optional<Candidate> temp = cr.findById(id);
		Candidate c=null;
		if(temp.isPresent())
		{
			c=temp.get();
		}
		return c;
	}
	public Candidate update(Candidate candidate) {
		Candidate c = read(candidate.getId());
		if(c!=null)
		{
			c=candidate;
			cr.save(c);
		}
		return c;
	}
	public Candidate delete(Integer id) {
		Candidate c = read(id);
		if(c!=null)
		{
			cr.delete(c);
		}
		return c;
	}
	
}
