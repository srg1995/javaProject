<html>
<head>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

</head>
<body>

<h1>INTRODUCE EL NOMBRE DE USUARIO QUE QUIERES ELIMINAR</h1>

${error}
${campoVacio}

<form:form action="eliminarUsuario" method="POST" modelAttribute="usuariosForm" path="usuariosForm">
	<form:input id="nombre" path="nombre" />
	<form:button value="enviar" >eliminar</form:button>
</form:form>
</body>
</html> 