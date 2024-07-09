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
        <title>Gestión de Reservas</title>
        <link href="_sweetAlert/sweetalert.css" rel="stylesheet" type="text/css"/>
        <%@include file="_referencias.jsp" %>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            .container {
                display: flex;
                flex-direction: column;
                align-items: center;
                margin-top: 20px;
            }
            .search-box {
                display: flex;
                justify-content: center;
                margin-bottom: 20px;
            }
            .search-box input {
                margin-right: 10px;
            }
            .info-box {
                display: flex;
                width: 100%;
                justify-content: space-between;
            }
            .info-section {
                width: 45%;
                border: 1px solid #ccc;
                padding: 10px;
                border-radius: 5px;
                background-color: white;
            }
            .info-section h5 {
                text-align: center;
                margin-bottom: 15px;
            }
            .consumo-list {
                width: 100%;
            }
            .consumo-list table {
                width: 100%;
                border-collapse: collapse;
            }
            .consumo-list th, .consumo-list td {
                border: 1px solid #ccc;
                padding: 8px;
                text-align: left;
            }
            .consumo-list th {
                background-color: #f2f2f2;
            }
        </style>
    </head>
    <body>
        <%@include file="_menu.jsp" %>
        <div class="container">
            <div class="search-box">
                <input class="form-control" id="dni_cliente" name="dni_cliente" size="8" placeholder="DNI" required>
                <button class="btn btn-primary" onclick="buscar_dis()">Buscar Cliente</button>
                <button class="btn btn-success" onclick="generarFactura()">Generar Factura</button>
            </div>
            <div class="info-box">
                <div class="info-section">
                    <h5>Datos de Alojamiento</h5>
                    <p><strong>Código:</strong> A005</p>
                    <p><strong>Fecha de Alojamiento:</strong> 2024-05-28</p>
                    <p><strong>Reserva:</strong> R008</p>
                    <p><strong>DNI:</strong> 88888888</p>
                    <p><strong>Nombre:</strong> Sol</p>
                    <p><strong>Habitación:</strong> H005</p>
                    <p><strong>Descripción:</strong> Triple</p>
                    <p><strong>Precio:</strong> 150.0</p>
                    <p><strong>Fecha de Reserva:</strong> 2024-05-28</p>
                    <p><strong>Fecha de Inicio:</strong> 2024-06-10</p>
                    <p><strong>Fecha de Finalización:</strong> 2024-06-15</p>
                    <p><strong>Importe:</strong> 750.0</p>
                </div>
                <div class="info-section">
                    <h5>Datos de Consumo</h5>
                    <div class="consumo-list">
                        <table>
                            <thead>
                                <tr>
                                    <th>Código de Compra</th>
                                    <th>Código de Producto</th>
                                    <th>Descripción</th>
                                    <th>Precio</th>
                                    <th>Cantidad</th>
                                    <th>Importe</th>
                                </tr>
                            </thead>
                            <tbody id="tablaConsumo">
                                <tr>
                                    <td>C00011</td>
                                    <td>S001</td>
                                    <td>Desayuno Buffet</td>
                                    <td>15.0</td>
                                    <td>2</td>
                                    <td>30.0</td>
                                </tr>
                                <!-- Aquí se pueden agregar más filas de consumo si es necesario -->
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <script src="_sweetAlert/sweetalert.js" type="text/javascript"></script>
        <script src="_sweetAlert/sweetalert.min.js" type="text/javascript"></script>
        <script>
            function buscar_dis() {
                var dni_cliente = $("#dni_cliente").val();
                $.post('dis_buscar_reserva', {
                    dni_cliente: dni_cliente
                }, function (res) {
                    // Actualizar tabla con las reservas obtenidas
                    $('#tabla1').html(res);
                });
            }
            
            function generarFactura() {
                var dni_cliente = $("#dni_cliente").val();
                if (dni_cliente) {
                    // Lógica para generar factura
                    alert("Generando factura para el cliente con DNI: " + dni_cliente);
                } else {
                    alert("Por favor, ingrese el DNI del cliente.");
                }
            }
        </script>
    </body>
</html>