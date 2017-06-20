<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Map, java.util.HashMap, com.expedia.model.hotel.Hotel, com.expedia.util.StringUtil" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hotels</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style>
body {
    padding: 20px;
    font-family: 'Open Sans', sans-serif;
    background-color: #f7f7f7;
}

.lib-panel {
    margin-bottom: 20Px;
}
.lib-panel img {
    width: 100%;
    background-color: transparent;
}

.lib-panel .row,
.lib-panel .col-md-6 {
    padding: 0;
    background-color: #FFFFFF;
}


.lib-panel .lib-row {
    padding: 0 20px 0 20px;
}

.lib-panel .lib-row.lib-header {
    background-color: #FFFFFF;
    font-size: 20px;
    padding: 10px 20px 0 20px;
}

.lib-panel .lib-row.lib-header .lib-header-seperator {
    height: 2px;
    width: 26px;
    background-color: #d9d9d9;
    margin: 7px 0 7px 0;
}

.lib-panel .lib-row.lib-desc {
    position: relative;
    height: 100%;
    display: block;
    font-size: 13px;
}
.lib-panel .lib-row.lib-desc a{
    position: absolute;
    width: 100%;
    bottom: 10px;
    left: 20px;
}

.row-margin-bottom {
    margin-bottom: 20px;
}

.box-shadow {
    -webkit-box-shadow: 0 0 10px 0 rgba(0,0,0,.10);
    box-shadow: 0 0 10px 0 rgba(0,0,0,.10);
}

.no-padding {
    padding: 0;
}

.glyphicon-star {
  font-size: 24px;
  color: #e67e22;
}

.half {
    position:relative;
}
.font{
    font-size:24px;
}
.half:before {

      content: "\e006"; /* put here default icon code*/
      width: 47%;
      display: block;
      position: absolute;
      overflow: hidden;

}
.half:after {
    content: "\e007"; /* put here icon-empty code*/
}

.half-heart:before {

      content: "\e005"; /* put here default icon code*/
      width: 57%;
      display: block;
      position: absolute;
      overflow: hidden;

}
.half-heart:after {
    content: "\e143"; /* put here icon-empty code*/
}


</style>
</head>
<body>
<%
	HashMap<String, Hotel> hotels = (HashMap<String,Hotel>)request.getSession().getAttribute("hotels");
%>
<div class="container">
	<div class="row">
		<h4>Hotels Offers From <a href="https://offersvc.expedia.com/">Expedia</a></h4>
	</div>
    <hr>
	
    <% 
    	int count = 1;
    	for (Map.Entry<String, Hotel> entry : hotels.entrySet()) {
    		Hotel hotel = (Hotel)entry.getValue();
    %>
    	<% if(count % 2 == 0) {%>
	    	<div class="row row-margin-bottom">
	    <% } %>
	            <div class="col-md-5 no-padding lib-item" data-category="view" >
	                <div class="lib-panel">
	                    <div class="row box-shadow">
	                        <div class="col-md-4">
	                         <span class="badge" style="margin:10px"><%=hotel.getHotelPricingInfo().getAveragePriceValue() + " " + hotel.getHotelPricingInfo().getCurrency() %></span>	
	                           
	                            <img  class="lib-img-show" src="<%= StringUtil.isNullOrEmpty(hotel.getHotelInfo().getHotelImageUrl()) ? "/expedia-exercise/images/placeholder.png" :  hotel.getHotelInfo().getHotelImageUrl() %>">
	                        </div>
	                        <div class="col-md-8">
	                            <div class="lib-row lib-header">
	                                <a target="_blank" href="/expedia-exercise/Hotel?hotelId=<%=hotel.getHotelInfo().getHotelId()%>"><%=hotel.getHotelInfo().getHotelName() %></a>	                                                                	                                
	                            </div>	                            
	                            <div class="lib-row lib-desc">
	                               		<%=hotel.getHotelInfo().getHotelLongDestination() %>
	                            </div>
	                            <hr>
	                            <div class="lib-row">
				                    <div class="col-xs-12 text-center">
				                        <h4 class="rating-num"><%=hotel.getHotelInfo().getHotelStarRating() %></h4>
				                        <div class="rating">
				                        	<%
				                        		String[] starArr=null;
				                        		int stars = 0;
				                        		if(! StringUtil.isNullOrEmpty(hotel.getHotelInfo().getHotelStarRating())){				                        			
			                        				starArr = hotel.getHotelInfo().getHotelStarRating().split("\\.");
			                        				stars = Integer.parseInt(starArr[0]);				                        			
				                        		}
				                        		
				                        		for(int i=0; i < stars; i++){
				                        	%>
				                            	<i class="glyphicon glyphicon-star"></i>
				                            <% } %>
				                            <% if(!"0".equals(starArr[1])) { %>
				                            <i class="glyphicon glyphicon-star font half"></i>
				                            <%} %>
				                        </div>
				                    </div>
				                  </div>
				                  <div class="lib-row lib-desc">
	                                <%=hotel.getHotelInfo().getDescription().length() <= 100 ? hotel.getHotelInfo().getDescription() :
	                                	hotel.getHotelInfo().getDescription().substring(0,100) +"..."
	                                %>
	                              </div>	                            
	                        </div>
	                    </div>
	                </div>
	            </div>
	            <div class="col-md-2"></div>            
	       <% if(count % 2 == 0) {%> 
	       		</div>
	    	<% } %>
        <% 
        	count++;
        }
    	%>
</div>
</body>
</html>