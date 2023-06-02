package com.lcwd.rating.service.RatingService.Impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.rating.service.RatingService.Repository.RatingRepository;
import com.lcwd.rating.service.RatingService.Service.RatingService;
import com.lcwd.rating.service.RatingService.entities.Rating;
@Service
public class RatingServiceImpl implements RatingService{
	
	@Autowired
	RatingRepository ratingRepository;

	@Override
	public Rating create(Rating rating) {
		// TODO Auto-generated method stub
		rating.setRatingId(UUID.randomUUID().toString());;
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getAllRating() {
		// TODO Auto-generated method stub
		return ratingRepository.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		// TODO Auto-generated method stub
		return ratingRepository.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		// TODO Auto-generated method stub
		return ratingRepository.findByHotelId(hotelId);
	}

}
