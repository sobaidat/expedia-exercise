package com.expedia.model.hotel;

/**
 * a HotelScores model class with only getters methods because the data of this model will be filled from json object
 * marked as final because we don't need to extend this class
 * @author sleman.obaidat@gmail.com
 *
 */
public final class HotelScores {
	private float rawAppealScore;
	private float movingAverageScore;
	
	public float getRawAppealScore() {
		return rawAppealScore;
	}
	public float getMovingAverageScore() {
		return movingAverageScore;
	}
}
