<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String [] cities = {"Mumbai" ,"Pune","Cochin","BBSR","Goa","Kolkata" ,"Bengaluru"}; %>
<form method="post" action="save.do">
Flight Code : <input name ="code"> <br>
Source : <select name ="from"> 
		<% for(String ct: cities) { %>
			<option value ="<%=ct %>"> <%=ct %></option>
			<% } %> </select><br>
Destination :  <select name ="to"> 
		<% for(String ct: cities) { %>
			<option value ="<%=ct %>"> <%=ct %></option>
			<% } %> </select><br>
Carrier : <input type ="radio" name ="carrier" value ="Indigo" checked>Indigo
		  <input type ="radio" name ="carrier" value ="JetAirWays">JetAirWays
		  <input type ="radio" name ="carrier" value ="AirIndia">AirIndia
		  <br>
<input type="submit" value="Add Flight"> <br>
</form>
</body>
</html>