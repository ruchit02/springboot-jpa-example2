package com.topnotch.mysqlDatabase.models;

import java.sql.Date;
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
@Table(name="orders")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Orders {

	@Id
	@Column(name="order_number")
	private Integer order_number;
	
	@Column(name="order_date")
	private Date order_date;
	
	@Column(name="required_date")
	private Date required_date;
	
	@Column(name="shipped_date")
	private Date shipped_date;
	
	@Column(name="status")
	private String status;
	
	@Column(name="comments", columnDefinition="text")
	private String comments;
	
	//FOREIGN KEY
	@ManyToOne
	@JoinColumn(name="customer_number", referencedColumnName="customer_number")
	private Customers customer_number;
	
	//RELATION
	@OneToMany(mappedBy= "order_number")
	@JsonIgnore
	private List<OrderDetails> details;

	
	
	
	
	
	
	
	
	
	public Orders() {
		
	}
	
	
	
	
	
	
	
	
	public Integer getOrder_number() {
		return order_number;
	}

	public void setOrder_number(Integer order_number) {
		this.order_number = order_number;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	public Date getRequired_date() {
		return required_date;
	}

	public void setRequired_date(Date required_date) {
		this.required_date = required_date;
	}

	public Date getShipped_date() {
		return shipped_date;
	}

	public void setShipped_date(Date shipped_date) {
		this.shipped_date = shipped_date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Customers getCustomer_number() {
		return customer_number;
	}

	public void setCustomer_number(Customers customer_number) {
		this.customer_number = customer_number;
	}

	public List<OrderDetails> getDetails() {
		return details;
	}

	public void setDetails(List<OrderDetails> details) {
		this.details = details;
	}
}
