<html>
<head>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
</head>
<body>
   <style>
      .error {
         color: #ff0000;
      }

      .errorblock {
         color: #000;
         background-color: #ffEEEE;
         border: 3px solid #ff0000;
         padding: 8px;
         margin: 16px;
      }
   </style>
<form:form action="apellido" method="POST" modelAttribute="datos" path="datos" enctype="multipart/form-data" commandName="datosDto">
	<form:input id="nombre" path="nombre" />
	<form:errors path="*" cssClass = "error"/>
	<form:input id="apellido" path="apellidos" />
	
	<form:errors path="*" class="has-error" />
	<form:button value="enviar" >enviar</form:button>
</form:form>
</body>
</html>