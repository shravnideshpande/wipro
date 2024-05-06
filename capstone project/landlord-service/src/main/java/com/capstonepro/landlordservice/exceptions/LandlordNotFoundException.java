package com.capstonepro.landlordservice.exceptions;

@SuppressWarnings("serial")
public class LandlordNotFoundException extends RuntimeException {
	
	public LandlordNotFoundException() {
		
	}
	
	public LandlordNotFoundException(String msg) {
		super(msg);
	}

}
