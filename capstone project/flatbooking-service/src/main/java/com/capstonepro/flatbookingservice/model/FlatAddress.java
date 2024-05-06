package com.capstonepro.flatbookingservice.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlatAddress {

	private int addressId;
	private int houseNum;
	private String lane;
	private String cityName;
	private String stateName;
	private int disPin;
	private String countryName;
		
}
