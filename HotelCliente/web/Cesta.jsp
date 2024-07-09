<%@page import="java.util.List"%>
<%@page import="presentacion.Presentador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Cesta de Artículos</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <%@include file="_referencias.jsp" %> 
</head>
<body>
    <%@include file="_menu.jsp" %> 
    <div class="container">
            <div class="card">
        <div class="card-body">
            <h3 class="card-title">Cesta de Servicios</h3>
        <% Presentador pres = (Presentador)session.getAttribute("pres"); %>
        <% String tot = pres.getTot(); %>
        <% List lis = pres.getLis(); %>
        <table class="table">
            <thead class="thead-dark">
                <tr>
                    <th>Código</th>
                    <th>Nombre</th>
                    <th>Precio</th>
                    <th>Cantidad</th>
                    <th>Importe</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <% for(int i=0; i<lis.size(); i++) { %>
                    <% Object[] f = (Object[])lis.get(i); %>
                    <tr>
                        <td><input type="text" name="cod" size="5" value='<%= f[0] %>' readonly class="form-control"/></td>
                        <td><input type="text" name="" size="20" value='<%= f[1] %>' readonly class="form-control"/></td>
                        <td><input type="text" name="" size="10" value='<%= f[2] %>' readonly class="form-control"/></td>
                        <td><input type="text" name="" size="5" value='<%= f[3] %>' class="form-control"/></td>
                        <td><input type="text" name="" size="10" value='<%= f[4] %>' readonly class="form-control"/></td>
                        <td>
                            <form action="ControlConsumo" method="Post">
                                <input type="hidden" name="cod" value='<%= f[0] %>'/>
                                <button type="submit" name="acc" value="Quitar Articulo" class="btn btn-danger">Quitar Artículo</button>
                            </form>
                        </td>
                    </tr> 
                <% } %>
            </tbody>
        </table>
        <div>Total: <input type="text" name="" size="10" value='<%= tot %>' readonly class="form-control"/></div>
        <br>
        <div>
            <form action="ControlConsumo" method="Post">
                <button type="submit" name="acc" value="Listar Articulos" class="btn btn-primary">Listar Artículos</button>
                <button type="submit" name="acc" value="Nueva Venta" class="btn btn-primary">Nueva Venta</button>
            </form>
        </div>
    </div> </div> </div> <br><br>
</body>
</html>