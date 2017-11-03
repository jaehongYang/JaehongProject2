package com.jaehong;

import org.springframework.stereotype.Component;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;

@Component
public class DynamoDbClient {
	
	
	public AmazonDynamoDB getClient() {
		
		AmazonDynamoDB client = AmazonDynamoDBClientBuilder
				.standard()
				.withCredentials(new ProfileCredentialsProvider("jaehong"))
				.withRegion(Regions.AP_NORTHEAST_2)
				.build();
		return client;
	}
	

}
