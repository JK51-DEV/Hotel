
package servicio;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "ServVenta")
public class ServVenta {
    private Venta ven;
    
    @WebMethod(operationName = "nuevaVenta")
    public Venta nuevaVenta() {
        ven=new Venta();
        ven.setNum(DaoVenta.getNumGenerado());
        ven.setFec(Fecha.getFec());
        ven.setHor(Fecha.getHor());
        return ven;
    }

    @WebMethod(operationName = "grabarVenta")
    public String grabarVenta(@WebParam(name = "dni") String dni, @WebParam(name = "cod") String cod, @WebParam(name = "tot") double tot) {
        //TODO write your implementation code here:
        return null;
    }
}
