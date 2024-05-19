
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="ws.*" %>
<%
Servidor1_Service server = new Servidor1_Service();
Servidor1 port = server.getServidor1Port();
List<Categoria> cat = port.catListar();
List<Fabricante> fab = port.fabListar();
                  
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
            <h4>Gestioon de Dispositivos</h4>
            <button class="btn btn-success" type="button" onclick="location.href = 'index_nuevo.jsp'">Nuevo</button>
            <br>
            <table>
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
            </table>
            <table class="table table-bordered">
                <thead style="background-color: black; color: white">
                    <tr>
                        <th>Código</th><th>Serie</th><th>Descripcion</th><th>Precio</th>
                        <th class="text-center">Mantenimiento</th>
                    </tr>
                </thead>
                <tbody id="tabla1">
                   <%
                       List<Dispositivo> dis = port.disListar();
                       for (Dispositivo l : dis) {
                   %>  
                   <tr>
                       <td><%=l.getIdDpc()%></td>
                       <td><%=l.getSerieDpc()%></td>
                       <td><%=l.getDescripcionDpc()%></td>
                       <td>S/. <%=l.getPrecioDpc()%></td>
                       <td class="text-center">
                           <a class="btn btn-warning" href="/TutorialCliente/index_editar.jsp?id=<%=l.getIdDpc()%>">Editar</a>
                           <button class="btn btn-danger" type="button" onclick="dis.eliminar(<%=l.getIdDpc()%>)">Eliminar</button>
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
        buscar_dis = function (){
          var fabricante = $("#fabricante").val();
          var categoria = $("#categoria").val();
          $.post('dis_buscar.do', {
                  fabricante: fabricante,
                  categoria: categoria
                }, function (res){
                    $('#tabla1').html(res);
                });
        };
    </script>
</html>
