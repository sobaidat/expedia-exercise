package com.expedia.model.hotel;

import java.io.Serializable;

/**
 * a Hotel model class with only getters methods because the data of this model will be filled from json object
 * marked as final because we don't need to extend this class
 * @author sleman.obaidat@gmail.com
 *
 */
public final class Hotel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private OfferDateRange offerDateRange;
	private Destination destination;
	private HotelInfo hotelInfo;	
	private HotelUrgencyInfo hotelUrgencyInfo;
	private HotelPricingInfo hotelPricingInfo;
	private HotelUrls hotelUrls;
	private HotelScores hotelScores;
	
	public OfferDateRange getOfferDateRange() {
		return offerDateRange;
	}

	public Destination getDestination() {
		return destination;
	}

	public HotelInfo getHotelInfo() {
		return hotelInfo;
	}

	public HotelUrgencyInfo getHotelUrgencyInfo() {
		return hotelUrgencyInfo;
	}

	public HotelPricingInfo getHotelPricingInfo() {
		return hotelPricingInfo;
	}

	public HotelUrls getHotelUrls() {
		return hotelUrls;
	}

	public HotelScores getHotelScores() {
		return hotelScores;
	}	
}
