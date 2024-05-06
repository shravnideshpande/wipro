package com.capstonepro.flatservice.service;

import java.util.List;

import com.capstonepro.flatservice.entity.Flat;

public interface FlatService {

	Flat saveFlat(Flat flats);
	
	Flat updateFlat(Flat flat);

	Flat getFlatById(int flatId);

	List<Flat> fetchAllFlats();

	void deleteFlatById(int flatId);
}