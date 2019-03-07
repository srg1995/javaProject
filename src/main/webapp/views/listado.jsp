
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>LISTADO DE PERSONAS</h1>
	<table>
  		<tr>
    		<th>nombre</th>
    		<th>dni</th>
  		</tr>
	<c:forEach items="${lista}" var="listado">
  		<tr>
			<td>${listado.nombre}</td>
			<td>${listado.dni}</td>
		</tr>
	</c:forEach>
	</table>
	
	<div><a href="/pru2/principal">Return</a></div>
</body>
</html>