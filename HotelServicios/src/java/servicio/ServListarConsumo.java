package servicio;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "ServListarConsumo")
public class ServListarConsumo {

    @WebMethod(operationName = "listarConsumo")
    public List<Consumo> listarConsumo() {
        return DaoConsumo.listar();
    }
}
