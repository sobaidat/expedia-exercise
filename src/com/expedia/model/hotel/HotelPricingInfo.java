package com.expedia.model.hotel;

/**
 * a HotelPricingInfo model class with only getters methods because the data of this model will be filled from json object
 * marked as final because we don't need to extend this class
 * @author sleman.obaidat@gmail.com
 *
 */
public final class HotelPricingInfo {
	private float averagePriceValue;
	private float totalPriceValue;
	private String originalPricePerNight;
	private int hotelTotalBaseRate;
	private float hotelTotalTaxesAndFees;
	private String currency;
	private float hotelTotalMandatoryTaxesAndFees;
	private int percentSavings;
	private boolean drr;
	
	public float getAveragePriceValue() {
		return averagePriceValue;
	}
	public float getTotalPriceValue() {
		return totalPriceValue;
	}
	public String getOriginalPricePerNight() {
		return originalPricePerNight;
	}
	public int getHotelTotalBaseRate() {
		return hotelTotalBaseRate;
	}
	public float getHotelTotalTaxesAndFees() {
		return hotelTotalTaxesAndFees;
	}
	public String getCurrency() {
		return currency;
	}
	public float getHotelTotalMandatoryTaxesAndFees() {
		return hotelTotalMandatoryTaxesAndFees;
	}
	public int getPercentSavings() {
		return percentSavings;
	}
	public boolean isDrr() {
		return drr;
	}
}
