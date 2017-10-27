package com.jaehong;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;


@Component
public class CoinFunction {
	
	@Autowired
	private Api_Client client;
	
	
	@SuppressWarnings("unchecked")
	public HashMap<String, Object> callApi(String coin, String URI, HashMap<String, String> request) {
		
		if(URI.contains("public"))URI = URI + "/" + coin;
		
		ObjectMapper mapper = new ObjectMapper();
		JSONObject obj = new JSONObject();
		JSONParser parser = new JSONParser();
		HashMap<String, Object> model = null;
		String result = "";
		try {
		    result = client.callApi(URI, request);
		    obj = (JSONObject)parser.parse(result.toString());
			model = mapper.readValue(obj.get("data").toString(), HashMap.class);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		return model;
	}
}
