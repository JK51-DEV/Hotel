<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="servicio.*" %>

<%-- start web service invocation --%>
<%
    servicio.ServAlojamiento_Service service = new servicio.ServAlojamiento_Service();
    servicio.ServAlojamiento port = service.getServAlojamientoPort();
%>
<%-- end web service invocation --%>

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
            width: 120%;
            margin-bottom: 20px;
        }
        .search-box {
            display: flex;
            justify-content: center;
            margin-bottom: 20px;
        }
        .search-box input {
            width: 150px;
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
            overflow-x: auto;
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
            margin: 0 5px;
        }
        .div2 {
            width: 100%;
        }
        .div1 {
            margin-right: 35px;
        }
        .btncli {
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
                <h3 class="card-title">Nueva Factura</h3>
                <div class="search-box">
                    <input class="form-control" id="dni_cliente" name="dni_cliente" size="8" placeholder="DNI" required>
                    <button class="btn btn-primary btncli" onclick="buscar_aloj_factura2(); buscar_compra_factura()">Buscar Cliente</button>
                    <button class="btn btn-success" onclick="generarFactura()">Generar Factura</button>
                </div>
                
                <div class="info-section div2">
                    <h5>Datos de Alojamiento</h5>
                    <div class="consumo-list">
                        <table class="table table-bordered">
                            <thead class="thead-dark">
                                <tr>
                                    <th>Código</th>
                                    <th>Fecha de Alojamiento</th>
                                    <th>Reserva</th>
                                    <th>DNI</th>
                                    <th>Nombre</th>
                                    <th>Habitación</th>
                                    <th>Precio</th>
                                    <th>Fecha de Inicio</th>
                                    <th>Fecha de Finalización</th>
                                    <th>Días de estadía</th>
                                    <th>Importe</th>
                                </tr>
                            </thead>
                            <tbody id="tabla1">
                                <!-- Datos cargados por AJAX -->
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
                                    <th>DNI del Cliente</th>
                                    <th>Fecha de Compra</th>
                                    <th>Total de Compra</th>
                                </tr>
                            </thead>
                            <tbody id="tabla2">
                                <!-- Datos cargados por AJAX -->
                            </tbody>
                        </table>
                    </div>
                </div>

                <div class="info-section div2">
                    <h5>Total a Cobrar</h5>
                    <p id="totalGlobal">0.00</p> <!-- Muestra el total global -->
                </div>
            </div>
        </div>
    </div> 
    <br><br>

    <form id="formFactura" action="Factura.jsp" method="post" style="display:none;">
        <input type="hidden" name="dni_cliente" id="form_dni_cliente">
        <input type="hidden" name="datosAlojamiento" id="form_datosAlojamiento">
        <input type="hidden" name="datosConsumo" id="form_datosConsumo">
        <input type="hidden" name="totalCobrar" id="form_totalCobrar"> <!-- Campo añadido -->
    </form>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="_sweetAlert/sweetalert.js" type="text/javascript"></script>
    <script src="_sweetAlert/sweetalert.min.js" type="text/javascript"></script>
    <script>
        function buscar_aloj_factura2() {
            var dni_cliente = $("#dni_cliente").val();
            $.post('buscarAlojamiento_Factura', {
                dni_cliente: dni_cliente
            }, function (res) {
                $('#tabla1').empty();
                $('#tabla1').html(res);
                calcularTotal(); // Calcula el total al cargar los datos
            });
        }
        
        function buscar_compra_factura() {
            var dni_cliente = $("#dni_cliente").val();
            $.post('buscarConsumo_Factura', {
                dni_cliente: dni_cliente
            }, function (res) {
                $('#tabla2').empty();
                $('#tabla2').html(res);
                calcularTotal(); // Calcula el total al cargar los datos
            });
        }
        
        function calcularTotal() {
            var totalImporte = 0;
            var totalCompra = 0;

            $('#tabla1 tr').each(function() {
                var row = $(this);
                var importe = parseFloat(row.find('td').eq(10).text()) || 0;
                totalImporte += importe; // Suma el importe de la reserva
            });

            $('#tabla2 tr').each(function() {
                var row = $(this);
                var total = parseFloat(row.find('td').eq(3).text()) || 0;
                totalCompra += total; // Suma el total de las compras
            });

            var totalCobrar = totalImporte + totalCompra;
            $('#totalGlobal').text(totalCobrar.toFixed(2)); // Muestra el total global en la página
            $('#form_totalCobrar').val(totalCobrar.toFixed(2)); // Establece el total a cobrar en el formulario
        }

        function generarFactura() {
            var dni_cliente = $("#dni_cliente").val();
            if (dni_cliente) {
                var datosAlojamiento = [];
                var datosConsumo = [];

                $('#tabla1 tr').each(function() {
                    var row = $(this);
                    var rowData = {
                        codigo: row.find('td').eq(0).text(),
                        fechaAlojamiento: row.find('td').eq(1).text(),
                        reserva: row.find('td').eq(2).text(),
                        dni: row.find('td').eq(3).text(),
                        nombre: row.find('td').eq(4).text(),
                        habitacion: row.find('td').eq(5).text(),
                        precio: row.find('td').eq(6).text(),
                        fechaInicio: row.find('td').eq(7).text(),
                        fechaFin: row.find('td').eq(8).text(),
                        diasEstadia: row.find('td').eq(9).text(),
                        importe: row.find('td').eq(10).text()
                    };
                    datosAlojamiento.push(rowData);
                });

                $('#tabla2 tr').each(function() {
                    var row = $(this);
                    var rowData = {
                        codigoCompra: row.find('td').eq(0).text(),
                        dniCliente: row.find('td').eq(1).text(),
                        fechaCompra: row.find('td').eq(2).text(),
                        totalCompra: row.find('td').eq(3).text()
                    };
                    datosConsumo.push(rowData);
                });

                $('#form_dni_cliente').val(dni_cliente);
                $('#form_datosAlojamiento').val(JSON.stringify(datosAlojamiento));
                $('#form_datosConsumo').val(JSON.stringify(datosConsumo));

                $('#formFactura').submit();
            } else {
                alert("Por favor, ingrese el DNI del cliente.");
            }
        }
    </script>
</body>
</html>