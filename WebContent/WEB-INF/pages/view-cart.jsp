<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	
	<jsp:include page="/style.jsp"/>

</head>
<body>

 	

<h1>Contents of your cart</h1>
			<ul>
			<c:forEach items="${cart}" var="nextBook">
			
				<h2>${nextBook.bookName}</h2>
			
			
			</c:forEach>
			</ul>	
			
					
 	<h3><a href="${pageContext.request.contextPath}">Home</a></h3>
		
  
</body>
</html>