package com.expedia.util;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import com.expedia.configuration.ApiConfig;

public class ServletUtil {
	public static String[] getParameters(HttpServletRequest request) {
		Enumeration<String> paramNames = request.getParameterNames();
		List<String> params = new ArrayList<>();
		while (paramNames.hasMoreElements()) {
			String param = paramNames.nextElement();
			if (isAllowedParameter(param, ApiConfig.getHotelsApiUrl().getAllowedParameters())) {
				params.add(param);
				params.add(request.getParameter(param));
			}
		}

		return params.toArray(new String[params.size()]);
	}

	private static boolean isAllowedParameter(String param, Set<String> allowedParameters) {
		return allowedParameters.contains(param);
	}
}
