<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	
	<jsp:include page="/style.jsp"/>

</head>
<body>

 	<h1>Book Saved Successfully !!</h1><br>
 	
 	<h3>Book ID	  : ${book.bookId}</h3>
 	<h3>Book Name : ${book.bookName}</h3>
 	<h3>Book Price : ${book.bookPrice}</h3>
 	<h3>Book Author : ${book.bookAuthor}</h3>
 	<h3>Book Type : ${book.bookType}</h3>
 	<h3>Book Desc. : ${book.bookDescription}</h3>
 	
 	<h2>Return to <a href="${pageContext.request.contextPath}/viewCart">View Cart</a> page.</h2>
 	
 	<h2>Return to <a href="${pageContext.request.contextPath}">Home</a> page.</h2>
 	
 	
 
</body>
</html>