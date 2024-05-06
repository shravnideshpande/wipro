package com.capstonepro.flatservice.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "flat_table")
public class Flat {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="flat_num",length=5)
	private int flatId;
	
	@Column(name="flat_cost",length=10)
	@Positive(message="flatCost allows only positive value")
	private double flatCost;
	
	@OneToOne(cascade = CascadeType.ALL)
    private FlatAddress flatAddress;
	
	@Column(name="availability_status",length=20)
	@NotNull(message="Please provide valid argument")
    private String availabilityStatus;
	
	@Positive
	private int landlordId;
}