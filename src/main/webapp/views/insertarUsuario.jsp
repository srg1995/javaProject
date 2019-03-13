<html lang="en">
<head>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

</head>
<body>

fdsfd${error}


<form:form action="insertarUsuario" method="POST" modelAttribute="usuariosForm" path="usuariosForm">
	<form:input id="nombre" path="nombre" />
	<form:errors path="nombre" cssClass="rojo"/>
	<form:input id="dni" path="dni" />
	<form:button value="enviar" >enviar</form:button>
</form:form>

<spring:message code="valid.name"/>

</body>
</html> 