package com.tp.lms.model;

import java.util.Date;

import com.tp.lms.model.enums.RequirementStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * 
 * 
 @author DURGESH */

@Entity
@Table(name = "requirement")
public class Requirement {
	
	
	@Id
	@Column(name="requirement_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(name = "book_master_id")
	private int bookMasterId;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="price")
	private float price;
	
	@Column(name="expected_fulfilment_date")
	private Date expectedFulfilmentDate;
	
	@Enumerated(EnumType.STRING)
	@Column(name="requirement_status",nullable = false)
	private RequirementStatus requirementStatus;
	
	private char requirementReason;

	public int getRequirementId() {
		return id;
	}

	public int getBookMasterId() {
		return bookMasterId;
	}

	public int getQuantity() {
		return quantity;
	}

	public float getPrice() {
		return price;
	}

	public Date getExpectedFulfilmentDate() {
		return expectedFulfilmentDate;
	}

	public RequirementStatus getRequirementStatus() {
		return requirementStatus;
	}

	public char getRequirementReason() {
		return requirementReason;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBookMasterId(int bookMasterId) {
		this.bookMasterId = bookMasterId;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setExpectedFulfilmentDate(Date expectedFulfilmentDate) {
		this.expectedFulfilmentDate = expectedFulfilmentDate;
	}

	public void setRequirementStatus(RequirementStatus requirementStatus) {
		this.requirementStatus = requirementStatus;
	}

	public void setRequirementReason(char requirementReason) {
		this.requirementReason = requirementReason;
	}

}
