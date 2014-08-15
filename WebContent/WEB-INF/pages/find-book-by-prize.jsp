<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Enter Mim and Max Prize Value</title>

    <jsp:include page="/style.jsp"/>
    
</head>

<body>
	
	 <h1>Enter Mim and Max Prize Value</h1><p>
	 
	 
	 <form action="findbyprisePOST" method="post"> 
	   	   <h3><label>Enter Min Prize : </label><input type="text" name="min"><br> 
	   	   <label>Enter Max Prize : </label><input type="text" name="max"><br>                  
	   	   
		    <input type="submit" value="Find Book(s)"/></h3><p>
	 </form>	
	 
	
</body>
</html>