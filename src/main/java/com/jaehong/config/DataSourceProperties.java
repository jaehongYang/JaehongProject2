package com.jaehong.config;



import java.util.HashMap;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="spring")
public class DataSourceProperties {
	
	@NestedConfigurationProperty
	private String profiles;
	
	@NestedConfigurationProperty
	private String port;
	
	@NestedConfigurationProperty
	private HashMap<String, String> datasource;
	
	
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public HashMap<String, String> getDatasource() {
		return datasource;
	}
	public void setDatasource(HashMap<String, String> datasource) {
		this.datasource = datasource;
	}
	public String getProfiles() {
		return profiles;
	}
	public void setProfiles(String profiles) {
		this.profiles = profiles;
	}
}
