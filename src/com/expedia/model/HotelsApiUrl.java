package com.expedia.model;

import java.util.HashSet;

/**
 * a model class to hold api request configurations
 * 
 * @author Sulaiman-PC
 *
 */
public class HotelsApiUrl {
	private String baseUrl;
	private String scenario;
	private String page;
	private String uid;
	private String productType;
	private String other;
	private HashSet<String> allowedParameters;
	
	public HashSet<String> getAllowedParameters() {
		return allowedParameters;
	}

	public void setAllowedParameters(HashSet<String> allowedParameters) {
		this.allowedParameters = allowedParameters;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public String getScenario() {
		return scenario;
	}

	public void setScenario(String scenario) {
		this.scenario = scenario;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	public void setOther(String other){
		this.other = other;
	}

	@Override
	public String toString() {
		return baseUrl + "?scenario=" + scenario + "&page=" + page + "&uid=" + uid + "&productType=" + productType + other;
	}
}
