<%@page import="java.util.List"%>
<%@page import="presentacion.Presentador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Catálogo de Artículos</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <%@include file="_referencias.jsp" %> 
    <style>
        body {
            padding-top: 20px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #f2f2f2;
        }
        .btn-primary {
            margin-right: 5px;
        }
    </style>
</head>
<body>
    <%@include file="_menu.jsp" %> 
    <div class="container">
        <h1>Catálogo de Artículos</h1>
        <% Presentador pres = (Presentador)session.getAttribute("pres"); %>
        <% List lis = pres.getLis(); %>
        <table class="table">
            <thead class="thead-dark">
                <tr>
                    <th>Código</th>
                    <th>Nombre</th>
                    <th>Precio</th>
                    <th>Cantidad</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <% for(int i=0; i<lis.size(); i++) { %>
                    <% Object[] f = (Object[])lis.get(i); %>
                    <tr>
                        <form action="ControlConsumo" method="Post">
                            <td><input type="text" name="cod" size="5" value='<%= f[0] %>' readonly class="form-control"/></td>
                            <td><input type="text" name="nom" size="20" value='<%= f[1] %>' readonly class="form-control"/></td>
                            <td><input type="text" name="pre" size="10" value='<%= f[2] %>' readonly class="form-control"/></td>
                            <td><input type="text" name="can" size="5" value="" class="form-control"/></td>
                            <td><button type="submit" name="acc" value="Agregar Articulo" class="btn btn-primary">Agregar Artículo</button></td>
                        </form>
                    </tr> 
                <% } %>
            </tbody>
        </table>        
    </div>
</body>
</html>