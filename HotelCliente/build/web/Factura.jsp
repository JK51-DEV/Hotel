<%-- 
    Document   : Factura
    Created on : 06-jul-2024, 14:58:31
    Author     : Usuario
--%>

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

        <!--<label for="config_tax">IVA:
          <input type="checkbox" id="config_tax" />
        </label>
        <label for="config_tax_rate" class="taxrelated">Tasa:
          <input type="text" id="config_tax_rate" value="13"/>%
        </label>-->
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
  
   <!--
    <p contenteditable>
      <strong>Sistema Web S.A. de C.V.</strong><br>
      234/90, New York Street<br>
      Perú.<br>
      
    </p>

  -->
  <!--.me-->

  <div class="info">
   <p>
      <strong>Hotel Wimbledon</strong><br>
      Av. Costanera 2098, San Miguel 15087<br>
      Perú.<br>
      
    </p>
  </div>
  <!-- .info -->

  <div class="bank">
    <p>
      Web: <a href="login.jpg">wimbledon-hotel.com/</a><br>
      E-mail: <a href="reservas@wimbledon-hotel.com">reservas@wimbledon-hotel.com</a><br>
      Tel: +51 990 370 681<br>
      Twitter: @wimbledon-hotel
    </p>
  </div>
  <!--.bank-->
  
  
  <!--
      <p contenteditable>
      Datos bacarios: <br>
      Titular de la cuenta: <br>
      IBAN: <br>
      BIC:
    </p>

  -->

</header>


<div class="row section">

	<div class="col-2">
    <h1>Factura</h1>
  </div><!--.col-->

  <div class="col-2 text-right details">
    <p>
      Fecha: <input type="text" class="datePicker" /><br>
      Factura #: <input type="text" value="100" /><br>
     Vence: <input class="twoweeks" type="text"/>
    </p>
  </div><!--.col-->
  
  
  
  <div class="col-2">
    

    <p class="client">
      <strong>Cobrar a</strong><br>
      [Nombre cliente]<br>
      [DNI cliente]
    </p>
  </div><!--.col-->
  
  
  <div class="col-2">
   

    <p class="client">
      <strong>Emitido por</strong><br>
      [Nombre empleado]<br>
      [DNI empleado]
    </p>
  </div><!--.col-->

  

</div>
<!--.row-->

<!--<div class="row section" style="margin-top:-1rem">
<div class="col-1">
	<table style='width:100%'>
    <thead contenteditable>
	<tr class="invoice_detail">
      <th width="25%" style="text-align">Vendedor</th>
       <th width="25%">Orden de compra </th>
      <th width="20%">Enviar por</th>
      <th width="30%">Términos y condiciones</th>
	 </tr> 
    </thead>
    <tbody contenteditable>
	<tr class="invoice_detail">
      <td width="25%" style="text-align">John Doe</td>
       <td width="25%">#PO-2020 </td>
      <td width="20%">DHL</td>
      <td width="30%">Pago al contado</td>
	 </tr>
	</tbody>
	</table>
</div>

</div>-->

<!--.row-->

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
        <td width='5%'> <span>12345</span></td> <!--<a class="control removeRow" href="#">x</a>-->
        <td width='60%'><span>Descripción</span></td>
        <td class="amount"><input type="text" value="1"/></td>
        <td class="rate"><input type="text" value="99" /></td>
        <td class="tax taxrelated"></td>
        <td class="sum"></td>
      </tr>
    </tbody>
  </table>
 <!-- <a class="control newRow" href="#">+ Nueva fila</a>-->
</div><!--.invoice-body-->

<div class="invoicelist-footer">
  <table>
    <tr class="taxrelated">
      <td>IVA:</td>
      <td id="total_tax"></td>
    </tr>
    <tr>
      <td><strong>Total:</strong></td>
      <td id="total_price"></td>
    </tr>
  </table>
</div>

<div class="note" contenteditable>
  <h2>Nota:</h2>
</div><!--.note-->

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
