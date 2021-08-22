package com.topnotch.mysqlDatabase.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="customers")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Customers {

	@Id
	@Column(name="customer_number")
	private Integer customer_number;
	
	@Column(name="customer_name")
	private String customer_name;
	
	@Column(name="contact_last_name")
	private String contact_last_name;
	
	@Column(name="contact_first_name")
	private String contact_first_name;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="address_line1")
	private String address_line1;
	
	@Column(name="address_line2")
	private String address_line2;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="postal_code")
	private String postal_code;
	
	@Column(name="country")
	private String country;
	
	//FOREIGN KEY
	@ManyToOne
	@JoinColumn(name="sales_rep_employee_number", referencedColumnName="employee_number")
	private Employees sales_rep_employee_number;
	
	@Column(name="credit_limit")
	private Double credit_limit;
	
	//RELATION
	@OneToMany(mappedBy= "customer_number")
	@JsonIgnore
	private List<Orders> orders;
	
	//RELATION
	@OneToMany(mappedBy= "customer_number")
	@JsonIgnore
	private List<Payments> payments;

	
	
	
	
	
	public Customers() {
		
	}
	
	
	
	
	
	public Integer getCustomer_number() {
		return customer_number;
	}

	public void setCustomer_number(Integer customer_number) {
		this.customer_number = customer_number;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getContact_last_name() {
		return contact_last_name;
	}

	public void setContact_last_name(String contact_last_name) {
		this.contact_last_name = contact_last_name;
	}

	public String getContact_first_name() {
		return contact_first_name;
	}

	public void setContact_first_name(String contact_first_name) {
		this.contact_first_name = contact_first_name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress_line1() {
		return address_line1;
	}

	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}

	public String getAddress_line2() {
		return address_line2;
	}

	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Double getCredit_limit() {
		return credit_limit;
	}

	public void setCredit_limit(Double credit_limit) {
		this.credit_limit = credit_limit;
	}

	public Employees getSales_rep_employee_number() {
		return sales_rep_employee_number;
	}

	public void setSales_rep_employee_number(Employees sales_rep_employee_number) {
		this.sales_rep_employee_number = sales_rep_employee_number;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	public List<Payments> getPayments() {
		return payments;
	}

	public void setPayments(List<Payments> payments) {
		this.payments = payments;
	}
	
	
	
	
}
