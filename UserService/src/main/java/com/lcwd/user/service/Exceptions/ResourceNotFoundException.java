package com.lcwd.user.service.Exceptions;

public class ResourceNotFoundException extends RuntimeException{

	public ResourceNotFoundException() {
		// TODO Auto-generated constructor stub
		super("resource not found on server");
	}
	
	public ResourceNotFoundException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
	
	
}
