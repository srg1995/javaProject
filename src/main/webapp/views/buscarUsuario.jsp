<html>
<head>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

</head>
<body>


<form:form action="listadoUsuario" method="POST" modelAttribute="usuarioDto" path="usuarioDto">
	<form:input id="nombre" path="nombre" />
	<form:button value="enviar" >enviar</form:button>
</form:form>

${error}
${usuario.nombre}
${usuario.dni}

</body>
</html>