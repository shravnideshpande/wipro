package com.capstonepro.landlordservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstonepro.landlordservice.entity.Landlord;


public interface LandlordRepository extends JpaRepository<Landlord, Integer> {
    
}
