
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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
    		<th><div><a href="/pru2/"><spring:message code="nombre"/></a></div></th>
    		<th><div><a href="/pru2/"><spring:message code="dni"/></a></div></th>
  		</tr>
	<c:forEach items="${lista}" var="listado">
  		<tr>
			<td>${listado.nombre}</td>
			<td>${listado.dni}</td>
		</tr>
	</c:forEach>
	</table>
	
	<div><a href="/pru2/"><spring:message code="return"/></a></div>
</body>
</html>