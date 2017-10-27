package com.jaehong.model;

public class TickerModel {
	
	 private String opening_price; 
     private String closing_price; 
     private String min_price;     
     private String max_price;     
     private String average_price; 
     private String units_traded;  
     private String volume_1day;   
     private String volume_7day;   
     private String buy_price;     
     private String sell_price;    
     private String date;
	public String getOpening_price() {
		return opening_price;
	}
	public void setOpening_price(String opening_price) {
		this.opening_price = opening_price;
	}
	public String getClosing_price() {
		return closing_price;
	}
	public void setClosing_price(String closing_price) {
		this.closing_price = closing_price;
	}
	public String getMin_price() {
		return min_price;
	}
	public void setMin_price(String min_price) {
		this.min_price = min_price;
	}
	public String getMax_price() {
		return max_price;
	}
	public void setMax_price(String max_price) {
		this.max_price = max_price;
	}
	public String getAverage_price() {
		return average_price;
	}
	public void setAverage_price(String average_price) {
		this.average_price = average_price;
	}
	public String getUnits_traded() {
		return units_traded;
	}
	public void setUnits_traded(String units_traded) {
		this.units_traded = units_traded;
	}
	public String getVolume_1day() {
		return volume_1day;
	}
	public void setVolume_1day(String volume_1day) {
		this.volume_1day = volume_1day;
	}
	public String getVolume_7day() {
		return volume_7day;
	}
	public void setVolume_7day(String volume_7day) {
		this.volume_7day = volume_7day;
	}
	public String getBuy_price() {
		return buy_price;
	}
	public void setBuy_price(String buy_price) {
		this.buy_price = buy_price;
	}
	public String getSell_price() {
		return sell_price;
	}
	public void setSell_price(String sell_price) {
		this.sell_price = sell_price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "LastTradeInfoModel [opening_price=" + opening_price + ", closing_price=" + closing_price
				+ ", min_price=" + min_price + ", max_price=" + max_price + ", average_price=" + average_price
				+ ", units_traded=" + units_traded + ", volume_1day=" + volume_1day + ", volume_7day=" + volume_7day
				+ ", buy_price=" + buy_price + ", sell_price=" + sell_price + ", date=" + date + "]";
	}       
}
