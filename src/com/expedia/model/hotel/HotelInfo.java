package com.expedia.model.hotel;

/**
 * a HotelInfo model class with only getters methods because the data of this model will be filled from json object
 * marked as final because we don't need to extend this class
 * @author sleman.obaidat@gmail.com
 *
 */
public final class HotelInfo {
	private String hotelId;
	private String hotelName;
	private String hotelDestination;
	private String hotelDestinationRegionID;
	private String hotelLongDestination;
	private String hotelStreetAddress;
	private String hotelCity;
	private String hotelProvince;
	private String hotelCountryCode;
	private String hotelLocation;
	private String hotelLatitude;
	private String hotelLongitude;
	private String hotelStarRating;
	private String hotelGuestReviewRating;
	private String travelStartDate;
	private String travelEndDate;
	private String hotelImageUrl;
	private float carPackageScore;
	private String description;
	private int distanceFromUser;
	private String language;
	private float movingAverageScore;
	private float promotionAmount;
	private String promotionDescription;
	private String promotionTag;
	private float rawAppealScore;
	private float relevanceScore;
	private String statusCode;
	private String statusDescription;
	private boolean carPackage;
	private boolean allInclusive;
	
	public String getHotelId() {
		return hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public String getHotelDestination() {
		return hotelDestination;
	}
	public String getHotelDestinationRegionID() {
		return hotelDestinationRegionID;
	}
	public String getHotelLongDestination() {
		return hotelLongDestination;
	}
	public String getHotelStreetAddress() {
		return hotelStreetAddress;
	}
	public String getHotelCity() {
		return hotelCity;
	}
	public String getHotelProvince() {
		return hotelProvince;
	}
	public String getHotelCountryCode() {
		return hotelCountryCode;
	}
	public String getHotelLocation() {
		return hotelLocation;
	}
	public String getHotelLatitude() {
		return hotelLatitude;
	}
	public String getHotelLongitude() {
		return hotelLongitude;
	}
	public String getHotelStarRating() {
		return hotelStarRating;
	}
	public String getHotelGuestReviewRating() {
		return hotelGuestReviewRating;
	}
	public String getTravelStartDate() {
		return travelStartDate;
	}
	public String getTravelEndDate() {
		return travelEndDate;
	}
	public String getHotelImageUrl() {
		return hotelImageUrl;
	}
	public float getCarPackageScore() {
		return carPackageScore;
	}
	public String getDescription() {
		return description;
	}
	public int getDistanceFromUser() {
		return distanceFromUser;
	}
	public String getLanguage() {
		return language;
	}
	public float getMovingAverageScore() {
		return movingAverageScore;
	}
	public float getPromotionAmount() {
		return promotionAmount;
	}
	public String getPromotionDescription() {
		return promotionDescription;
	}
	public String getPromotionTag() {
		return promotionTag;
	}
	public float getRawAppealScore() {
		return rawAppealScore;
	}
	public float getRelevanceScore() {
		return relevanceScore;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public String getStatusDescription() {
		return statusDescription;
	}
	public boolean isCarPackage() {
		return carPackage;
	}
	public boolean isAllInclusive() {
		return allInclusive;
	}
}
