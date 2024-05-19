//
package servicio;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "ServHabitacion")
public class ServHabitacion {

    @WebMethod(operationName = "registrarHabitacion")
    public String registrarHabitacion(@WebParam(name = "cod") String cod, @WebParam(name = "nom") String nom, @WebParam(name = "estado") String estado, @WebParam(name = "pre") String pre) {
        Habitacion h=new Habitacion(cod,nom,estado,Double.parseDouble(pre));
        String msg= DaoHabitacion.grabarHabitacion(h);
        if (msg==null) {
            msg="Se guardo habitacion";
        }else{
            msg="NO se guardo habitacion";
        }
        return msg;
    }

    @WebMethod(operationName = "buscarHabitacion")
    public String buscarHabitacion(@WebParam(name = "cod") String cod) {
        String res;
        Habitacion nom=DaoHabitacion.buscarHabitacion(cod);
        res="CODIGO: "+nom.getCod()+" NOMBRE: "+nom.getNom()+" ESTADO: "+ nom.getEstado()+" PRECIO: "+nom.getPre();
        return res;
    }

    @WebMethod(operationName = "listarHabitacion")
    public List<Habitacion> listarHabitacion() {
        return DaoHabitacion.listarHabitacion();
    }

}
