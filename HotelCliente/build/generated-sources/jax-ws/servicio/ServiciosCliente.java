
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
@WebService(name = "ServiciosCliente", targetNamespace = "http://servicio/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServiciosCliente {


    /**
     * 
     * @param dni
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarCliente", targetNamespace = "http://servicio/", className = "servicio.BuscarCliente")
    @ResponseWrapper(localName = "buscarClienteResponse", targetNamespace = "http://servicio/", className = "servicio.BuscarClienteResponse")
    @Action(input = "http://servicio/ServiciosCliente/buscarClienteRequest", output = "http://servicio/ServiciosCliente/buscarClienteResponse")
    public String buscarCliente(
        @WebParam(name = "dni", targetNamespace = "")
        String dni);

    /**
     * 
     * @param nom
     * @param dni
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarUsuarioInicioSesion", targetNamespace = "http://servicio/", className = "servicio.BuscarUsuarioInicioSesion")
    @ResponseWrapper(localName = "buscarUsuarioInicioSesionResponse", targetNamespace = "http://servicio/", className = "servicio.BuscarUsuarioInicioSesionResponse")
    @Action(input = "http://servicio/ServiciosCliente/buscarUsuarioInicioSesionRequest", output = "http://servicio/ServiciosCliente/buscarUsuarioInicioSesionResponse")
    public boolean buscarUsuarioInicioSesion(
        @WebParam(name = "dni", targetNamespace = "")
        String dni,
        @WebParam(name = "nom", targetNamespace = "")
        String nom);

    /**
     * 
     * @param nom
     * @param dni
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "autenticarCliente", targetNamespace = "http://servicio/", className = "servicio.AutenticarCliente")
    @ResponseWrapper(localName = "autenticarClienteResponse", targetNamespace = "http://servicio/", className = "servicio.AutenticarClienteResponse")
    @Action(input = "http://servicio/ServiciosCliente/autenticarClienteRequest", output = "http://servicio/ServiciosCliente/autenticarClienteResponse")
    public boolean autenticarCliente(
        @WebParam(name = "dni", targetNamespace = "")
        String dni,
        @WebParam(name = "nom", targetNamespace = "")
        String nom);

    /**
     * 
     * @param dni
     * @return
     *     returns java.util.List<servicio.Cliente>
     */
    @WebMethod(operationName = "dis_listar_avanzado")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "dis_listar_avanzado", targetNamespace = "http://servicio/", className = "servicio.DisListarAvanzado")
    @ResponseWrapper(localName = "dis_listar_avanzadoResponse", targetNamespace = "http://servicio/", className = "servicio.DisListarAvanzadoResponse")
    @Action(input = "http://servicio/ServiciosCliente/dis_listar_avanzadoRequest", output = "http://servicio/ServiciosCliente/dis_listar_avanzadoResponse")
    public List<Cliente> disListarAvanzado(
        @WebParam(name = "dni", targetNamespace = "")
        String dni);

    /**
     * 
     * @param dni
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarNombre", targetNamespace = "http://servicio/", className = "servicio.BuscarNombre")
    @ResponseWrapper(localName = "buscarNombreResponse", targetNamespace = "http://servicio/", className = "servicio.BuscarNombreResponse")
    @Action(input = "http://servicio/ServiciosCliente/buscarNombreRequest", output = "http://servicio/ServiciosCliente/buscarNombreResponse")
    public String buscarNombre(
        @WebParam(name = "dni", targetNamespace = "")
        String dni);

    /**
     * 
     * @param dni
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "elmininarCliente", targetNamespace = "http://servicio/", className = "servicio.ElmininarCliente")
    @ResponseWrapper(localName = "elmininarClienteResponse", targetNamespace = "http://servicio/", className = "servicio.ElmininarClienteResponse")
    @Action(input = "http://servicio/ServiciosCliente/elmininarClienteRequest", output = "http://servicio/ServiciosCliente/elmininarClienteResponse")
    public String elmininarCliente(
        @WebParam(name = "dni", targetNamespace = "")
        String dni);

    /**
     * 
     * @return
     *     returns java.util.List<servicio.Cliente>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarCliente", targetNamespace = "http://servicio/", className = "servicio.ListarCliente")
    @ResponseWrapper(localName = "listarClienteResponse", targetNamespace = "http://servicio/", className = "servicio.ListarClienteResponse")
    @Action(input = "http://servicio/ServiciosCliente/listarClienteRequest", output = "http://servicio/ServiciosCliente/listarClienteResponse")
    public List<Cliente> listarCliente();

    /**
     * 
     * @param nom
     * @param dni
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "grabarCliente", targetNamespace = "http://servicio/", className = "servicio.GrabarCliente")
    @ResponseWrapper(localName = "grabarClienteResponse", targetNamespace = "http://servicio/", className = "servicio.GrabarClienteResponse")
    @Action(input = "http://servicio/ServiciosCliente/grabarClienteRequest", output = "http://servicio/ServiciosCliente/grabarClienteResponse")
    public boolean grabarCliente(
        @WebParam(name = "dni", targetNamespace = "")
        String dni,
        @WebParam(name = "nom", targetNamespace = "")
        String nom);

    /**
     * 
     * @param dni
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscar", targetNamespace = "http://servicio/", className = "servicio.Buscar")
    @ResponseWrapper(localName = "buscarResponse", targetNamespace = "http://servicio/", className = "servicio.BuscarResponse")
    @Action(input = "http://servicio/ServiciosCliente/buscarRequest", output = "http://servicio/ServiciosCliente/buscarResponse")
    public List<Object> buscar(
        @WebParam(name = "dni", targetNamespace = "")
        String dni);

}
