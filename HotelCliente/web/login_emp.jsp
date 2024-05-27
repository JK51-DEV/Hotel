<%-- 
    Document   : login
    Created on : 22-abr-2024, 1:45:35
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="_css_js/estilos_emp.css" rel="stylesheet" type="text/css"/>
        <%
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //Borrar directivas de memoria cache y anular algoritmos predeterminados para almacenar cache 
            response.setHeader("Pragma", "no-cache");//Directivas compatibles con memorias cache 
            response.setDateHeader("Expires", 0);//Proporciona Fecha y hora para decir el tiempo de respuesta caduco 
        %>
        <%@include file="_referencias.jsp" %> 
    </head>
    <body>
        <%@include file="_menu.jsp" %> 
        <div id="cuadro">
            <form action="IniciarSesion" method="Post">
                <center><p id="titulo">INICIAR SESIÓN</p></center>
                <center><label id="subtitulo3">CODIGO DE USUARIO</label></center>
                <br/>
                <input type="text" name="txtdni" value="" id="txtdni" class="entrada"/>
                <br/><br/>
                <center><label id="subtitulo4">NOMBRE DE USUARIO</label></center>
                <br/>
                <input type="text" name="txtnom" id="txtnom" class="entrada"/>
                <br/><br/>
                <input type="submit" name="acce" value="Iniciar Sesion" id="boton"/>
            </form>
            <br/>
            <p id="marca"><a href="registrarCliente_emp.jsp">REGISTRAR</a></p>
            <p ><a href="Menu_emp.jsp" style="color: white; text-decoration: none;">Volver</a></p>
        </div>
    </body>
</html>
