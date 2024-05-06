package com.capstonepro.flatbookingservice.model;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flat {

	private int flatId;
	private double flatCost;
	 private FlatAddress flatAddress;
		
	 private String availabilityStatus;
	 private int landlordId;
	 }


