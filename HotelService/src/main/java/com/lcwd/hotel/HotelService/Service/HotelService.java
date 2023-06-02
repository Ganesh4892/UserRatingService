package com.lcwd.hotel.HotelService.Service;

import java.util.List;

import com.lcwd.hotel.HotelService.Entities.Hotel;

public interface HotelService {
	
	// create
	Hotel createHotel(Hotel hotel);
	
	// get all
	List<Hotel> getAllHotels();
	
	// get Single
	Hotel getHotel(String hotelId);
	

}
