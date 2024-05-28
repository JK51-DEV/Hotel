<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="servicio.*" %>
<%
    ServReserva_Service server = new ServReserva_Service();
    ServReserva port = server.getServReservaPort();


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
            <h4>Gestión de Reservas</h4>
            <%--<button class="btn btn-success" type="button" onclick="location.href = 'index_nuevo.jsp'">Nuevo</button>--%>

            <table>
                <tr>
                    <td style="padding: 0px">Ingresar filtro:</td>
                    <td style="padding: 10px">DNI:</td>
                    <td style="padding: 10px">
                        <input class="form-control" id="dni_cliente" name="dni_cliente" size="8" required>
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
            </table>--%>
            <table class="table table-bordered">
                <thead style="background-color: black; color: white">
                    <tr>
                        <%--<<th>Código</th><th>DNI</th><th>Nombre</th><th>F. Creacion</th><th>F. Inicio</th><th>F. Fin</th><th>Importe</th>--%>
                        <th>Código</th><th>DNI</th><th>Nombre</th><th>Habitación</th><th>H. Tipo</th><th>Precio Ind.</th><th>F. Creacion</th><th>F. Inicio</th><th>F. Fin</th><th>Importe</th>
                            <%--  <th>Código</th><th>DNI</th><th>Habitación</th><th>F. Creación</th><th>F. Inicio</th><th>F. Fin</th><th>Importe</th>
                            <%--<th class="text-center">Mantenimiento</th>--%>
                    </tr>
                </thead>
                <tbody id="tabla1">
                    <%                        List<Reserva> dis = port.listarReservas();
                        for (Reserva l : dis) {
                    %>  
                    <tr>
                        <td><%=l.getCodRes()%></td>
                        <td><%=l.getCli().getDni()%></td>
                        <td><%=l.getCli().getNom()%></td>
                        <td><%=l.getHab().getCod()%></td>
                        <td><%=l.getHab().getNom()%></td>
                        <td><%=l.getHab().getPre()%></td>
                        <td><%=l.getFecCreacion()%></td>
                        <%-- <td><%=l.getFecCreacion()%></td>--%>
                        <td><%=l.getFecInicio()%></td>
                        <td><%=l.getFecFin()%></td>
                        <td>S/. <%=l.getImp()%></td>
                        <td class="text-center">
                            <%--<a class="btn btn-warning" href="/TutorialCliente/index_editar.jsp?id=<%=l.getIdDpc()%>">Editar</a>
                            <button class="btn btn-danger" type="button" onclick="dis.eliminar(<%=l.getCodRes()%>)">Eliminar</button>--%>
                        </td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
        </div>
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
            var dni_cliente = $("#dni_cliente").val();
            $.post('dis_buscar_reserva', {
                dni_cliente: dni_cliente
            }, function (res) {
                $('#tabla1').html(res);
            });
        };
    </script>
</html>
