package servicio;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "ServReserva")
public class ServReserva {

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

    /**
     * Web service operation
     */
   @WebMethod(operationName = "registrarReserva")
public String registrarReserva(@WebParam(name = "hab") String hab, @WebParam(name = "cli") String cli, @WebParam(name = "fecInicio") String fecInicio, @WebParam(name = "fecFin") String fecFin) {
    Habitacion habi = DaoHabitacion.buscarHabitacion(hab);
    Cliente clie = DaoCliente.buscar(cli);

    if (habi == null) {
        return "No se encontró la habitación con el código: " + hab;
    }
    if (clie == null) {
        return "No se encontró el cliente con el DNI: " + cli;
    }

    Reserva r = new Reserva();
    r.setHab(habi);
    r.setCli(clie);
    r.setFecInicio(fecInicio);
    r.setFecFin(fecFin);

    String msg = DaoReserva.grabarReservas(r);

    if (msg == null) {
        DaoReserva.cambioEstado(habi);
        return "Se guardó la reserva correctamente";
    } else {
        return "No se pudo guardar la reserva: " + msg;
    }
}
    }