<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Loose Change Converter</title>
</head>
<body>
	<h1> Loose Change Converter</h1>

<h3> Sign Up Page</h3>

<div className="container">
		<form:form action="/MyCapstoneProject/register" method="POST" modelAttribute="user">
		
		<div class="form-group">
			<label for="firstName"> First name </label> <form:input type="text"
				class="form-control" path="firstName" id="firstName"
				placeholder="First Name"/>
		</div>
		<br>
		<br>
		<div class="form-group">
			<label for="lastName"> Last name </label> <form:input type="text"
				class="form-control" path="lastName" id="lastName"
				placeholder="Last Name"/>
		</div>
		<br>
		<br>
		<div class="form-group">
			<label for="country"> Country </label> <form:input type="text"
				class="form-control" path="country" id="country"
				placeholder="Country"/>
		</div>
		<br>
		<br>
		<div class="form-group">
			<label for="email"> Email address </label> <form:input type="text"
				class="form-control" path="email" id="email"
				placeholder="Email"/>
		</div>
		<br>
		<br>		
		<div class="form-group">
			<label for="password"> Password </label> <form:input type="text"
				class="form-control" path="password" id="password"
				placeholder="Password"/>
		</div>
		<br>
		<br>
		<input type="submit"></input> 
		</form:form>
		
		</div>

</body>
</html>