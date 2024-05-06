package com.capstonepro.tenantservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="tenantaddress_tbl")
public class TenantAddress {
    
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="address_id",length=5)
	@Positive(message="addressId allows only positive value")
    private int addressId;
	
	@Column(name="house_num",length=5)
	@Positive(message="houseNum allows only positive value")
    private int houseNum;
	
	@Column(length=30)
	@NotNull(message="Please provide valid argument")
    private String lane;
	
	@Column(name="city_name",length=30)
	@NotNull(message="Please provide valid argument")
    private String cityName;
	
	@Column(name="state_name",length=30)
	@NotNull(message="Please provide valid argument")
    private String stateName;
	
	@Column(name="pin",length=6)
	@Positive(message="districtPin allows only positive value")
    private int discPin;
	
	@Column(name="country_name",length=30)
	@NotNull(message="Please provide valid argument")
    private String countryName;	
}