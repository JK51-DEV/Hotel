
package servicio;
import servicio.Habitacion;
import java.util.ArrayList;
import java.util.List;

public class DaoReserva {
    public static List<Reserva>listarReservas(){
        String sql="select * from reserva";
        List tabla=Acceso.listar(sql);
        List lis=new ArrayList();
        for(int i=0;i<tabla.size();i++){
            Object[]f=(Object[])tabla.get(i); 
            Reserva res=new Reserva();
            Cliente cli = DaoCliente.buscar(f[1].toString());
            res.setCli(cli);
            Habitacion hab = DaoHabitacion.buscarHabitacionCOD(f[2].toString());
            res.setHab(hab);         
            res.setCodRes(f[0].toString());
            res.setFecCreacion(f[3].toString());
            res.setFecInicio(f[4].toString());
            res.setFecFin(f[5].toString());
            res.setImp(Double.parseDouble(f[6].toString()));
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
            // Obtener la lista de reservas para determinar el siguiente código consecutivo
    List<Reserva> reservas = listarReservas();
    // Determinar el siguiente número de reserva
    int siguienteNumero = reservas.size() + 1;
    // Formatear el número de reserva con ceros a la izquierda para mantener el formato RXXX
    String codigoReserva = String.format("R%03d", siguienteNumero);
    
    // Asignar el código de reserva generado a la reserva
    r.setCodRes(codigoReserva);
    
    // Construir la consulta SQL para insertar la reserva en la base de datos
        String sql="insert into reserva values ('"+r.getCodRes()+"','"+r.getCli().getDni()+"',"
                + "'"+r.getHab().getCod()+"','"+r.getFecha()+"','"+r.getFecInicio()+"',"
                + "'"+r.getFecFin()+"',"+r.importe()+")";
        return Acceso.ejecutar(sql);
    }
    
    public static String cambioEstado(Habitacion h){
        String sql="update habitacion set ESTADO = 'O' where COD= '"+h.getCod()+"'";
        return Acceso.ejecutar(sql);
    }
    
    
}
