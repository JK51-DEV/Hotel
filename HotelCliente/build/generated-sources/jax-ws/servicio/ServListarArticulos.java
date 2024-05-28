
package servicio;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServListarArticulos", targetNamespace = "http://servicio/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServListarArticulos {


    /**
     * 
     * @return
     *     returns java.util.List<servicio.Articulo>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarArticulos", targetNamespace = "http://servicio/", className = "servicio.ListarArticulos")
    @ResponseWrapper(localName = "listarArticulosResponse", targetNamespace = "http://servicio/", className = "servicio.ListarArticulosResponse")
    @Action(input = "http://servicio/ServListarArticulos/listarArticulosRequest", output = "http://servicio/ServListarArticulos/listarArticulosResponse")
    public List<Articulo> listarArticulos();

}
