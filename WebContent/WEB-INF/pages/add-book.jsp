<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Enter a new book</title>

    <jsp:include page="/style.jsp"/>
    
</head>

<body>
	
	<h1>Enter Book Details</h1>
	<div id="addbook">
		
		<sf:form action="savebook" method="post" commandName="addbookCMD">
			<p><label>Enter Book Name  : </label> <sf:input path="bookName"/><br>
			<label>Enter Book Price : </label> <sf:input path="bookPrice"/><br>
			<label>Enter Author Name: </label> <sf:input path="bookAuthor"/><br>
			<label>Enter Book Type  : </label> <sf:input path="bookType"/><br>
			<label>Enter Description: </label> <sf:input path="bookDescription"/><br>
			<input type="submit" value="Add New Book"/></p>
		</sf:form>
	
	
	</div>
	
</body>
</html>