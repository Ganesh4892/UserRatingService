package com.lcwd.rating.service.RatingService.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.lcwd.rating.service.RatingService.entities.Rating;

public interface RatingRepository extends JpaRepository<Rating, String>{

	/// if you want to implement any custom method or query
	// customer finder method
	List<Rating> findByUserId(String userId);
	List<Rating> findByHotelId(String hotelId);
}
