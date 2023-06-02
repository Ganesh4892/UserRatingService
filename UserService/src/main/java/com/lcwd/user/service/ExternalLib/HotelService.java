package com.lcwd.user.service.ExternalLib;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.lcwd.user.service.UserService.entities.Hotel;

@Service
@FeignClient(name = "HOTELSERVICE")
public interface HotelService {
	
	@GetMapping("hotels/{hotelId}")
	public Hotel getHotel(@PathVariable String hotelId);

}
