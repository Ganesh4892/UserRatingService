package com.lcwd.user.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.lcwd.user.service.Exceptions.ResourceNotFoundException;
import com.lcwd.user.service.UserService.entities.Hotel;
import com.lcwd.user.service.UserService.entities.Rating;
import com.lcwd.user.service.UserService.entities.User;
import com.lcwd.user.service.repository.UserRepository;
import com.lcwd.user.service.services.UserService;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	private Logger logger= LoggerFactory.getLogger(UserServiceImpl.class);

	public User saveUser(User user) {
		// TODO Auto-generated method stub
		user.setUserId(UUID.randomUUID().toString());
		return userRepository.save(user);
	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	public User getUser(String userId) {
		// return userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("given user id not found"+userId));
		
	User  user	= userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("given user id not found"+userId));
	
	Rating[] forObject = restTemplate.getForObject("http://localhost:8083/ratings/users/"+user.getUserId(),Rating[].class);
	List<Rating> ratingList = Arrays.asList(forObject).stream().map(rating -> {
		ResponseEntity<Hotel> hotelEntity =  restTemplate.getForEntity("http://localhost:8081/hotels/"+rating.getHotelId(), Hotel.class);
		rating.setHotel(hotelEntity.getBody());
		return rating;
	}).collect(Collectors.toList());
	
	user.setRatingsList(ratingList);
	///logger.info("",forObject);
	
	return user;
	}
	

}
