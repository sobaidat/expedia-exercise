package com.expedia.configuration;

import java.util.Properties;

import com.expedia.model.HotelsApiUrl;

public class ApiConfig {
	private static HotelsApiUrl hotelsApiUrl;	

	public static void Init(){
		Properties prop = PropertiesManager.getInstance().getProperties(PropertiesManager.API_CONFIG_PROPERITES);
		
		hotelsApiUrl = new HotelsApiUrl();
		hotelsApiUrl.setBaseUrl(prop.getProperty("offers.api.baseurl"));
		hotelsApiUrl.setScenario(prop.getProperty("offers.api.scenario"));
		hotelsApiUrl.setPage(prop.getProperty("offers.api.page"));
		hotelsApiUrl.setUid(prop.getProperty("offers.api.uid"));
		hotelsApiUrl.setProductType(prop.getProperty("offers.api.productType"));
	}
	
	public static HotelsApiUrl getHotelsApiUrl() throws Exception {
		if(hotelsApiUrl == null)
			throw new Exception("Api Configurations not initialized");
		
		return hotelsApiUrl;
	}
}
