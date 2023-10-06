<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>billing</title>
</head>
<body>
	<h2>Billing Info</h2>
	<hr>
			First Name : ${bill.firstName}<br/>
			Last Name : ${bill.lastName}<br/>
			Email : ${bill.email}<br/>
			Mobile : ${bill.mobile}<br/>
			Product : ${bill.product}<br/>
			Amount : ${bill.amount}<br/>
			Mode : ${bill.mode}<br/>
</body>
</html>