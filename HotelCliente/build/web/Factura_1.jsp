
<%@page import="servicio.ServiciosCliente"%>
<%@page import="servicio.Servicios"%>
<%@page import="java.util.List"%>
<%@page import="servicio.Factura"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            String codfac = request.getParameter("codfac");
        %>
  
  <div class="col-2 text-right details">
       <%
            servicio.ServicioFactura_Service service = new servicio.ServicioFactura_Service();
            servicio.ServicioFactura port = service.getServicioFacturaPort();
            List<Factura> factura = port.listarFactura(codfac);
             for (Factura d : factura) {
            %>
    <p>
      Fecha: <%= d.getFecfacturacion() %><br>
      Factura # :  <%= codfac %><br>
      <!--Vence: <input class="twoweeks" type="text"/>-->
    </p>
  </div><!--.col-->
  
  <div class="col-2">
           
    <p class="client">
      <strong>Cobrar a</strong><br>
      CLIENTE:  <%=  d.getCliente().getNom() %><br>
      DNI: <%=  d.getCliente().getDni() %>
    </p>
  </div>
    <!--
  
  <div class="col-2">
   
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
        <td width='5%'> <span><%=  d.getAloj().getReserva().getHab().getCod() %></span></td> <!--<a class="control removeRow" href="#">x</a>-->
        <td width='60%'><span>Habitación: <%=  d.getAloj().getReserva().getHab().getNom() %></span></td>
        <td class="amount"><input type="text"/><%=  d.getAloj().getReserva().getDia() %></td>
        <td class="rate"><%=d.getAloj().getReserva().getHab().getPre() %></td>
        <td class="tax taxrelated" value="0"></td>
        <td class="sum"><%=d.getAloj().getReserva().getImp() %></td>
      </tr>
      <tr>
        <td width='5%'> <span><%=  d.getComp().getNum() %></span></td> <!--<a class="control removeRow" href="#">x</a>-->
        <td width='60%'><span>Consumo durante la estadia</span></td>
        <td class="amount"><input type="text"/>#</td>
        <td class="rate"><%=d.getComp().getTot() %></td>
        <td class="tax taxrelated" value="0"></td>
        <td class="sum"><%=d.getComp().getTot() %></td>
      </tr>
    </tbody>
  </table>
</div><!--.invoice-body-->

<div class="invoicelist-footer">
  <table>
    <tr class="taxrelated">
      <td>IVA:</td>
      <td id="total_tax">0</td>
    </tr>
    <tr>
      <td><strong>Total:</strong></td>
      <td id="total_price"><%=d.getTot() %></td>
    </tr>
  </table>
</div>
<% 
                    } // Fin del bucle for
            %>
            
<div class="note" contenteditable>
  <h2>Nota:</h2>
  <script>
        // Función para mostrar una alerta
        function mostrarAlerta() {
            alert("No se encontraron facturas relacionadas.");
        }
    </script>
</div><!--.note-->

<footer class="row">
  <div class="col-1 text-center">
    <p class="notaxrelated" contenteditable>El monto de la factura no incluye el impuesto sobre las ventas.</p>
    
  </div>
</footer>