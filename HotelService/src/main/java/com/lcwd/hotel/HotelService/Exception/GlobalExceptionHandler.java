package com.lcwd.hotel.HotelService.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.lcwd.hotel.HotelService.payload.ApiResponse;



@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> HandlerResourceNotFound(ResourceNotFoundException ex)
	{
		String msg= ex.getMessage();
		boolean success = false;
		ApiResponse apiResponse = new ApiResponse(msg, success, HttpStatus.NOT_FOUND) ;
				
		return new ResponseEntity<ApiResponse>(apiResponse , HttpStatus.NOT_FOUND);
		
	}
}
