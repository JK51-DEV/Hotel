
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

    private final static QName _BuscarReserva_QNAME = new QName("http://servicio/", "buscarReserva");
    private final static QName _BuscarReservaResponse_QNAME = new QName("http://servicio/", "buscarReservaResponse");
    private final static QName _ListarReservas_QNAME = new QName("http://servicio/", "listarReservas");
    private final static QName _ListarReservasResponse_QNAME = new QName("http://servicio/", "listarReservasResponse");
    private final static QName _RegistrarReserva_QNAME = new QName("http://servicio/", "registrarReserva");
    private final static QName _RegistrarReservaResponse_QNAME = new QName("http://servicio/", "registrarReservaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarReserva }
     * 
     */
    public BuscarReserva createBuscarReserva() {
        return new BuscarReserva();
    }

    /**
     * Create an instance of {@link BuscarReservaResponse }
     * 
     */
    public BuscarReservaResponse createBuscarReservaResponse() {
        return new BuscarReservaResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarReserva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarReserva")
    public JAXBElement<BuscarReserva> createBuscarReserva(BuscarReserva value) {
        return new JAXBElement<BuscarReserva>(_BuscarReserva_QNAME, BuscarReserva.class, null, value);
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

}
