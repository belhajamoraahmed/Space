package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.User;
import com.example.demo.service.UserService;


@RestController
@RequestMapping("/api/user")
public class UserControler {

	
	@Autowired
	UserService userService;
	
	
	@PostMapping("/authenticate")
	public ResponseEntity<Object> authenticate(@RequestBody  User user) throws Exception {
		User user1 = userService.getUser(user.getEmail());
		
		if (user1 != null) return new ResponseEntity<>(user1,HttpStatus.OK);
		else return new ResponseEntity<>("mot de passe ou Email incorrect",HttpStatus.CONFLICT);
	
}
}
