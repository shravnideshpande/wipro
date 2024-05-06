package com.capstonepro.flatbookingservice.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tenant {

	private int tntId;
	private String tntFirstName;
	private String tntLastName;
	private int age;
	private TenantAddress tPermanentAddress;
	private String contactNum;
	private String idPrrofType;
	private String idPrrofNo;

}