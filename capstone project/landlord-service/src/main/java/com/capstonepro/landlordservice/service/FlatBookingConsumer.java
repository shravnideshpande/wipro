package com.capstonepro.landlordservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.capstonepro.landlordservice.model.FlatBooking;


@FeignClient(name = "FLATBOOKING-SERVICE")
public interface FlatBookingConsumer {
    
    @PostMapping("/fbooking/acceptbooking/{id}")
    FlatBooking acceptBooking(@PathVariable("id") int bookingId);
    
    @PostMapping("/fbooking/denybooking/{id}")
    FlatBooking denyBooking(@PathVariable("id") int bookingId);
    
}
