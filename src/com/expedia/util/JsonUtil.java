package com.expedia.util;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * a util class to aid json basic operations
 * @author sleman.obaidat@gmail.com
 *
 */
public class JsonUtil {
	/**
	 * Convert the passed json string to JsonObject object
	 * @param jsonString
	 * @return JsonObject
	 */
	public static JsonObject toJsonObject(String jsonString) {
		JsonParser parser = new JsonParser();
		return (JsonObject) parser.parse(jsonString);
	}

	/**
	 * Get a JsonObject from another JsonObject by the passed objectName
	 * @param fromObject
	 * @param objectName
	 * @return JsonObject
	 */
	public static JsonObject getJsonObject(JsonObject fromObject, String objectName) {
		return fromObject.get(objectName).getAsJsonObject();
	}
	
	/**
	 * Get a JsonArray  from JsonObject by the passed objectArrayName
	 * @param fromObject
	 * @param objectArrayName
	 * @return JsonArray
	 */
	public static JsonArray getJsonArray(JsonObject fromObject, String objectArrayName){
		return fromObject.get(objectArrayName).getAsJsonArray();
	}
	
	/**
	 * a generic method to get all object of the type objClass from jsonArray
	 * @param jsonArray
	 * @param objClass
	 * @return list of objects of type objClass
	 */
	public static <E> List<E> getListOfObjects(JsonArray jsonArray, Class<E> objClass){
		Gson gson = new Gson();
		List<E> listOfObjects = new ArrayList<E>();
		
		for (int i = 0; i < jsonArray.size(); i++) {
			try {
				JsonElement q = jsonArray.get(i);
				E obj = (E) gson.fromJson(q, objClass);
				listOfObjects.add(obj);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return listOfObjects;
	}
}
