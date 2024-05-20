
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

    private final static QName _AutenticarCliente_QNAME = new QName("http://servicio/", "autenticarCliente");
    private final static QName _AutenticarClienteResponse_QNAME = new QName("http://servicio/", "autenticarClienteResponse");
    private final static QName _BuscarCliente_QNAME = new QName("http://servicio/", "buscarCliente");
    private final static QName _BuscarClienteResponse_QNAME = new QName("http://servicio/", "buscarClienteResponse");
    private final static QName _BuscarNombre_QNAME = new QName("http://servicio/", "buscarNombre");
    private final static QName _BuscarNombreResponse_QNAME = new QName("http://servicio/", "buscarNombreResponse");
    private final static QName _BuscarUsuarioInicioSesion_QNAME = new QName("http://servicio/", "buscarUsuarioInicioSesion");
    private final static QName _BuscarUsuarioInicioSesionResponse_QNAME = new QName("http://servicio/", "buscarUsuarioInicioSesionResponse");
    private final static QName _ElmininarCliente_QNAME = new QName("http://servicio/", "elmininarCliente");
    private final static QName _ElmininarClienteResponse_QNAME = new QName("http://servicio/", "elmininarClienteResponse");
    private final static QName _GrabarCliente_QNAME = new QName("http://servicio/", "grabarCliente");
    private final static QName _GrabarClienteResponse_QNAME = new QName("http://servicio/", "grabarClienteResponse");
    private final static QName _ListarCliente_QNAME = new QName("http://servicio/", "listarCliente");
    private final static QName _ListarClienteResponse_QNAME = new QName("http://servicio/", "listarClienteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AutenticarCliente }
     * 
     */
    public AutenticarCliente createAutenticarCliente() {
        return new AutenticarCliente();
    }

    /**
     * Create an instance of {@link AutenticarClienteResponse }
     * 
     */
    public AutenticarClienteResponse createAutenticarClienteResponse() {
        return new AutenticarClienteResponse();
    }

    /**
     * Create an instance of {@link BuscarCliente }
     * 
     */
    public BuscarCliente createBuscarCliente() {
        return new BuscarCliente();
    }

    /**
     * Create an instance of {@link BuscarClienteResponse }
     * 
     */
    public BuscarClienteResponse createBuscarClienteResponse() {
        return new BuscarClienteResponse();
    }

    /**
     * Create an instance of {@link BuscarNombre }
     * 
     */
    public BuscarNombre createBuscarNombre() {
        return new BuscarNombre();
    }

    /**
     * Create an instance of {@link BuscarNombreResponse }
     * 
     */
    public BuscarNombreResponse createBuscarNombreResponse() {
        return new BuscarNombreResponse();
    }

    /**
     * Create an instance of {@link BuscarUsuarioInicioSesion }
     * 
     */
    public BuscarUsuarioInicioSesion createBuscarUsuarioInicioSesion() {
        return new BuscarUsuarioInicioSesion();
    }

    /**
     * Create an instance of {@link BuscarUsuarioInicioSesionResponse }
     * 
     */
    public BuscarUsuarioInicioSesionResponse createBuscarUsuarioInicioSesionResponse() {
        return new BuscarUsuarioInicioSesionResponse();
    }

    /**
     * Create an instance of {@link ElmininarCliente }
     * 
     */
    public ElmininarCliente createElmininarCliente() {
        return new ElmininarCliente();
    }

    /**
     * Create an instance of {@link ElmininarClienteResponse }
     * 
     */
    public ElmininarClienteResponse createElmininarClienteResponse() {
        return new ElmininarClienteResponse();
    }

    /**
     * Create an instance of {@link GrabarCliente }
     * 
     */
    public GrabarCliente createGrabarCliente() {
        return new GrabarCliente();
    }

    /**
     * Create an instance of {@link GrabarClienteResponse }
     * 
     */
    public GrabarClienteResponse createGrabarClienteResponse() {
        return new GrabarClienteResponse();
    }

    /**
     * Create an instance of {@link ListarCliente }
     * 
     */
    public ListarCliente createListarCliente() {
        return new ListarCliente();
    }

    /**
     * Create an instance of {@link ListarClienteResponse }
     * 
     */
    public ListarClienteResponse createListarClienteResponse() {
        return new ListarClienteResponse();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutenticarCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "autenticarCliente")
    public JAXBElement<AutenticarCliente> createAutenticarCliente(AutenticarCliente value) {
        return new JAXBElement<AutenticarCliente>(_AutenticarCliente_QNAME, AutenticarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutenticarClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "autenticarClienteResponse")
    public JAXBElement<AutenticarClienteResponse> createAutenticarClienteResponse(AutenticarClienteResponse value) {
        return new JAXBElement<AutenticarClienteResponse>(_AutenticarClienteResponse_QNAME, AutenticarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarCliente")
    public JAXBElement<BuscarCliente> createBuscarCliente(BuscarCliente value) {
        return new JAXBElement<BuscarCliente>(_BuscarCliente_QNAME, BuscarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarClienteResponse")
    public JAXBElement<BuscarClienteResponse> createBuscarClienteResponse(BuscarClienteResponse value) {
        return new JAXBElement<BuscarClienteResponse>(_BuscarClienteResponse_QNAME, BuscarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarNombre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarNombre")
    public JAXBElement<BuscarNombre> createBuscarNombre(BuscarNombre value) {
        return new JAXBElement<BuscarNombre>(_BuscarNombre_QNAME, BuscarNombre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarNombreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarNombreResponse")
    public JAXBElement<BuscarNombreResponse> createBuscarNombreResponse(BuscarNombreResponse value) {
        return new JAXBElement<BuscarNombreResponse>(_BuscarNombreResponse_QNAME, BuscarNombreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarUsuarioInicioSesion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarUsuarioInicioSesion")
    public JAXBElement<BuscarUsuarioInicioSesion> createBuscarUsuarioInicioSesion(BuscarUsuarioInicioSesion value) {
        return new JAXBElement<BuscarUsuarioInicioSesion>(_BuscarUsuarioInicioSesion_QNAME, BuscarUsuarioInicioSesion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarUsuarioInicioSesionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarUsuarioInicioSesionResponse")
    public JAXBElement<BuscarUsuarioInicioSesionResponse> createBuscarUsuarioInicioSesionResponse(BuscarUsuarioInicioSesionResponse value) {
        return new JAXBElement<BuscarUsuarioInicioSesionResponse>(_BuscarUsuarioInicioSesionResponse_QNAME, BuscarUsuarioInicioSesionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElmininarCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "elmininarCliente")
    public JAXBElement<ElmininarCliente> createElmininarCliente(ElmininarCliente value) {
        return new JAXBElement<ElmininarCliente>(_ElmininarCliente_QNAME, ElmininarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElmininarClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "elmininarClienteResponse")
    public JAXBElement<ElmininarClienteResponse> createElmininarClienteResponse(ElmininarClienteResponse value) {
        return new JAXBElement<ElmininarClienteResponse>(_ElmininarClienteResponse_QNAME, ElmininarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrabarCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "grabarCliente")
    public JAXBElement<GrabarCliente> createGrabarCliente(GrabarCliente value) {
        return new JAXBElement<GrabarCliente>(_GrabarCliente_QNAME, GrabarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrabarClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "grabarClienteResponse")
    public JAXBElement<GrabarClienteResponse> createGrabarClienteResponse(GrabarClienteResponse value) {
        return new JAXBElement<GrabarClienteResponse>(_GrabarClienteResponse_QNAME, GrabarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "listarCliente")
    public JAXBElement<ListarCliente> createListarCliente(ListarCliente value) {
        return new JAXBElement<ListarCliente>(_ListarCliente_QNAME, ListarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "listarClienteResponse")
    public JAXBElement<ListarClienteResponse> createListarClienteResponse(ListarClienteResponse value) {
        return new JAXBElement<ListarClienteResponse>(_ListarClienteResponse_QNAME, ListarClienteResponse.class, null, value);
    }

}
