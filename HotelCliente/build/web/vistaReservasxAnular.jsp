<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="servicio.*"%>
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
        <%@include file="_referencias.jsp" %>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%@include file="_menu.jsp" %>
        <div class="container">
            <div class="card">
                <div class="card-body">
                    <h3 class="card-title">Gestión de Reservas por anularse</h3>
                    <table class="table table-bordered">
                        <thead style="background-color: black; color: white">
                            <tr>
                                <th>Código</th>
                                <th>DNI</th>
                                <th>Nombre</th>
                                <th>Habitación</th>
                                <th>H. Tipo</th>
                                <th>Precio Ind.</th>
                                <th>F. Creacion</th>
                                <th>Estado</th>
                                <th>F. Inicio</th>
                                <th>F. Fin</th>
                                <th>Importe</th>
                                <th>Acción</th>
                            </tr>
                        </thead>
                        <tbody id="tabla1">
                            <% 
                                List<Reserva> dis = port.listarReservasAnuladas();
                                for (Reserva l : dis) {
                            %>  
                            <tr>
                                <td><%= l.getCodRes() %></td>
                                <td><%= l.getCli().getDni() %></td>
                                <td><%= l.getCli().getNom() %></td>
                                <td><%= l.getHab().getCod() %></td>
                                <td><%= l.getHab().getNom() %></td>
                                <td><%= l.getHab().getPre() %></td>
                                <td><%= l.getFecCreacion() %></td>
                                <td><%= l.getEstado() %></td>
                                <td><%= l.getFecInicio() %></td>
                                <td><%= l.getFecFin() %></td>
                                <td>S/. <%= l.getImp() %></td>
                                <td class="text-center">
                                    <a class="btn btn-success confirmar-btn" href="#" data-codres="<%= l.getCodRes() %>">Confirmar</a>
                                    <a class="btn btn-primary" href="FacturasAnuladas.jsp?codRes=<%= l.getCodRes() %>&dni=<%= l.getCli().getDni() %>&nombre=<%= l.getCli().getNom() %>&habitacion=<%= l.getHab().getCod() %>&hTipo=<%= l.getHab().getNom() %>&precio=<%= l.getHab().getPre() %>&fCreacion=<%= l.getFecCreacion() %>&fInicio=<%= l.getFecInicio() %>&fFin=<%= l.getFecFin() %>&importe=<%= l.getImp() %>">Crear Factura</a>
                                </td>
                            </tr>
                            <% 
                                }
                            %>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <br><br>
    </body>
    <script src="_sweetAlert/sweetalert.js" type="text/javascript"></script>
    <script src="_sweetAlert/sweetalert.min.js" type="text/javascript"></script>
    <script>
        dis_eliminar = function (id) {
            swal({
                title: "¿Estás seguro de eliminar?",
                text: "¡Una vez eliminado no se podrá recuperar!",
                type: "warning",
                showCancelButton: true,
                confirmButtonClass: "btn-danger",
                confirmButtonText: "Sí, Eliminar!",
                cancelButtonText: "No, Cancelar!",
                closeOnConfirm: false,
                closeOnCancel: false
            },
            function (isConfirm) {
                if (isConfirm) {
                    $.post('dis_eliminar.do', { id: id }, function (res) {
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
            $.post('dis_buscar_reserva', { dni_cliente: dni_cliente }, function (res) {
                $('#tabla1').html(res);
            });
        };
    </script>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script>
        $(document).ready(function() {
            $('.confirmar-btn').click(function(e) {
                e.preventDefault(); // Evitar que el enlace cambie de página
                var codReserva = $(this).data('codres'); // Obtener el código de reserva
                confirmarReserva(codReserva); // Llamar a la función para confirmar la reserva
            });

            function confirmarReserva(codReserva) {
                $.ajax({
                    url: 'confirmarReserva', // Ruta al servlet que maneja la confirmación
                    type: 'POST', // Método HTTP
                    data: { codRes: codReserva }, // Parámetro: código de reserva
                    success: function(response) {
                        alert(response); // Mostrar mensaje de éxito o error
                        setTimeout(function () {
                            window.location = 'vistaReservas.jsp';
                        }, 1200);
                    },
                    error: function(xhr, status, error) {
                        console.error('Error al confirmar la reserva', error);
                        alert('Error al confirmar la reserva');
                    }
                });
            }
        });
    </script>
</html>