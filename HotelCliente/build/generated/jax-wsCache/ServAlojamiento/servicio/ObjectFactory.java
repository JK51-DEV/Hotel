
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

    private final static QName _AgregarAlojamiento_QNAME = new QName("http://servicio/", "agregarAlojamiento");
    private final static QName _AgregarAlojamientoResponse_QNAME = new QName("http://servicio/", "agregarAlojamientoResponse");
    private final static QName _BuscarAlojamiento_QNAME = new QName("http://servicio/", "buscarAlojamiento");
    private final static QName _BuscarAlojamientoRES_QNAME = new QName("http://servicio/", "buscarAlojamientoRES");
    private final static QName _BuscarAlojamientoRESResponse_QNAME = new QName("http://servicio/", "buscarAlojamientoRESResponse");
    private final static QName _BuscarAlojamientoREStotal_QNAME = new QName("http://servicio/", "buscarAlojamientoREStotal");
    private final static QName _BuscarAlojamientoREStotalResponse_QNAME = new QName("http://servicio/", "buscarAlojamientoREStotalResponse");
    private final static QName _BuscarAlojamientoResponse_QNAME = new QName("http://servicio/", "buscarAlojamientoResponse");
    private final static QName _Codigoautomaticoaloj_QNAME = new QName("http://servicio/", "codigoautomaticoaloj");
    private final static QName _CodigoautomaticoalojResponse_QNAME = new QName("http://servicio/", "codigoautomaticoalojResponse");
    private final static QName _EliminarResumenAloj_QNAME = new QName("http://servicio/", "eliminarResumenAloj");
    private final static QName _EliminarResumenAlojResponse_QNAME = new QName("http://servicio/", "eliminarResumenAlojResponse");
    private final static QName _ListarAlojamiento_QNAME = new QName("http://servicio/", "listarAlojamiento");
    private final static QName _ListarAlojamientoResponse_QNAME = new QName("http://servicio/", "listarAlojamientoResponse");
    private final static QName _RegistrarAlojamiento_QNAME = new QName("http://servicio/", "registrarAlojamiento");
    private final static QName _RegistrarAlojamientoResponse_QNAME = new QName("http://servicio/", "registrarAlojamientoResponse");
    private final static QName _ResumenAlojamiento_QNAME = new QName("http://servicio/", "resumenAlojamiento");
    private final static QName _ResumenAlojamientoResponse_QNAME = new QName("http://servicio/", "resumenAlojamientoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AgregarAlojamiento }
     * 
     */
    public AgregarAlojamiento createAgregarAlojamiento() {
        return new AgregarAlojamiento();
    }

    /**
     * Create an instance of {@link AgregarAlojamientoResponse }
     * 
     */
    public AgregarAlojamientoResponse createAgregarAlojamientoResponse() {
        return new AgregarAlojamientoResponse();
    }

    /**
     * Create an instance of {@link BuscarAlojamiento }
     * 
     */
    public BuscarAlojamiento createBuscarAlojamiento() {
        return new BuscarAlojamiento();
    }

    /**
     * Create an instance of {@link BuscarAlojamientoRES }
     * 
     */
    public BuscarAlojamientoRES createBuscarAlojamientoRES() {
        return new BuscarAlojamientoRES();
    }

    /**
     * Create an instance of {@link BuscarAlojamientoRESResponse }
     * 
     */
    public BuscarAlojamientoRESResponse createBuscarAlojamientoRESResponse() {
        return new BuscarAlojamientoRESResponse();
    }

    /**
     * Create an instance of {@link BuscarAlojamientoREStotal }
     * 
     */
    public BuscarAlojamientoREStotal createBuscarAlojamientoREStotal() {
        return new BuscarAlojamientoREStotal();
    }

    /**
     * Create an instance of {@link BuscarAlojamientoREStotalResponse }
     * 
     */
    public BuscarAlojamientoREStotalResponse createBuscarAlojamientoREStotalResponse() {
        return new BuscarAlojamientoREStotalResponse();
    }

    /**
     * Create an instance of {@link BuscarAlojamientoResponse }
     * 
     */
    public BuscarAlojamientoResponse createBuscarAlojamientoResponse() {
        return new BuscarAlojamientoResponse();
    }

    /**
     * Create an instance of {@link Codigoautomaticoaloj }
     * 
     */
    public Codigoautomaticoaloj createCodigoautomaticoaloj() {
        return new Codigoautomaticoaloj();
    }

    /**
     * Create an instance of {@link CodigoautomaticoalojResponse }
     * 
     */
    public CodigoautomaticoalojResponse createCodigoautomaticoalojResponse() {
        return new CodigoautomaticoalojResponse();
    }

    /**
     * Create an instance of {@link EliminarResumenAloj }
     * 
     */
    public EliminarResumenAloj createEliminarResumenAloj() {
        return new EliminarResumenAloj();
    }

    /**
     * Create an instance of {@link EliminarResumenAlojResponse }
     * 
     */
    public EliminarResumenAlojResponse createEliminarResumenAlojResponse() {
        return new EliminarResumenAlojResponse();
    }

    /**
     * Create an instance of {@link ListarAlojamiento }
     * 
     */
    public ListarAlojamiento createListarAlojamiento() {
        return new ListarAlojamiento();
    }

    /**
     * Create an instance of {@link ListarAlojamientoResponse }
     * 
     */
    public ListarAlojamientoResponse createListarAlojamientoResponse() {
        return new ListarAlojamientoResponse();
    }

    /**
     * Create an instance of {@link RegistrarAlojamiento }
     * 
     */
    public RegistrarAlojamiento createRegistrarAlojamiento() {
        return new RegistrarAlojamiento();
    }

    /**
     * Create an instance of {@link RegistrarAlojamientoResponse }
     * 
     */
    public RegistrarAlojamientoResponse createRegistrarAlojamientoResponse() {
        return new RegistrarAlojamientoResponse();
    }

    /**
     * Create an instance of {@link ResumenAlojamiento }
     * 
     */
    public ResumenAlojamiento createResumenAlojamiento() {
        return new ResumenAlojamiento();
    }

    /**
     * Create an instance of {@link ResumenAlojamientoResponse }
     * 
     */
    public ResumenAlojamientoResponse createResumenAlojamientoResponse() {
        return new ResumenAlojamientoResponse();
    }

    /**
     * Create an instance of {@link Alojamiento }
     * 
     */
    public Alojamiento createAlojamiento() {
        return new Alojamiento();
    }

    /**
     * Create an instance of {@link Empleado }
     * 
     */
    public Empleado createEmpleado() {
        return new Empleado();
    }

    /**
     * Create an instance of {@link Reserva }
     * 
     */
    public Reserva createReserva() {
        return new Reserva();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link Habitacion }
     * 
     */
    public Habitacion createHabitacion() {
        return new Habitacion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarAlojamiento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "agregarAlojamiento")
    public JAXBElement<AgregarAlojamiento> createAgregarAlojamiento(AgregarAlojamiento value) {
        return new JAXBElement<AgregarAlojamiento>(_AgregarAlojamiento_QNAME, AgregarAlojamiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarAlojamientoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "agregarAlojamientoResponse")
    public JAXBElement<AgregarAlojamientoResponse> createAgregarAlojamientoResponse(AgregarAlojamientoResponse value) {
        return new JAXBElement<AgregarAlojamientoResponse>(_AgregarAlojamientoResponse_QNAME, AgregarAlojamientoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarAlojamiento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarAlojamiento")
    public JAXBElement<BuscarAlojamiento> createBuscarAlojamiento(BuscarAlojamiento value) {
        return new JAXBElement<BuscarAlojamiento>(_BuscarAlojamiento_QNAME, BuscarAlojamiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarAlojamientoRES }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarAlojamientoRES")
    public JAXBElement<BuscarAlojamientoRES> createBuscarAlojamientoRES(BuscarAlojamientoRES value) {
        return new JAXBElement<BuscarAlojamientoRES>(_BuscarAlojamientoRES_QNAME, BuscarAlojamientoRES.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarAlojamientoRESResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarAlojamientoRESResponse")
    public JAXBElement<BuscarAlojamientoRESResponse> createBuscarAlojamientoRESResponse(BuscarAlojamientoRESResponse value) {
        return new JAXBElement<BuscarAlojamientoRESResponse>(_BuscarAlojamientoRESResponse_QNAME, BuscarAlojamientoRESResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarAlojamientoREStotal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarAlojamientoREStotal")
    public JAXBElement<BuscarAlojamientoREStotal> createBuscarAlojamientoREStotal(BuscarAlojamientoREStotal value) {
        return new JAXBElement<BuscarAlojamientoREStotal>(_BuscarAlojamientoREStotal_QNAME, BuscarAlojamientoREStotal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarAlojamientoREStotalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarAlojamientoREStotalResponse")
    public JAXBElement<BuscarAlojamientoREStotalResponse> createBuscarAlojamientoREStotalResponse(BuscarAlojamientoREStotalResponse value) {
        return new JAXBElement<BuscarAlojamientoREStotalResponse>(_BuscarAlojamientoREStotalResponse_QNAME, BuscarAlojamientoREStotalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarAlojamientoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarAlojamientoResponse")
    public JAXBElement<BuscarAlojamientoResponse> createBuscarAlojamientoResponse(BuscarAlojamientoResponse value) {
        return new JAXBElement<BuscarAlojamientoResponse>(_BuscarAlojamientoResponse_QNAME, BuscarAlojamientoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Codigoautomaticoaloj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "codigoautomaticoaloj")
    public JAXBElement<Codigoautomaticoaloj> createCodigoautomaticoaloj(Codigoautomaticoaloj value) {
        return new JAXBElement<Codigoautomaticoaloj>(_Codigoautomaticoaloj_QNAME, Codigoautomaticoaloj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodigoautomaticoalojResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "codigoautomaticoalojResponse")
    public JAXBElement<CodigoautomaticoalojResponse> createCodigoautomaticoalojResponse(CodigoautomaticoalojResponse value) {
        return new JAXBElement<CodigoautomaticoalojResponse>(_CodigoautomaticoalojResponse_QNAME, CodigoautomaticoalojResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarResumenAloj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "eliminarResumenAloj")
    public JAXBElement<EliminarResumenAloj> createEliminarResumenAloj(EliminarResumenAloj value) {
        return new JAXBElement<EliminarResumenAloj>(_EliminarResumenAloj_QNAME, EliminarResumenAloj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarResumenAlojResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "eliminarResumenAlojResponse")
    public JAXBElement<EliminarResumenAlojResponse> createEliminarResumenAlojResponse(EliminarResumenAlojResponse value) {
        return new JAXBElement<EliminarResumenAlojResponse>(_EliminarResumenAlojResponse_QNAME, EliminarResumenAlojResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarAlojamiento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "listarAlojamiento")
    public JAXBElement<ListarAlojamiento> createListarAlojamiento(ListarAlojamiento value) {
        return new JAXBElement<ListarAlojamiento>(_ListarAlojamiento_QNAME, ListarAlojamiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarAlojamientoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "listarAlojamientoResponse")
    public JAXBElement<ListarAlojamientoResponse> createListarAlojamientoResponse(ListarAlojamientoResponse value) {
        return new JAXBElement<ListarAlojamientoResponse>(_ListarAlojamientoResponse_QNAME, ListarAlojamientoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarAlojamiento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "registrarAlojamiento")
    public JAXBElement<RegistrarAlojamiento> createRegistrarAlojamiento(RegistrarAlojamiento value) {
        return new JAXBElement<RegistrarAlojamiento>(_RegistrarAlojamiento_QNAME, RegistrarAlojamiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarAlojamientoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "registrarAlojamientoResponse")
    public JAXBElement<RegistrarAlojamientoResponse> createRegistrarAlojamientoResponse(RegistrarAlojamientoResponse value) {
        return new JAXBElement<RegistrarAlojamientoResponse>(_RegistrarAlojamientoResponse_QNAME, RegistrarAlojamientoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResumenAlojamiento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "resumenAlojamiento")
    public JAXBElement<ResumenAlojamiento> createResumenAlojamiento(ResumenAlojamiento value) {
        return new JAXBElement<ResumenAlojamiento>(_ResumenAlojamiento_QNAME, ResumenAlojamiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResumenAlojamientoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "resumenAlojamientoResponse")
    public JAXBElement<ResumenAlojamientoResponse> createResumenAlojamientoResponse(ResumenAlojamientoResponse value) {
        return new JAXBElement<ResumenAlojamientoResponse>(_ResumenAlojamientoResponse_QNAME, ResumenAlojamientoResponse.class, null, value);
    }

}
