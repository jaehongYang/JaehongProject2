package com.jaehong.coin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jaehong.coin.service.CustomSettingService;
import com.jaehong.config.DataSourceProperties;

@RestController
@Profile({"default"})
public class CustomSettingController {
	
	@Autowired
    private DataSourceProperties dsProperties;
	
	@Autowired
	private CustomSettingService service;

	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String a () {
		
		String a = service.getTest();
		
		return "a";
	}
}
