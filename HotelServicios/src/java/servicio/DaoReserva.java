package servicio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import servicio.Habitacion;
import java.util.ArrayList;
import java.util.List;
import static servicio.Acceso.getConexion;

public class DaoReserva {

    Connection d = getConexion();

    public List<Reserva> listar_avanzado_reserva(String dni_cliente) {
        String sql = "select * from reserva WHERE DNI_CLIENTE='" + dni_cliente + "'";
        List tabla = Acceso.listar(sql);
        List lis = new ArrayList();
        for (int i = 0; i < tabla.size(); i++) {
            Object[] f = (Object[]) tabla.get(i);
            Reserva res = new Reserva();
            Cliente cli = DaoCliente.buscar(f[1].toString());
            Habitacion hab = DaoHabitacion.buscarHabitacionCOD(f[2].toString());
            res.setCodRes(f[0].toString());
            res.setCli(cli);
            res.setHab(hab);
            res.setFecCreacion(f[3].toString()); // Asignar la fecha de creación desde la entidad reserva
            res.setFecInicio(f[4].toString());
            res.setFecFin(f[5].toString());
            res.setImp(Double.parseDouble(f[6].toString())); // El calculo se hace des la entidad reserva
            lis.add(res);
        }
        return lis;
    }

    public static List<Reserva> listarReservas() {
        String sql = "select * from reserva";
        List tabla = Acceso.listar(sql);
        List lis = new ArrayList();
        for (int i = 0; i < tabla.size(); i++) {
            Object[] f = (Object[]) tabla.get(i);
            Reserva res = new Reserva();
            Cliente cli = DaoCliente.buscar(f[1].toString());
            Habitacion hab = DaoHabitacion.buscarHabitacionCOD(f[2].toString());
            res.setCodRes(f[0].toString());
            res.setCli(cli);
            res.setHab(hab);
            res.setFecCreacion(f[3].toString()); // Asignar la fecha de creación desde la entidad reserva
            res.setFecInicio(f[4].toString());
            res.setFecFin(f[5].toString());
            res.setImp(Double.parseDouble(f[6].toString())); // El calculo se hace des la entidad reserva
            lis.add(res);
        }
        return lis;
    }

    public static String buscarReserva(String dni_cliente) {
        String sql = "select * from reserva where DNI_CLIENTE='" + dni_cliente + "'";
        Object[] f = Acceso.buscar(sql);
        if (f != null) {
            return "COD RESERVA: " +f[0].toString() + "COD Hab: "+ f[2].toString();
        }
        return null;
    }
    
    public static Reserva buscarReservaLista(String codRes) {
        String sql = "select * from reserva where COD_RES='" + codRes + "'";
        Object[] f = Acceso.buscar(sql);
        if (f != null) {
        String dniCliente = f[1].toString();
        String codHab = f[2].toString();

        Cliente cli = DaoCliente.buscar(dniCliente); 
        Habitacion hab = DaoHabitacion.buscarHabitacionCOD(codHab); 

        String fecInicio = f[4].toString();
        String fecFin = f[5].toString();  

        // Crear la instancia de Reserva usando el constructor
        Reserva r = new Reserva(hab, cli, fecInicio, fecFin);
        r.setCodRes(f[0].toString());      
        r.setFecCreacion(f[3].toString()); 
        r.setImp(Double.parseDouble(f[6].toString()));

        return r;
    }
    return null;
    }
    
    public static String grabarReservas(Reserva r) {
        // Construir la consulta SQL para insertar la reserva en la base de datos
        String sql = "insert into reserva values ('" + r.Codigoautomatico() + "','" + r.getCli().getDni() + "',"
                + "'" + r.getHab().getCod() + "','" + r.Hoy() + "','" + r.getFecInicio() + "',"
                + "'" + r.getFecFin() + "'," + r.Importe() + ")";
        return Acceso.ejecutar(sql);
    }

    public static String RegistrarReservas(List<Reserva> reservas) {
        StringBuilder errorMessages = new StringBuilder();
        for (Reserva r : reservas) {
            String result = grabarReservas(r);
            if (result != null) {
                errorMessages.append("Error al guardar la reserva ").append(r.getCodRes()).append(": ").append(result).append("\n");
            }
        }
        return errorMessages.length() > 0 ? errorMessages.toString() : null;
    }

    public static String cambioEstado(Habitacion h) {
        String sql = "update habitacion set ESTADO = 'O' where COD= '" + h.getCod() + "'";
        return Acceso.ejecutar(sql);
    }

}
