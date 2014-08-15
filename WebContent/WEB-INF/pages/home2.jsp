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

	<style type="text/css">
	


			body {
		
			background:#FFCC66;		
			}
			
			h1 {
			background:LightGoldenRodYellow ;
			color:Maroon ;
			width:270px;
			margin:0 auto 0 auto;
						
			}	
	
			p {
			background:GreenYellow ;
			color:DarkRed ;
			width:400px;
			margin-top:40px;
			margin-left:auto;
			margin-right:auto;		
			
			}	
			

	
	</style>
</head>

<body>
	
	<h1>Enter Credentials</h1>
	
		<div id="addbook">
		
		<sf:form action="userID" method="post" commandName="userCMD">
			<p><label>Enter User Name  : </label> <sf:input path="userName"/><br>
			<label>Enter Password : </label> <sf:password path="password"/><br>
			
			
			<input type="submit" value="Create User"/></p>
		</sf:form>
	
	
	</div>

	
</body>
</html>