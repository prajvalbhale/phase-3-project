<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="com.example.demo.*" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<Shoes> s=(List<Shoes>)request.getAttribute("list"); %>
<table border="1">
<tr>
<th>Shoes Id</th>
<th>Shoes Name</th>
<th>Shoes Brand</th>
<th>Shoes Price</th>
<th>Edit</th>
<th>Delete</th>
</tr>
<%for (Shoes ss:s) {%>
<tr>
<td><%=ss.getId() %></td>
<td><%=ss.getName() %></td>
<td><%=ss.getBrand() %></td>
<td><%=ss.getPrice() %></td>
<td><a href="editshoes.jsp?id=<%=ss.getName()%>">Edit</a></td>
<td><a href="Deletestshoes.jsp?id=<%=ss.getId()%>">Delete</a></td>
<%} %>
</table>

</body>
</html>