package com.teksystems.java_react.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teksystems.java_react.models.User;
import com.teksystems.java_react.services.UserService;

@RestController
public class UserController {
	
	private final UserService userServ;
	
	public UserController(UserService userServ) {
		this.userServ = userServ;
	}
	
	@GetMapping("/")
	public Iterable<User> index() {
		 System.out.println(userServ.allUsers());
		 return userServ.allUsers();
	}
	
}
