/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Usuario
 */
@WebService(serviceName = "ServiciosEmpleado")
public class ServiciosEmpleado {

    
    @WebMethod(operationName = "grabarEmpleado")
    public boolean grabarEmpleado(
            @WebParam(name = "dni") String dni,
            @WebParam(name = "nom") String nom
    ) {
        DaoEmpleado pres = new DaoEmpleado();
        return pres.grabar(dni, nom);
    }


    @WebMethod(operationName = "buscarEmpleado")
    public String buscarEmpleado(@WebParam(name = "dni") String dni) {
        String res;
        Empleado nom=DaoEmpleado.buscar(dni);
        res= "DNI: "+ nom.getDni()+ " Nombre: "+ nom.getNom();
        return res;
    }

    @WebMethod(operationName = "listarEmpleado")
    public List<Empleado> listarEmpleado() {
        return DaoEmpleado.listar();
    }

    @WebMethod(operationName = "elmininarEmpleado")
    public String elmininarEmpleado(@WebParam(name = "dni") String dni) {
        String msg=DaoEmpleado.eliminar(dni);
        if(msg==null){
            msg="Empleado Eliminado";
        }
        return msg;
    }

    @WebMethod(operationName = "autenticarEmpleado")
    public boolean autenticarEmpleado(
            @WebParam(name = "dni") String dni,
            @WebParam(name = "nom") String nom
    ) {
        return DaoEmpleado.autenticarEmpleado(dni, nom);
    }
    
    @WebMethod(operationName = "buscarAdministradorInicioSesion")
public boolean buscarAdministradorInicioSesion(
        @WebParam(name = "dni") String dni,
        @WebParam(name = "nom") String nom
) {
    DaoEmpleado daoEmpleado= new DaoEmpleado();
    return daoEmpleado.buscarAdministradorInicioSesion(dni, nom);
}

@WebMethod(operationName = "buscarNombreAdministrador")
public String buscarNombreAdministrador(@WebParam(name = "dni") String dni) {
    DaoEmpleado daoEmpleado = new DaoEmpleado();
    return daoEmpleado.buscarNombreAdministrador(dni);
}

}
