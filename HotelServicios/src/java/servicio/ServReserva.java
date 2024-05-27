package servicio;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "ServReserva")
public class ServReserva {

    ResuReserva resumen = new ResuReserva();
    Reserva res= new Reserva();
    
    @WebMethod(operationName = "listarReservas")
    public List<Reserva> listarReservas() {
        return DaoReserva.listarReservas();
    }

    @WebMethod(operationName = "buscarReserva")
    public String buscarReserva(@WebParam(name = "dni") String dni) {
        String res;
        String nom=DaoReserva.buscarReserva(dni);
        if (nom != null) {
            Cliente c=new Cliente();
            
            return nom;
        }else{
            res="No existe reserva";
        }
    return res;
    }

   @WebMethod(operationName = "registrarReserva")
    public String registrarReserva() {
    try {
            List<Reserva> reservas = resumen.getResumen();
            String result = DaoReserva.RegistrarReservas(reservas);

            if (result == null) {
                reservas.forEach((r) -> {
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
    @WebMethod(operationName = "getTotal")
    public String getTotal() {
       return String.valueOf(resumen.getTot());
    }
   
    @WebMethod(operationName = "resumenReserva")
    public List<Reserva> resumenReserva() {
        return resumen.getResumen();
    }

    @WebMethod(operationName = "agregarReserva")
    public String agregarReserva(@WebParam(name = "hab") String hab, @WebParam(name = "cli") String cli, @WebParam(name = "fecInicio") String fecInicio, @WebParam(name = "fecFin") String fecFin) {
        Habitacion habi = DaoHabitacion.buscarHabitacion(hab);
        Cliente clie = DaoCliente.buscar(cli);
        
        if (habi == null) {
            return "No se encontró la habitación con el código: " + hab;
        }
        if (clie == null) {
            return "No se encontró el cliente con el DNI: " + cli;
        }
        
        resumen.agregar(habi, clie, fecInicio, fecFin);
        return "La reserva se agregó";
    }
    @WebMethod(operationName = "eliminarResumen")
    public String eliminarResumen() {
        try {
            resumen.limpiar();
            return "Eliminar resumen";
        } catch (Exception e) {
            return "Error al eliminar todas las reservas: " + e.getMessage();
        }
    }
    
    @WebMethod(operationName = "listar_avanzado_reserva")
    public List<Reserva> listar_avanzado_reserva(
            @WebParam(name = "dni_cliente") String dni_cliente) {
        DaoReserva dis = new DaoReserva();
        return dis.listar_avanzado_reserva(dni_cliente);
    }

    }