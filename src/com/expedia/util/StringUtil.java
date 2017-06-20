package com.expedia.util;

import java.util.HashSet;

/**
 * a util class for purpose of using with strings
 * @author sleman.obaidat@gmail.com
 *
 */
public class StringUtil {
	public static final String LINE_SEPARATOR = System.lineSeparator();
	
	/**
	 * Check whether the passed string is null or empty
	 * @param str
	 * @return true if the string is null or zero characters
	 */
	public static boolean isNullOrEmpty(String str){
		return str == null || "".equals(str);
	}
	
	/**
	 * Splits a string by certain delimiter and stores the results on hashset
	 * @param str
	 * @param Delimiter
	 * @return a hash set of strings split by delimiter
	 */
	public static HashSet<String> toSet(String str, String Delimiter){
		HashSet<String> strSet = new HashSet<>();
		String[] strArrSplit = str.split("\\"+Delimiter);
		for(String s : strArrSplit){
			strSet.add(s);
		}
		return strSet;
	}
}
