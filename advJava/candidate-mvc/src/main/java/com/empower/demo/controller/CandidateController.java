package com.empower.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
		return mv;
	}
}
