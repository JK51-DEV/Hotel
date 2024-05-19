<%-- 
    Document   : Cesta
    Created on : 22-abr-2024, 0:48:15
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listado de Habitaciones</h1>
        <table>
            <tr>
                <td>Codigo</td>
                <td>Nombre</td>
                <td>Estado</td>
                <td>Precio</td>
                <td></td>
            </tr>
            <tr>
                <td><input type="text" name="" size="5" value=""/></td>
                <td><input type="text" name="" size="20" value=""/></td>
                <td><input type="text" name="" size="2" value=""/></td>
                <td><input type="text" name="" size="3" value=""/></td>
                <td></td>
            </tr>
            <tr>
                <td colspan="5" alig="right" >Total===><input type="text" name="" size="20" value=""/></td>
            </tr>
        </table>
        <table>
            <tr>
                <td><input type="submit" name="acc" value="Listar Habitaciones"/></td>
            </tr>
        </table>
    </body>
</html>
