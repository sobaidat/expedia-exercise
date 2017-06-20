package com.expedia.model.hotel;

/**
 * a destination model class with only getters methods because the data of this model will be filled from json object
 * marked as final because we don't need to extend this class
 * @author sleman.obaidat@gmail.com
 *
 */
public final class Destination {
	private String regionID;
	private String longName;
	private String country;
	private String province;
	
	public String getRegionID() {
		return regionID;
	}
	public String getLongName() {
		return longName;
	}
	public String getCountry() {
		return country;
	}
	public String getProvince() {
		return province;
	}
	public String getCity() {
		return city;
	}
	private String city;
}
