package com.expedia.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.expedia.util.StringUtil;

/**
 * 
 * @author Sulaiman-PC
 *
 */
public class ApiRequest {
	private ApiRequest() {

	}

	public static ApiRequest createRequest() {
		return new ApiRequest();
	}

	public String get(URL url) {
		StringBuffer sb = new StringBuffer();
		HttpURLConnection httpcon= null;
		BufferedReader inreader = null;

		try {
			httpcon = getHttpConnection(url);
			httpcon.setRequestMethod("GET");
			httpcon.connect();

			inreader = new BufferedReader(new InputStreamReader(httpcon.getInputStream()));

			String decodedStringLine;
			while ((decodedStringLine = inreader.readLine()) != null) {
				sb.append(decodedStringLine).append(StringUtil.LINE_SEPARATOR);
			}
		} catch (IOException ex) {
			sb = new StringBuffer();
			sb.append("HTTP Status 500").append(StringUtil.LINE_SEPARATOR);
			sb.append("Calling Api Failed!").append(StringUtil.LINE_SEPARATOR);
			

		} finally {
			if (inreader != null)
				try {
					inreader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			if (httpcon != null)
				httpcon.disconnect();
		}

		return sb.toString();
	}

	private HttpURLConnection getHttpConnection(URL url) throws IOException {
		HttpURLConnection httpcon = (HttpURLConnection) ((url).openConnection());
		httpcon.setDoOutput(true);
		httpcon.setRequestProperty("Content-Type", "application/json");
		httpcon.setRequestProperty("Accept", "application/json");
		return httpcon;
	}
}
