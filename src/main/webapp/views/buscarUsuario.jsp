<html>
<head>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

</head>
<body>


	<form:form action="listadoUsuario" method="POST" modelAttribute="usuarioDto" path="usuarioDto">
		<form:input id="nombre" path="nombre" />
		<form:button value="enviar" >enviar</form:button>
	</form:form>
	
	<c:if test="${error != null}">
		${error}
	</c:if>
	
	<c:if test="${usuario.nombre != null}">
		El dni del usuario <strong>${usuario.nombre}</strong> es <strong>${usuario.dni}</strong>
	</c:if>
	
	
	


<div><a href="/pru2/"><spring:message code="return"/></a></div>
</body>
</html>