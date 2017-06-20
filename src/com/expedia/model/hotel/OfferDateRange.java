package com.expedia.model.hotel;

/**
 * a OfferDateRange model class with only getters methods because the data of this model will be filled from json object
 * marked as final because we don't need to extend this class
 * @author sleman.obaidat@gmail.com
 *
 */
public final class OfferDateRange {
	private int [] travelStartDate;
	private int [] travelEndDate;
	private int lengthOfStay;
	
	public int[] getTravelStartDate() {
		return travelStartDate;
	}
	public int[] getTravelEndDate() {
		return travelEndDate;
	}
	public int getLengthOfStay() {
		return lengthOfStay;
	}
}
