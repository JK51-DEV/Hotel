
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

    private final static QName _AgregarReserva_QNAME = new QName("http://servicio/", "agregarReserva");
    private final static QName _AgregarReservaResponse_QNAME = new QName("http://servicio/", "agregarReservaResponse");
    private final static QName _BuscarReserva_QNAME = new QName("http://servicio/", "buscarReserva");
    private final static QName _BuscarReservaDNI_QNAME = new QName("http://servicio/", "buscarReservaDNI");
    private final static QName _BuscarReservaDNIResponse_QNAME = new QName("http://servicio/", "buscarReservaDNIResponse");
    private final static QName _BuscarReservaResponse_QNAME = new QName("http://servicio/", "buscarReservaResponse");
    private final static QName _EliminarResumen_QNAME = new QName("http://servicio/", "eliminarResumen");
    private final static QName _EliminarResumenResponse_QNAME = new QName("http://servicio/", "eliminarResumenResponse");
    private final static QName _GetTotal_QNAME = new QName("http://servicio/", "getTotal");
    private final static QName _GetTotalResponse_QNAME = new QName("http://servicio/", "getTotalResponse");
    private final static QName _ListarReservas_QNAME = new QName("http://servicio/", "listarReservas");
    private final static QName _ListarReservasResponse_QNAME = new QName("http://servicio/", "listarReservasResponse");
    private final static QName _ListarAvanzadoReserva_QNAME = new QName("http://servicio/", "listar_avanzado_reserva");
    private final static QName _ListarAvanzadoReservaResponse_QNAME = new QName("http://servicio/", "listar_avanzado_reservaResponse");
    private final static QName _RegistrarReserva_QNAME = new QName("http://servicio/", "registrarReserva");
    private final static QName _RegistrarReservaResponse_QNAME = new QName("http://servicio/", "registrarReservaResponse");
    private final static QName _ResumenReserva_QNAME = new QName("http://servicio/", "resumenReserva");
    private final static QName _ResumenReservaResponse_QNAME = new QName("http://servicio/", "resumenReservaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AgregarReserva }
     * 
     */
    public AgregarReserva createAgregarReserva() {
        return new AgregarReserva();
    }

    /**
     * Create an instance of {@link AgregarReservaResponse }
     * 
     */
    public AgregarReservaResponse createAgregarReservaResponse() {
        return new AgregarReservaResponse();
    }

    /**
     * Create an instance of {@link BuscarReserva }
     * 
     */
    public BuscarReserva createBuscarReserva() {
        return new BuscarReserva();
    }

    /**
     * Create an instance of {@link BuscarReservaDNI }
     * 
     */
    public BuscarReservaDNI createBuscarReservaDNI() {
        return new BuscarReservaDNI();
    }

    /**
     * Create an instance of {@link BuscarReservaDNIResponse }
     * 
     */
    public BuscarReservaDNIResponse createBuscarReservaDNIResponse() {
        return new BuscarReservaDNIResponse();
    }

    /**
     * Create an instance of {@link BuscarReservaResponse }
     * 
     */
    public BuscarReservaResponse createBuscarReservaResponse() {
        return new BuscarReservaResponse();
    }

    /**
     * Create an instance of {@link EliminarResumen }
     * 
     */
    public EliminarResumen createEliminarResumen() {
        return new EliminarResumen();
    }

    /**
     * Create an instance of {@link EliminarResumenResponse }
     * 
     */
    public EliminarResumenResponse createEliminarResumenResponse() {
        return new EliminarResumenResponse();
    }

    /**
     * Create an instance of {@link GetTotal }
     * 
     */
    public GetTotal createGetTotal() {
        return new GetTotal();
    }

    /**
     * Create an instance of {@link GetTotalResponse }
     * 
     */
    public GetTotalResponse createGetTotalResponse() {
        return new GetTotalResponse();
    }

    /**
     * Create an instance of {@link ListarReservas }
     * 
     */
    public ListarReservas createListarReservas() {
        return new ListarReservas();
    }

    /**
     * Create an instance of {@link ListarReservasResponse }
     * 
     */
    public ListarReservasResponse createListarReservasResponse() {
        return new ListarReservasResponse();
    }

    /**
     * Create an instance of {@link ListarAvanzadoReserva }
     * 
     */
    public ListarAvanzadoReserva createListarAvanzadoReserva() {
        return new ListarAvanzadoReserva();
    }

    /**
     * Create an instance of {@link ListarAvanzadoReservaResponse }
     * 
     */
    public ListarAvanzadoReservaResponse createListarAvanzadoReservaResponse() {
        return new ListarAvanzadoReservaResponse();
    }

    /**
     * Create an instance of {@link RegistrarReserva }
     * 
     */
    public RegistrarReserva createRegistrarReserva() {
        return new RegistrarReserva();
    }

    /**
     * Create an instance of {@link RegistrarReservaResponse }
     * 
     */
    public RegistrarReservaResponse createRegistrarReservaResponse() {
        return new RegistrarReservaResponse();
    }

    /**
     * Create an instance of {@link ResumenReserva }
     * 
     */
    public ResumenReserva createResumenReserva() {
        return new ResumenReserva();
    }

    /**
     * Create an instance of {@link ResumenReservaResponse }
     * 
     */
    public ResumenReservaResponse createResumenReservaResponse() {
        return new ResumenReservaResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarReserva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "agregarReserva")
    public JAXBElement<AgregarReserva> createAgregarReserva(AgregarReserva value) {
        return new JAXBElement<AgregarReserva>(_AgregarReserva_QNAME, AgregarReserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarReservaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "agregarReservaResponse")
    public JAXBElement<AgregarReservaResponse> createAgregarReservaResponse(AgregarReservaResponse value) {
        return new JAXBElement<AgregarReservaResponse>(_AgregarReservaResponse_QNAME, AgregarReservaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarReserva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarReserva")
    public JAXBElement<BuscarReserva> createBuscarReserva(BuscarReserva value) {
        return new JAXBElement<BuscarReserva>(_BuscarReserva_QNAME, BuscarReserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarReservaDNI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarReservaDNI")
    public JAXBElement<BuscarReservaDNI> createBuscarReservaDNI(BuscarReservaDNI value) {
        return new JAXBElement<BuscarReservaDNI>(_BuscarReservaDNI_QNAME, BuscarReservaDNI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarReservaDNIResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarReservaDNIResponse")
    public JAXBElement<BuscarReservaDNIResponse> createBuscarReservaDNIResponse(BuscarReservaDNIResponse value) {
        return new JAXBElement<BuscarReservaDNIResponse>(_BuscarReservaDNIResponse_QNAME, BuscarReservaDNIResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarReservaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarReservaResponse")
    public JAXBElement<BuscarReservaResponse> createBuscarReservaResponse(BuscarReservaResponse value) {
        return new JAXBElement<BuscarReservaResponse>(_BuscarReservaResponse_QNAME, BuscarReservaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarResumen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "eliminarResumen")
    public JAXBElement<EliminarResumen> createEliminarResumen(EliminarResumen value) {
        return new JAXBElement<EliminarResumen>(_EliminarResumen_QNAME, EliminarResumen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarResumenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "eliminarResumenResponse")
    public JAXBElement<EliminarResumenResponse> createEliminarResumenResponse(EliminarResumenResponse value) {
        return new JAXBElement<EliminarResumenResponse>(_EliminarResumenResponse_QNAME, EliminarResumenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTotal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "getTotal")
    public JAXBElement<GetTotal> createGetTotal(GetTotal value) {
        return new JAXBElement<GetTotal>(_GetTotal_QNAME, GetTotal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTotalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "getTotalResponse")
    public JAXBElement<GetTotalResponse> createGetTotalResponse(GetTotalResponse value) {
        return new JAXBElement<GetTotalResponse>(_GetTotalResponse_QNAME, GetTotalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarReservas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "listarReservas")
    public JAXBElement<ListarReservas> createListarReservas(ListarReservas value) {
        return new JAXBElement<ListarReservas>(_ListarReservas_QNAME, ListarReservas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarReservasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "listarReservasResponse")
    public JAXBElement<ListarReservasResponse> createListarReservasResponse(ListarReservasResponse value) {
        return new JAXBElement<ListarReservasResponse>(_ListarReservasResponse_QNAME, ListarReservasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarAvanzadoReserva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "listar_avanzado_reserva")
    public JAXBElement<ListarAvanzadoReserva> createListarAvanzadoReserva(ListarAvanzadoReserva value) {
        return new JAXBElement<ListarAvanzadoReserva>(_ListarAvanzadoReserva_QNAME, ListarAvanzadoReserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarAvanzadoReservaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "listar_avanzado_reservaResponse")
    public JAXBElement<ListarAvanzadoReservaResponse> createListarAvanzadoReservaResponse(ListarAvanzadoReservaResponse value) {
        return new JAXBElement<ListarAvanzadoReservaResponse>(_ListarAvanzadoReservaResponse_QNAME, ListarAvanzadoReservaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarReserva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "registrarReserva")
    public JAXBElement<RegistrarReserva> createRegistrarReserva(RegistrarReserva value) {
        return new JAXBElement<RegistrarReserva>(_RegistrarReserva_QNAME, RegistrarReserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarReservaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "registrarReservaResponse")
    public JAXBElement<RegistrarReservaResponse> createRegistrarReservaResponse(RegistrarReservaResponse value) {
        return new JAXBElement<RegistrarReservaResponse>(_RegistrarReservaResponse_QNAME, RegistrarReservaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResumenReserva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "resumenReserva")
    public JAXBElement<ResumenReserva> createResumenReserva(ResumenReserva value) {
        return new JAXBElement<ResumenReserva>(_ResumenReserva_QNAME, ResumenReserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResumenReservaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "resumenReservaResponse")
    public JAXBElement<ResumenReservaResponse> createResumenReservaResponse(ResumenReservaResponse value) {
        return new JAXBElement<ResumenReservaResponse>(_ResumenReservaResponse_QNAME, ResumenReservaResponse.class, null, value);
    }

}
