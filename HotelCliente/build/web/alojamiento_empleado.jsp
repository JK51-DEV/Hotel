
<%@page import="java.util.List"%>
<%@page import="presentacion.Presentador"%>
<%@page import="servicio.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Proceso de Alojamiento</title>
      <%@include file="_referencias.jsp" %>
    </head>
    <body>
        <%@include file="_menu.jsp" %> 
        <% Presentador pres = (Presentador)session.getAttribute("pres"); %>
        <%-- Object[] fil2 = pres.getFil2(); %>
        <% String msg = pres.getMsg(); --%>
        <div class="container">
        <h1>Proceso de Venta</h1>
        <form >
            <table>
                <tr>
                    <td>Codigo de Alojamiento:  </td>
                    <td><input class="form-control" type="text" id="aloj" name="aloj" required></td>
                </tr>
                
                <tr>
                    <td>Empleado : </td>
                    <td><input class="form-control" type="text" id="emp" name="emp" required></td>
                    <td><input class="form-control" type="text" id="emp_nom" name="emp_nom" required></td>
                </tr>
                <tr>
                    <td>Codigo de reserva</td>
                    <td>
                        <input class="form-control" type="text" name="cod" size="" />
                    </td>
                    <td>
                        <input type="submit" name="acc" class="btn btn-primary" value="Buscar Reserva"/>
                    </td>
                </tr>
                
                <table>
                    <br>
                    <h4>Detalle de reserva:  </h4>
                <tr>
                <br>
                    <td>Dni Cliente:</td>
                    <td>
                        <input class="form-control" type="text" name="" size=""  readonly/>
                         
                    </td>
                   
                    <td>Nombre Cliente: </td>
                    <td><input class="form-control" type="text" name="" size=""  readonly/> </td>
                    
                </tr>
                <tr>
                    <td>Codigo de habitacion:</td>
                    <td>
                        <input class="form-control" type="text" name="" size=""  readonly/>
                    </td>
                    <td>
                        <input class="form-control" type="text" name="" size=""  readonly/>
                    </td>
                </tr>
                <tr>
                    <td>Fecha de reserva:</td>
                    <td>
                        <input class="form-control" type="text" name="" size=""  readonly/>
                    </td>
                </tr>
                <tr>
                    <td>Fecha de inicio de reserva: </td>
                    <td>
                        <input class="form-control" type="text" name="" size=""  readonly/>
                    </td>
                    <td>Fecha de fin de reserva: </td>
                    <td>
                        <input class="form-control" type="text" name="" size=""  readonly/>
                    </td>
                </tr>
                <tr>
                    <td>Importe :</td>
                    <td>
                        <input class="form-control" type="text" name="" size=""  readonly/>
                    </td>
                </tr>
                </table>
                <tr>
                <td>
                    <br>
                        <input type="submit" name="acc" class="btn btn-primary" value="Buscar Reserva"/>
                </td>
                </tr>
                
        <br>
        </table>
        </form>
        </div>
        
    <script src="_sweetAlert/sweetalert.js" type="text/javascript"></script>
    <script src="_sweetAlert/sweetalert.min.js" type="text/javascript"></script>
    </body>
</html>
