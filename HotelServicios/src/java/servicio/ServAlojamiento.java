
package servicio;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "ServAlojamiento")
public class ServAlojamiento {
    ResuAlojamiento alojamiento=new ResuAlojamiento();
    Alojamiento aloj=new Alojamiento();
    DaoAlojamiento daoaloj=new DaoAlojamiento();
    
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
    
    //BUSCA ALOJAMIENTO POR CODIGO DE RESERVA
    @WebMethod(operationName = "buscarAlojamientoRES")
    public String buscarAlojamientoRES(@WebParam(name = "codres") String codres) {
        String res;
        String nom=DaoAlojamiento.buscarAlojamientocodRES(codres);
        if (nom != null) {
            return nom;
        }else{
            res="No hay reservas en esta habitacion";
        }
    return res;
    }
    
    @WebMethod(operationName = "buscarAlojamientoREStotal")
    public List<Alojamiento> buscarAlojamientoREStotal(@WebParam(name = "codres") String codres) {
        return daoaloj.BuscarAlojamiento(codres);
    }
    
    @WebMethod(operationName = "agregarAlojamiento")
    public String agregarAlojamiento(@WebParam(name = "codres") String codres,@WebParam(name = "emp") String emp ) {
        Reserva res = DaoReserva.buscarReservaLista(codres);
        Empleado empleado=DaoEmpleado.buscar(emp);
        
        if (res == null) {
            return "No se encontró la reserva ";
        }
        if (empleado == null) {
            return "No se encontró el empleado";
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
           String aloja = DaoAlojamiento.RegistrarAlojamiento(aloj);

            if (aloja == null) {
                return "SE guardo la reserva:\n";
            } else {
                return "Errores al guardar la reserva:\n" + aloja;
            }
       } catch (Exception e) {
           // Manejo de excepciones
           Throwable cause = e.getCause();
           while (cause != null) {
               e = (Exception) cause;
               cause = e.getCause();
           }
           return "Error al registrar todas las reservas: " + e.getMessage();
       }
   }
   
   @WebMethod(operationName = "codigoautomaticoaloj")
    public String codigoautomaticoaloj() {
       return String.valueOf(aloj.CodigoautomaticoAloj());
    }

}