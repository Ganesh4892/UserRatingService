package com.lcwd.user.service.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.user.service.UserService.entities.User;
import com.lcwd.user.service.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/wel")
	public String meshTech() {
		return "Welcome";
	}
	
	// create
	@PostMapping
	public ResponseEntity<User> saveUser(@RequestBody User user)
	{
		System.out.println("*************************welcome*****************");
		User user2 = userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user2);
		
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<User> getSingleUser(@PathVariable String userId)
	{
		User user = userService.getUser(userId);
				
		return ResponseEntity.ok(user);
		
	}
	
	
	//all user 
	@GetMapping
	public ResponseEntity<List<User>> getUsers()
	{
		List<User> users = userService.getAllUser();
				
		return ResponseEntity.ok(users);
		
	}
}
