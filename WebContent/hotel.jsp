<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.expedia.model.hotel.Hotel, com.expedia.util.StringUtil" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<% Hotel hotel =(Hotel) request.getAttribute("hotel"); %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><%=hotel.hotelInfo.hotelName %></title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<div class="row">
		<h4><%=hotel.hotelInfo.hotelName %></h4>
	</div>
    <hr>
</div>
</body>
</html>