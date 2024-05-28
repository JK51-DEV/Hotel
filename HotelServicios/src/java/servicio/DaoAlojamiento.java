package servicio;

import java.util.ArrayList;
import java.util.List;
import static servicio.DaoReserva.grabarReservas;

public class DaoAlojamiento {
    public static List<Alojamiento> listarAlojamiento() {
    String sql = "select * from alojamiento";
    List tabla = Acceso.listar(sql);
    List lis = new ArrayList();
    for (int i = 0; i < tabla.size(); i++) {
        Object[] f = (Object[]) tabla.get(i);
        Alojamiento aloj = new Alojamiento();
        Reserva reserva = DaoReserva.buscarReservaLista(f[1].toString());
        aloj.setCodAloj(f[0].toString());
        aloj.setReserva(reserva);
        aloj.setFecCreacionAloj(f[3].toString()); // Asignar la fecha de creación desde la entidad alojamiento
        lis.add(aloj);
    }
    return lis;
    }
    
    public List<Alojamiento> BuscarAlojamiento(String codaloj) {
    String sql="select * from alojamiento where cod_aloj='"+codaloj+"'";
    List tabla = Acceso.listar(sql);
    List lis = new ArrayList();
    for (int i = 0; i < tabla.size(); i++) {
        Object[] f = (Object[]) tabla.get(i);
        Alojamiento aloj = new Alojamiento();
        Reserva reserva = DaoReserva.buscarReservaLista(f[1].toString());
        aloj.setCodAloj(f[0].toString());
        aloj.setReserva(reserva);
        aloj.setFecCreacionAloj(f[3].toString()); // Asignar la fecha de creación desde la entidad alojamiento
        lis.add(aloj);
    }
    return lis;
    }
    
    public static String buscarAlojamiento(String codaloj){
        String sql="select * from alojamiento where cod_aloj='"+codaloj+"'";
        Object[]f=Acceso.buscar(sql);
        if(f!=null){
            
            return "Codigo Alojamiento: "+f[0].toString()+" Codigo Reserva: "+f[1].toString()+" DNI empleado: "+f[2].toString();
        }
        return null;
    }
    // busca alojamiento por codifo de reserva
    public static String buscarAlojamientocodRES(String codres){
        String sql="select * from alojamiento where COD_RES='"+codres+"'";
        Object[]f=Acceso.buscar(sql);
        if(f!=null){
            return f[1].toString();
        }
        return null;
    }
    
    public static String grabarAlojamiento(Alojamiento a){
        // Construir la consulta SQL para insertar la reserva en la base de datos
        String sql = "insert into alojamiento values ('" + a.CodigoautomaticoAloj() + "','" + a.getReserva().getCodRes()+ "','" + a.getEmpleado().getDni()+ "','" + a.HoyAlojamiento() + "')";
        return Acceso.ejecutar(sql);
    }
    
    public static String RegistrarAlojamiento(List<Alojamiento> alojamiento) {
        StringBuilder errorMessages = new StringBuilder();
        for (Alojamiento a : alojamiento) {
            String result = grabarAlojamiento(a);
            if (result != null) {
                errorMessages.append("Error al guardar el alojamiento ").append(a.getCodAloj()).append(": ").append(result).append("\n");
            }
        }
        return errorMessages.length() > 0 ? errorMessages.toString() : null;
    }
    

}
