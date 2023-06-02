package com.lcwd.hotel.HotelService.Impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.hotel.HotelService.Entities.Hotel;
import com.lcwd.hotel.HotelService.Exception.ResourceNotFoundException;
import com.lcwd.hotel.HotelService.Repository.HotelRepository;
import com.lcwd.hotel.HotelService.Service.HotelService;
@Service
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	HotelRepository hotelRepository;
	

	public Hotel createHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		hotel.setHotel_id(UUID.randomUUID().toString());
		return hotelRepository.save(hotel);
	}

	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return hotelRepository.findAll();
	}

	public Hotel getHotel(String hotelId) {
		// TODO Auto-generated method stub
		return hotelRepository.findById(hotelId).orElseThrow(()-> new ResourceNotFoundException("given hotel id is not found"+hotelId));
	}

}
