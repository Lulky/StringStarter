<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Primer String</title>
</head>
<body>
	<h1>Customer Name: <c:out value="${nombre}"></c:out></h1>
	<h2>Item name: <c:out value="${item}"></c:out></h2>
	<h2>Price: <c:out value="${precio}"></c:out></h2>
	<h2>Description: <c:out value="${descripcion}"></c:out></h2>
	<h2>Vendor: <c:out value="${proveedor}"></c:out></h2>
</body>
</html>