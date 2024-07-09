package servicio;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import static servicio.DaoFactura.*;

/**
 *
 * @author Lume
 */
public class Factura {
    private String codfac;
    private Cliente cliente;
    private Alojamiento aloj;
    private Compra comp;
    private String fecfacturacion;
    private double tot;

    public Factura() {
    }

    public Factura(Cliente cliente, Alojamiento aloj, Compra comp) {
        this.cliente = cliente;
        this.aloj = aloj;
        this.comp = comp;
    }

    public Factura(String codfac, Cliente cliente, Alojamiento aloj, Compra comp, String fecfacturacion, double tot) {
        this.codfac = codfac;
        this.cliente = cliente;
        this.aloj = aloj;
        this.comp = comp;
        this.fecfacturacion = fecfacturacion;
        this.tot = tot;
    }

    
    
    public String Codigoautomatico(){
        List<Factura> factura = listarFacturas();
        int siguienteNumero = factura.size() + 1;
        codfac = String.format("F%03d", siguienteNumero);
        return codfac;
    }
    public String Hoy() {
        Date dat=new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(dat);
    }

    public String getCodfac() {
        return codfac;
    }

    public void setCodfac(String codfac) {
        this.codfac = codfac;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Alojamiento getAloj() {
        return aloj;
    }

    public void setAloj(Alojamiento aloj) {
        this.aloj = aloj;
    }

    public Compra getComp() {
        return comp;
    }

    public void setComp(Compra comp) {
        this.comp = comp;
    }

    public String getFecfacturacion() {
        return fecfacturacion;
    }

    public void setFecfacturacion(String fecfacturacion) {
        this.fecfacturacion = fecfacturacion;
    }

    public double getTot() {
        return tot;
    }

    public void setTot(double tot) {
        this.tot = tot;
    }

    
    
}
