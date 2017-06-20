<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="com.expedia.model.hotel.Hotel, com.expedia.util.StringUtil"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
	Hotel hotel = (Hotel) request.getAttribute("hotel");
%>
<meta http-equiv="Content-Type" content="text/html; utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><%=hotel.getHotelInfo().getHotelName()%></title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


</head>
<body>
	<div class="container">
		<div class="row">
			<h4><%=hotel.getHotelInfo().getHotelName()%></h4>
		</div>
		<hr>
		<div class="lib-row lib-desc">
			<%=hotel.getHotelInfo().getDescription()%>
		</div>
		<div id="map" style="height:400px"></div>
		
	</div>
	
	<script>
function myMap() {
	var myLatLng = {lat: <%=hotel.getHotelInfo().getHotelLatitude()%>, lng: <%=hotel.getHotelInfo().getHotelLongitude()%>};
	var mapTag = document.getElementById("map");
	var mapOptions = {
	    center: myLatLng,
	    zoom: 15,
	    mapTypeId: google.maps.MapTypeId.MAP
	};

	var map = new google.maps.Map(mapTag, mapOptions);
	
	var marker = new google.maps.Marker({
	    position: myLatLng,
	    map: map,
	    title: '<%=hotel.getHotelInfo().getHotelStreetAddress()%>'
	  });

}
</script>

<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyALXTJ2js4hirunr0FhO-NEjW1AhpP9GEw &callback=myMap"></script>
</body>
</html>