package com.capstonepro.flatbookingservice.service;

import java.util.List;

import com.capstonepro.flatbookingservice.entity.FlatBooking;


public interface FlatBookingService {

	FlatBooking saveFlatBooking(FlatBooking flatBooking);
    
	FlatBooking getBookingById(int bookingId);
    
	FlatBooking updateFlatBooking(FlatBooking flatBooking);
    List<FlatBooking> getAllBooking();
    
    void deleteFlatBooking(int bookingId);
    
	void acceptBooking(int bookingId);

    void denyBooking(int bookingId);
    
    String getBookingStatus(int bookingId);
	
}
