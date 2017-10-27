package com.jaehong.define;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public  class StaticDefine {
	
	private static String cu = "Y";
	
	private static final String public_ticker = "/public/ticker";
	private static final String public_recent_transactions = "/public/recent_transactions";
	private static final String info_account = "/info/account";
	private static final String info_balance = "/info/balance";
	private static final String info_orders = "/info/orders";
	private static final String info_user_transaction = "/info/user_transactions";
	private static final String trade_place = "/trade/place";
	private static final String info_order_detail = "/info/order_detail";
	private static final String trade_cancel = "/trade/cancel";
//	
	
	
	
	private static boolean XMR_YN = true;
	private static float MAX_OPERATION_COST = 30000;
	private static int MAX_BUY_COST = 231;
	private static float MAX_SELL_COST = 233;
	public static String getCu() {
		return cu;
	}
	public static void setCu(String cu) {
		StaticDefine.cu = cu;
	}
	public static boolean isXMR_YN() {
		return XMR_YN;
	}
	public static void setXMR_YN(boolean xMR_YN) {
		XMR_YN = xMR_YN;
	}
	public static float getMAX_OPERATION_COST() {
		return MAX_OPERATION_COST;
	}
	public static void setMAX_OPERATION_COST(float mAX_OPERATION_COST) {
		MAX_OPERATION_COST = mAX_OPERATION_COST;
	}
	public static int getMAX_BUY_COST() {
		return MAX_BUY_COST;
	}
	public static void setMAX_BUY_COST(int mAX_BUY_COST) {
		MAX_BUY_COST = mAX_BUY_COST;
	}
	public static float getMAX_SELL_COST() {
		return MAX_SELL_COST;
	}
	public static void setMAX_SELL_COST(float mAX_SELL_COST) {
		MAX_SELL_COST = mAX_SELL_COST;
	}
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
	
	
	


	

}
