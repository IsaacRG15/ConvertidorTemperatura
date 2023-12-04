<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link rel="stylesheet" href="resources/css/main.css" type="text/css">

</head>
<body>
<%@ page import="model.CFdatos" %>
<%
    CFdatos dat = (CFdatos) request.getAttribute("user");
%>
<h1>Gracias por suscribirte</h1>
<p> Registro de la información: </p>
<br>
<label>Tipo:</label>
<span><%= dat.getTipo()%></span><br>
<label>Resultado:</label>
<span><%= dat.convertir()%></span><br>


<form action="" method="get">
    <input type="hidden" name="action"  value="registrar"><br>
    <input type="submit" value="Regresar">
</form>

</body>
</html>