<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<h1>Welcome to BAPS Aksharpith!!</h1>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Demo</title>
	<link type="text/css" rel="stylesheet" href="styles.css"/>
	
	<style type="text/css">
	body {
		background:#FFCC66;			
			}
	nav ul	{
		background:#ccc;
		padding:0 10px; /* padding(leave space) 0 top and bottam, 10px right nd left */
		list-style:none; /* to get rid of bullet points the dots) */
		position: relative;
		display: inline-table; /* to reduce width of the cell (background color) to match the space of the words */
		}
	
	nav ul:after /* this is to stay every thing in place after you click on the links */
		{
		content:"";
		clear:both;
		display:block;
		}
	
	nav ul li 	{
		float:left; /* to aline li elements horizontal starting from left */
		}
	
	nav ul li a	{
		display:block;         /* to put "a" elements in blocks */
		padding: 15px 20px;    /* to put space (padding)on each block 15px top&bottom 20px left&right */
		color:#757575;
		text-decoration:none   /* to remove underline */
		}
	
	nav ul li:hover {
		background:#4b545f;    /* to change color of the block when you hover over the mouse */
		}
	
	nav ul li:hover a{
		color:red;             /* to change color of fonts when hover the mouse over */
		}
	
	nav ul ul{
		display:none; 			/* to hide drop down iteams */
		background:#5f6975;		/* background color of drop down iteams */
	    position:absolute;
	    top:100%;
		
		}
	
	nav ul li:hover > ul{
		display:block;
		}
		
	nav ul ul li {
		float:none;
		border-top:1px solid #fff;
		border-bottom: 3px solid #33FF33;
		posotion: relative;
		}
	
	nav ul ul li a {
		padding: 15px 40px;
		color: #FFF;
		}
	
	nav ul ul li a:hover {
		background:#4b5445f;
		}
/* This CSS Style you tube link http://www.youtube.com/watch?v=TU45mMW_xmc */
	
	</style>

	
	</head>
	<body>
		 <nav>
		 	<ul>
		 		<li><a href="${pageContext.request.contextPath}">Home</a></li>
		 		<li><a href="#">Ayurveda</a></li>
		 		<li><a href="#">Books</a>
		 			<ul>
		 				<li><a href="${pageContext.request.contextPath}/addbookC">Add Book</a></li>
		 				<li><a href="${pageContext.request.contextPath}/showallbooks">Show All Books</a></li>
		 				<li><a href="${pageContext.request.contextPath}/findbyprise">Find By Prize</a></li>
		 				<li><a href="${pageContext.request.contextPath}/selectToDelete">Delete Book</a></li>
		 			</ul>
		 		</li>
		 		<li><a href="#">CD/DVD</a></li>
		 	</ul>
		 </nav>
	 	<a href="${pageContext.request.contextPath}/viewCart">View Cart</a> 
	</body>
</html>