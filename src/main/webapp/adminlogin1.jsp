<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Incorrect Password</h1>
<input type="hidden" name="password" value=<%=request.getParameter("password") %>>
<h2 style="text-align:center; Color:blue"> "Registerd here.."</h2>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>First Name :</b>&nbsp;
<input type="text" name="fname" placeholder="First Name"><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Last Name :</b>&nbsp;
<input type="text" name="lname" placeholder="Last Name"><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Phono:</b>&nbsp;
<input type="text" name="phono" placeholder="phono"><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Username:  :</b>
<input type="number" name="username " placeholder="Username "><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Password:  :</b>
<input type="number" name="password" placeholder="Password"><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<button type="submit" class="btn btn-primary">ADD</button><br><br><br><br>
</body>
</html>