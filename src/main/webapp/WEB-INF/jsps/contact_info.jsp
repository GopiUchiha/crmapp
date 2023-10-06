<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Info</title>
</head>
<body>
	<h2>Contact Info</h2>
	<hr>
	First Name : ${contact.firstName}<br/>
	Last Name : ${contact.lastName}<br/>
	Email : ${contact.email}<br/>
	Lead Source : ${contact.leadSource}<br/>
	Mobile : ${contact.mobile}<br/>
	
	<form action="sendEmail" method="post">
		<input type="hidden" name="email" value="${contact.email}"/>
		<input type="submit" value="send email"/>
	</form>
	
</body>
</html>