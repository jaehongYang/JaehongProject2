package com.jaehong.schedule.batch;

import org.springframework.stereotype.Component;

@Component
public class AutoTradeBatch {
	
	public void execute() {
		// TODO Auto-generated method stub
		
		
		
		/**1. 현재가격 가져오기
		   2. 현재가격가격과 내가 설정한 가격 비교
		   3. 조건이 맞다면 현재가지고 있는 금액(빗썸 KRW)과 설정한 코인에 보유수량, 매도대기수량 가져오기 / 가격이 아니라면 Pass
		   4. 보유수량을  최대프로그램매수/매도금액에과 비교. 
		   5. 작다면 매수걸기, 크다면 Pass
		*/
		
	}
	
	public void buyAnalisis() {
		//TODO
	}
	
	public void sellAnalisis() {
		//TODO
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
