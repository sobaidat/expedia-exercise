package com.expedia.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.expedia.api.ApiRequest;
import com.expedia.configuration.ApiConfig;
import com.expedia.model.hotel.Hotel;
import com.expedia.util.ApiUtil;
import com.expedia.util.HotelUtil;
import com.expedia.util.ServletUtil;

/**
 * Servlet implementation class Offers
 */
@WebServlet({ "/Hotels", "/Hotel" })
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		super.init();

		// Initialize Api Configuration (Load properties from
		// apiconfig.properties file)
		ApiConfig.Init();
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControllerServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String servletPath = request.getServletPath();
		if ("/Hotel".equals(servletPath)) {
			HashMap<String, Hotel> hotels = (HashMap<String, Hotel>) request.getSession().getAttribute("hotels");
			
			if(hotels!=null && hotels.containsKey(request.getParameter("hotelId"))){
				request.setAttribute("hotel", hotels.get(request.getParameter("hotelId")));
				request.getRequestDispatcher(Pages.HOTEL).forward(request, response);
			}
		} else {
			// Call Hotel Api
			ApiRequest apiRequest = ApiRequest.createRequest(); // Create Http
																// Request
			String apiResponse = "";
			try {
				// Call get method of url				
				apiResponse = apiRequest.get(ApiUtil.getHotelsUrl(ServletUtil.getParameters(request)));
			} catch (Exception e) {
				response.getWriter().println(e.getMessage());
				e.printStackTrace();
			}

			
			request.getSession().setAttribute("hotels", HotelUtil.getHotels(apiResponse));					
			request.getRequestDispatcher(Pages.HOTELS).forward(request, response);
		}
	}

}
