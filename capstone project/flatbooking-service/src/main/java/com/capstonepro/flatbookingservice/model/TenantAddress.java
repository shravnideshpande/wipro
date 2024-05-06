package com.capstonepro.flatbookingservice.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TenantAddress {

	 private int addressId;
	 private int houseNum;
	 private String lane;
	 private String cityName;
	 private String stateName;
	 private int discPin;
	 private String countryName;	
		
}
