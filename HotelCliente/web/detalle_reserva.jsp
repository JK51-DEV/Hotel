
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
        // Recuperar los datos de la URL
        String hab = request.getParameter("hab");
        String email = request.getParameter("email");
        %>
        
        
        
        <h1>RESUMEN DE RESERVA</h1>
        <h2>Numero de habitación: </h2>
        <h2>Cliente: </h2>
        <h2>Fecha de inicio: </h2>
        <h2>Fecha de fin: </h2>
    </body>
</html>
