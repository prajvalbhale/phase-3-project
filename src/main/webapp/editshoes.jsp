<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Editing Shoes Details</h1>
<input type="hidden" name="name" value=<%=request.getParameter("name") %>>
Shoes name to be edited <input type="text" name="name">
<input type="submit"  value="edit"> 

</body>
</html>