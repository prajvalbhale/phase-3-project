<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.box {
	max-width: 750px; 
  	margin: auto;
	align-content: center;
	border : 1px solid gray;
  	border-radius: 15px;
  	background-color: white;
  	border-width: 2px;
  	overflow: hidden; 	 
  
  	padding : 60px;
  	padding-top: 35px;
  	padding-bottom : 35px;
}

.sh{
	font-family: Garamond;
	font-size:20px;
	color: green;
	padding:1px;
	padding-top:1px;
	max-width:500px;
	margin: 1%;
}

</style>
</head>
<h3 class="sh">SportyShoes.com</h3>
<hr>
<br>
<h2 style="text-align:center; Color:black"> Insert new shoe!</h2>
<body class="main">
<div class="box">
<form action="success.jsp">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Shoes Id :</b>&nbsp;
<input type="text" name=" id" placeholder="Shoes Id"><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Shoes Name :</b>&nbsp;
<input type="text" name="name" placeholder="Shoes Name"><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<b>Brand Name :</b>&nbsp;
<input type="text" name="brand" placeholder="Brand Name"><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<b>Shoes Price :</b>
<input type="number" name="price" placeholder="Shoes Price"><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;


<div class="container text-center">
<a href="adminlogin.jsp" class="btn btn-outline-danger">Back</a>
<button type="submit" class="btn btn-primary">Add</button>

</div>
</form>
<form action="shoesdetails.jsp">
<h2 style="text-align:center; Color:black">Display/Edit Shoes</h2>
<button type="submit" class="btn btn-primary">show all</button>
</form>
</div>
</body>
</html>