package com.capstonepro.flatservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstonepro.flatservice.entity.Flat;
import com.capstonepro.flatservice.service.FlatService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/flats")
public class FlatController {
	
	@Autowired
	private FlatService flatService;
	
	
	@PostMapping("/save")
	public ResponseEntity<Flat> addFlat(@Valid @RequestBody Flat flat) {
		flatService.saveFlat(flat);
		ResponseEntity<Flat> responseEntity = new ResponseEntity<>(flat,HttpStatus.CREATED);
		return responseEntity;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Flat> getflatDetails(@PathVariable("id") int flatId){
		Flat flat = flatService.getFlatById(flatId);
		return new ResponseEntity<>(flat,HttpStatus.OK);
	}	
	
	@GetMapping("/all")
	public List<Flat> fetchAllFlats(){
		List<Flat> flats = flatService.fetchAllFlats();
		return flats;
	}
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteFlat(@PathVariable("id")  int flatId){
		flatService.deleteFlatById(flatId);
		ResponseEntity<Void> responseEntity = new ResponseEntity<>(HttpStatus.OK);
		return responseEntity;
	}
	
	@PutMapping("/update")
	public ResponseEntity<Flat> updateTenant(@Valid @RequestBody Flat flat) {
		flatService.updateFlat(flat);
		ResponseEntity<Flat> responseEntity = new ResponseEntity<>(flat, HttpStatus.CREATED);
		return responseEntity;
	}

	
}
