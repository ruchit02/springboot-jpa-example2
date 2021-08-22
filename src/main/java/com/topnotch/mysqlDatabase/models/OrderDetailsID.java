package com.topnotch.mysqlDatabase.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;

public class OrderDetailsID implements Serializable{
	
	/*
	 * DO NOT SPECIFY
	 * 
	 * @Column(name="order_number") over here! WHY? If you'll specify it then
	 * hibernate will set (private Order order_number;) in the OrderDetails Class to
	 * Integer i.e. hibernate will provide value of type Integer to order_number
	 * instead of type Order
	 */
	
	private Integer order_number;
	private String product_code;
	
	
	
	
	
	public OrderDetailsID() {}
	
	public OrderDetailsID(Integer order_number, String product_code) {
		this.order_number = order_number;
		this.product_code = product_code;
	}

	
	
	
	
	
	
	
	public Integer getOrder_number() {
		return order_number;
	}

	public void setOrder_number(Integer order_number) {
		this.order_number = order_number;
	}

	public String getProduct_code() {
		return product_code;
	}

	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((order_number == null) ? 0 : order_number.hashCode());
		result = prime * result + ((product_code == null) ? 0 : product_code.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderDetailsID other = (OrderDetailsID) obj;
		if (order_number == null) {
			if (other.order_number != null)
				return false;
		} else if (!order_number.equals(other.order_number))
			return false;
		if (product_code == null) {
			if (other.product_code != null)
				return false;
		} else if (!product_code.equals(other.product_code))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "" + getOrder_number() + "_" + getProduct_code();
	}
}
