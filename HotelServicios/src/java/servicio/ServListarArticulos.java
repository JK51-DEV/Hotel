package servicio;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "ServListarArticulos")
public class ServListarArticulos {

    @WebMethod(operationName = "listarArticulos")
    public List<Articulo> listarArticulos() {        
        return DaoArticulo.listar();
    }
}
