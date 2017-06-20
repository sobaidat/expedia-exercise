package com.expedia.util;

import java.net.URL;

import com.expedia.configuration.ApiConfig;

public class ApiUtil {
	
	/**
	 * 
	 * @param params
	 * @return a URL object represnts the hotel (offers) api url 
	 * @throws Exception
	 */
	public static final URL getHotelsUrl(String...params) throws Exception{
		return new URL(ApiConfig.getOffersApiUrl(params).toString());
	}
}
