package com.expedia.util;

import java.util.HashMap;
import java.util.List;
import com.expedia.model.hotel.Hotel;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * a util class to convert json response data to Hotel objects
 * used hashmap represent each hotel by its id to make it easy and fast to get specific hotel item
 * @author sleman.obaidat@gmail.com
 *
 */
public class HotelUtil {

	public static HashMap<String, Hotel> getHotels(String jsonString) {
		HashMap<String, Hotel> hotelsMap = new HashMap<>();
		
		JsonObject jsonObject = JsonUtil.toJsonObject(jsonString);
		JsonObject offers = JsonUtil.getJsonObject(jsonObject, "offers");
		JsonArray hotelsJsonArray = JsonUtil.getJsonArray(offers, "Hotel");
		
		List<Hotel> hotels = JsonUtil.getListOfObjects(hotelsJsonArray, Hotel.class);
		for(Hotel hotel : hotels){
			hotelsMap.put(hotel.getHotelInfo().getHotelId(), hotel);
		}
		
		return hotelsMap;
	}
}
