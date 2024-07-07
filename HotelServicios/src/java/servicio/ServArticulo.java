package servicio;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "ServArticulo")
public class ServArticulo {

    @WebMethod(operationName = "listarArticulos")
    public java.util.List<Object[]> listarArticulos() {        
        return Acceso.listar("select * from articulo");
    }
}
