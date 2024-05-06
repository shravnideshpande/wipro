package com.capstonepro.flatservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.capstonepro.flatservice.entity.Flat;

public interface FlatRepository extends JpaRepository<Flat, Integer> {

	

}
