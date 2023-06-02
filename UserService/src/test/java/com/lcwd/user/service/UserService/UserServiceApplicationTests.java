package com.lcwd.user.service.UserService;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lcwd.user.service.ExternalLib.HotelService;
import com.lcwd.user.service.UserService.entities.Hotel;

@SpringBootTest
class UserServiceApplicationTests {
	
	@Autowired
	HotelService hotelService;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void getHotelByIdTest() {
		String hotelId = "34df9d64-2a85-4472-a3e8-bd307ea75ac7";
		Hotel hotel = hotelService.getHotel(hotelId);
		assertTrue(hotel.getHotel_id().equals("34df9d64-2a85-4472-a3e8-bd307ea75ac7"));
		
	}

}
