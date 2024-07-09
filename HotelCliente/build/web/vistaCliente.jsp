<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="servicio.*" %>
<%
Servicios server = new Servicios();
ServiciosCliente port = server.getServiciosClientePort();

                  
 %>
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
            <div class="card">
        <div class="card-body">
            <h3 class="card-title">Gestión de Clientes</h3>
            <button class="btn btn-success" type="button" onclick="location.href = 'registrarCliente_emp.jsp'">Registar Cliente</button>
            
            <%--<button class="btn btn-success" type="button" onclick="location.href = 'index_nuevo.jsp'">Nuevo</button>--%>
            <table>
                <tr>
                    <td style="padding: 0px">Ingresar filtro:</td>
                    <td style="padding: 10px">DNI:</td>
                    <td style="padding: 10px">
                    <input class="form-control" id="dni" name="dni" size="8" required>
                    </td>
                    <%--<td style="padding: 10px">Categoria</td>
                    <td style="padding: 10px">
                    <input class="form-control" id="categoria" name="categoria" size="1" required>
                    </td>--%>
                    
                    <td style="padding: 10px"><button class="btn btn-primary" onclick="buscar_dis()">Buscar</button></td>
                </tr>
            </table>
            <%--<table>
                <tr>
                    <td style="padding: 0px">Seleccionar filtro:</td>
                    <td style="padding: 10px">Fabricante</td>
                    <td style="padding: 10px">
                        <select class="form-control" id="fabricnate" name="fabricnate" size="1" required>
                            <option value="">------</option>
                            <% for (Fabricante f : fab) {%>
                            <option value="<%=f.getIdFb()%>" ><%=f.getDescripcionFb()%></option>
                            <%  }%>
                        </select>
                    </td>
                    <td style="padding: 10px">Categoria</td>
                    <td style="padding: 10px">
                        <select class="form-control" id="categoria" name="categoria" size="1" required>
                            <option value="">------</option>
                            <% for (Categoria c : cat) {%>
                            <option value="<%=c.getIdCt()%>" ><%=c.getDescripcionCt()%></option>
                            <%  }%>
                        </select>
                    </td>
                    
                    <td style="padding: 10px"><button class="btn btn-primary" onclick="buscar_dis()">Buscar</button></td>
                </tr>
            </table> --%>
            <table class="table table-bordered">
                <thead style="background-color: black; color: white">
                    <tr>
                        <th>Código</th><th>Nombre</th>
                       <%-- <th class="text-center">Mantenimiento</th>--%>
                    </tr>
                </thead>
                <tbody id="tabla1">
                   <%
                       List<Cliente> dis = port.listarCliente();
                       for (Cliente l : dis) {
                   %>  
                   <tr>
                       <td><%=l.getDni()%></td>
                       <td><%=l.getNom()%></td>
                       <td class="text-center">
                          <%-- <a class="btn btn-warning" href="/HotelCliente/index_editar.jsp?id=<%=l.getDni()%>">Editar</a>
                           <button class="btn btn-danger" type="button" onclick="dis.eliminar(<%=l.getDni()%>)">Eliminar</button>--%>
                       </td>
                   </tr>
                   <%  
                       }
                   %>
                </tbody>
            </table>
        </div> </div> </div> <br><br>
    </body>
    <script src="_sweetAlert/sweetalert.js" type="text/javascript"></script>
    <script src="_sweetAlert/sweetalert.min.js" type="text/javascript"></script>
    <script>
        dis_eliminar = function (id){
            swal({
                tittle: "Estas seguro de eliminar?",
                text: "Una vez eliminado no se podra recuperar!",
                type: "warning",
                showCancelButton: true,
                confirmButtonClass: "btn-danger",
                confirmButtonText: "Si, Eliminar!",
                cancelButtonText: "No, Cancelar!",
                closeOnConfirm: false,
                closeOnCancel: false
            },
            function (isConfirm){
                if (isConfirm){
                    $.post('dis_eliminar.do',{
                        id: id
                    }, function (res){
                        swal("Alerta del sistema!",res,"success");
                        setTimeout(function (){
                            window.location = '/TutorialCliente/index.jsp';
                        },1200);
                    });
                } else {
                    swal("Cancelado", "Cancelaste esto :)", "error");
                }
            });
        };
    </script>
    <script>
        buscar_dis = function () {
            var dni = $("#dni").val();
            $.post('dis_buscar', {
                dni: dni
            }, function (res) {
                $('#tabla1').html(res);
            });
        };
    </script>
</html>

