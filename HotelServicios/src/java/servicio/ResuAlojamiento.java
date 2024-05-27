
package servicio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lume
 */
public class ResuAlojamiento {
    private List<Alojamiento> alojamiento=new ArrayList();
    private double tot;

    public List<Alojamiento> getResumenAlojamiento() {
        return alojamiento;
    }

    public void getResumenAlojamiento(List<Alojamiento> alojamiento) {
        this.alojamiento = alojamiento;
    }

    public double getTot() {
        double total=0;
        for(int i=0;i<alojamiento.size();i++){
            Alojamiento aloj=(Alojamiento)alojamiento.get(i);
            total+=aloj.Importe();
        }
        tot=total;
        return tot;
    }

    public void setTot(double tot) {
        this.tot = tot;
    }
    
     public void agregar(Habitacion hab, Cliente cli, Empleado empleado, String fecInicio, String fecFin) {

        if (hab != null && cli != null && empleado != null && fecInicio != null && fecFin != null) {
            Alojamiento aloj = new Alojamiento(hab,cli, empleado, fecInicio, fecFin);
            alojamiento.add(aloj);
        } else {
            throw new IllegalArgumentException("Ningún parámetro debe ser nulo");
        }
    }
    public void limpiar() {
        alojamiento.clear();
    }

    

    
    
    
    
    
}
