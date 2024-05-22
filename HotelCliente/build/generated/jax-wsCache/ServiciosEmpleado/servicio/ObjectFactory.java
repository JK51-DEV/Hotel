
package servicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servicio package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AutenticarEmpleado_QNAME = new QName("http://servicio/", "autenticarEmpleado");
    private final static QName _AutenticarEmpleadoResponse_QNAME = new QName("http://servicio/", "autenticarEmpleadoResponse");
    private final static QName _BuscarAdministradorInicioSesion_QNAME = new QName("http://servicio/", "buscarAdministradorInicioSesion");
    private final static QName _BuscarAdministradorInicioSesionResponse_QNAME = new QName("http://servicio/", "buscarAdministradorInicioSesionResponse");
    private final static QName _BuscarEmpleado_QNAME = new QName("http://servicio/", "buscarEmpleado");
    private final static QName _BuscarEmpleadoResponse_QNAME = new QName("http://servicio/", "buscarEmpleadoResponse");
    private final static QName _BuscarNombreAdministrador_QNAME = new QName("http://servicio/", "buscarNombreAdministrador");
    private final static QName _BuscarNombreAdministradorResponse_QNAME = new QName("http://servicio/", "buscarNombreAdministradorResponse");
    private final static QName _ElmininarEmpleado_QNAME = new QName("http://servicio/", "elmininarEmpleado");
    private final static QName _ElmininarEmpleadoResponse_QNAME = new QName("http://servicio/", "elmininarEmpleadoResponse");
    private final static QName _GrabarEmpleado_QNAME = new QName("http://servicio/", "grabarEmpleado");
    private final static QName _GrabarEmpleadoResponse_QNAME = new QName("http://servicio/", "grabarEmpleadoResponse");
    private final static QName _ListarEmpleado_QNAME = new QName("http://servicio/", "listarEmpleado");
    private final static QName _ListarEmpleadoResponse_QNAME = new QName("http://servicio/", "listarEmpleadoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AutenticarEmpleado }
     * 
     */
    public AutenticarEmpleado createAutenticarEmpleado() {
        return new AutenticarEmpleado();
    }

    /**
     * Create an instance of {@link AutenticarEmpleadoResponse }
     * 
     */
    public AutenticarEmpleadoResponse createAutenticarEmpleadoResponse() {
        return new AutenticarEmpleadoResponse();
    }

    /**
     * Create an instance of {@link BuscarAdministradorInicioSesion }
     * 
     */
    public BuscarAdministradorInicioSesion createBuscarAdministradorInicioSesion() {
        return new BuscarAdministradorInicioSesion();
    }

    /**
     * Create an instance of {@link BuscarAdministradorInicioSesionResponse }
     * 
     */
    public BuscarAdministradorInicioSesionResponse createBuscarAdministradorInicioSesionResponse() {
        return new BuscarAdministradorInicioSesionResponse();
    }

    /**
     * Create an instance of {@link BuscarEmpleado }
     * 
     */
    public BuscarEmpleado createBuscarEmpleado() {
        return new BuscarEmpleado();
    }

    /**
     * Create an instance of {@link BuscarEmpleadoResponse }
     * 
     */
    public BuscarEmpleadoResponse createBuscarEmpleadoResponse() {
        return new BuscarEmpleadoResponse();
    }

    /**
     * Create an instance of {@link BuscarNombreAdministrador }
     * 
     */
    public BuscarNombreAdministrador createBuscarNombreAdministrador() {
        return new BuscarNombreAdministrador();
    }

    /**
     * Create an instance of {@link BuscarNombreAdministradorResponse }
     * 
     */
    public BuscarNombreAdministradorResponse createBuscarNombreAdministradorResponse() {
        return new BuscarNombreAdministradorResponse();
    }

    /**
     * Create an instance of {@link ElmininarEmpleado }
     * 
     */
    public ElmininarEmpleado createElmininarEmpleado() {
        return new ElmininarEmpleado();
    }

    /**
     * Create an instance of {@link ElmininarEmpleadoResponse }
     * 
     */
    public ElmininarEmpleadoResponse createElmininarEmpleadoResponse() {
        return new ElmininarEmpleadoResponse();
    }

    /**
     * Create an instance of {@link GrabarEmpleado }
     * 
     */
    public GrabarEmpleado createGrabarEmpleado() {
        return new GrabarEmpleado();
    }

    /**
     * Create an instance of {@link GrabarEmpleadoResponse }
     * 
     */
    public GrabarEmpleadoResponse createGrabarEmpleadoResponse() {
        return new GrabarEmpleadoResponse();
    }

    /**
     * Create an instance of {@link ListarEmpleado }
     * 
     */
    public ListarEmpleado createListarEmpleado() {
        return new ListarEmpleado();
    }

    /**
     * Create an instance of {@link ListarEmpleadoResponse }
     * 
     */
    public ListarEmpleadoResponse createListarEmpleadoResponse() {
        return new ListarEmpleadoResponse();
    }

    /**
     * Create an instance of {@link Empleado }
     * 
     */
    public Empleado createEmpleado() {
        return new Empleado();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutenticarEmpleado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "autenticarEmpleado")
    public JAXBElement<AutenticarEmpleado> createAutenticarEmpleado(AutenticarEmpleado value) {
        return new JAXBElement<AutenticarEmpleado>(_AutenticarEmpleado_QNAME, AutenticarEmpleado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutenticarEmpleadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "autenticarEmpleadoResponse")
    public JAXBElement<AutenticarEmpleadoResponse> createAutenticarEmpleadoResponse(AutenticarEmpleadoResponse value) {
        return new JAXBElement<AutenticarEmpleadoResponse>(_AutenticarEmpleadoResponse_QNAME, AutenticarEmpleadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarAdministradorInicioSesion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarAdministradorInicioSesion")
    public JAXBElement<BuscarAdministradorInicioSesion> createBuscarAdministradorInicioSesion(BuscarAdministradorInicioSesion value) {
        return new JAXBElement<BuscarAdministradorInicioSesion>(_BuscarAdministradorInicioSesion_QNAME, BuscarAdministradorInicioSesion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarAdministradorInicioSesionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarAdministradorInicioSesionResponse")
    public JAXBElement<BuscarAdministradorInicioSesionResponse> createBuscarAdministradorInicioSesionResponse(BuscarAdministradorInicioSesionResponse value) {
        return new JAXBElement<BuscarAdministradorInicioSesionResponse>(_BuscarAdministradorInicioSesionResponse_QNAME, BuscarAdministradorInicioSesionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarEmpleado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarEmpleado")
    public JAXBElement<BuscarEmpleado> createBuscarEmpleado(BuscarEmpleado value) {
        return new JAXBElement<BuscarEmpleado>(_BuscarEmpleado_QNAME, BuscarEmpleado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarEmpleadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarEmpleadoResponse")
    public JAXBElement<BuscarEmpleadoResponse> createBuscarEmpleadoResponse(BuscarEmpleadoResponse value) {
        return new JAXBElement<BuscarEmpleadoResponse>(_BuscarEmpleadoResponse_QNAME, BuscarEmpleadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarNombreAdministrador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarNombreAdministrador")
    public JAXBElement<BuscarNombreAdministrador> createBuscarNombreAdministrador(BuscarNombreAdministrador value) {
        return new JAXBElement<BuscarNombreAdministrador>(_BuscarNombreAdministrador_QNAME, BuscarNombreAdministrador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarNombreAdministradorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarNombreAdministradorResponse")
    public JAXBElement<BuscarNombreAdministradorResponse> createBuscarNombreAdministradorResponse(BuscarNombreAdministradorResponse value) {
        return new JAXBElement<BuscarNombreAdministradorResponse>(_BuscarNombreAdministradorResponse_QNAME, BuscarNombreAdministradorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElmininarEmpleado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "elmininarEmpleado")
    public JAXBElement<ElmininarEmpleado> createElmininarEmpleado(ElmininarEmpleado value) {
        return new JAXBElement<ElmininarEmpleado>(_ElmininarEmpleado_QNAME, ElmininarEmpleado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElmininarEmpleadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "elmininarEmpleadoResponse")
    public JAXBElement<ElmininarEmpleadoResponse> createElmininarEmpleadoResponse(ElmininarEmpleadoResponse value) {
        return new JAXBElement<ElmininarEmpleadoResponse>(_ElmininarEmpleadoResponse_QNAME, ElmininarEmpleadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrabarEmpleado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "grabarEmpleado")
    public JAXBElement<GrabarEmpleado> createGrabarEmpleado(GrabarEmpleado value) {
        return new JAXBElement<GrabarEmpleado>(_GrabarEmpleado_QNAME, GrabarEmpleado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrabarEmpleadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "grabarEmpleadoResponse")
    public JAXBElement<GrabarEmpleadoResponse> createGrabarEmpleadoResponse(GrabarEmpleadoResponse value) {
        return new JAXBElement<GrabarEmpleadoResponse>(_GrabarEmpleadoResponse_QNAME, GrabarEmpleadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarEmpleado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "listarEmpleado")
    public JAXBElement<ListarEmpleado> createListarEmpleado(ListarEmpleado value) {
        return new JAXBElement<ListarEmpleado>(_ListarEmpleado_QNAME, ListarEmpleado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarEmpleadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "listarEmpleadoResponse")
    public JAXBElement<ListarEmpleadoResponse> createListarEmpleadoResponse(ListarEmpleadoResponse value) {
        return new JAXBElement<ListarEmpleadoResponse>(_ListarEmpleadoResponse_QNAME, ListarEmpleadoResponse.class, null, value);
    }

}
