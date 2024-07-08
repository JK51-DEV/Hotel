<%-- 
    Document   : registrarCliente
    Created on : 22-abr-2024, 13:08:49
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="servicio.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="_css_js/registro.css" rel="stylesheet" type="text/css"/>
        <link href="_sweetAlert/sweetalert.css" rel="stylesheet" type="text/css"/>
        <link href="_css_js/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="_css_js/jquery-3.7.1.min.js" type="text/javascript"></script>
        <script src="_css_js/bootstrap.min.js" type="text/javascript"></script>
    </head>
    <body>
        <div id="cuadro">
            <form>
                <p id="titulo">REGISTRO DE CLIENTE</p>
                <hr>
                <br/><br/>
                <center><label id="subtitulo3">CODIGO DE USUARIO</label></center>
                <br/>
                <input type="text" id="dni" name="dni" class="entrada" required/>
                <br/><br/>
                <center><label id="subtitulo4">NOMBRE DE USUARIO</label></center>
                <br/>
                <input type="text" id="nom" name="nom" class="entrada" required/>
                <%
                    Servicios server = new Servicios();
                    ServiciosCliente port = server.getServiciosClientePort();

                %>
                <br/><br/>
                <button id="boton" class="btn btn-info" type="button" onclick="grabarCliente()">Registrar</button>
                <%--<input type="submit" value="Registar" id="boton"/>--%>
            </form>
            <br/>
            <p id="marca"><a href="login.jsp">INGRESAR</a></p>
            <p ><a href="Inicio.jsp" style="color: white; text-decoration: none;">Volver</a></p>
        </div>
    </body>
    <script src="_sweetAlert/sweetalert.js" type="text/javascript"></script>
    <script src="_sweetAlert/sweetalert.min.js" type="text/javascript"></script>
    <script>
                    grabarCliente = function () {
                        $.post('Control', {
                            dni: $('#dni').val(),
                            nom: $('#nom').val()
                        }, function (res) {
                            swal("Bien hecho!", res, "success");
                            setTimeout(function () {
                                window.location = '/HotelCliente/login.jsp';
                            }, 1200);
                        });
                    };
    </script>
</html>
