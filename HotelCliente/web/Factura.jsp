<%-- 
    Document   : Factura
    Created on : 06-jul-2024, 14:58:31
    Author     : Usuario
--%>

<%@page import="servicio.*"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%-- start web service invocation --%><hr/>
    <%-- end web service invocation --%><hr/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hotel Wimbledon</title>
    <link href="assets/css/main.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="control-bar">
  <div class="container">
    <div class="row">
      <div class="col-2-4">
        <div class="slogan">Facturación </div>
        <script>
        // Función para mostrar una alerta
        function mostrarAlerta() {
            alert("No se encontraron facturas para los parámetros dados.");
        }
    </script>

        <label for="config_note">Nota:
          <input type="checkbox" id="config_note" />
        </label>
        
        
     </div>
      <div class="col-4 text-right">
          <a href="login.jsp">Volver</a>
        <a href="javascript:window.print()">Imprimir</a>
      </div><!--.col-->
    </div><!--.row-->
  </div><!--.container-->
</div><!--.control-bar-->

<header class="row">
  <div class="logoholder text-center" >
      <img src="https://wimbledon-hotel.com/wp-content/uploads/2022/08/cropped-logo-hwimbledon.png">
   <!-- <img src="assets/img/logo.png">-->
  </div><!--.logoholder-->
   <div class="me">
  </div>

   <div class="info">
   <p>
      <strong>Hotel Wimbledon</strong><br>
      Av. Costanera 2098, San Miguel 15087<br>
      Perú.<br>
      
    </p>
  </div>

  <div class="bank">
    <p>
      Web: <a href="login.jpg">wimbledon-hotel.com/</a><br>
      E-mail: <a href="reservas@wimbledon-hotel.com">reservas@wimbledon-hotel.com</a><br>
      Tel: +51 990 370 681<br>
      Twitter: @wimbledon-hotel
    </p>
  </div>
</header>

<div class="row section">

	<div class="col-2">
    <h1>Factura</h1>
  </div><!--.col-->
<% 
                // Obtener la lista de facturas desde el atributo de solicitud
                List<servicio.Factura> facturas = (List<servicio.Factura>) request.getAttribute("facturas");
                
                // Verificar si hay facturas para mostrar
                if (facturas != null && !facturas.isEmpty()) {
                    // Iterar sobre la lista de facturas y mostrar cada una en una fila de la tabla
                    for (servicio.Factura factura : facturas) {
            %>
  <div class="col-2 text-right details">
    <p>
      Fecha: <input type="text" class="datePicker" /><br>
      Factura #: <input type="text" value="1" /><br>
      Vence: <input class="twoweeks" type="text"/>
    </p>
  </div><!--.col-->

  <div class="col-2">
    
    <p class="client">
      <strong>Cobrar a</strong><br>
     
      CLIENTE: <%= factura.getCliente().getNom() %><br> <!-- Ejemplo de acceso al nombre del cliente -->
      DNI: <%= factura.getCliente().getDni() %>
        
    </p>
    
  </div><!--.col-->
           
 <!-- <div class="col-2">
   

    <p class="client">
      <strong>Emitido por</strong><br>
      [Nombre empleado]<br>
      [DNI empleado]
    </p>
  </div><!--.col-->

</div>

<div class="invoicelist-body">
  <table>
    <thead>
      <th width="5%">Código</th>
      <th width="60%">Descripción</th>
      
      <th width="10%">Cant.</th>
      <th width="15%">Precio</th>
      <th class="taxrelated">IVA</th>
      <th width="10%">Total</th>
    </thead>
    <tbody>
      <tr>
        <td width='5%'> <span><%= factura.getRes().getHab().getCod() %></span></td> <!--<a class="control removeRow" href="#">x</a>-->
        <td width='60%'><span>Habitacion: <%= factura.getRes().getHab().getNom() %></span></td>
        <td class="amount"><input type="text"/><%= factura.getRes().getDia() %></td>
        <td class="rate"><%= factura.getRes().getHab().getPre() %></td>
        <td class="tax taxrelated">hola</td>
        <td ><%= factura.getRes().getImp() %></td>
      </tr>
      <tr>
        <td width='5%'> <span><%= factura.getComp().getNum() %></span></td> <!--<a class="control removeRow" href="#">x</a>-->
        <td width='60%'><span>Consumo de la estadia</span></td>
        <td class="amount"><input type="text"/>#</td>
        <td class="rate"><%= factura.getComp().getTot() %></td>
        <td class="tax taxrelated">hola</td>
        <td ><%= factura.getComp().getTot() %></td>
      </tr>
    </tbody>
  </table>
</div><!--.invoice-body-->

<div class="invoicelist-footer">
  <table>
    <tr class="taxrelated">
      <td>IVA:</td>
      <td id="total_tax"></td>
    </tr>
    <tr>
      <td><strong>Total:</strong></td>
      <td ><%= factura.getTot() %></td>
    </tr>
  </table>
</div>

<div class="note" contenteditable>
  <h2>Nota:</h2>
</div><!--.note-->
<% 
                    } // Fin del bucle for
                } else {
            %>
            <script>
                mostrarAlerta()
                </script>
                
            <% } %>
<footer class="row">
  <div class="col-1 text-center">
    <p class="notaxrelated" contenteditable>El monto de la factura no incluye el impuesto sobre las ventas.</p>
    
  </div>
</footer>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="assets/bower_components/jquery/dist/jquery.min.js"><\/script>')</script>
<script src="assets/js/main.js"></script>
</body>
</html>
