package com.topnotch.mysqlDatabase.models;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="payments")
@IdClass(PaymentsID.class)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Payments implements Serializable {
	
	@Id
	@ManyToOne
	@JoinColumn(name="customer_number", referencedColumnName="customer_number")
	private Customers customer_number;
	
	@Id
	@Column(name="check_number")
	private String check_number;
	
	@Column(name="payment_date")
	private Date payment_date;
	
	@Column(name="amount")
	private Double amount;

	
	
	
	
	
	
	
	public Payments() {
		
	}
	
	
	
	
	
	
	
	public Customers getCustomer_number() {
		return customer_number;
	}

	public void setCustomer_number(Customers customer_number) {
		this.customer_number = customer_number;
	}

	public String getCheck_number() {
		return check_number;
	}

	public void setCheck_number(String check_number) {
		this.check_number = check_number;
	}

	public Date getPayment_date() {
		return payment_date;
	}

	public void setPayment_date(Date payment_date) {
		this.payment_date = payment_date;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
