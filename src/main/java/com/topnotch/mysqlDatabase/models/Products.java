package com.topnotch.mysqlDatabase.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="products")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Products {
	
	@Id
	@Column(name="product_code")
	private String product_code;
	
	@Column(name="product_name")
	private String product_name;
	
	//FOREIGN KEY
	@ManyToOne
	@JoinColumn(name="product_line", referencedColumnName="product_line")
	private ProductLines product_line;
	
	@Column(name="product_scale")
	private String product_scale;
	
	@Column(name="product_vendor")
	private String product_vendor;
	
	@Lob
	@Column(name="product_description", columnDefinition="text")
	private String product_description;
	
	@Column(name="quantity_in_stock")
	private Short quantity_in_stock;
	
	@Column(name="buy_price")
	private Double buy_price;
	
	@Column(name="msrp")
	private Double msrp;
	
	//RELATION
	@OneToMany(mappedBy= "product_code")
	@JsonIgnore
	private List<OrderDetails> details;
	
	
	
	
	public Products() {
		
	}




	public String getProduct_code() {
		return product_code;
	}




	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}




	public String getProduct_name() {
		return product_name;
	}




	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}




	public String getProduct_vendor() {
		return product_vendor;
	}




	public void setProduct_vendor(String product_vendor) {
		this.product_vendor = product_vendor;
	}




	public String getProduct_scale() {
		return product_scale;
	}




	public void setProduct_scale(String product_scale) {
		this.product_scale = product_scale;
	}




	public String getProduct_description() {
		return product_description;
	}




	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}




	public Short getQuantity_in_stock() {
		return quantity_in_stock;
	}




	public void setQuantity_in_stock(Short quantity_in_stock) {
		this.quantity_in_stock = quantity_in_stock;
	}




	public Double getBuy_price() {
		return buy_price;
	}




	public void setBuy_price(Double buy_price) {
		this.buy_price = buy_price;
	}




	public Double getMsrp() {
		return msrp;
	}




	public void setMsrp(Double msrp) {
		this.msrp = msrp;
	}




	public ProductLines getProduct_line() {
		return product_line;
	}




	public void setProduct_line(ProductLines product_line) {
		this.product_line = product_line;
	}




	public List<OrderDetails> getDetails() {
		return details;
	}




	public void setDetails(List<OrderDetails> details) {
		this.details = details;
	}
	
	
}
