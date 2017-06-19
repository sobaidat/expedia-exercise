package com.expedia.util;

import java.util.HashMap;
import java.util.List;

import com.expedia.model.hotel.Hotel;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class HotelUtil {

	public static HashMap<String,Hotel> getHotels(String jsonString) {
		HashMap<String, Hotel> hotelsMap = new HashMap<>();
		
		JsonObject jsonObject = JsonUtil.toJsonObject(jsonString);
		JsonObject offers = JsonUtil.getJsonObject(jsonObject, "offers");
		JsonArray hotelsJsonArray = JsonUtil.getJsonArray(offers, "Hotel");
		
		List<Hotel> hotels = JsonUtil.getListOfObjects(hotelsJsonArray, Hotel.class);
		for(Hotel hotel : hotels){
			hotelsMap.put(hotel.hotelInfo.hotelId, hotel);
		}
		
		return hotelsMap;
	}
}
