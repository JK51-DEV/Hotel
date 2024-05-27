
package servicio;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "ServAlojamiento")
public class ServAlojamiento {
    ResuAlojamiento alojamiento=new ResuAlojamiento();
    Alojamiento aloj=new Alojamiento();
    
    @WebMethod(operationName = "listarAlojamiento")
    public List<Alojamiento> listarAlojamiento() {
        return DaoAlojamiento.listarAlojamiento();
    }
   
    @WebMethod(operationName = "buscarAlojamientoDNI")
    public String buscarAlojamientoDNI(@WebParam(name = "dni") String dni) {
        String res;
        String nom=DaoAlojamiento.buscarAlojamiento(dni);
        if (nom != null) {
            Cliente c=new Cliente();
            
            return nom;
        }else{
            res="No existe reserva";
        }
    return res;
    }
    
    @WebMethod(operationName = "buscarAlojamientoCODHAB")
    public String buscarAlojamientoCODHAB(@WebParam(name = "codhab") String codhab) {
        String res;
        String nom=DaoAlojamiento.buscarAlojamientocodhabi(codhab);
        if (nom != null) {
            Habitacion h=new Habitacion();
            
            return nom;
        }else{
            res="No hay reservas en esta habitacion";
        }
    return res;
    }
    
    @WebMethod(operationName = "agregarAlojamiento")
    public String agregarAlojamiento(@WebParam(name = "hab") String hab, @WebParam(name = "cli") String cli,@WebParam(name = "emp") String emp, @WebParam(name = "fecInicio") String fecInicio, @WebParam(name = "fecFin") String fecFin) {
        Habitacion habi = DaoHabitacion.buscarHabitacion(hab);
        Cliente clie = DaoCliente.buscar(cli);
        Empleado empe=DaoEmpleado.buscar(emp);
        
        if (habi == null) {
            return "No se encontró la habitación con el código: " + hab;
        }
        if (clie == null) {
            return "No se encontró el cliente con el DNI: " + cli;
        }
        if (clie == null) {
            return "No se encontró el empleado con el DNI: " + emp;
        }
        
        alojamiento.agregar(habi, clie, empe, fecInicio, fecFin);
        
        return "La reserva se agregó";
    }
    @WebMethod(operationName = "resumenAlojamiento")
    public List<Alojamiento> resumenAlojamiento() {
        return alojamiento.getResumenAlojamiento();
    }
    
    @WebMethod(operationName = "eliminarResumenAloj")
    public String eliminarResumenAloj() {
        try {
            alojamiento.limpiar();
            return "Eliminar resumen";
        } catch (Exception e) {
            return "Error al eliminar todas las reservas: " + e.getMessage();
        }
    }
    @WebMethod(operationName = "getTotalAloj")
    public String getTotal() {
       return String.valueOf(alojamiento.getTot());
    }
    
    @WebMethod(operationName = "registrarAlojamiento")
    public String registrarReserva() {
    try {
            List<Alojamiento> aloj = alojamiento.getResumenAlojamiento();
            String result = DaoAlojamiento.RegistrarAlojamiento(aloj);

            if (result == null) {
                aloj.forEach((r) -> {
                    DaoReserva.cambioEstado(r.getHab());
                });
            } else {
                return "Errores al guardar la reserva:\n" + result;
            }
    } catch (Exception e) {
        Throwable cause = e.getCause();
        while (cause != null) {
            e = (Exception) cause;
            cause = e.getCause();
        }
        return "Error al registrar todas las reservas: " + e.getMessage();
    }
        return "Registro exitoso";
}
    
}
