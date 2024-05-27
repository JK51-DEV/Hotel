package servicio;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "Servicios")
public class ServiciosCliente {

    @WebMethod(operationName = "grabarCliente")
    public boolean grabarCliente(
            @WebParam(name = "dni") String dni,
            @WebParam(name = "nom") String nom
    ) {
        DaoCliente pres = new DaoCliente();
        return pres.grabar(dni, nom);
    }

    @WebMethod(operationName = "buscarCliente")
    public String buscarCliente(@WebParam(name = "dni") String dni) {
        String res;
        Cliente nom = DaoCliente.buscar(dni);
        res = "DNI: " + nom.getDni() + " Nombre: " + nom.getNom();
        return res;
    }

    @WebMethod(operationName = "listarCliente")
    public List<Cliente> listarCliente() {
        return DaoCliente.listar();
    }

    @WebMethod(operationName = "elmininarCliente")
    public String elmininarCliente(@WebParam(name = "dni") String dni) {
        String msg = DaoCliente.eliminar(dni);
        if (msg == null) {
            msg = "Cliente Eliminado";
        }
        return msg;
    }

    @WebMethod(operationName = "autenticarCliente")
    public boolean autenticarCliente(
            @WebParam(name = "dni") String dni,
            @WebParam(name = "nom") String nom
    ) {
        return DaoCliente.autenticarCliente(dni, nom);
    }

    @WebMethod(operationName = "buscarUsuarioInicioSesion")
    public boolean buscarUsuarioInicioSesion(
            @WebParam(name = "dni") String dni,
            @WebParam(name = "nom") String nom
    ) {
        DaoCliente daoCliente = new DaoCliente();
        return daoCliente.buscarUsuarioInicioSesion(dni, nom);
    }

    @WebMethod(operationName = "buscarNombre")
    public String buscarNombre(@WebParam(name = "dni") String dni) {
        DaoCliente daoCliente = new DaoCliente();
        return daoCliente.buscarNombre(dni);
    }

    @WebMethod(operationName = "dis_listar_avanzado")
    public List<Cliente> dis_listar_avanzado(
            @WebParam(name = "dni") String dni) {
        DaoCliente dis = new DaoCliente();
        return dis.dis_listar_avanzado(dni);
    }

}
