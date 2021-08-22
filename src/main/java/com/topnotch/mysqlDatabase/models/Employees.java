package com.topnotch.mysqlDatabase.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="employees")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Employees {

	@Id
	@Column(name="employee_number")
	private Integer employee_number;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="extension")
	private String extension;
	
	@Column(name="email")
	private String email;
	
	//FOREIGN KEY
	@ManyToOne
	@JoinColumn(name="office_code", referencedColumnName="office_code")
	private Offices office_code;
	
	//FOREIGN KEY
	@ManyToOne
	@JoinColumn(name="reports_to", referencedColumnName="employee_number")
	private Employees reports_to;
	
	@Column(name="job_title")
	private String job_title;
	
	//RELATION
	@JsonIgnore
	@OneToMany(mappedBy="sales_rep_employee_number")
	private List<Customers> customers;
	
	//RELATION
	@JsonIgnore
	@OneToMany(mappedBy= "reports_to")
	private List<Employees> supervisee ;

	
	
	
	
	
	
	
	public Employees() {
		
	}
	
	
	
	
	
	public Integer getEmployee_number() {
		return employee_number;
	}

	public void setEmployee_number(Integer employee_number) {
		this.employee_number = employee_number;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public Offices getOffice_code() {
		return office_code;
	}

	public void setOffice_code(Offices office_code) {
		this.office_code = office_code;
	}

	public Employees getReports_to() {
		return reports_to;
	}

	public void setReports_to(Employees reports_to) {
		this.reports_to = reports_to;
	}

	public List<Customers> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customers> customers) {
		this.customers = customers;
	}

	public List<Employees> getSupervisee() {
		return supervisee;
	}

	public void setSupervisee(List<Employees> supervisee) {
		this.supervisee = supervisee;
	}
}
