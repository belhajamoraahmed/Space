package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.User;
import com.example.demo.repo.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo ;
	
	
	public User getUser(String email) {
		User user1 = userRepo.findUserByEmail(email);
		if (user1 != null) return user1;
		else return null ;
	}
	
}
