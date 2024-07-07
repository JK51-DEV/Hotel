<%@page import="java.util.List"%>
<%@page import="presentacion.Presentador"%>
<%@page import="servicio.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    servicio.ServAlojamiento_Service service = new servicio.ServAlojamiento_Service();
    servicio.ServAlojamiento port = service.getServAlojamientoPort();

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Proceso de Alojamiento</title>
        <link href="_sweetAlert/sweetalert.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-ui/1.12.1/i18n/datepicker-es.js"></script>
        <%@include file="_referencias.jsp" %>
    </head>
    <body>
        <%@include file="_menu.jsp" %> 
        <% Presentador pres = (Presentador) session.getAttribute("pres"); %>
        <%-- Object[] fil2 = pres.getFil2(); %>
        <% String msg = pres.getMsg(); --%>
        <div class="container">
            <h1>Proceso de Venta</h1>
            <form >
                <table>
                    <%  String codigo = port.codigoautomaticoaloj();
                    %>

                    <tr>
                        <td>Codigo de Alojamiento:  </td>
                        <td><input class="form-control" value="<%=codigo%>" type="text" id="aloj" name="aloj" required></td>
                    </tr>

                    <tr>
                        <td>Empleado : </td>
                        <td><input class="form-control" type="text" value="${nombreAdmin}" id="emp_nom" name="emp_nom" required></td>
                    </tr>
                    <tr>
                        <td>DNI de Empleado : </td>
                        <td><input class="form-control" type="text" value="${txtdniAdmin}" id="emp_dni" name="emp_dni" required></td>
                    </tr>
                    <td>Codigo de reserva</td>
                    <td>
                        <input class="form-control" type="text" name="cod" id="cod" size="" />
                    </td>
                    <td>
                        <button class="btn btn-info" type="button" onclick="agregarAlojamiento()">Busqueda de Reserva</button>
                    </td>
                    </tr>

                    <table>
                        <br> 
                        <h4>Detalle de reserva:  </h4>
                        <%                        List<Alojamiento> dis = port.resumenAlojamiento();
                            for (Alojamiento l : dis) {
                        %>  
                        <tr>
                        <br>
                        <td>Codigo de reserva:</td>
                        <td>
                            <input class="form-control" type="text" name="" size="" value="<%=l.getReserva().getCodRes()%>" readonly/>

                        </td>
                        <td>Dni Cliente:</td>
                        <td>
                            <input class="form-control" type="text" name="" size="" value="<%=l.getReserva().getCli().getDni()%>" readonly/>

                        </td>

                        <td>Nombre Cliente: </td>
                        <td><input class="form-control" type="text" name="" size="" value="<%=l.getReserva().getCli().getNom()%>" readonly/> </td>

                        </tr>
                        <tr>
                            <td>Codigo de habitacion:</td>
                            <td>
                                <input class="form-control" type="text" name="" size="" value="<%=l.getReserva().getHab().getCod()%>" readonly/>
                            </td>
                            <td>Nombre de habitacion:</td>
                            <td>
                                <input class="form-control" type="text" name="" size="" value="<%=l.getReserva().getHab().getNom()%>" readonly/>
                            </td>
                            <td>Precio de habitacion:</td>
                            <td>
                                <input class="form-control" type="text" name="" size="" value="<%=l.getReserva().getHab().getPre()%>" readonly/>
                            </td>
                        </tr>
                        <tr>
                            <td>Fecha de reserva:</td>
                            <td>
                                <input class="form-control" type="text" name="" size="" value="<%=l.getReserva().getFecCreacion()%>" readonly/>
                            </td>
                        </tr>
                        <tr>
                            <td>Fecha de inicio de reserva: </td>
                            <td>
                                <input class="form-control" type="text" name="" size="" value="<%=l.getReserva().getFecInicio()%>" readonly/>
                            </td>
                            <td>Fecha de fin de reserva: </td>
                            <td>
                                <input class="form-control" type="text" name="" size="" value="<%=l.getReserva().getFecFin()%>" readonly/>
                            </td>
                        </tr>
                        <tr>
                            <td>Importe :</td>
                            <td>
                                <input class="form-control" type="text" name="" size="" value="<%=l.getReserva().getImp()%>"  readonly/>
                            </td>
                        </tr>
                        <%
                            }
                        %>

                    </table>
                    <tr>
                        <td colspan="0"></td>
                        <td>
                            <button class="btn btn-danger" type="button" onclick="eliminarResumenAloj()">Eliminar Resumen</button>
                            <br><br>
                            <button class="btn btn-info" type="button" onclick="registrarAlojamiento()">Registrar Alojamiento</button>
                            <br>
                            <br>
                            <br>


                        </td>

                    </tr>

                    <br>
                </table>
            </form>
        </div>

        <script src="_sweetAlert/sweetalert.js" type="text/javascript"></script>
        <script src="_sweetAlert/sweetalert.min.js" type="text/javascript"></script>
    </body>
    <script>
                                agregarAlojamiento = function () {
                                    $.post('Agregar_alojamiento', {
                                        emp_dni: $('#emp_dni').val(),
                                        cod: $('#cod').val()
                                    }, function (res) {
                                            window.location = '/HotelCliente/alojamiento_empleado.jsp';
                                    });
                                };
    </script>
    <script>
        function eliminarResumenAloj() {
            $.post('Resumen_alojamiento_eliminar', function (res) {
                //swal("Resumen eliminado!", res, "success");
                setTimeout(function () {
                    window.location = '/HotelCliente/vistaAlojamiento.jsp';
                }, 1200);
            });
        }
    </script>
    <script>
        function registrarAlojamiento() {
            $.post('Resumen_alojamiento_guardar', function (res) {
                swal("Alojamiento registrado!", res, "success");
                eliminarResumenAloj();
                setTimeout(function () {
                    window.location = '/HotelCliente/vistaAlojamiento.jsp';
                }, 1200);
            });
        }
    </script>
</html>
