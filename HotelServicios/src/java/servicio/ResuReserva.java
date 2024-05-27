
package servicio;

import java.util.ArrayList;
import java.util.List;

public class ResuReserva {
    private List<Reserva> resumen=new ArrayList();
    private double tot;

    public List<Reserva> getResumen() {
        return resumen;
    }

    public void setResumen(List<Reserva> resumen) {
        this.resumen = resumen;
    }

    public double getTot() {
        double total=0;
        for(int i=0;i<resumen.size();i++){
            Reserva res=(Reserva)resumen.get(i);
            total+=res.getImp();
        }
        tot=total;
        return tot;
    }

    public void setTot(double tot) {
        this.tot = tot;
    }
    
    public void agregar(Habitacion hab, Cliente cli, String fecInicio, String fecFin) {

        if (hab != null && cli != null && fecInicio != null && fecFin != null) {
            Reserva res = new Reserva(hab, cli, fecInicio, fecFin);
            resumen.add(res);
        } else {
            throw new IllegalArgumentException("Ningún parámetro debe ser nulo");
        }
    }
    public void limpiar() {
        resumen.clear();
    }

}
