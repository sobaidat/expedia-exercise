package com.expedia.util;

import java.net.URL;

import com.expedia.configuration.ApiConfig;

public class ApiUtil {
	public static final URL getHotelsUrl(String...params) throws Exception{
		return new URL(ApiConfig.getHotelsApiUrl(params).toString());
	}
}
