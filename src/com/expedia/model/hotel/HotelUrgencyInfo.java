package com.expedia.model.hotel;

/**
 * a HotelUrgencyInfo model class with only getters methods because the data of this model will be filled from json object
 * marked as final because we don't need to extend this class
 * @author sleman.obaidat@gmail.com
 *
 */
public final class HotelUrgencyInfo {
	private long airAttachRemainingTime;
	private int numberOfPeopleViewing;
	private int numberOfPeopleBooked;
	private int numberOfRoomsLeft;
	private long lastBookedTime;
	private String almostSoldStatus;
	private String link;
	private String[] almostSoldOutRoomTypeInfoCollection;
	private boolean airAttachEnabled;
	
	public long getAirAttachRemainingTime() {
		return airAttachRemainingTime;
	}
	public int getNumberOfPeopleViewing() {
		return numberOfPeopleViewing;
	}
	public int getNumberOfPeopleBooked() {
		return numberOfPeopleBooked;
	}
	public int getNumberOfRoomsLeft() {
		return numberOfRoomsLeft;
	}
	public long getLastBookedTime() {
		return lastBookedTime;
	}
	public String getAlmostSoldStatus() {
		return almostSoldStatus;
	}
	public String getLink() {
		return link;
	}
	public String[] getAlmostSoldOutRoomTypeInfoCollection() {
		return almostSoldOutRoomTypeInfoCollection;
	}
	public boolean isAirAttachEnabled() {
		return airAttachEnabled;
	}
}
