<html>
<head>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

</head>
<body>

fdsfd${nombre}
 
  
<form:form action="apellido" method="POST" modelAttribute="categoryOptions" path="categoryOptions">
	<form:input id="nombre" path="nombre" />
	<form:input id="apellido" path="apellidos" />
	<form:button value="enviar" >enviar</form:button>
</form:form>
</body>
</html>