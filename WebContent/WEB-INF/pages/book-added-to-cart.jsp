 x<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	
	<jsp:include page="/style.jsp"/>

</head>
<body>

 	<h1>Added to your Cart !!</h1><br>
 	 	
 	<h3>${title}</h3>
 	<h4><a href="${pageContext.request.contextPath}/viewCart">View Cart</a></h4>
 	
 
 	<a href="${pageContext.request.contextPath}">Home</a>
 	
 	
 
</body>
</html>