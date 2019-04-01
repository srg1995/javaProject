<html lang="en">
<head>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

</head>
<body>

<form:form action="insertarUsuario" method="POST" modelAttribute="usuariosForm" path="usuariosForm">
	<form:label path="nombre"><spring:message code="nombre"/></form:label>
	<form:input id="nombre" path="nombre" />
	<form:label path="nombre"><spring:message code="dni"/></form:label>
	<form:input id="dni" path="dni" />
	<form:button value="enviar" >enviar</form:button>
</form:form>

<c:if test="${error != null}">
	${error}
</c:if>

<%-- 	<form:errors path="nombre" cssClass="rojo"/> --%>	 

<div><a href="/pru2/"><spring:message code="return"/></a></div>

</body>
</html> 