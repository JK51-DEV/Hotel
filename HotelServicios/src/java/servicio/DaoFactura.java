
package servicio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lume
 */
public class DaoFactura {
    
    public static String buscarMontoCompra(String num) {
        String sql = "select * from compra where num='" + num + "'";
        Object[] f = Acceso.buscar(sql);
        if (f != null) {
            return f[2].toString();
        }
        return null;
    }
    
    
    public static List<Factura> generar_factura(String dni, String res, String compra) {
    List<Factura> lis = new ArrayList<>();

    // Crear la factura
    Factura fac = new Factura();
    Cliente cli = DaoCliente.buscar(dni);
    Reserva reser = DaoReserva.buscarReservaLista(res);
    Compra comp = DaoCompra.buscarcompra(compra);
    
    double totalFactura = 0.0;
    if (reser != null) {
        totalFactura += reser.Importe();
    }
    
    String totalCompraStr = buscarMontoCompra(comp.getNum());
        if (totalCompraStr != null) {
            double totalCompra = Double.parseDouble(totalCompraStr);
            totalFactura += totalCompra;
        }
    
    fac.setCliente(cli);
    fac.setRes(reser);
    fac.setComp(comp);
    fac.setTot(totalFactura);
   
    lis.add(fac);

    return lis;
}

    
}
