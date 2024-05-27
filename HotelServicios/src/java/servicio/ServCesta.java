package servicio;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "ServCesta")
public class ServCesta {

    private Cesta cesta;
    
    @WebMethod(operationName = "crearCesta")
    public String crearCesta() {
        cesta = new Cesta();
        return "OK";
    }

    @WebMethod(operationName = "agregarLinea")
    public String agregarLinea(@WebParam(name = "cod") String cod, @WebParam(name = "nom") String nom, @WebParam(name = "pre") String pre, @WebParam(name = "can") String can) {
        cesta.agregar(cod, nom, Double.parseDouble(pre), Integer.parseInt(can));
        return "OK";
    }

    @WebMethod(operationName = "quitarLinea")
    public String quitarLinea(@WebParam(name = "cod") String cod) {
        cesta.quitar(cod);
        return "OK";
    }

    @WebMethod(operationName = "getCesta")
    public List<Linea> getCesta() {
        return cesta.getCes();
    }

    @WebMethod(operationName = "getTotal")
    public String getTotal() {
        return String.valueOf(cesta.getTot());
    }
}
