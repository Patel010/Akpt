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

 	<h1>List Of All Books.</h1><br>
 	
 	<h2>Return to <a href="${pageContext.request.contextPath}">Home</a> page.</h2>
 			<ul>
			<c:forEach items="${akptbooksetarray}" var="nextBook">
				    
				 	<h3>Book Name : ${nextBook.bookName}</h3><br>
				 	<h5>Book Price :$ ${nextBook.bookPrice}<br>
				 	    Book Author : ${nextBook.bookAuthor}<br>
				 	    Book Type : ${nextBook.bookType}<br>
				 	    Book ID	  : ${nextBook.bookId}<br>
				 	    Book Desc. : ${nextBook.bookDescription}</h5>
				 	    
			<h3><sf:form action="addToCart"  method="post" >	
				<input type="hidden" name="id" value="${nextBook.bookId}" />	    
				<input type="submit" value="Add To Cart"/> 
			</sf:form></h3>

				 	<h3>****************************************</h3>
				 					 				 	
			</c:forEach>
 	<h2>Return to <a href="${pageContext.request.contextPath}">Home</a> page.</h2>
		</ul>
  
</body>
</html>