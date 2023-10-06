<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>leads</title>
</head>
<body>
	<a href="viewleadpage"><b>Create New Lead</b></a>
	<h2 >All Leads</h2>
	<hr>
	<table>
		<tr style="color:green">
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Lead Source</th>
			<th>Mobile</th>
		</tr>
		<c:forEach var="lead" items="${leads}">
   			<tr>
				<td>${lead.id}</td>
				<td><a href="getLeadById?id=${lead.id}">${lead.firstName}</a></td>
				<td>${lead.lastName}</td>
				<td>${lead.email}</td>
				<td>${lead.leadSource}</td>
				<td>${lead.mobile}</td>
			</tr>	 
		</c:forEach>
	</table>
</body>
</html>