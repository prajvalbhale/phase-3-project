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
</body>
</html>