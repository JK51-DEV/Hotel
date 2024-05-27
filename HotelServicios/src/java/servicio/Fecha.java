package servicio;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fecha {
    public static String getFec(){
        Date dat=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(dat);
    }
    public static String getHor(){
        Date dat=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
        return sdf.format(dat);
    }    
}
