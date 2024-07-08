
package servicio;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Lume
 */
@WebService(serviceName = "ServFactura")
public class ServFactura {
//
//    @WebMethod(operationName = "generarfactura")
//    public List<Factura> generarfactura(@WebParam(name = "dni") String dni, @WebParam(name = "reser") String res, @WebParam(name = "compra") String compra) {
//        List<Factura> nom = DaoFactura.generar_factura(dni, res, compra);
//        if (nom != null) {
//            return nom;
//        } else {
//            return new ArrayList<>();
//        }
//    }
    
    @WebMethod(operationName = "generarfactura")
    public List<Factura> generarfactura(@WebParam(name = "dni") String dni, @WebParam(name = "reser") String res, @WebParam(name = "compra") String compra) {
        
        Reserva reserva = DaoReserva.buscarReservaLista(res);
        
        if (reserva != null && reserva.getCli() != null && reserva.getCli().getDni().equals(dni)) {
            List<Factura> facturas = DaoFactura.generar_factura(dni, res, compra);
            if (facturas != null) {
                return facturas;
            } else {
                return new ArrayList<>();
            }
        } else {
            return new ArrayList<>(); // o lanzar una excepción, según la lógica de tu aplicación
        }
    }

    @WebMethod(operationName = "buscarMontoCompra")
    public String buscarMontoCompra(@WebParam(name = "num") String num) {
        String res;
        String nom=DaoFactura.buscarMontoCompra(num);
        if (nom != null) {
            return nom;
        }else{
            res="No existe reserva";
        }
    return res;
    }
    
    
    
}
