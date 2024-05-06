package com.capstonepro.tenantservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.capstonepro.tenantservice.model.Flat;



@FeignClient(name="FLAT-SERVICE")
public interface FlatServiceConsumer {
	
	@GetMapping("/flats/all")
	List<Flat> fetchAllFlats();

}
