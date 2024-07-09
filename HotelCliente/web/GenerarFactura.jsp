<%-- 
    Document   : GenerarFactura
    Created on : 08/07/2024, 03:18:41 AM
    Author     : Lume
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Generar Factura</title>
        <link href="_sweetAlert/sweetalert.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-ui/1.12.1/i18n/datepicker-es.js"></script>
        <%@include file="_referencias.jsp" %>
    </head>
    <body>
        <%@include file="_menu.jsp" %> 
         <div class="container">
            <div class="card">
        <div class="card-body">
            <h3 class="card-title">Generar Factura</h3>
    
       <form method="post" action="generar_factura">
    <label for="dniCliente">DNI Cliente:</label>
    <input type="text" id="dniCliente" name="dniCliente" required><br><br>

    <label for="codigoReserva">Código de Reserva:</label>
    <input type="text" id="codigoReserva" name="codigoReserva" required><br><br>

    <label for="numeroCompra">Número de Compra:</label>
    <input type="text" id="numeroCompra" name="numeroCompra" required><br><br>

    <input type="submit" class="btn btn-success" id="generarFacturaBtn" value="Generar Factura">
</form>
        </div> </div> </div> <br><br>
</body>
<script>
    $(document).ready(function() {
        $('#generarFacturaBtn').click(function(event) {
            event.preventDefault(); // Evitar comportamiento por defecto del botón (enviar formulario)

            var dni = $('#dniCliente').val();
            var reser = $('#codigoReserva').val();
            var compra = $('#numeroCompra').val();

            $.post('generar_factura', {
                dniCliente: dni,
                codigoReserva: reser,
                numeroCompra: compra
            }, function(response) {
                $('#resultContainer').html('Resultado = ' + response);
                // Redirigir a otra página si se completan todos los datos
                if (dni && reser && compra) {
                    window.location.href = 'Factura.jsp'; // Ajusta la ruta según la estructura de tu proyecto
                }
            }).fail(function() {
                $('#resultContainer').html('Error al generar la factura.');
            });
        });
    });
</script>
 

    
    
</html>
