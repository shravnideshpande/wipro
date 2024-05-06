package com.capstonepro.landlordservice.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlatAddress {
	
    private int addressId;
    private int houseNum;
    private String street;
    private String city;
    private String state;
    private int pin;
    private String country;

     
}
