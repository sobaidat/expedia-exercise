package com.expedia.configuration;

import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

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
	
	public static HotelsApiUrl getHotelsApiUrl(String...params) throws Exception {
		if(hotelsApiUrl == null)
			throw new Exception("Api Configurations not initialized");
		
		StringBuffer otherQuery = new StringBuffer();
		for(int i=0; i < params.length-1; i++){
			otherQuery.append("&").append(params[i]).append("=").append(params[i+1]);
		}
		hotelsApiUrl.setOther(otherQuery.toString());
		
		return hotelsApiUrl ;
	}
}
