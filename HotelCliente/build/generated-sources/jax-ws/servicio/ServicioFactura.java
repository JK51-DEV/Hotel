
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
    @WebMethod(operationName = "registrar_Factura")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "registrar_Factura", targetNamespace = "http://servicio/", className = "servicio.RegistrarFactura")
    @ResponseWrapper(localName = "registrar_FacturaResponse", targetNamespace = "http://servicio/", className = "servicio.RegistrarFacturaResponse")
    @Action(input = "http://servicio/ServicioFactura/registrar_FacturaRequest", output = "http://servicio/ServicioFactura/registrar_FacturaResponse")
    public String registrarFactura();

    /**
     * 
     * @param cli
     * @param comp
     * @param codaloj
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "agregar_resumen_factura")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "agregar_resumen_factura", targetNamespace = "http://servicio/", className = "servicio.AgregarResumenFactura")
    @ResponseWrapper(localName = "agregar_resumen_facturaResponse", targetNamespace = "http://servicio/", className = "servicio.AgregarResumenFacturaResponse")
    @Action(input = "http://servicio/ServicioFactura/agregar_resumen_facturaRequest", output = "http://servicio/ServicioFactura/agregar_resumen_facturaResponse")
    public String agregarResumenFactura(
        @WebParam(name = "cli", targetNamespace = "")
        String cli,
        @WebParam(name = "codaloj", targetNamespace = "")
        String codaloj,
        @WebParam(name = "comp", targetNamespace = "")
        String comp);

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
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "resumenFactura", targetNamespace = "http://servicio/", className = "servicio.ResumenFactura")
    @ResponseWrapper(localName = "resumenFacturaResponse", targetNamespace = "http://servicio/", className = "servicio.ResumenFacturaResponse")
    @Action(input = "http://servicio/ServicioFactura/resumenFacturaRequest", output = "http://servicio/ServicioFactura/resumenFacturaResponse")
    public List<Object> resumenFactura();

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
     * @param cli
     * @param comp
     * @param codaloj
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "guardarfactura", targetNamespace = "http://servicio/", className = "servicio.Guardarfactura")
    @ResponseWrapper(localName = "guardarfacturaResponse", targetNamespace = "http://servicio/", className = "servicio.GuardarfacturaResponse")
    @Action(input = "http://servicio/ServicioFactura/guardarfacturaRequest", output = "http://servicio/ServicioFactura/guardarfacturaResponse")
    public String guardarfactura(
        @WebParam(name = "cli", targetNamespace = "")
        String cli,
        @WebParam(name = "codaloj", targetNamespace = "")
        String codaloj,
        @WebParam(name = "comp", targetNamespace = "")
        String comp);

    /**
     * 
     * @param cli
     * @param comp
     * @param codaloj
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
        @WebParam(name = "codaloj", targetNamespace = "")
        String codaloj,
        @WebParam(name = "comp", targetNamespace = "")
        String comp);

}
