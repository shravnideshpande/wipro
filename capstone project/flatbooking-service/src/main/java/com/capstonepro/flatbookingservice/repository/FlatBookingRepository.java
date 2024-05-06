package com.capstonepro.flatbookingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstonepro.flatbookingservice.entity.FlatBooking;


public interface FlatBookingRepository extends JpaRepository<FlatBooking,Integer>{

}
