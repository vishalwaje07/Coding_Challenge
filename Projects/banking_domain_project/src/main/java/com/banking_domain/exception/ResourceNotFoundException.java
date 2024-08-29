package com.banking_domain.exception;

public class ResourceNotFoundException extends Throwable{
	public ResourceNotFoundException(String message) {
		super(message);
	}

	public String getMessage() {
		// TODO Auto-generated method stub
		
		return "Resource not found";
	}
}