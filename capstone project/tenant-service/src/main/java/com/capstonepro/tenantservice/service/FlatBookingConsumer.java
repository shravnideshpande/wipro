package com.capstonepro.tenantservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.capstonepro.tenantservice.model.FlatBooking;


@FeignClient(name = "FLATBOOKING-SERVICE")
public interface FlatBookingConsumer {
	
	@PostMapping("/fbooking/add")
	FlatBooking addflatBooking(@RequestBody FlatBooking flatBooking);
	
	@GetMapping("/fbooking/bookingstatus/{id}")
	String getBookingStatus(@PathVariable("id") int bookingId);

}
