package com.topnotch.mysqlDatabase.models;

import java.io.Serializable;

public class PaymentsID implements Serializable{
	
	private Integer customer_number;
	private String check_number;
	
	
	
	
	
	
	
	public PaymentsID() {}

	public PaymentsID(Integer customer_number, String check_number) {
		this.customer_number = customer_number;
		this.check_number    = check_number;
	}
	
	
	
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((check_number == null) ? 0 : check_number.hashCode());
		result = prime * result + ((customer_number == null) ? 0 : customer_number.hashCode());
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
		PaymentsID other = (PaymentsID) obj;
		if (check_number == null) {
			if (other.check_number != null)
				return false;
		} else if (!check_number.equals(other.check_number))
			return false;
		if (customer_number == null) {
			if (other.customer_number != null)
				return false;
		} else if (!customer_number.equals(other.customer_number))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "" + getCustomer_number() + "_" + getCheck_number();
	}
	
	
	
	
	
	
	public Integer getCustomer_number() {
		return customer_number;
	}

	public void setCustomer_number(Integer customer_number) {
		this.customer_number = customer_number;
	}

	public String getCheck_number() {
		return check_number;
	}

	public void setCheck_number(String check_number) {
		this.check_number = check_number;
	}
}
