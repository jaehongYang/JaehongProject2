package com.jaehong.schedule.batch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jaehong.CoinFunction;
import com.jaehong.define.StaticDefine;

@Component
public class AutoTradeBatch {
	
	@Autowired
	CoinFunction function;
	
	/**1. 현재가격 가져오기
	   2. 현재가격가격과 내가 설정한 가격 비교
	   3. 조건이 맞다면 현재가지고 있는 금액(빗썸 KRW)과 설정한 코인에 보유수량, 매도대기수량 가져오기 / 가격이 아니라면 Pass
	   4. 보유수량을  최대프로그램매수/매도금액에과 비교. 
	   5. 작다면 매수걸기, 크다면 Pass
	*/
	
	@SuppressWarnings("unchecked")
	public void execute() {
		if(StaticDefine.isXMR_YN()) {
			HashMap<String, Object> currentCost = function.callApi("XRP", "/public/orderbook", null);
			if(currentCost.get("payment_currency").equals("KRW") &&  currentCost.get("order_currency").equals("XRP")) {
				 ArrayList<HashMap<String, String>> bids = (ArrayList<HashMap<String, String>>)currentCost.get("bids");
				 HashMap<String, String> bid = (HashMap<String, String>)bids.get(0);
				 ArrayList<HashMap<String, String>> asks = (ArrayList<HashMap<String, String>>)currentCost.get("asks");
				 HashMap<String, String> ask = (HashMap<String, String>)asks.get(0);
//				 if(Float.parseFloat((String)bid.get("price")) <= StaticDefine.getMAX_BUY_COST()) {
					 buyAnalisis(bid);
//				 }else if(Float.parseFloat((String)ask.get("price")) >= StaticDefine.getMAX_BUY_COST()){
					 sellAnalisis(ask);
//				 };
			}
		}
	}
	
	@SuppressWarnings("unused")
	public void buyAnalisis(HashMap<String, String> bid) {
		//TODO
		System.out.println("buyAnalisis");
		HashMap<String, String> request = new HashMap<String, String>();
		request.put("currency", "XRP");
		HashMap<String, Object> result = function.callApi("XRP", "/info/balance", request);
		int quantity = (int) ((int)result.get("available_krw") / StaticDefine.getMAX_BUY_COST());
		
		if(quantity > 10 ) {
			/**Float형을 변환*/
			request.put("units", String.valueOf(quantity));
			request.put("order_currency", "XRP");
			request.put("type", "bid");
			request.put("Payment_currency", "KRW");
			request.put("misu", "N");
			/**Integer형을 변환*/
			request.put("price",String.valueOf(StaticDefine.getMAX_BUY_COST()));
			System.out.println("request"+ request.toString());
			function.callApi("XRP", "/trade/place", request);
		}
	}
	
	@SuppressWarnings("unused")
	public void sellAnalisis(HashMap<String, String> ask) {
		System.out.println("sellAnalisis");
		HashMap<String, String> request = new HashMap<String, String>();
		request.put("currency", "XRP");
		HashMap<String, Object> result = function.callApi("XRP", "/info/balance", request);
		float available = Float.parseFloat((String) result.get("available_xrp")) + 0;
		
		if(available > 10) {
			request.put("units", String.valueOf(available));
			request.put("order_currency", "XRP");
			request.put("type", "ask");
			request.put("Payment_currency", "KRW");
			request.put("misu", "N");
			request.put("price",String.valueOf(StaticDefine.getMAX_SELL_COST()));
			function.callApi("XRP", "/trade/place", request);
			System.out.println("거래 완료");
		}
	}
	
	public void reservedBuy() {
		//TODO
	}
	
	public void reservedSell() {
		//TODO
	}
	
	public void reservedSellCancel() {
		//TODO
	}
	
	public void reservedBuyCancel() {
		//TODO
	}


	

}
