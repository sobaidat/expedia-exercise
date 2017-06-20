package com.expedia.util;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import com.expedia.configuration.ApiConfig;

/**
 * a util class to aid servlet
 * @author sleman.obaidat@gmail.com
 *
 */
public class ServletUtil {
	
	/**
	 * Gets the parameters from the HttpRequest
	 * Ignoring any non-valid parameter (the valid parameters would be defined in apiconfig.properties: offers.api.validParameters=....)
	 * @param request
	 * @return array of valid parameters
	 */
	public static String[] getParameters(HttpServletRequest request) {
		Enumeration<String> paramNames = request.getParameterNames();
		List<String> params = new ArrayList<>();
		while (paramNames.hasMoreElements()) {
			String param = paramNames.nextElement();
			if (isValidParameter(param, ApiConfig.getHotelsApiUrl().getValidParameters())) {
				params.add(param);
				params.add(request.getParameter(param));
			}
		}

		return params.toArray(new String[params.size()]);
	}

	/**
	 * util method to check if the valid parameters list contains the passed parameter name
	 * @param param
	 * @param validParameters
	 * @return true if the passed param is on the list of valid parameters
	 */
	private static boolean isValidParameter(String param, Set<String> validParameters) {
		return validParameters.contains(param);
	}
}
