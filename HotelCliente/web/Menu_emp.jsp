<%-- 
    Document   : Menu
    Created on : 22-abr-2024, 0:33:10
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="_css_js/estilos_emp.css" rel="stylesheet" type="text/css"/>
        <%@include file="_referencias.jsp" %> 
    </head>
    <body>
        <%@include file="_menu.jsp" %> 
        <div id="cuadro">
            <center><p id="titulo">BIENVENIDO AL HOTEL</p></center>
            <br/>
            <center><label id="subtitulo3">INICIAR SESIÓN</label></center>
            <br/>
            <button id="boton" onclick="window.location.href = 'login_emp.jsp'">Ingresar</button>
            <br/><br/>
            <center><label id="subtitulo3">REGISTRARSE</label></center>
            <br/>
            <button id="boton" onclick="window.location.href = 'registrarCliente_emp.jsp'">Registrar</button>
            <br/><br/>
            <%--<center><label id="subtitulo4">RESERVAR HABITACIÓN</label></center>
            <br/>
            <button id="boton" onclick="window.location.href = 'vistaHabitaciones.jsp'">Reservar</button>--%>
            <br/><br/>

        </div>
    </body>
</html>

