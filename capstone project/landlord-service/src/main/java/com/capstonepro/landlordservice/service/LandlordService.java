package com.capstonepro.landlordservice.service;

import java.util.List;

import com.capstonepro.landlordservice.entity.Landlord;

public interface LandlordService {
	
	Landlord addLandlord(Landlord landlord);
	
	Landlord updateLandlord(Landlord landlord);

	void deleteLandlord(int landlordId);

	Landlord getLandlordById(int landlordId);

	List<Landlord> viewAllLandlords();
	
}
