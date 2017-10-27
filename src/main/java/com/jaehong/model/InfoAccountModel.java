package com.jaehong.model;

public class InfoAccountModel {
	private String created; 
	private String account_id; 
	private String trade_fee; 
	private String balance;
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getAccount_id() {
		return account_id;
	}
	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}
	public String getTrade_fee() {
		return trade_fee;
	}
	public void setTrade_fee(String trade_fee) {
		this.trade_fee = trade_fee;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "InfoAccountModel [created=" + created + ", account_id=" + account_id + ", trade_fee=" + trade_fee
				+ ", balance=" + balance + "]";
	} 
	
	
}
