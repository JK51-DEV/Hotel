package servicio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import static servicio.DaoReserva.listarReservas;

public class Reserva {
    private String codRes;
    private Habitacion hab;
    private Cliente cli;
    private String fecInicio, fecFin;
    private String fecCreacion;
    private Double imp;

    public Reserva() {
    }

    public Reserva( Habitacion hab, Cliente cli, String fecInicio, String fecFin) {
        if (hab == null || cli == null || fecInicio == null || fecFin == null) {
            throw new IllegalArgumentException("Ningún parámetro debe ser nulo");
        }
        this.hab = hab;
        this.cli = cli;
        this.fecInicio = fecInicio;
        this.fecFin = fecFin;
    }
    
    public String getFecha(){
        Date dat=new Date();
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(dat);
    }

    public String getFecCreacion() {
        return fecCreacion;
    }

    public void setFecCreacion(String fecCreacion) {
        this.fecCreacion = fecCreacion;
    }
    
    public String fechacreacion(){
        Date dat=new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        fecCreacion = sdf.format(dat);
        return fecCreacion;
    }

    public String getCodRes() {
        return codRes;
    }

    public void setCodRes(String codRes) {
        this.codRes = codRes;
    }
    
    public String Codigoautomatico(){
        List<Reserva> reservas = listarReservas();
        int siguienteNumero = reservas.size() + 1;
        codRes = String.format("R%03d", siguienteNumero);
        return codRes;
    }

    public Habitacion getHab() {
        return hab;
    }

    public void setHab(Habitacion hab) {
        this.hab = hab;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public String getFecInicio() {
        return fecInicio;
    }

    public void setFecInicio(String fecInicio) {
        this.fecInicio = fecInicio;
    }

    public String getFecFin() {
        return fecFin;
    }

    public void setFecFin(String fecFin) {
        this.fecFin = fecFin;
    }
    
    public static int diferenciaDias(String fecInicio, String fecFin){   
        Date dinicio = null, dfinal = null;
        long milis1, milis2, diff;     
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");     
        try {
            dinicio = sdf.parse(fecInicio);
            dfinal = sdf.parse(fecFin);                                           
        } catch (ParseException e) {     
            System.out.println("Se ha producido un error en los formatos de fechas");
        }              
         Calendar cinicio = Calendar.getInstance();
         Calendar cfinal = Calendar.getInstance();     
         cinicio.setTime(dinicio);
         cfinal.setTime(dfinal);        
         milis1 = cinicio.getTimeInMillis();     
         milis2 = cfinal.getTimeInMillis();    
         diff = milis2-milis1;        
         long diffdias = Math.abs ( diff / (24 * 60 * 60 * 1000) );     
         return (int) diffdias;
    }
   
    public Double getImp() {
        int dias = diferenciaDias(fecInicio, fecFin);
        double precioHabitacion = hab.getPre();
        imp = dias * precioHabitacion;
        return imp;
    }

    public void setImp(Double imp) {
        this.imp = imp;
    }
  
}