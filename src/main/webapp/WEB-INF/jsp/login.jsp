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
<form:form action="/MyCapstoneProject/login" method="Post" modelAttribute="user">

Email   : <form:input path="email"/>
<br>
<br>
Password: <form:password path="password"/>
<br>
<br>
<input type="submit" value="Login">

</form:form>

</body>
</html>