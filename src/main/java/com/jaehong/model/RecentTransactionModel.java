package com.jaehong.model;

public class RecentTransactionModel {
	
	 private String transaction_date; 
     private String type; 
     private String units_traded;     
     private String price;     
     private String total;
	public String getTransaction_date() {
		return transaction_date;
	}
	public void setTransaction_date(String transaction_date) {
		this.transaction_date = transaction_date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUnits_traded() {
		return units_traded;
	}
	public void setUnits_traded(String units_traded) {
		this.units_traded = units_traded;
	}
	public String getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "RecentTransactionModel [transaction_date=" + transaction_date + ", type=" + type + ", units_traded="
				+ units_traded + ", price=" + price + ", total=" + total + ", getTransaction_date()="
				+ getTransaction_date() + ", getType()=" + getType() + ", getUnits_traded()=" + getUnits_traded()
				+ ", getPrice()=" + getPrice() + ", getTotal()=" + getTotal() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
     
     
     
}
