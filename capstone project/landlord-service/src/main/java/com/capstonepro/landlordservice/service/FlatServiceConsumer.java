package com.capstonepro.landlordservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.capstonepro.landlordservice.model.Flat;


@FeignClient(name = "FLAT-SERVICE")
public interface FlatServiceConsumer {

	 @PostMapping("/flats/save")
	  Flat addFlat(@RequestBody Flat flat);
	    
}
