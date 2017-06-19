package com.expedia.util;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonUtil {
	public static JsonObject toJsonObject(String jsonString) {
		JsonParser parser = new JsonParser();
		return (JsonObject) parser.parse(jsonString);
	}

	public static JsonObject getJsonObject(JsonObject fromObject, String objectName) {
		return fromObject.get(objectName).getAsJsonObject();
	}
	
	public static JsonArray getJsonArray(JsonObject fromObject, String objectArrayName){
		return fromObject.get(objectArrayName).getAsJsonArray();
	}
	
	public static <E> List<E> getListOfObjects(JsonArray jsonArray, Class objClass){
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
