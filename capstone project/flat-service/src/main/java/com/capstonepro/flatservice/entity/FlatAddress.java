package com.capstonepro.flatservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "flatAddress_table")
public class FlatAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "address_id", length = 5)
	private int addressId;
	@Column(name = "house_num", length = 5)
	private int houseNum;
	@Column( length = 30)
	private String lane;
	@Column(name = "city_name", length = 30)
	private String cityName;
	@Column(name = "state_name", length = 30)
	private String stateName;
	@Column(name = "pin", length = 6)
	private int disPin;
	@Column(name = "country_name", length = 30)

	private String countryName;
}