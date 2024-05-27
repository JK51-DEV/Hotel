<%-- 
    Document   : reservaHab
    Created on : 23-abr-2024, 12:38:57
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="servicio.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reserva de Habitacion</title>
        <link href="_sweetAlert/sweetalert.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-ui/1.12.1/i18n/datepicker-es.js"></script>
        <%@include file="_referencias_cli.jsp" %> 
        <style>
            td { padding: 10px;}
        </style>
    </head>
    <body>
        <%@include file="_menu_cli.jsp" %> 
        <div class="container">
            <br>
            <h4>Registro de nueva reserva</h4>
            <table>
                <tr>
                    <%--<td>Codigo: </td>--%>
                    <%--<td><input class="form-control" type="text" id="rese" name="rese" required></td>--%>
                    <td>N. de Habitación: </td>
                    <td><input class="form-control" type="text" id="hab" name="hab" required></td>
                    
                    
                </tr>
                <%
                    Servicios server = new Servicios();
                    ServiciosCliente port = server.getServiciosClientePort();
                    List<Cliente> cat = port.listarCliente();
                %>
                <tr>
                    <td>Cliente:</td>
                    <td>
                        <input class="form-control" type="text" value="${txtdni}" id="cat" name="cat" required>
                       <%-- <select class="form-control" id="cat" name="cat" size="1" required>
                            <option value="">Seleccione</option>
                            <% for (Cliente c : cat) {%>
                            <option value="<%=c.getDni()%>" ><%=c.getDni()%></option>
                            <%  }%>
                        </select>--%>
                    </td>
                    <td>F. de inicio: </td>
                    <td><input class="form-control" type="date" id="fini" name="fini" required></td>
                    <td>F. de fin </td>
                    <td><input class="form-control" type="date" id="ffin" name="ffin" required></td>
                </tr>
                <tr>
                    <td colspan="0"></td>
                    <td>
                        <a class="btn btn-primary" href="/HotelCliente/vistaHabitaciones_cli.jsp">Cancelar</a>
                        <br><br>
                        <button class="btn btn-info" type="button" onclick="RegistrarReserva()">Registrar</button>
                    </td>
                </tr>
            </table>
        </div>
                        
        <script src="_sweetAlert/sweetalert.js" type="text/javascript"></script>
        <script src="_sweetAlert/sweetalert.min.js" type="text/javascript"></script>
        <script>
            $(function() {
                $.datepicker.setDefaults($.datepicker.regional['es']);
                $('#fini').datepicker({
                    dateFormat: 'dd/mm/yy'
                });
                $('#ffin').datepicker({
                    dateFormat: 'dd/mm/yy'
                });
            });

            RegistrarReserva = function () {
                $.post('ControlReservas', {
                    hab: $('#hab').val(),
                    cat: $('#cat').val(),
                    fini: $('#fini').val(),
                    ffin: $('#ffin').val()
                }, function (res) {
                    swal("Bien hecho!", res, "success");
                    setTimeout(function () {
                        window.location = '/HotelCliente/vistaReservas.jsp';
                    }, 1200);
                });
            };
        </script>
    </body>
    
</html>

