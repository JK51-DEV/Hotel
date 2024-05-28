<%@page import="java.util.List"%>
<%@page import="presentacion.Presentador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Proceso de Venta</title>
    <%@include file="_referencias.jsp" %> 
</head>
<body>
    <% Presentador pres = (Presentador)session.getAttribute("pres"); %>
    <% String tot = pres.getTot(); %>
    <% Object[] fil = pres.getFil(); %>
    <% List lis = pres.getLis(); %> 
    <% Object[] fil2 = pres.getFil2(); %>
    <% String msg = pres.getMsg(); %>
    <div class="container">
        <h1>Proceso de Venta</h1>
        <table class="table table-bordered">
            <form action="ControlConsumo" method="Post">
                <tr>
                    <td>Numero Venta</td>
                    <td colspan="2">
                        <input class="form-control" type="text" name="cod" size="" value='<%= fil[0] %>' readonly/>
                    </td>
                </tr>
                <tr>
                    <td>Fecha Venta</td>
                    <td colspan="2">
                        <input class="form-control" type="text" name="" size="" value='<%= fil[1] %>' readonly/>
                    </td>
                </tr>
                <tr>
                    <td>Hora Venta</td>
                    <td colspan="2">
                        <input class="form-control" type="text" name="" size="" value='<%= fil[2] %>' readonly/>
                    </td>
                </tr>
                <tr>
                    <td>DNI</td>
                    <td>
                        <input class="form-control" type="text" name="dni" size="" value='<%= fil2[0] %>'/>
                    </td>
                    <td>
                        <input type="submit" name="acc" class="btn btn-primary" value="Buscar Cliente"/>
                    </td>
                </tr>
                <tr>
                    <td>Nombre</td>
                    <td colspan="2">
                        <input class="form-control" type="text" name="" size="" value='<%= fil2[1] %>' readonly/>
                    </td>
                </tr> 
            </form>
        </table>
        <h3><%= msg %></h3>   
        <br>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>Codigo</th>
                    <th>Nombre</th>
                    <th>Precio</th>
                    <th>Cantidad</th>
                    <th>Importe</th>
                </tr>
            </thead>
            <tbody>
                <% for(int i=0; i<lis.size(); i++) { %>
                    <% Object[] f = (Object[])lis.get(i); %>
                    <tr>
                        <td><input class="form-control" type="text" name="cod" size="5" value='<%= f[0] %>' readonly/></td>
                        <td><input class="form-control" type="text" name="" size="20" value='<%= f[1] %>' readonly/></td>
                        <td><input class="form-control" type="text" name="" size="10" value='<%= f[2] %>' readonly/></td>
                        <td><input class="form-control" type="text" name="" size="10" value='<%= f[3] %>' readonly/></td>
                        <td><input class="form-control" type="text" name="" size="10" value='<%= f[4] %>' readonly/></td>                
                    </tr>
                <% } %>
                <tr>
                    <td colspan="5" align="right">Total===><input class="form-control" type="text" name="" size="10" value='<%= tot %>' readonly/></td> 
                </tr>            
            </tbody>
        </table>
        <div id="resumenVenta" class="modal" style="display:none">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Resumen de la Venta</h4>
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                    </div>
                    <div class="modal-body">
                        <p>Cliente: <%= fil2[1] %></p>
                        <p>Productos:</p>
                        <ul>
                            <% for(int i=0; i<lis.size(); i++) { %>
                                <% Object[] f = (Object[])lis.get(i); %>
                                <li><%= f[1] %> - Cantidad: <%= f[3] %>, Precio: <%= f[2] %></li>
                            <% } %>
                        </ul>
                        <p>Total de la venta: <%= tot %></p>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-danger" data-dismiss="modal">Cerrar</button>
                    </div>
                </div>
            </div>
        </div>
        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#resumenVenta">Grabar Venta</button>
        <!-- Botón para regresar a Cesta.jsp -->
        <a href="Cesta.jsp" class="btn btn-secondary">Regresar</a>
    </div>
    <script src="_sweetAlert/sweetalert.js" type="text/javascript"></script>
    <script src="_sweetAlert/sweetalert.min.js" type="text/javascript"></script>
</body>
</html>