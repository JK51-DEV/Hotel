package servicio;

public class DaoAlojamiento {
    
    
    
    public static String buscarAlojamiento(String dni){
        String sql="select * from reserva where DNI_CLIENTE='"+dni+"'";
        Object[]f=Acceso.buscar(sql);
        if(f!=null){
            return f[2].toString();
        }
        return null;
    }
    
//    public static String grabarAlojamiento(Alojamiento r){
//    // Construir la consulta SQL para insertar la reserva en la base de datos
//        String sql="insert into reserva values ('"+r.Codigoautomatico()+"','"+r.getCli().getDni()+"',"
//                + "'"+r.getHab().getCod()+"','"+r.getFecha()+"','"+r.getFecInicio()+"',"
//                + "'"+r.getFecFin()+"',"+r.Importe()+")";
//        return Acceso.ejecutar(sql);
//    }
    
    public static String cambioEstado(Habitacion h){
        String sql="update habitacion set ESTADO = 'O' where COD= '"+h.getCod()+"'";
        return Acceso.ejecutar(sql);
    }
    
}
