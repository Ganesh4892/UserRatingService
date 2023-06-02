package com.lcwd.hotel.HotelService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.hotel.HotelService.Entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String>{

	/// if you want to implement any custom method or query
}
