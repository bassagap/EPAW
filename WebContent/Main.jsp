<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="controller.Main" %>
<%@ page import="domain.User" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users table</title>
</head>
<style type="text/css">
body {
    background-color: #FAFAFA;
}
h2 {
	font-weight: bold;
	font-size: 16px;
}
td {
	border: 1px solid black;
}
table {
	border: 1px solid black; 
	width: 500px;
}

</style>
<body>
<h1>Users table</h1>
<table>
	<tr>
		<td style = ' width: 50px;'><h2>ID</h2></td>
		<td style = ' width: 80px;'><h2>Name</h2></td>
		<td style = ' width: 80px;'><h2>Profile</h2></td>	
		<td style = ' width: 80px;'><h2>Telefone</h2></td>		
	</tr>
	<%
	ArrayList<User> usersList = Main.getUsersList(session);
	for (User user:  usersList)
	{
	%>
	<tr>
	<td style = ' width: 50px;'> <%=user.getId()%></td>
	<td style = ' width: 80px;'><%=user.getName()%> </td>
	<td style = ' width: 80px;'> <%=user.getDescription()%></td>
	<td style = ' width: 80px;'> <%=user.getTelefon()%></td>
	</tr>
	<%       
	}
	%>
	<tr>
		<td style = 'border: 1px solid black; width: 50px;'><% %></td>
		<td style = 'border: 1px solid black; width: 80px;'><% %></td>
		<td style = 'border: 1px solid black; width: 80px;'><% %></td>		
		<td style = 'border: 1px solid black; width: 80px;'><% %></td>	
	</tr>
</table>
</body>
</html>