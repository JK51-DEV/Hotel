<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="servicio.*" %>
<%
    ServReserva_Service server = new ServReserva_Service();
    ServReserva port = server.getServReservaPort();


%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Inicio</title>
        <link href="_sweetAlert/sweetalert.css" rel="stylesheet" type="text/css"/>
        <%@include file="_referencias_cli.jsp" %> 
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%@include file="_menu_cli.jsp" %> 
        <div class="container">
            <h4>Resumen de Reserva</h4>
            <%--<button class="btn btn-success" type="button" onclick="location.href = 'index_nuevo.jsp'">Nuevo</button>--%>

            <%--<table>
                <tr>
                    <td style="padding: 0px">Seleccionar filtro:</td>
                    <td style="padding: 10px">Fabricante</td>
                    <td style="padding: 10px">
                        <select class="form-control" id="fabricnate" name="fabricnate" size="1" required>
                            <option value="">------</option>
                            <% for (Fabricante f : fab) {%>
                            <option value="<%=f.getIdFb()%>" ><%=f.getDescripcionFb()%></option>
                            <%  }%>
                        </select>
                    </td>
                    <td style="padding: 10px">Categoria</td>
                    <td style="padding: 10px">
                        <select class="form-control" id="categoria" name="categoria" size="1" required>
                            <option value="">------</option>
                            <% for (Categoria c : cat) {%>
                            <option value="<%=c.getIdCt()%>" ><%=c.getDescripcionCt()%></option>
                            <%  }%>
                        </select>
                    </td>
                    
                    <td style="padding: 10px"><button class="btn btn-primary" onclick="buscar_dis()">Buscar</button></td>
                </tr>
            </table>--%>
            <table>
                <%                        String dise = port.codigoautomatico();
                %>
                <tr>
                    <td style="padding: 0px">Codigo de reserva:</td>
                    <td style="padding: 10px"><%=dise%></td>
                </tr>
                <%                        List<Reserva> dis = port.resumenReserva();
                    for (Reserva l : dis) {
                %>  
                <tr>
                    <td style="padding: 0px">DNI:</td>
                    <td style="padding: 10px"><%=l.getCli().getDni()%></td>
                </tr>
                <tr>
                    <td style="padding: 0px">Nombre:</td>
                    <td style="padding: 10px"><%=l.getCli().getNom()%></td>
                </tr>
                <tr>
                    <td style="padding: 0px">Codigo de habitaciòn:</td>
                    <td style="padding: 10px"><%=l.getHab().getCod()%></td>
                </tr>
                <tr>
                    <td style="padding: 0px">Nombre de habitaciòn:</td>
                    <td style="padding: 10px"><%=l.getHab().getNom()%></td>
                </tr>
                <tr>
                    <td style="padding: 0px">Precio de habitaciòn:</td>
                    <td style="padding: 10px"><%=l.getHab().getPre()%></td>
                </tr>
                <tr>
                    <td style="padding: 0px">Fecha de inicio:</td>
                    <td style="padding: 10px"><%=l.getFecInicio()%></td>
                </tr>
                <tr>
                    <td style="padding: 0px">Fecha de fin:</td>
                    <td style="padding: 10px"><%=l.getFecFin()%></td>
                </tr>
                <%                        String di = port.getTotal();
                %>
                <tr>
                    <td style="padding: 0px">Importe total:</td>
                    <td style="padding: 10px"><%=di%></td>
                </tr>
                <tr>
                    <td colspan="0"></td>
                    <td>
                        <button class="btn btn-danger" type="button" onclick="eliminarResumen()">Eliminar Resumen</button>
                        <br><br>
                        <button class="btn btn-info" type="button" onclick="registrarReserva()">Registrar Reserva</button>
                    </td>
                </tr>
                <%
                    }
                %>
            </table>
        </div>
    </body>
    <script src="_sweetAlert/sweetalert.js" type="text/javascript"></script>
    <script src="_sweetAlert/sweetalert.min.js" type="text/javascript"></script>
    <script>
                            dis_eliminar = function (id) {
                                swal({
                                    tittle: "Estas seguro de eliminar?",
                                    text: "Una vez eliminado no se podra recuperar!",
                                    type: "warning",
                                    showCancelButton: true,
                                    confirmButtonClass: "btn-danger",
                                    confirmButtonText: "Si, Eliminar!",
                                    cancelButtonText: "No, Cancelar!",
                                    closeOnConfirm: false,
                                    closeOnCancel: false
                                },
                                        function (isConfirm) {
                                            if (isConfirm) {
                                                $.post('dis_eliminar.do', {
                                                    id: id
                                                }, function (res) {
                                                    swal("Alerta del sistema!", res, "success");
                                                    setTimeout(function () {
                                                        window.location = '/TutorialCliente/index.jsp';
                                                    }, 1200);
                                                });
                                            } else {
                                                swal("Cancelado", "Cancelaste esto :)", "error");
                                            }
                                        });
                            };
    </script>
    <script>
        buscar_dis = function () {
            var dni_cliente = $("#dni_cliente").val();
            $.post('dis_buscar_reserva', {
                dni_cliente: dni_cliente
            }, function (res) {
                $('#tabla1').html(res);
            });
        };
    </script>
    <script>
        function eliminarResumen() {
            // Enviar una solicitud POST al controlador correspondiente
            $.post('Resumen_reserva_eliminar', function (res) {
                // Mostrar un mensaje o realizar alguna acción adicional si es necesario
                //swal("Resumen eliminado!", res, "success");
                setTimeout(function () {
                    window.location = '/HotelCliente/vistaHabitaciones_cli.jsp';
                }, 1200);
            });
        }
    </script>
    <script>
        function registrarReserva() {
            // Enviar una solicitud POST al controlador correspondiente
            $.post('Resumen_reserva_guardar', function (res) {
                // Mostrar un mensaje o realizar alguna acción adicional si es necesario
                swal("Reserva registrada!", res, "success");
                eliminarResumen();
                setTimeout(function () {
                    window.location = '/HotelCliente/vistaHabitaciones_cli.jsp';
                }, 1200);
            });
        }
    </script>
</html>
