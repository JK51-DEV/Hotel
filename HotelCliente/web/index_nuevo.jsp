<%-- 
    Document   : index_nuevo
    Created on : 30-mar-2024, 21:43:46
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
                    <td><input class="form-control" type="text" id="ser" name="ser" required></td>
                    <td>Descripcion: </td>
                    <td><input class="form-control" type="text" id="des" name="des" required></td>
                    <td>Precio: </td>
                    <td><input class="form-control" type="text" id="prec" name="prec" required></td>
                </tr>
                <%
                    Servidor1_Service server = new Servidor1_Service();
                    Servidor1 port = server.getServidor1Port();
                    List<Categoria> cat = port.catListar();
                    List<Fabricante> fab = port.fabListar();
                %>
                <tr>
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
                </tr>
                <tr>
                    <td colspan="0"></td>
                    <td>
                        <a class="btn btn-primary" href="/TutorialCliente/">Cancelar</a>
                        <button class="btn btn-info" type="button" onclick="dis_registrar()">Registrar</button>
                    </td>
                </tr>
            </table>
        </div>
    </body>
    <script src="_sweetAlert/sweetalert.js" type="text/javascript"></script>
    <script src="_sweetAlert/sweetalert.min.js" type="text/javascript"></script>
    <script>
        dis_registrar = function (){
            $.post('dis_registrar.do', {
                  ser: $('#ser').val(),
                  des: $('#des').val(),
                  prec: $('#prec').val(),
                  cat: $('#cat').val(),
                  fab: $('#fab').val()
                }, function (res){
                    swal("Bien hecho!",res,"success");
                        setTimeout(function (){
                            window.location = '/HotelCliente/vistaCliente.jsp';
                        },1200);
                    });
        };
    </script>
</html>
