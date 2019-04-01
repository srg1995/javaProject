<html>
<head>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

</head>
<body>

<h1>INTRODUCE EL NOMBRE DE USUARIO QUE QUIERES ELIMINAR</h1>

<c:if test="${error != null}">
	<p> ${error}</p> 
</c:if>
${campoVacio}

<form:form action="eliminarUsuario" method="POST" modelAttribute="usuariosForm" path="usuariosForm">
	<form:input id="nombre" path="nombre" />
	<form:button value="enviar" >eliminar</form:button>
</form:form>

<div><a href="/pru2/"><spring:message code="return"/></a></div>
</body>
</html> 