package servicio;

public class DaoVenta {
    public static String getNumGenerado(){
        return Acceso.getNum("select * from venta");
    }
}
