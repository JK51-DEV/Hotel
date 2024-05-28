
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
@WebService(name = "ServAlojamiento", targetNamespace = "http://servicio/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServAlojamiento {


    /**
     * 
     * @return
     *     returns java.util.List<servicio.Alojamiento>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarAlojamiento", targetNamespace = "http://servicio/", className = "servicio.ListarAlojamiento")
    @ResponseWrapper(localName = "listarAlojamientoResponse", targetNamespace = "http://servicio/", className = "servicio.ListarAlojamientoResponse")
    @Action(input = "http://servicio/ServAlojamiento/listarAlojamientoRequest", output = "http://servicio/ServAlojamiento/listarAlojamientoResponse")
    public List<Alojamiento> listarAlojamiento();

    /**
     * 
     * @param codres
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarAlojamientoRES", targetNamespace = "http://servicio/", className = "servicio.BuscarAlojamientoRES")
    @ResponseWrapper(localName = "buscarAlojamientoRESResponse", targetNamespace = "http://servicio/", className = "servicio.BuscarAlojamientoRESResponse")
    @Action(input = "http://servicio/ServAlojamiento/buscarAlojamientoRESRequest", output = "http://servicio/ServAlojamiento/buscarAlojamientoRESResponse")
    public String buscarAlojamientoRES(
        @WebParam(name = "codres", targetNamespace = "")
        String codres);

    /**
     * 
     * @param codaloj
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarAlojamiento", targetNamespace = "http://servicio/", className = "servicio.BuscarAlojamiento")
    @ResponseWrapper(localName = "buscarAlojamientoResponse", targetNamespace = "http://servicio/", className = "servicio.BuscarAlojamientoResponse")
    @Action(input = "http://servicio/ServAlojamiento/buscarAlojamientoRequest", output = "http://servicio/ServAlojamiento/buscarAlojamientoResponse")
    public String buscarAlojamiento(
        @WebParam(name = "codaloj", targetNamespace = "")
        String codaloj);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "registrarAlojamiento", targetNamespace = "http://servicio/", className = "servicio.RegistrarAlojamiento")
    @ResponseWrapper(localName = "registrarAlojamientoResponse", targetNamespace = "http://servicio/", className = "servicio.RegistrarAlojamientoResponse")
    @Action(input = "http://servicio/ServAlojamiento/registrarAlojamientoRequest", output = "http://servicio/ServAlojamiento/registrarAlojamientoResponse")
    public String registrarAlojamiento();

    /**
     * 
     * @return
     *     returns java.util.List<servicio.Alojamiento>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "resumenAlojamiento", targetNamespace = "http://servicio/", className = "servicio.ResumenAlojamiento")
    @ResponseWrapper(localName = "resumenAlojamientoResponse", targetNamespace = "http://servicio/", className = "servicio.ResumenAlojamientoResponse")
    @Action(input = "http://servicio/ServAlojamiento/resumenAlojamientoRequest", output = "http://servicio/ServAlojamiento/resumenAlojamientoResponse")
    public List<Alojamiento> resumenAlojamiento();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarResumenAloj", targetNamespace = "http://servicio/", className = "servicio.EliminarResumenAloj")
    @ResponseWrapper(localName = "eliminarResumenAlojResponse", targetNamespace = "http://servicio/", className = "servicio.EliminarResumenAlojResponse")
    @Action(input = "http://servicio/ServAlojamiento/eliminarResumenAlojRequest", output = "http://servicio/ServAlojamiento/eliminarResumenAlojResponse")
    public String eliminarResumenAloj();

    /**
     * 
     * @param codres
     * @param emp
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "agregarAlojamiento", targetNamespace = "http://servicio/", className = "servicio.AgregarAlojamiento")
    @ResponseWrapper(localName = "agregarAlojamientoResponse", targetNamespace = "http://servicio/", className = "servicio.AgregarAlojamientoResponse")
    @Action(input = "http://servicio/ServAlojamiento/agregarAlojamientoRequest", output = "http://servicio/ServAlojamiento/agregarAlojamientoResponse")
    public String agregarAlojamiento(
        @WebParam(name = "codres", targetNamespace = "")
        String codres,
        @WebParam(name = "emp", targetNamespace = "")
        String emp);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "codigoautomaticoaloj", targetNamespace = "http://servicio/", className = "servicio.Codigoautomaticoaloj")
    @ResponseWrapper(localName = "codigoautomaticoalojResponse", targetNamespace = "http://servicio/", className = "servicio.CodigoautomaticoalojResponse")
    @Action(input = "http://servicio/ServAlojamiento/codigoautomaticoalojRequest", output = "http://servicio/ServAlojamiento/codigoautomaticoalojResponse")
    public String codigoautomaticoaloj();

}
