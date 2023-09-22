package com.empower.email.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.empower.email.EmailServiceImpl;

@Controller
public class MyController {
	@Autowired
	private EmailServiceImpl emailService;

	@GetMapping
	public String showFirstPage() {
		return "one";
	}

	@PostMapping("generate")
	public String generateOtp(@RequestParam("email") String email, HttpSession session)
	{
		//generate otp
		int noOfDigits=6;
		String otp="";
		for(int i=0;i<noOfDigits;i++)
		{	
			otp+=(int)(Math.random()*10);		
		}
		emailService.sendSimpleMessage(email, "Otp", otp+" is the OTP to signup to our website. Never share otp with anybody");
		session.setAttribute("otp",otp);
		System.out.println(otp+" is sent to "+email);
		//this otp should be sent to user by email

	return"two";

	}

	@PostMapping("validateOtp")
	@ResponseBody
	public String validateOtp(@RequestParam("otp") String otp,HttpSession session) {
		// validate otp
		String originalOtp=(String) session.getAttribute("otp");
		if(otp.equals(originalOtp))
			return "Otp is valid";
		else
			return "Entered otp is invalid";
	}
}
