<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="servicio.*" %>
    <%-- start web service invocation --%><hr/>
       <%-- start web service invocation --%><hr/>
    <%
	servicio.ServicioFactura_Service service = new servicio.ServicioFactura_Service();
	servicio.ServicioFactura port = service.getServicioFacturaPort();
	// TODO process result here
	
    %>
    <%-- end web service invocation --%><hr/>

    
<!DOCTYPE html>
<html>
    <head>
       <meta charset="UTF-8">
        <title>Inicio</title>
        <link href="_sweetAlert/sweetalert.css" rel="stylesheet" type="text/css"/>
        <link href="_css_js/fondo.css" rel="stylesheet" type="text/css"/>
        <%@include file="_referencias.jsp" %> 
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%@include file="_menu.jsp" %> 
        <div class="container">
            <h4>Facturas</h4>
            
            <table>
                <tr>
                    <td style="padding: 0px">Ingresar filtro:</td>
                    <td style="padding: 10px">Factura: </td>
                    <td style="padding: 10px">
                    <input class="form-control" id="factura" name="factura" size="8" required>
                    </td>
                    
                    <td style="padding: 10px"><button class="btn btn-primary" onclick="buscar_factura()">Buscar</button></td>
                </tr>
            </table>
            </table> 
            <table class="table table-bordered">
                <thead style="background-color: black; color: white">
                    <tr>
                        <th>Código</th>
                        <th>Dni Cliente</th>
                        <th>Cliente</th>
                        <th>Habitacion</th>
                        <th>Codigo Compra</th>
                        <th>Fecha Facturacion</th>
                        <th>Total</th>
                        <th>Accion</th>
                    </tr>
                </thead>
                <tbody id="tabla1">
                   <%
                       List<Factura> fac = port.listarfacturas();
                       for (Factura l : fac) {
                   %>  
                   <tr>
                       <td><%=l.getCodfac()%></td>
                       <td><%=l.getCliente().getDni()%></td>
                       <td><%=l.getCliente().getNom()%></td>
                       <td><%=l.getAloj().getReserva().getHab().getNom()%></td>
                       <td><%=l.getComp().getNum()%></td>
                       <td><%=l.getFecfacturacion()%></td>
                       <td><%=l.getTot()%></td>
                       <td class="text-center">
                           <button class="btn btn-info" onclick="accionFactura()">Generar Factura</button>
                       </td>
                       </td>
                   </tr>
                   <%  
                       }
                   %>
                </tbody>
            </table>
        </div>
    </body>
    <script>
        buscar_factura = function () {
            var factura = $("#factura").val();
            $.post('buscar_Factura', {
                factura: factura
            }, function (res) {
                $('#tabla1').html(res);
            });
        };
        
        function accionFactura() {
            window.location.href = 'Factura.jsp';
        }
    </script>
</html>
