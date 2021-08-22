package com.topnotch.mysqlDatabase.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="product_lines")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ProductLines {

	@Id
	@Column(name="product_line")
	private String product_line;
	
	@Column(name="text_description")
	private String text_description;
	
	@Lob
	@Column(name="html_description", columnDefinition="mediumtext")
	private String html_description;
	
	@Lob
	@Type(type="org.hibernate.type.BinaryType")
	@Column(name="image")
	private byte[] image;
	
	//RELATION
	@OneToMany(mappedBy= "product_line")
	@JsonIgnore
	private List<Products> products;
	
	
	
	
	
	
	
	public ProductLines() {
		
	}







	public String getProduct_line() {
		return product_line;
	}

	public void setProduct_line(String product_line) {
		this.product_line = product_line;
	}







	public String getText_description() {
		return text_description;
	}
	
	public void setText_description(String text_description) {
		this.text_description = text_description;
	}







	public String getHtml_description() {
		return html_description;
	}

	public void setHtml_description(String html_description) {
		this.html_description = html_description;
	}







	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}







	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}
}
