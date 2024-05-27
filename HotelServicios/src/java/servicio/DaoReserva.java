
package servicio;
import servicio.Habitacion;
import java.util.ArrayList;
import java.util.List;

public class DaoReserva {
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
    
    public static String buscarReserva(String dni){
        String sql="select * from reserva where DNI_CLIENTE='"+dni+"'";
        Object[]f=Acceso.buscar(sql);
        if(f!=null){
            return f[2].toString();
        }
        return null;
    }
    
    public static String grabarReservas(Reserva r){
    // Construir la consulta SQL para insertar la reserva en la base de datos
        String sql="insert into reserva values ('"+r.Codigoautomatico()+"','"+r.getCli().getDni()+"',"
                + "'"+r.getHab().getCod()+"','"+r.getFecha()+"','"+r.getFecInicio()+"',"
                + "'"+r.getFecFin()+"',"+r.getImp()+")";
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
    
    public static String cambioEstado(Habitacion h){
        String sql="update habitacion set ESTADO = 'O' where COD= '"+h.getCod()+"'";
        return Acceso.ejecutar(sql);
    }
    
    
}
