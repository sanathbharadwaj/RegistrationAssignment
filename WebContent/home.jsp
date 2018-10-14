<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display</title>
<style>
table#nat{
	width: 50%;
	background-color: #c48ec5;
}
</style>
</head>
<body>  
<% 
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String mobile = request.getParameter("mobile");
	String password = request.getParameter("password");
%>
<table id ="nat">
<tr>
	<td>Name</td>
	<td><%= name %></td>
</tr>

<tr>
	<td>Email</td>
	<td><%= email %></td>
</tr>

<tr>
	<td>Mobile</td>
	<td><%= mobile %></td>
</tr>

<tr>
	<td>Password</td>
	<td><%= password %></td>
</tr>

</table>
<br>
</body>
</html>