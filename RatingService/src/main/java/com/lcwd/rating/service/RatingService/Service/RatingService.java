package com.lcwd.rating.service.RatingService.Service;

import java.util.List;

import com.lcwd.rating.service.RatingService.entities.Rating;

public interface RatingService {
	
	// create
	Rating create(Rating rating);
	
	// get all
	List<Rating> getAllRating();
	
	// get Single bu userId
	List<Rating> getRatingByUserId(String userId);
	
	// get Single by HotelId
		List<Rating> getRatingByHotelId(String hotelId);
	

}
