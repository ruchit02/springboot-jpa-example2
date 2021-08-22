package com.topnotch.mysqlDatabase.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="orderdetails")
@IdClass(OrderDetailsID.class)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class OrderDetails implements Serializable{

	@Id
	@ManyToOne
	@JoinColumn(name="order_number", referencedColumnName="order_number")
	private Orders order_number;
	
	@Id
	@ManyToOne
	@JoinColumn(name="product_code", referencedColumnName="product_code")
	private Products product_code;
	
	@Column(name="quantity_ordered")
	private Integer quantity_ordered;
	
	@Column(name="price_each")
	private Double price_each;
	
	@Column(name="order_line_number")
	private Short order_line_number;

	
	
	
	
	
	
	public OrderDetails() {
		
	}
	
	
	
	
	
	
	
	public Orders getOrder_number() {
		return order_number;
	}

	public void setOrder_number(Orders order_number) {
		this.order_number = order_number;
	}

	public Products getProduct_code() {
		return product_code;
	}

	public void setProduct_code(Products product_code) {
		this.product_code = product_code;
	}

	public Integer getQuantity_ordered() {
		return quantity_ordered;
	}

	public void setQuantity_ordered(Integer quantity_ordered) {
		this.quantity_ordered = quantity_ordered;
	}

	public Double getPrice_each() {
		return price_each;
	}

	public void setPrice_each(Double price_each) {
		this.price_each = price_each;
	}

	public Short getOrder_line_number() {
		return order_line_number;
	}

	public void setOrder_line_number(Short order_line_number) {
		this.order_line_number = order_line_number;
	}
}
