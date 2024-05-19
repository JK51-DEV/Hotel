<%-- 
    Document   : CrearCliente
    Created on : 22-abr-2024, 21:45:43
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="servicio.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo dispositivo</title>
        <link href="_sweetAlert/sweetalert.css" rel="stylesheet" type="text/css"/>
        <%@include file="_referencias.jsp" %> 
        <style>
            td { padding: 10px;}
        </style>
    </head>
    <body>
        <%@include file="_menu.jsp" %> 
        <div class="container">
            <br>
            <h4>Registro de nuevo dispositivo</h4>
            <table>
                <tr>
                    <td>Serie: </td>
                    <td><input class="form-control" type="text" id="dni" name="dni" required></td>
                    <td>Descripcion: </td>
                    <td><input class="form-control" type="text" id="nom" name="nom" required></td>
                    <%--<td>Precio: </td>
                    <td><input class="form-control" type="text" id="prec" name="prec" required></td>--%>
                </tr>
                <%
                    Servicios server = new Servicios();
                    ServiciosCliente port = server.getServiciosClientePort();

                %>
                <%--<tr>
                    <td>Categoria:</td>
                    <td>
                        <select class="form-control" id="cat" name="cat" size="1" required>
                            <option value="">Seleccione</option>
                            <% for (Categoria c : cat) {%>
                            <option value="<%=c.getIdCt()%>" ><%=c.getDescripcionCt()%></option>
                            <%  }%>
                        </select>
                    </td>
                    <td>Fabricante:</td>
                    <td>
                        <select class="form-control" id="fab" name="fab" size="1" required>
                            <option value="">Seleccione</option>
                            <% for (Fabricante f : fab) {%>
                            <option value="<%=f.getIdFb()%>" ><%=f.getDescripcionFb()%></option>
                            <%  }%>
                        </select>
                    </td>
                </tr>--%>
                <tr>
                    <td colspan="0"></td>
                    <td>
                        <a class="btn btn-primary" href="/TutorialCliente/">Cancelar</a>
                        <button class="btn btn-info" type="button" onclick="grabarCliente()">Registrar</button>
                    </td>
                </tr>
            </table>
        </div>
    </body>
    <script src="_sweetAlert/sweetalert.js" type="text/javascript"></script>
    <script src="_sweetAlert/sweetalert.min.js" type="text/javascript"></script>
    <script>
        grabarCliente = function (){
            $.post('Control', {
                  dni: $('#dni').val(),
                  nom: $('#nom').val()
                }, function (res){
                    swal("Bien hecho!",res,"success");
                        setTimeout(function (){
                            window.location = '/HotelCliente/vistaCliente.jsp';
                        },1200);
                    });
        };
    </script>
</html>
