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

		
		<h1>Jai Swaminarayan</h1><br>
		<p>Welcome to BAPS Aksharpith Store</p><br>
		<h3><a href="${pageContext.request.contextPath}/loginxx">Click Here to Login</a></h3><br>
		<h3>New user? Click <a href="${pageContext.request.contextPath}/createNewUser">here</a> to register !!</h3>
		
	<form>
	<input type="button" value="Touch Me" onclick="aouch()"><br>
	<input type="button" value="Start" onclick="start()"><br>
	<input type="button" value="Calling Globle and local var in same method" onclick="varScops()"><br>
	<input type="button" value="Calling localvar in diff function will NOT work" onclick="xxx()"><br>
	</form>
			
		<script type="text/javascript">
			function aouch (){
				alert ("outch");
			}
			/*****************************************/
			function first(x,y){
				document.write(x + " and " + y + " are in function first" +"<br>");
				return (x+y)+ "<br>";
			}
			function second (a,b){
				document.write(a + " and " + b + " are in function second");
			}
			function start(){
				first(3, 1);
				document.write(first(5,5));
				second("Ripal", 2);
			}
			/*****************************************/
			
			var globleVar = 3 ;
			function varScops(){
				var localVar = 5;
				document.write(globleVar + localVar);
			}
			function xxx(){
			document.write(localVar);
			document.write(globleVar);
			}
		</script>
		
	</body>
</html>