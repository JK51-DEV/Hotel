package servicio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Alojamiento {
    private String codRes;
    private Habitacion hab;
    private Cliente cli;
    private Empleado empleado;
    private String fecInicio, fecFin;
    private String fecCreacion;
    private Double imp;

    public Alojamiento() {
    }

    public Alojamiento(String codRes, Habitacion hab, Cliente cli, Empleado empleado, String fecInicio, String fecFin, String fecCreacion, Double imp) {
        this.codRes = codRes;
        this.hab = hab;
        this.cli = cli;
        this.empleado = empleado;
        this.fecInicio = fecInicio;
        this.fecFin = fecFin;
        this.fecCreacion = fecCreacion;
        this.imp = imp;
    }
    
    public String getFecha(){
        Date dat=new Date();
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(dat);
    }

    public String getCodRes() {
        return codRes;
    }

    public void setCodRes(String codRes) {
        this.codRes = codRes;
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

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
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

    public String getFecCreacion() {
        return fecCreacion;
    }

    public void setFecCreacion(String fecCreacion) {
        this.fecCreacion = fecCreacion;
    }

    public Double getImp() {
        return imp;
    }

    public void setImp(Double imp) {
        this.imp = imp;
    }
    
    
    
    
}
