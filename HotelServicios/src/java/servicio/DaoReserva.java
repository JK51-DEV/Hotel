package servicio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
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
            res.setEstado(f[7].toString()); // Asignar el estado desde la entidad reserva
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
            res.setEstado(f[7].toString()); // Asignar el estado desde la entidad reserva
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
    
     public static String buscarReservaparalojamiento(String dni_cliente) {
        String sql = "select * from reserva where DNI_CLIENTE='" + dni_cliente + "'";
        Object[] f = Acceso.buscar(sql);
        if (f != null) {
            return f[0].toString();
        }
        return null;
    }
    
    public static String buscarReservacod(String codres) {
        String sql = "select * from reserva where cod_res='" + codres + "'";
        Object[] f = Acceso.buscar(sql);
        if (f != null) {
            return  f[1].toString();
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
                + "'" + r.getFecFin() + "'," + r.Importe() + ",'" + r.getEstado() + "')";
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

    
    public static void eliminarReservasAnuladasExpiradas() {
         List<Reserva> reservasAnuladas = listarReservasAnuladas();
    
    for (Reserva reserva : reservasAnuladas) {
        String fecInicio = reserva.getFecInicio();
        
        // Obtener la fecha actual y calcular la diferencia en horas
        LocalDateTime ahora = LocalDateTime.now();
        LocalDateTime fechaInicio = LocalDate.parse(fecInicio).atStartOfDay();
        
        // Calcular la diferencia de tiempo en horas desde la fecha de inicio
        long horasDesdeInicio = ChronoUnit.HOURS.between(fechaInicio, ahora);
        
        if (horasDesdeInicio >= 20) { // Verifica si han pasado al menos 20 horas desde la fecha de inicio
            String sql = "delete from reserva where cod_res = '" + reserva.getCodRes() + "'";
            Acceso.ejecutar(sql);

            // Cambiar el estado de la habitación a 'D' (Disponible)
            String cambiarEstadoHabitacion = "update habitacion set ESTADO = 'D' where COD = '" + reserva.getHab().getCod() + "'";
            Acceso.ejecutar(cambiarEstadoHabitacion);
        }
        }
    }
    
    public static List<Reserva> listarReservasAnuladas() {
        String sql = "select * from reserva where estado = 'A'";
        List tabla = Acceso.listar(sql);
        List<Reserva> lis = new ArrayList<>();
        
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
            res.setImp(Double.parseDouble(f[6].toString())); // El cálculo se hace desde la entidad reserva
            res.setEstado(f[7].toString()); // Asignar el estado desde la entidad reserva
            lis.add(res);
        }
        
        return lis;
    }
    
    
    public static String confirmarReserva(String codRes) {
    String sql = "update reserva set estado = 'R' where cod_res = '" + codRes + "'";
    return Acceso.ejecutar(sql);
}
    
}
    

