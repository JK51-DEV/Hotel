
package servicio;

/**
 *
 * @author Lume
 */
public class Factura {
    private String codfac;
    private Cliente cliente;
    private Reserva res;
    private Compra comp;
    private String fecfacturacion;
    private double tot;

    public Factura() {
    }

    public Factura(String codfac, Cliente cliente, Reserva res, Compra comp, String fecfacturacion, double tot) {
        this.codfac = codfac;
        this.cliente = cliente;
        this.res = res;
        this.comp = comp;
        this.fecfacturacion = fecfacturacion;
        this.tot = tot;
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

    public Reserva getRes() {
        return res;
    }

    public void setRes(Reserva res) {
        this.res = res;
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

    
//    public void calcularTotal() {
//    double importe = (res != null) ? res.Importe() : 0.0;
//    double totalCompra = (comp != null) ? comp.getTotal() : 0.0;
//    this.tot = importe + 7;
    



    
    
}
