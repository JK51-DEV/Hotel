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
        <div class="slogan">Factura de Reserva Anulada</div>
      </div>
      <div class="col-4 text-right">
          <a href="vistaReservasxAnular.jsp">Volver</a>
          <a href="javascript:window.print()">Imprimir</a>
      </div>
    </div>
  </div>
</div>

<header class="row">
  <div class="logoholder text-center">
      <img src="https://wimbledon-hotel.com/wp-content/uploads/2022/08/cropped-logo-hwimbledon.png" alt="Hotel Wimbledon Logo">
  </div>
  <div class="me"></div>
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
  </div>
  <div class="col-2 text-right details">
    <p>
      Fecha de Creación: <%= request.getParameter("fCreacion") %><br>
      Reserva #: <%= request.getParameter("codRes") %><br>
      Fecha de Inicio: <%= request.getParameter("fInicio") %><br>
      Fecha de Fin: <%= request.getParameter("fFin") %>
    </p>
  </div>
  <div class="col-2">
    <p class="client">
      <strong>Cobrar a</strong><br>
      Cliente: <%= request.getParameter("nombre") %><br>
      DNI: <%= request.getParameter("dni") %>
    </p>
  </div>
</div>

<div class="invoicelist-body">
  <table>
    <thead>
      <tr>
        <th width="5%">Código</th>
        <th width="60%">Descripción</th>
        <th width="10%">Cantidad</th>
        <th width="15%">Precio Unitario</th>
        <th width="10%">Total</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td><%= request.getParameter("habitacion") %></td>
        <td>Reserva Anulada</td>
        <td>1</td>
        <td>S/. <%= request.getParameter("precio") %></td>
        <td>S/. <%= request.getParameter("precio") %></td>
      </tr>
    </tbody>
  </table>
</div>

<div class="invoicelist-footer">
  <table>
    <tr>
      <td><strong>Total:</strong></td>
      <td>S/. <%= request.getParameter("precio") %></td>
    </tr>
  </table>
</div>

<div class="note" contenteditable>
  <h2>Nota:</h2>
  <p>Esta factura corresponde a una reserva anulada.</p>
</div>

<footer class="row">
  <div class="col-1 text-center">
    <p class="notaxrelated" contenteditable>El monto de la factura no incluye el impuesto sobre las ventas.</p>
  </div>
</footer>
</body>
</html>