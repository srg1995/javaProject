<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<c:set var="contextPath" value="${request.getContextPath()}"/>
		<script src="${contextPath}resources/js/jquery-3.3.1.min.js"></script>
		<script src="${contextPath}resources/js/modificarUsuario.js"></script>
		
		<style>
		#formularioOculto, .marcarErrores{
			display:none
		}
	</style>
		
	</head>
	
	<body>
		
		<form:form action="modificarUsuario" id ="formularioOculto" method="POST" modelAttribute="actualizarUsuarios" path="actualizarUsuarios">
			<form:label path="nombre"><spring:message code="nuevo.nombre"/></form:label>
			<form:input id="nombre" path="nombre" />
			<form:label path="dni"><spring:message code="nuevo.dni"/></form:label>
			<form:input id="dni" path="dni" />
			<form:button value="enviar" ><spring:message code="enviar"/></form:button>
		</form:form>
	
		<div class="existe-formulario">
			<input type="text" id="inputNombreAntiguo" placeholder="introduce usuario">
			<input type="button" id="comprobarExistencia" value="Comprobar existencia">
			<div class="marcarErrores"><spring:message code="error.usuario"/></div>
		</div>
	
		<c:if test="${error != null}">
			${error}
		</c:if>
	
		<div><a href="/pru2/"><spring:message code="return"/></a></div>
	
	
		<!--
			para sesiones
			<c:set var="theUltimateAnswer" value="${41+1}" scope="session"  />
		-->
	</body>
</html>