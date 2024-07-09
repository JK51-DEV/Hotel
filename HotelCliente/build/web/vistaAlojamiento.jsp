<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="servicio.*" %>
<%
    servicio.ServAlojamiento_Service service = new servicio.ServAlojamiento_Service();
    servicio.ServAlojamiento port = service.getServAlojamientoPort();


%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Inicio</title>
        <link href="_sweetAlert/sweetalert.css" rel="stylesheet" type="text/css"/>
        <%@include file="_referencias.jsp" %> 
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%@include file="_menu.jsp" %> 
         <div class="container">
            <div class="card">
        <div class="card-body">
            <h3 class="card-title">Gestión de Alojamientos</h3>
            <button class="btn btn-success" type="button" onclick="location.href = 'alojamiento_empleado.jsp'">Registar Alojamiento</button>
            <br><br>
            <%-- <table>
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
             </table>--%>
            <table class="table table-bordered">
                <thead style="background-color: black; color: white">
                    <tr>
                        <th>Código</th><th>F. Alojamiento</th><th>Reserva</th><th>DNI</th><th>Nombre</th><th>Habitación</th><th>H. Nombre</th><th>Precio</th><th>F. Reserva</th><th>F. Inicio</th><th>F. Fin</th><th>Importe</th>
                            <%--<th>Precio</th><th>Precio</th>--%>
                        <%-- <th class="text-center">Mantenimiento</th>--%>
                    </tr>
                </thead>
                <tbody id="tabla1">
                    <%                       List<Alojamiento> dis = port.listarAlojamiento();
                        for (Alojamiento l : dis) {
                    %>  
                    <tr>
                        <td><%=l.getCodAloj()%></td>
                        <td><%=l.getFecCreacionAloj()%></td>
                       <%--  <td><%=l.getEmpleado().getDni()%></td>
                        <td><%=l.getEmpleado().getNom()%></td>--%>
                        <td><%=l.getReserva().getCodRes()%></td>
                        <td><%=l.getReserva().getCli().getDni()%></td>
                        <td><%=l.getReserva().getCli().getNom()%></td>
                        <td><%=l.getReserva().getHab().getCod()%></td>
                        <td><%=l.getReserva().getHab().getNom()%></td>
                        <td><%=l.getReserva().getHab().getPre()%></td>
                        <td><%=l.getReserva().getFecCreacion()%></td>
                        <td><%=l.getReserva().getFecInicio()%></td>
                        <td><%=l.getReserva().getFecFin()%></td>
                        <td><%=l.getReserva().getImp()%></td>
                        <td class="text-center">
                            <%-- <a class="btn btn-warning" href="/TutorialCliente/index_editar.jsp?id=<%=l.getIdDpc()%>">Editar</a>
                            <button class="btn btn-danger" type="button" onclick="dis.eliminar(<%=l.getCod()%>)">Eliminar</button>--%>
                        </td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
        </div></div> </div> <br><br>
    </body>
    <script src="_sweetAlert/sweetalert.js" type="text/javascript"></script>
    <script src="_sweetAlert/sweetalert.min.js" type="text/javascript"></script>
    <script>
                dis_eliminar = function (id) {
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
                            function (isConfirm) {
                                if (isConfirm) {
                                    $.post('dis_eliminar.do', {
                                        id: id
                                    }, function (res) {
                                        swal("Alerta del sistema!", res, "success");
                                        setTimeout(function () {
                                            window.location = '/TutorialCliente/index.jsp';
                                        }, 1200);
                                    });
                                } else {
                                    swal("Cancelado", "Cancelaste esto :)", "error");
                                }
                            });
                };
    </script>
    <script>
        buscar_dis = function () {
            var fabricante = $("#fabricante").val();
            var categoria = $("#categoria").val();
            $.post('dis_buscar.do', {
                fabricante: fabricante,
                categoria: categoria
            }, function (res) {
                $('#tabla1').html(res);
            });
        };
    </script>
</html>

