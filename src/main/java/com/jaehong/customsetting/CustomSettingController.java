package com.jaehong.customsetting;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jaehong.CoinFunction;
import com.jaehong.CommonUtils;
import com.jaehong.customsetting.service.CustomSettingService;
import com.jaehong.define.StaticDefine;
import com.jaehong.model.TickerModel;

@RestController
@Profile({"default"})
public class CustomSettingController {
	
	@Autowired
    private CoinFunction function;
	
	@Autowired
	private CommonUtils utils;
	
	@Autowired
	private CustomSettingService service;
	
	@Autowired
	private StaticDefine define;

	@RequestMapping(value="/test", method=RequestMethod.GET)
	public HashMap<String, Object> a () {
		HashMap<String, String> request = new HashMap<String, String>();
		HashMap<String, Object> result = function.callApi("QTUM", "/public/ticker", null);
		return result;
	}
	
	@SuppressWarnings("static-access")
	@RequestMapping(value="/aa", method=RequestMethod.PUT)
	public String b ( @RequestBody HashMap<String, String> a) {
		
		String result = (String)a.get("ExcuteYn");
		define.setCu(result);
		return define.getCu();
	}
	
	@RequestMapping(value="/bb", method=RequestMethod.GET)
	public String b1 () {
		
		
		return define.getCu();
	}
}
