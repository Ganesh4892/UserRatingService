package com.lcwd.rating.service.RatingService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import com.lcwd.rating.service.RatingService.Service.RatingService;
import com.lcwd.rating.service.RatingService.entities.Rating;

@Controller
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	RatingService ratingService;
	
	// create 
	@PostMapping
	public  ResponseEntity<Rating> saveRating(@RequestBody Rating rating){
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
		
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Rating>> getAllRating(){
		return ResponseEntity.ok(ratingService.getAllRating());
	}
	
	// get rating by userID
	@GetMapping("/users/{userId}")
	public ResponseEntity<List<Rating>> getRatingByUserID(@PathVariable String userId){
		return ResponseEntity.status(HttpStatus.OK).body(ratingService.getRatingByUserId(userId));
	}
	// get rating by Hotel
	@GetMapping("/hotels/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingByHotelID(@PathVariable String hotelId){
		return ResponseEntity.status(HttpStatus.OK).body(ratingService.getRatingByHotelId(hotelId));
	}
}
