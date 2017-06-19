package com.expedia.util;

public class StringUtil {
	public static final String LINE_SEPARATOR = System.lineSeparator();
	
	public static boolean isNullOrEmpty(String str){
		return str == null || "".equals(str);
	}
}
