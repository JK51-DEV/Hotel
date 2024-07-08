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
        <h1>Generar Factura</h1>
    
    <form method="post" action="ruta/a/tu/servlet/o/controlador">
        <label for="dniCliente">DNI Cliente:</label>
        <input type="text" id="dniCliente" name="dniCliente"><br><br>
        
        <label for="codigoReserva">Código de Reserva:</label>
        <input type="text" id="codigoReserva" name="codigoReserva"><br><br>
        
        <label for="numeroCompra">Número de Compra:</label>
        <input type="text" id="numeroCompra" name="numeroCompra"><br><br>
        
        <input type="submit" value="Generar Factura">
    </form>
    </body>
</html>
