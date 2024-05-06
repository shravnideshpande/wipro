package com.capstonepro.flatbookingservice.exception;


public class BookingModuleNotFoundException extends RuntimeException {
	
	public BookingModuleNotFoundException() {
		
	}
	
	public BookingModuleNotFoundException(String msg) {
		super(msg);
	}

}
