package com.upskillit.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.upskillit.library.entity.MyUser;
import com.upskillit.library.service.MyUserDetailsService;
import com.upskillit.library.util.AuthRequest;
import com.upskillit.library.util.JwtUtil;
import com.upskillit.library.util.MyToken;


@RestController
@CrossOrigin("*")
public class MyController {
	@Autowired
	private MyUserDetailsService us;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private AuthenticationManager am;
	
	@GetMapping("/dummy")
	public String home()
	{
		return "Hello world";
	}
	
	@PostMapping("/login")
	public MyToken validateLogin(@RequestBody AuthRequest ar)
	{
		System.out.println(ar.getUsername()+":"+ar.getPassword());
		MyToken myToken=new MyToken();
		try
		{
			am.authenticate(new UsernamePasswordAuthenticationToken(ar.getUsername(), ar.getPassword()));
			System.out.println("Line 41");
			String token = jwtUtil.generateToken(ar.getUsername());
			System.out.println("Line 43");
//			myToken.token=token;
			myToken.setToken(token);
		}catch(Exception ex)
		{
			System.out.println("Inside catch block");
//			myToken.token="Login failed";
			myToken.setToken("Login failed");
		}
		return myToken;
		
	}
	
	@PostMapping("/signup")
	public MyUser signup(@RequestBody MyUser user)
	{
		return us.create(user);
	}
	
	@PutMapping("/update")
	public MyUser update(@RequestBody MyUser user)
	{
		return us.update(user);
	}
	
	@GetMapping("/all")
	public List<MyUser> retrieveAllUsers()
	{
		return us.read();
	}
	
	@GetMapping("/user/{username}")
	public MyUser findUserByUsername(@PathVariable("username")String username)
	{
		return us.findByUsername(username);
	}
}
