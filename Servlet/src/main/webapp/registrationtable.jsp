<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%! String email ; String password ; String name; %> 

<% 
email = request.getParameter("email");
password = request.getParameter("password");
name = request.getParameter("password");
%>

<div align="center">
<h1>Registration Details</h1>
<table  border cellpadding="10px" cellspacing="0px">

<tr>
	<th>Name</th>
	<th>Email </th>
	<th>Password </th>
</tr>

<tr>
	 <td> <%= name %> </td>
	 <td> <%= email %> </td>
	 <td> <%= password %> </td>
</tr>


</table>
</div>
</body>
</html>