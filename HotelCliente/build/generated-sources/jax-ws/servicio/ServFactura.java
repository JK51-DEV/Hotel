
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
@WebService(name = "ServFactura", targetNamespace = "http://servicio/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServFactura {


    /**
     * 
     * @param num
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarMontoCompra", targetNamespace = "http://servicio/", className = "servicio.BuscarMontoCompra")
    @ResponseWrapper(localName = "buscarMontoCompraResponse", targetNamespace = "http://servicio/", className = "servicio.BuscarMontoCompraResponse")
    @Action(input = "http://servicio/ServFactura/buscarMontoCompraRequest", output = "http://servicio/ServFactura/buscarMontoCompraResponse")
    public String buscarMontoCompra(
        @WebParam(name = "num", targetNamespace = "")
        String num);

    /**
     * 
     * @param compra
     * @param reser
     * @param dni
     * @return
     *     returns java.util.List<servicio.Factura>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "generarfactura", targetNamespace = "http://servicio/", className = "servicio.Generarfactura")
    @ResponseWrapper(localName = "generarfacturaResponse", targetNamespace = "http://servicio/", className = "servicio.GenerarfacturaResponse")
    @Action(input = "http://servicio/ServFactura/generarfacturaRequest", output = "http://servicio/ServFactura/generarfacturaResponse")
    public List<Factura> generarfactura(
        @WebParam(name = "dni", targetNamespace = "")
        String dni,
        @WebParam(name = "reser", targetNamespace = "")
        String reser,
        @WebParam(name = "compra", targetNamespace = "")
        String compra);

}