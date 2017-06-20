package com.expedia.util;

import java.util.HashSet;

public class StringUtil {
	public static final String LINE_SEPARATOR = System.lineSeparator();
	
	public static boolean isNullOrEmpty(String str){
		return str == null || "".equals(str);
	}
	
	public static HashSet<String> toSet(String str, String Delimiter){
		HashSet<String> strSet = new HashSet<>();
		String[] strArrSplit = str.split("\\"+Delimiter);
		for(String s : strArrSplit){
			strSet.add(s);
		}
		return strSet;
	}
}
