package com.empower.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.empower.demo.api.CandidateApi;
import com.empower.demo.model.Candidate;

@Controller
public class CandidateController {
	@Autowired
	private CandidateApi ca;
	
	@GetMapping
	public ModelAndView home()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("candidate");
		List<Candidate> candidates = ca.read();
		mv.addObject("candidates",candidates);
		mv.addObject("candidate", new Candidate());
		return mv;
	}
	
	@RequestMapping(value = "dml",method = RequestMethod.POST, params = "add")
	public ModelAndView addCandidate(Candidate candidate)
	{
		ca.create(candidate);
		return home();
	}
	
	@RequestMapping(value = "dml",method = RequestMethod.POST, params = "update")
	public ModelAndView updateCandidate(Candidate candidate)
	{
		ca.update(candidate);
		return home();
	}
	
	@RequestMapping(value = "dml",method = RequestMethod.POST, params = "delete")
	public ModelAndView deleteCandidate(Candidate candidate)
	{
		ca.delete(candidate.getId());
		return home();
	}
	
	@GetMapping("select/{id}")
	public ModelAndView select(@PathVariable("id") Integer id)
	{
		Candidate candidate = ca.read(id);
		ModelAndView mv=new ModelAndView();
		mv.addObject("candidate",candidate);
		mv.setViewName("candidate");
		List<Candidate> candidates = ca.read();
		mv.addObject("candidates",candidates);

		return mv;
	}
}
