package com.topnotch.mysqlDatabase.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="offices")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Offices {

	@Id
	@Column(name="office_code")
	private String office_code;
	
	@Column(name="city")
	private String city;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="address_line1")
	private String address_line1;
	
	@Column(name="address_line2")
	private String address_line2;
	
	@Column(name="state")
	private String state;
	
	@Column(name="country")
	private String country;
	
	@Column(name="postal_code")
	private String postal_code;
	
	@Column(name="territory")
	private String territory;
	
	//RELATION
	@JsonIgnore
	@OneToMany(mappedBy= "office_code")
	private List<Employees> employees;


	
	
	
	public Offices() {
		
	}
	
	
	
	
	
	
	public String getOffice_code() {
		return office_code;
	}


	public void setOffice_code(String office_code) {
		this.office_code = office_code;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
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


	public String getTerritory() {
		return territory;
	}


	public void setTerritory(String territory) {
		this.territory = territory;
	}


	public List<Employees> getEmployees() {
		return employees;
	}


	public void setEmployees(List<Employees> employees) {
		this.employees = employees;
	}
}
