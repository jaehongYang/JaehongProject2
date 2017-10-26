package com.jaehong;

import java.util.HashMap;

import com.utils.Api_Client;

public class CoinFunction {
	
	public void getCurrentCost(String coin, String connectKey, String secretKey) {
		Api_Client api = new Api_Client("4ebd66aff5db3e7503d6172e971cb06b",
				"fe3b19af14d2de923b2cb1372eb12a89");
		
			HashMap<String, String> rgParams = new HashMap<String, String>();
//			rgParams.put("order_currency", "BTC");
//			rgParams.put("payment_currency", "KRW");
			rgParams.put("currency", "QTUM");
		
		
			try {
//			    String result = api.callApi("/public/ticker/QTUM", rgParams);
//			    String result1 = api.callApi("/public/recent_transactions/QTUM", rgParams);
//			    String result2 = api.callApi("/public/recent_transactions/QTUM", rgParams);
				/** 현재 보유량 (각) */
			    String result3 = api.callApi("/info/account", rgParams); 
//			    System.out.println(result.toString());
//			    System.out.println(result1.toString());
//			    System.out.println(result2.toString());
			    System.out.println(result3.toString());
			} catch (Exception e) {
			    e.printStackTrace();
			}
	}

}
