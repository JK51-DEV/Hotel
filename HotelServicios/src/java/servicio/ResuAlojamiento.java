
package servicio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lume
 */
public class ResuAlojamiento {
    private List<Alojamiento> alojamiento=new ArrayList();

    public List<Alojamiento> getResumenAlojamiento() {
        return alojamiento;
    }

    public void getResumenAlojamiento(List<Alojamiento> alojamiento) {
        this.alojamiento = alojamiento;
    }

     public void agregar(Reserva res, Empleado empleado) {

        if (res != null) {
            Alojamiento aloj = new Alojamiento(res,empleado);
            alojamiento.add(aloj);
        } else {
            throw new IllegalArgumentException("Ningún parámetro debe ser nulo");
        }
    }
    public void limpiar() {
        alojamiento.clear();
    }

    

    
    
    
    
    
}
