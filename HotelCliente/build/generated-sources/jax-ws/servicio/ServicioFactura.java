
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
@WebService(name = "ServicioFactura", targetNamespace = "http://servicio/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicioFactura {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "codigoautomatic", targetNamespace = "http://servicio/", className = "servicio.Codigoautomatic")
    @ResponseWrapper(localName = "codigoautomaticResponse", targetNamespace = "http://servicio/", className = "servicio.CodigoautomaticResponse")
    @Action(input = "http://servicio/ServicioFactura/codigoautomaticRequest", output = "http://servicio/ServicioFactura/codigoautomaticResponse")
    public String codigoautomatic();

    /**
     * 
     * @param codfac
     * @return
     *     returns java.util.List<servicio.Factura>
     */
    @WebMethod(operationName = "listar_factura")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listar_factura", targetNamespace = "http://servicio/", className = "servicio.ListarFactura")
    @ResponseWrapper(localName = "listar_facturaResponse", targetNamespace = "http://servicio/", className = "servicio.ListarFacturaResponse")
    @Action(input = "http://servicio/ServicioFactura/listar_facturaRequest", output = "http://servicio/ServicioFactura/listar_facturaResponse")
    public List<Factura> listarFactura(
        @WebParam(name = "codfac", targetNamespace = "")
        String codfac);

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
    @Action(input = "http://servicio/ServicioFactura/buscarMontoCompraRequest", output = "http://servicio/ServicioFactura/buscarMontoCompraResponse")
    public String buscarMontoCompra(
        @WebParam(name = "num", targetNamespace = "")
        String num);

    /**
     * 
     * @return
     *     returns java.util.List<servicio.Factura>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarfacturas", targetNamespace = "http://servicio/", className = "servicio.Listarfacturas")
    @ResponseWrapper(localName = "listarfacturasResponse", targetNamespace = "http://servicio/", className = "servicio.ListarfacturasResponse")
    @Action(input = "http://servicio/ServicioFactura/listarfacturasRequest", output = "http://servicio/ServicioFactura/listarfacturasResponse")
    public List<Factura> listarfacturas();

    /**
     * 
     * @param cli
     * @param res
     * @param comp
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "agregar_factura")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "agregar_factura", targetNamespace = "http://servicio/", className = "servicio.AgregarFactura")
    @ResponseWrapper(localName = "agregar_facturaResponse", targetNamespace = "http://servicio/", className = "servicio.AgregarFacturaResponse")
    @Action(input = "http://servicio/ServicioFactura/agregar_facturaRequest", output = "http://servicio/ServicioFactura/agregar_facturaResponse")
    public String agregarFactura(
        @WebParam(name = "cli", targetNamespace = "")
        String cli,
        @WebParam(name = "res", targetNamespace = "")
        String res,
        @WebParam(name = "comp", targetNamespace = "")
        String comp);

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
    @Action(input = "http://servicio/ServicioFactura/generarfacturaRequest", output = "http://servicio/ServicioFactura/generarfacturaResponse")
    public List<Factura> generarfactura(
        @WebParam(name = "dni", targetNamespace = "")
        String dni,
        @WebParam(name = "reser", targetNamespace = "")
        String reser,
        @WebParam(name = "compra", targetNamespace = "")
        String compra);

}
