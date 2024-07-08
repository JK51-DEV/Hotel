<%@page import="java.util.List"%>
<%@page import="presentacion.Presentador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Proceso de Venta</title>
    <link href="_sweetAlert/sweetalert.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-ui/1.12.1/i18n/datepicker-es.js"></script>
    <%@include file="_referencias.jsp" %> 
    <style>
        td { padding: 10px; }
    </style>
</head>
<body>
    <%@include file="_menu.jsp" %> 
    <% Presentador pres = (Presentador)session.getAttribute("pres"); %>
    <% String tot = pres.getTot(); %>
    <% Object[] fil = pres.getFil(); %>
    <% List lis = pres.getLis(); %> 
    <% Object[] fil2 = pres.getFil2(); %>
    <% String msg = pres.getMsg(); %>
    
    <div class="container">
        <br>
        <h4>Proceso de Venta</h4>
        <table>
            <form action="ControlConsumo" method="Post">
                <tr>
                    <td>Numero Venta</td>
                    <td colspan="2">
                        <input class="form-control" type="text" name="cod" value='<%= fil[0] %>' readonly/>
                    </td>
                </tr>
                <tr>
                    <td>Fecha Venta</td>
                    <td colspan="2">
                        <input class="form-control" type="text" value='<%= fil[1] %>' readonly/>
                    </td>
                </tr>
                <tr>
                    <td>Hora Venta</td>
                    <td colspan="2">
                        <input class="form-control" type="text" value='<%= fil[2] %>' readonly/>
                    </td>
                </tr>
                <tr>
                    <td>DNI</td>
                    <td>
                        <input class="form-control" type="text" name="dni" value='<%= fil2[0] %>'/>
                    </td>
                    <td>
                        <input type="submit" name="acc" class="btn btn-primary" value="Buscar Cliente"/>
                    </td>
                </tr>
                <tr>
                    <td>Nombre</td>
                    <td colspan="2">
                        <input class="form-control" type="text" value='<%= fil2[1] %>' readonly/>
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
                        <td><input class="form-control" type="text" value='<%= f[0] %>' readonly/></td>
                        <td><input class="form-control" type="text" value='<%= f[1] %>' readonly/></td>
                        <td><input class="form-control" type="text" value='<%= f[2] %>' readonly/></td>
                        <td><input class="form-control" type="text" value='<%= f[3] %>' readonly/></td>
                        <td><input class="form-control" type="text" value='<%= f[4] %>' readonly/></td>                
                    </tr>
                <% } %>
                <tr>
                    <td colspan="5" align="right">Total:<input class="form-control" type="text" value='<%= tot %>' readonly/></td> 
                </tr>            
            </tbody>
        </table>
        <form action="ControlConsumo" method="Post">
            <input type="submit" name="acc" class="btn btn-primary" value="Grabar Compra"/>
        </form>
        <!-- Botón para regresar a Cesta.jsp -->
        <a href="Cesta.jsp" class="btn btn-secondary">Regresar</a>
    </div>
    <script src="_sweetAlert/sweetalert.js" type="text/javascript"></script>
    <script src="_sweetAlert/sweetalert.min.js" type="text/javascript"></script>
</body>
</html>