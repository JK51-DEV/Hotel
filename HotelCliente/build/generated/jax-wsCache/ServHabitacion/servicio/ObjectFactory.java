
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

    private final static QName _BuscarHabitacion_QNAME = new QName("http://servicio/", "buscarHabitacion");
    private final static QName _BuscarHabitacionResponse_QNAME = new QName("http://servicio/", "buscarHabitacionResponse");
    private final static QName _ListarHabitacion_QNAME = new QName("http://servicio/", "listarHabitacion");
    private final static QName _ListarHabitacionResponse_QNAME = new QName("http://servicio/", "listarHabitacionResponse");
    private final static QName _RegistrarHabitacion_QNAME = new QName("http://servicio/", "registrarHabitacion");
    private final static QName _RegistrarHabitacionResponse_QNAME = new QName("http://servicio/", "registrarHabitacionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarHabitacion }
     * 
     */
    public BuscarHabitacion createBuscarHabitacion() {
        return new BuscarHabitacion();
    }

    /**
     * Create an instance of {@link BuscarHabitacionResponse }
     * 
     */
    public BuscarHabitacionResponse createBuscarHabitacionResponse() {
        return new BuscarHabitacionResponse();
    }

    /**
     * Create an instance of {@link ListarHabitacion }
     * 
     */
    public ListarHabitacion createListarHabitacion() {
        return new ListarHabitacion();
    }

    /**
     * Create an instance of {@link ListarHabitacionResponse }
     * 
     */
    public ListarHabitacionResponse createListarHabitacionResponse() {
        return new ListarHabitacionResponse();
    }

    /**
     * Create an instance of {@link RegistrarHabitacion }
     * 
     */
    public RegistrarHabitacion createRegistrarHabitacion() {
        return new RegistrarHabitacion();
    }

    /**
     * Create an instance of {@link RegistrarHabitacionResponse }
     * 
     */
    public RegistrarHabitacionResponse createRegistrarHabitacionResponse() {
        return new RegistrarHabitacionResponse();
    }

    /**
     * Create an instance of {@link Habitacion }
     * 
     */
    public Habitacion createHabitacion() {
        return new Habitacion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarHabitacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarHabitacion")
    public JAXBElement<BuscarHabitacion> createBuscarHabitacion(BuscarHabitacion value) {
        return new JAXBElement<BuscarHabitacion>(_BuscarHabitacion_QNAME, BuscarHabitacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarHabitacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarHabitacionResponse")
    public JAXBElement<BuscarHabitacionResponse> createBuscarHabitacionResponse(BuscarHabitacionResponse value) {
        return new JAXBElement<BuscarHabitacionResponse>(_BuscarHabitacionResponse_QNAME, BuscarHabitacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarHabitacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "listarHabitacion")
    public JAXBElement<ListarHabitacion> createListarHabitacion(ListarHabitacion value) {
        return new JAXBElement<ListarHabitacion>(_ListarHabitacion_QNAME, ListarHabitacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarHabitacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "listarHabitacionResponse")
    public JAXBElement<ListarHabitacionResponse> createListarHabitacionResponse(ListarHabitacionResponse value) {
        return new JAXBElement<ListarHabitacionResponse>(_ListarHabitacionResponse_QNAME, ListarHabitacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarHabitacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "registrarHabitacion")
    public JAXBElement<RegistrarHabitacion> createRegistrarHabitacion(RegistrarHabitacion value) {
        return new JAXBElement<RegistrarHabitacion>(_RegistrarHabitacion_QNAME, RegistrarHabitacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarHabitacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "registrarHabitacionResponse")
    public JAXBElement<RegistrarHabitacionResponse> createRegistrarHabitacionResponse(RegistrarHabitacionResponse value) {
        return new JAXBElement<RegistrarHabitacionResponse>(_RegistrarHabitacionResponse_QNAME, RegistrarHabitacionResponse.class, null, value);
    }

}
