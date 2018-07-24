<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 

"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Loose Change Converter</title>
	<link rel="stylesheet" href="styles.css">
</head>

<body>
	<h1> Loose Change Converter</h1>
	<br>
	<br>
	<h2>Transaction</h2>
	<br>
	<br>
	<div className="container">
		<form:form action="/MyCapstoneProject/transaction" method="POST" modelAttribute="transaction">
		
		  
		     <div class="form-group"><label for="finalAmount">Loose Amount     :</label> <form:input type="text"
		     		class="form-control" path="finalAmount" id="finalAmount" placeholder="Loose Amount"/>
		     </div>
		     <br>
		    <div class="form-group"><form:label path="denomination">Loose Currency   :</form:label> 
		    	    <form:select path = "denomination" id="denomination">
                     <form:option value = "NONE" label = "Select"/>
                     <form:option value = "rupees" label = "rupees"/>
                     <form:option value = "yen" label = "yen"/>
                     <form:option value = "dollar" label = "dollar"/>
                     <form:option value = "franc" label = "franc"/>
                     <form:option value = "dinar" label = "dinar"/>
                     <form:option value = "peso" label = "peso"/>
                     <form:option value = "rand" label = "rand"/>
                     <form:option value = "CFA" label = "CFA"/>
                     <form:options items = "${denomination}" />
                  </form:select>     	
		    
		     </div>
		     <br>
		     
		      <div class="form-group"><form:label path="boughtCurrency">Wanted Currency  :</form:label> 
		    	    <form:select path = "boughtCurrency">
                     <form:option value = "NONE" label = "Select"/>
                     <form:option value = "rupees" label = "rupees"/>
                     <form:option value = "yen" label = "yen"/>
                     <form:option value = "dollar" label = "dollar"/>
                     <form:option value = "franc" label = "franc"/>
                     <form:option value = "dinar" label = "dinar"/>
                     <form:option value = "peso" label = "peso"/>
                     <form:option value = "rand" label = "rand"/>
                     <form:option value = "CFA" label = "CFA"/>
                     <form:options items = "${boughtCurrency}" />
                  </form:select>     	
		    
		     </div>
		     <br>
		    
		     <div class="form-group"><label for="boughtAmount">Value            :</label> <form:input type="int"
		     		class="form-control" path="boughtAmount" id="boughtAmount" placeholder="Value"/>
		     </div>
		     <br>
		     <div class="form-group"><form:label path = "message">Message          :</form:label> 
		     <form:textarea path = "message" rows = "5" cols = "30" />
		     		
		     </div>
		    <br>
		         <input type="submit"></input> 
		
		</form:form> 
		</div>
		
		
		     	

</body>
</html>