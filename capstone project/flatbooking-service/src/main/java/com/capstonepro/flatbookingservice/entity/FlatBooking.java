package com.capstonepro.flatbookingservice.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "flatBooking_tbl")
public class FlatBooking {

	@Positive(message = "flatId allows only positive value")
	private int flatId;

	@Id
	@Column(name = "booking_id", length = 5)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int bookingId;

	@Column(name = "booking_date")
	@CreationTimestamp
	private LocalDate bookingDate;
	
	@Column(name = "booking_fromdate")
    @FutureOrPresent(message = "bookingFromDate must be in the present or future")
	private LocalDate bookingFromDate;
	
	@Column(name = "booking_todate")
    @FutureOrPresent(message = "bookingToDate must be in the present or future")
	private LocalDate bookingToDate;
	
	@Column(name = "down_payment")
	@Positive(message = "DownPayment allows only positive value")
	private double dowmPayment;

	@Column(name = "tenant_id")
	@Positive(message = "tntId allows only positive value")
	private int tntId;

	@Column(name = "booking_status")
	@NotNull(message = "Please provide valid argument")
	private String bookingStatus;

	@Column(name = "bookingcancle_date")
	@CreationTimestamp
	private LocalDate bookingCancleDate;

}
