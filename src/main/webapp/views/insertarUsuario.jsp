<html>
<head>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

</head>
<body>

fdsfd${error}


<form:form action="insertarUsuario" method="POST" modelAttribute="usuariosForm" path="usuariosForm">
	<form:input id="nombre" path="nombre" />
	<form:input id="dni" path="dni" />
	<form:button value="enviar" >enviar</form:button>
</form:form>
</body>
</html> 