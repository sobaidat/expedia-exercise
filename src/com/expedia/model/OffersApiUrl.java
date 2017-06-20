package com.expedia.model;

import java.util.HashSet;

/**
 * a model class to hold api request configurations
 * these configurations will be read from apiconfig.properties on server instance initialized
 * @author sleman.obaidat@gmail.com
 *
 */
public class OffersApiUrl {
	private String baseUrl; //holds the base api url (ex: https://offersvc.expedia.com/offers/v2/getOffers)
	private String scenario;
	private String page;
	private String uid;
	private String productType;
	private String other; // this will contains the passed parameters on get query
	
	//the purpose of this set is to hold a list of parameter names that can be passed on api url request so any other parameters will be ignored
	//we can add parameters on apiconfig.properties
	private HashSet<String> validParameters;
	
	public HashSet<String> getValidParameters() {
		return validParameters;
	}

	public void setValidParameters(HashSet<String> validParameters) {
		this.validParameters = validParameters;
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
