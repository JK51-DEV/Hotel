<%-- 
    Document   : validarCliente
    Created on : 22-abr-2024, 15:52:04
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>¡Usuario validado!</h1>
        <h2>Bienvenido ${nombreAdmin} con el DNI: ${txtdniAdmin}</h2>
        <%--
        <% String msg=(String)session.getAttribute("msg"); %>  
        <h2><%= msg %></h2>
        --%>
        <h3><a href="login.jsp">Volver</a></h3>
    </body>
</html>
