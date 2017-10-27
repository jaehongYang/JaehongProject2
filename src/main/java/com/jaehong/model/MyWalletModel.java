package com.jaehong.model;

public class MyWalletModel {
	
	 private String   total_btc;    
     private String   total_krw;    
     private String   in_use_btc;   
     private String   in_use_krw;   
     private String   available_btc;
     private String   available_krw;
     private String   misu_btc;     
     private String   misu_krw;     
     private String   xcoin_last;   
     private String   misu_depo_krw;
	public String getTotal_btc() {
		return total_btc;
	}
	public void setTotal_btc(String total_btc) {
		this.total_btc = total_btc;
	}
	public String getTotal_krw() {
		return total_krw;
	}
	public void setTotal_krw(String total_krw) {
		this.total_krw = total_krw;
	}
	public String getIn_use_btc() {
		return in_use_btc;
	}
	public void setIn_use_btc(String in_use_btc) {
		this.in_use_btc = in_use_btc;
	}
	public String getIn_use_krw() {
		return in_use_krw;
	}
	public void setIn_use_krw(String in_use_krw) {
		this.in_use_krw = in_use_krw;
	}
	public String getAvailable_btc() {
		return available_btc;
	}
	public void setAvailable_btc(String available_btc) {
		this.available_btc = available_btc;
	}
	public String getAvailable_krw() {
		return available_krw;
	}
	public void setAvailable_krw(String available_krw) {
		this.available_krw = available_krw;
	}
	public String getMisu_btc() {
		return misu_btc;
	}
	public void setMisu_btc(String misu_btc) {
		this.misu_btc = misu_btc;
	}
	public String getMisu_krw() {
		return misu_krw;
	}
	public void setMisu_krw(String misu_krw) {
		this.misu_krw = misu_krw;
	}
	public String getXcoin_last() {
		return xcoin_last;
	}
	public void setXcoin_last(String xcoin_last) {
		this.xcoin_last = xcoin_last;
	}
	public String getMisu_depo_krw() {
		return misu_depo_krw;
	}
	public void setMisu_depo_krw(String misu_depo_krw) {
		this.misu_depo_krw = misu_depo_krw;
	}
	@Override
	public String toString() {
		return "MyWalletModel [total_btc=" + total_btc + ", total_krw=" + total_krw + ", in_use_btc=" + in_use_btc
				+ ", in_use_krw=" + in_use_krw + ", available_btc=" + available_btc + ", available_krw=" + available_krw
				+ ", misu_btc=" + misu_btc + ", misu_krw=" + misu_krw + ", xcoin_last=" + xcoin_last
				+ ", misu_depo_krw=" + misu_depo_krw + "]";
	}
     
}
