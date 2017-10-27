package com.jaehong.define;

import org.springframework.stereotype.Component;

@Component
public  class StaticDefine {
	
	private static String cu = "N";
	
	private static final String public_ticker = "/public/ticker";
	private static final String public_recent_transactions = "/public/recent_transactions";
	private static final String info_account = "/info/account";
	private static final String info_balance = "/info/balance";
	private static final String info_orders = "/info/orders";
	private static final String info_user_transaction = "/info/user_transactions";
	private static final String trade_place = "/trade/place";
	private static final String info_order_detail = "/info/order_detail";
	private static final String trade_cancel = "/trade/cancel";
	
	
	
	

	public static String getPublicTicker() {
		return public_ticker;
	}

	public static String getPublicRecentTransactions() {
		return public_recent_transactions;
	}

	public static String getInfoAccount() {
		return info_account;
	}

	public static String getInfoBalance() {
		return info_balance;
	}

	public static String getInfoOrders() {
		return info_orders;
	}

	public static String getInfoUserTransaction() {
		return info_user_transaction;
	}

	public static String getTradePlace() {
		return trade_place;
	}

	public static String getInfoOrderDetail() {
		return info_order_detail;
	}

	public static String getTradeCancel() {
		return trade_cancel;
	}

	public static String getCu() {
		return cu;
	}

	public static void setCu(String cu) {
		StaticDefine.cu = cu;
	}
	
	

}
