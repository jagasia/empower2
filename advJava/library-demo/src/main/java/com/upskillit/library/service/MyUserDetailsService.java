package com.upskillit.library.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.upskillit.library.entity.MyUser;
import com.upskillit.library.repository.MyUserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService
{
	@Autowired
	
	private MyUserRepository ur;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		return new User("jag", "jag@123", new ArrayList<>());
		Optional<MyUser> temp = ur.findById(username);
		User user=null;
		if(temp.isPresent())
		{
			MyUser myUser = temp.get();
			user=new User(myUser.getUsername(), myUser.getPassword(), new ArrayList<>());
		}
		return user;
	}
	
	public MyUser create(MyUser user)
	{
		return ur.save(user);
	}
	
	public MyUser update(MyUser user)
	{
		Optional<MyUser> temp = ur.findById(user.getUsername());
		MyUser u=null;
		if(temp.isPresent())
		{
			u=user;
			ur.save(u);
		}
		return u;
	}
	
	public List<MyUser> read()
	{
		return ur.findAll();
	}
	
	public MyUser findByUsername(String username)
	{
		Optional<MyUser> temp = ur.findById(username);
		MyUser user=null;
		if(temp.isPresent())
		{
			user=temp.get();
		}
		return user;
	}

}
