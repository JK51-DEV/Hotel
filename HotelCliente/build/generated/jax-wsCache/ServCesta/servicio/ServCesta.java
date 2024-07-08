
package servicio;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
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
@WebService(name = "ServCesta", targetNamespace = "http://servicio/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServCesta {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTotal", targetNamespace = "http://servicio/", className = "servicio.GetTotal")
    @ResponseWrapper(localName = "getTotalResponse", targetNamespace = "http://servicio/", className = "servicio.GetTotalResponse")
    @Action(input = "http://servicio/ServCesta/getTotalRequest", output = "http://servicio/ServCesta/getTotalResponse")
    public String getTotal();

    /**
     * 
     * @param can
     * @param pre
     * @param cod
     * @param nom
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "agregarLinea", targetNamespace = "http://servicio/", className = "servicio.AgregarLinea")
    @ResponseWrapper(localName = "agregarLineaResponse", targetNamespace = "http://servicio/", className = "servicio.AgregarLineaResponse")
    @Action(input = "http://servicio/ServCesta/agregarLineaRequest", output = "http://servicio/ServCesta/agregarLineaResponse")
    public String agregarLinea(
        @WebParam(name = "cod", targetNamespace = "")
        String cod,
        @WebParam(name = "nom", targetNamespace = "")
        String nom,
        @WebParam(name = "pre", targetNamespace = "")
        String pre,
        @WebParam(name = "can", targetNamespace = "")
        String can);

    /**
     * 
     * @param cod
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "quitarLinea", targetNamespace = "http://servicio/", className = "servicio.QuitarLinea")
    @ResponseWrapper(localName = "quitarLineaResponse", targetNamespace = "http://servicio/", className = "servicio.QuitarLineaResponse")
    @Action(input = "http://servicio/ServCesta/quitarLineaRequest", output = "http://servicio/ServCesta/quitarLineaResponse")
    public String quitarLinea(
        @WebParam(name = "cod", targetNamespace = "")
        String cod);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crearCesta", targetNamespace = "http://servicio/", className = "servicio.CrearCesta")
    @ResponseWrapper(localName = "crearCestaResponse", targetNamespace = "http://servicio/", className = "servicio.CrearCestaResponse")
    @Action(input = "http://servicio/ServCesta/crearCestaRequest", output = "http://servicio/ServCesta/crearCestaResponse")
    public String crearCesta();

    /**
     * 
     * @return
     *     returns java.util.List<servicio.Linea>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCesta", targetNamespace = "http://servicio/", className = "servicio.GetCesta")
    @ResponseWrapper(localName = "getCestaResponse", targetNamespace = "http://servicio/", className = "servicio.GetCestaResponse")
    @Action(input = "http://servicio/ServCesta/getCestaRequest", output = "http://servicio/ServCesta/getCestaResponse")
    public List<Linea> getCesta();

    /**
     * 
     * @param fec
     * @param num
     * @param tot
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "grabarCompra", targetNamespace = "http://servicio/", className = "servicio.GrabarCompra")
    @ResponseWrapper(localName = "grabarCompraResponse", targetNamespace = "http://servicio/", className = "servicio.GrabarCompraResponse")
    @Action(input = "http://servicio/ServCesta/grabarCompraRequest", output = "http://servicio/ServCesta/grabarCompraResponse")
    public String grabarCompra(
        @WebParam(name = "num", targetNamespace = "")
        String num,
        @WebParam(name = "fec", targetNamespace = "")
        String fec,
        @WebParam(name = "tot", targetNamespace = "")
        double tot);

}
