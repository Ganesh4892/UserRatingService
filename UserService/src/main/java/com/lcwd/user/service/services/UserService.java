package com.lcwd.user.service.services;

import java.util.List;

import com.lcwd.user.service.UserService.entities.User;

public interface UserService {

	// user operation
	
	// create 
	User saveUser(User user);
	
	// get all user
	List<User> getAllUser();
	
	// get user by id
	
	User getUser(String userId);
	
	//Todo : delete and updte operation
	
}
