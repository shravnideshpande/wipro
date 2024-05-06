package com.capstonepro.landlordservice.entity;

import java.time.LocalDate;

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
@Table(name = "landlord_tbl")
public class Landlord {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "landlord_id", length = 5)
	private int landlordId;
	@Column(name = "landlord_firstname", length = 30)
    @NotNull(message="Please provide valid argument")
	private String landlordFirstName;
	@Column(name = "landlord_lastname", length = 30)
	@NotNull(message="Please provide valid argument")
	private String landlordLastName;
	@Column(length = 3)
	@Positive(message="age allows only positive value")
	private int age;
	@Column(name = "contact_num", length = 10)
	@Positive(message="contact allows only positive value")
	private String contactNum;

	private LocalDate dob;

}
