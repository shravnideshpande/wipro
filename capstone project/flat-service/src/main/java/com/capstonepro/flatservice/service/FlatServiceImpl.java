package com.capstonepro.flatservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstonepro.flatservice.entity.Flat;
import com.capstonepro.flatservice.exception.FlatModulesNotFoundException;
import com.capstonepro.flatservice.repository.FlatRepository;


@Service
public class FlatServiceImpl implements FlatService {
	
	@Autowired 
	private FlatRepository flatRepository;
    
       
	@Override
	public Flat saveFlat(Flat flats) {
	   flatRepository.save(flats);
		return flats;
	}

	@Override
	public Flat getFlatById(int flatId) {
		Optional<Flat> optionalFlat = flatRepository.findById(flatId);
		if(optionalFlat.isEmpty()) {
			throw new  FlatModulesNotFoundException("Flat not existing with id: "+flatId);
			
		}
		Flat flat = optionalFlat.get();
		return flat;
}

	@Override
	public List<Flat> fetchAllFlats() {
		List<Flat> flats = flatRepository.findAll();
		return flats;
	}

	

	@Override
	public void deleteFlatById(int flatId) {
		Optional<Flat> optionalFlat = flatRepository.findById(flatId);
		if(optionalFlat.isEmpty()) {
			throw new  FlatModulesNotFoundException("Flatnot existing with id: "+flatId);
			
		}
		Flat flats = optionalFlat.get();
		flatRepository.delete(flats);		
		
	}

	@Override
	public Flat updateFlat(Flat flat) {
		Optional<Flat> optionalFlat = flatRepository.findById(flat.getFlatId());
		if (optionalFlat.isEmpty()) {
			throw new FlatModulesNotFoundException("Tenant not existing with id: " + flat.getFlatId());

		}
		flatRepository.save(flat);
		return flat;
	}

	
}