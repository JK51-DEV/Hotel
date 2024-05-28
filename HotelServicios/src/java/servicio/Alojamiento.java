package servicio;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import static servicio.DaoAlojamiento.listarAlojamiento;

public class Alojamiento {
    private String codAloj;
    private Reserva reserva;
    private Empleado empleado;
    private String fecCreacionAloj;

    public Alojamiento() {
    }

    public Alojamiento(Reserva reserva, Empleado empleado) {
        this.reserva = reserva;
        this.empleado = empleado;
    }

    public String getCodAloj() {
        return codAloj;
    }

    public void setCodAloj(String codAloj) {
        this.codAloj = codAloj;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    public String getFecCreacionAloj() {
        return fecCreacionAloj;
    }

    public void setFecCreacionAloj(String fecCreacionAloj) {
        this.fecCreacionAloj = fecCreacionAloj;
    }

    // genera codigo automaticamente de alojamiento
    public String CodigoautomaticoAloj(){
        List<Alojamiento> alojamiento = listarAlojamiento();
        int siguienteNumero = alojamiento.size() + 1;
        codAloj = String.format("A%03d", siguienteNumero);
        return codAloj;
    }
    //genera fecha del dia automaticamente
    public String HoyAlojamiento(){
        Date dat=new Date();
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(dat);
    }
    
    
}
