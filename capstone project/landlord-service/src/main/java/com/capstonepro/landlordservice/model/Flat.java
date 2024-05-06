package com.capstonepro.landlordservice.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Flat {

	private int flatId;
	private float cost;
	private String availability;
	private FlatAddress flatAddress;
	private int landlordId;
}
