package com.teksystems.java_react.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teksystems.java_react.models.User;
import com.teksystems.java_react.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public User update(User user) {
		return userRepo.save(user);
	}
	
	public User findUserById(Long id) {
		User user = userRepo.findById(id).orElse(null);
		if(user == null) {
			return null;
		}
		return user;
    }
	public void delete(Long id) {
		userRepo.deleteById(id);
	}
	public Iterable<User> allUsers(){
		return userRepo.findAll();
	}

}
