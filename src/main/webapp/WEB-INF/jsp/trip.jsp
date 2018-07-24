<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Loose Change Converter</title>
</head>
<body>

	<h1> Loose Change Converter</h1>
	<br>
	<br>
	<h2>Trip</h2>
	<br>
	<br>
	<div className="container">
		<form:form action="/MyCapstoneProject/trip" method="POST" modelAttribute="trip">
		
		     <div class="form-group"><form:label path="originCountry"> Country of Origin </form:label> 
		    	    <form:select path = "originCountry">
                     <form:option value = "NONE" label = "Select"/>
                     <form:options items = "${originCountryList}" />
                  </form:select>     	
		    
		     </div>
		     <br>
		     <div class="form-group">
		     	<label for="originDate"> Trip Date </label> <form:input type="date"
		     		class="form-control" path="originDate" id="originDate"
		     		placeholder="Trip Date"/>
		     </div>
		     <br>
		   <div class="form-group"><form:label path="destCountry"> Country of Destination </form:label> 
		    	    <form:select path = "destCountry">
                     <form:option value = "NONE" label = "Select"/>
                     <form:options items = "${destCountryList}" />
                  </form:select>     	
		    
		     </div>
		     <br>
		     <div class="form-group">
		     	<label for="departDate"> Return Date </label> <form:input type="date"
		     		class="form-control" path="departDate" id="departDate"
		     		placeholder="Return Date"/>
		     </div>
		     <br>
		     <div class="form-group">
		     	<label for="departTime"> Return Time </label> <form:input type="text"
		     		class="form-control" path="departTime" id="departTime"
		     		placeholder="Return Time"/>
		     </div>
		     <br>
	<br>
		     
		     <input type="submit"></input> 
		</form:form>
		
	</div>

</body>
</html>