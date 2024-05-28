
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
   
    // buscar por ID alojamiento
    @WebMethod(operationName = "buscarAlojamiento")
    public String buscarAlojamiento(@WebParam(name = "codaloj") String codaloj) {
        String res;
        String nom=DaoAlojamiento.buscarAlojamiento(codaloj);
        if (nom != null) {
            //Habitacion h=new Habitacion();
            
            return nom;
        }else{
            res="No hay reservas en esta habitacion";
        }
    return res;
    }
    
    @WebMethod(operationName = "agregarAlojamiento")
    public String agregarAlojamiento(@WebParam(name = "codres") String codres,@WebParam(name = "emp") String emp ) {
        Reserva res = DaoReserva.buscarReservaLista(codres);
        Empleado empleado=DaoEmpleado.buscar(emp);
        
        if (res == null) {
            return "No se encontró la habitación con el código: " + res;
        }
        if (empleado == null) {
            return "No se encontró la habitación con el código: " + res;
        }
        
        alojamiento.agregar(res, empleado);
        
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
    
    @WebMethod(operationName = "registrarAlojamiento")
    public String registrarAlojamiento() {
    try {
            List<Alojamiento> aloj = alojamiento.getResumenAlojamiento();
            String result = DaoAlojamiento.RegistrarAlojamiento(aloj);

            if (result == null) {
                return "Correcto:\n" + result;
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
        
    }
    
}
