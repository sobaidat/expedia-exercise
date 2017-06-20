package com.expedia.configuration;

import java.util.Properties;
import com.expedia.model.OffersApiUrl;
import com.expedia.util.StringUtil;

/**
 * class to hold api url configurations
 * 
 * @author sleman.obaidat@gmail.com
 *
 */
public class ApiConfig {
	private static OffersApiUrl offersApiUrl; //object to hold api url info	
	
	/**
	 * Initialize api url object by reading apiconfig.properties file
	 * and then set object attributes based on the name of property (ex: offers.api.baseurl holds the value for  HotelsApiUrl.baseUrl)
	 */
	public static void Init(){
		Properties prop = PropertiesManager.getInstance().getProperties(PropertiesManager.API_CONFIG_PROPERITES);
		
		offersApiUrl = new OffersApiUrl();
		offersApiUrl.setBaseUrl(prop.getProperty("offers.api.baseurl"));
		offersApiUrl.setScenario(prop.getProperty("offers.api.scenario"));
		offersApiUrl.setPage(prop.getProperty("offers.api.page"));
		offersApiUrl.setUid(prop.getProperty("offers.api.uid"));
		offersApiUrl.setProductType(prop.getProperty("offers.api.productType"));
		offersApiUrl.setValidParameters(StringUtil.toSet(prop.getProperty("offers.api.validParameters"), ","));
	}
	
	/**
	 * Gets the offers api url object and passes to the object any other parameters coming from params
	 * @param params
	 * @return OffersApiUrl object
	 * @throws Exception
	 */
	public static OffersApiUrl getOffersApiUrl(String...params) throws Exception {
		if(offersApiUrl == null)
			throw new Exception("Api Configurations not initialized");
		
		StringBuffer otherQuery = new StringBuffer();
		for(int i=0; i < params.length-1; i++){
			otherQuery.append("&").append(params[i]).append("=").append(params[i+1]);
		}
		offersApiUrl.setOther(otherQuery.toString());
		
		return offersApiUrl ;
	}
	
	public static OffersApiUrl getHotelsApiUrl(){
		return offersApiUrl;
	}
	
}
