<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="servicio.*" %>
   
    <%-- start web service invocation --%><hr/>
    <%
	servicio.ServAlojamiento_Service service = new servicio.ServAlojamiento_Service();
	servicio.ServAlojamiento port = service.getServAlojamientoPort();
	 
    %>
    
    <%-- end web service invocation --%><hr/>

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
        .card {
            width: 80%; /* Ancho ajustado del card */
            margin-bottom: 20px;
        }
        .search-box {
            display: flex;
            justify-content: center;
            margin-bottom: 20px;
        }
        .search-box input {
            width: 150px; /* Ancho ajustado del input */
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
            overflow-x: auto; /* Para manejar el desbordamiento horizontal */
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
        .btn-container {
            display: flex;
            justify-content: center;
            margin-top: 10px;
        }
        .btn-container button {
            margin: 0 5px; /* Espacio entre los botones */
        }
        .div2{
            width: 100%;
        }
        .div1{
            margin-right: 35px;
        }
        .btncli{
            margin-right: 35px;
            margin-left: -10px;
        }
        </style>
    </head>
    <body>
        <%@include file="_menu.jsp" %>
        <div class="container">
            <div class="card">
        <div class="card-body">
            <h3 class="card-title"> Nueva Factura </h3>
            <div class="search-box">
                <input class="form-control" id="dni_cliente" name="dni_cliente" size="8" placeholder="DNI" required>
                <button class="btn btn-primary btncli" onclick="buscar_aloj_factura2(); buscar_compra_factura()">Buscar Cliente</button>
                <button class="btn btn-success" onclick="generarFactura()">Generar Factura</button>
            </div>
            
                <%-- start web service invocation --%><hr/>
    
    <%-- end web service invocation --%><hr/>

            
            <div class="info-section div2">
                    <h5>Datos de Alojamiento</h5>
                    <div class="consumo-list">
                        <table class="table table-bordered">
                            <thead class="thead-dark">
                                <tr>
                                    <th>Código: </th>
                                    <th>Fecha de Alojamiento:</th>
                                    <th>Reserva:</th>
                                    <th>DNI:</th>
                                    <th>Nombre:</th>
                                    <th>Habitación:</th>
                                    <th>Descripción:</th>
                                    <th>Precio: </th>
                                    <th>Fecha de Reserva:</th>
                                    <th>Fecha de Inicio:</th>
                                    <th>Fecha de Finalización:</th>
                                    <th>Dias de estadia:</th>
                                    <th>Importe:</th>
                                </tr>
                            </thead>
                            <tbody id="tabla1">
                                <tr>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
                
                <div class="info-section div2">
                    <h5>Datos de Consumo</h5>
                    <div class="consumo-list">
                        <table class="table table-bordered">
                            <thead class="thead-dark">
                                <tr>
                                    <th>Código de Compra</th>
                                    <th>Dni del cliente</th>
                                    <th>Fecha de compra</th>
                                    <th>Total de compra</th>
                                </tr>
                            </thead>
                            <tbody id="tabla2">
                                <tr>
                                    
                                </tr>
                                <!-- Aquí se pueden agregar más filas de consumo si es necesario -->
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div></div></div> <br><br>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <script src="_sweetAlert/sweetalert.js" type="text/javascript"></script>
        <script src="_sweetAlert/sweetalert.min.js" type="text/javascript"></script>
        <script>
            function buscar_aloj_factura2() {
                var dni_cliente = $("#dni_cliente").val();
                $.post('buscarAlojamiento_Factura', {
                    dni_cliente: dni_cliente
                }, function (res) {
                    // Actualizar la tabla con las reservas obtenidas
                    $('#tabla1').empty(); // Limpiamos el contenido anterior de la tabla

                    // Insertamos las nuevas filas obtenidas del servidor
                    $('#tabla1').html(res);
                });
            }
            
            function buscar_compra_factura() {
                var dni_cliente = $("#dni_cliente").val();
                $.post('buscarConsumo_Factura', {
                    dni_cliente: dni_cliente
                }, function (res) {
                    // Actualizar la tabla con las reservas obtenidas
                    $('#tabla2').empty(); // Limpiamos el contenido anterior de la tabla

                    // Insertamos las nuevas filas obtenidas del servidor
                    $('#tabla2').html(res);
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