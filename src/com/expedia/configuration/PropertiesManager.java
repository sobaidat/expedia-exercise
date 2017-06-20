package com.expedia.configuration;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/**
 * a singleton class to read properties files
 * @author sleman.obaidat@gmail.com
 *
 */
public class PropertiesManager {
	public static final String API_CONFIG_PROPERITES = "apiconfig.properties";
			
	private PropertiesManager(){}
	
	public static PropertiesManager getInstance(){
		return new PropertiesManager();
	}
	
	public Properties getProperties(String propFile){
		Properties prop = new Properties();
		InputStream input = null;

		try {
			input = getClass().getClassLoader().getResourceAsStream(propFile);
			// load a properties file
			prop.load(input);
			
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		
		return prop;
	}
}
