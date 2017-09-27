package com.jaehong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JaehongTestController {

	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String a () {
		return "a";
	}
}
