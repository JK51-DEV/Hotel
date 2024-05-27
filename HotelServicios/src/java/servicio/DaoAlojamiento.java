package servicio;

import java.util.ArrayList;
import java.util.List;
import static servicio.DaoReserva.grabarReservas;

public class DaoAlojamiento {
    public static List<Alojamiento> listarAlojamiento() {
    String sql = "select * from reserva";
    List tabla = Acceso.listar(sql);
    List lis = new ArrayList();
    for (int i = 0; i < tabla.size(); i++) {
        Object[] f = (Object[]) tabla.get(i);
        Alojamiento aloj = new Alojamiento();
        Cliente cli = DaoCliente.buscar(f[1].toString());
        Empleado emp = DaoEmpleado.buscar(f[2].toString());
        Habitacion hab = DaoHabitacion.buscarHabitacionCOD(f[1].toString());
        aloj.setCodRes(f[0].toString());
        aloj.setCli(cli);
        aloj.setEmpleado(emp);
        aloj.setHab(hab);
        aloj.setFecCreacion(f[4].toString()); // Asignar la fecha de creación desde la entidad reserva
        aloj.setFecInicio(f[5].toString());
        aloj.setFecFin(f[6].toString());
        aloj.setImp(Double.parseDouble(f[7].toString())); // El calculo se hace des la entidad reserva
        lis.add(aloj);
    }
    return lis;
    }
    
    
    public static String buscarAlojamiento(String dni){
        String sql="select * from reserva where DNI_CLIENTE='"+dni+"'";
        Object[]f=Acceso.buscar(sql);
        if(f!=null){
            return f[3].toString();
        }
        return null;
    }
    
    public static String buscarAlojamientocodhabi(String codhab){
        String sql="select * from reserva where COD_HAB='"+codhab+"'";
        Object[]f=Acceso.buscar(sql);
        if(f!=null){
            return f[1].toString();
        }
        return null;
    }
    
    public static String grabarAlojamiento(Alojamiento a){
        // Construir la consulta SQL para insertar la reserva en la base de datos
        String sql = "insert into reserva values ('" + a.Codigoautomatico() + "','" + a.getCli().getDni() + "','"+a.getEmpleado().getDni()+"',"
                + "'" + a.getHab().getCod() + "','" + a.HoyAlojamiento() + "','" + a.getFecInicio() + "',"
                + "'" + a.getFecFin() + "'," + a.Importe() + ")";
        return Acceso.ejecutar(sql);
    }
    
    public static String RegistrarAlojamiento(List<Alojamiento> alojamientos) {
        StringBuilder errorMessages = new StringBuilder();
        for (Alojamiento a : alojamientos) {
            String result = grabarAlojamiento(a);
            if (result != null) {
                errorMessages.append("Error al guardar la reserva ").append(a.getCodRes()).append(": ").append(result).append("\n");
            }
        }
        return errorMessages.length() > 0 ? errorMessages.toString() : null;
    }
    
    public static String cambioEstado(Habitacion h){
        String sql="update habitacion set ESTADO = 'O' where COD= '"+h.getCod()+"'";
        return Acceso.ejecutar(sql);
    }
    
}
