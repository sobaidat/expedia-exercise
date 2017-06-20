package com.expedia.model.hotel;

/**
 * a HotelUrls model class with only getters methods because the data of this model will be filled from json object
 * marked as final because we don't need to extend this class
 * @author sleman.obaidat@gmail.com
 *
 */
public final class HotelUrls {
	private String hotelInfositeUrl;
	private String hotelSearchResultUrl;
	
	public String getHotelInfositeUrl() {
		return hotelInfositeUrl;
	}
	public String getHotelSearchResultUrl() {
		return hotelSearchResultUrl;
	}
}
