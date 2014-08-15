<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Enter Credentials</title>
	
		<jsp:include page="/style.jsp"/>
	</head>
	
	<body>
		
		<h1>Login Page</h1>
		
		<sf:form action="finduser" method="post" commandName="inputUserCMD">
			<p><label>Enter User Name  : </label> <sf:input path="userName"/><br>
			<label>Enter Password : </label> <sf:password path="password"/><br>
			<input type="submit" value="Login"/></p>
		</sf:form>
			
		
	</body>
</html>