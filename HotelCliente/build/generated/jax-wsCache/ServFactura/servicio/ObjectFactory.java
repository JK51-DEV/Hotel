
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

    private final static QName _BuscarMontoCompra_QNAME = new QName("http://servicio/", "buscarMontoCompra");
    private final static QName _BuscarMontoCompraResponse_QNAME = new QName("http://servicio/", "buscarMontoCompraResponse");
    private final static QName _Generarfactura_QNAME = new QName("http://servicio/", "generarfactura");
    private final static QName _GenerarfacturaResponse_QNAME = new QName("http://servicio/", "generarfacturaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarMontoCompra }
     * 
     */
    public BuscarMontoCompra createBuscarMontoCompra() {
        return new BuscarMontoCompra();
    }

    /**
     * Create an instance of {@link BuscarMontoCompraResponse }
     * 
     */
    public BuscarMontoCompraResponse createBuscarMontoCompraResponse() {
        return new BuscarMontoCompraResponse();
    }

    /**
     * Create an instance of {@link Generarfactura }
     * 
     */
    public Generarfactura createGenerarfactura() {
        return new Generarfactura();
    }

    /**
     * Create an instance of {@link GenerarfacturaResponse }
     * 
     */
    public GenerarfacturaResponse createGenerarfacturaResponse() {
        return new GenerarfacturaResponse();
    }

    /**
     * Create an instance of {@link Factura }
     * 
     */
    public Factura createFactura() {
        return new Factura();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link Compra }
     * 
     */
    public Compra createCompra() {
        return new Compra();
    }

    /**
     * Create an instance of {@link Reserva }
     * 
     */
    public Reserva createReserva() {
        return new Reserva();
    }

    /**
     * Create an instance of {@link Habitacion }
     * 
     */
    public Habitacion createHabitacion() {
        return new Habitacion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarMontoCompra }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarMontoCompra")
    public JAXBElement<BuscarMontoCompra> createBuscarMontoCompra(BuscarMontoCompra value) {
        return new JAXBElement<BuscarMontoCompra>(_BuscarMontoCompra_QNAME, BuscarMontoCompra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarMontoCompraResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarMontoCompraResponse")
    public JAXBElement<BuscarMontoCompraResponse> createBuscarMontoCompraResponse(BuscarMontoCompraResponse value) {
        return new JAXBElement<BuscarMontoCompraResponse>(_BuscarMontoCompraResponse_QNAME, BuscarMontoCompraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Generarfactura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "generarfactura")
    public JAXBElement<Generarfactura> createGenerarfactura(Generarfactura value) {
        return new JAXBElement<Generarfactura>(_Generarfactura_QNAME, Generarfactura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarfacturaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "generarfacturaResponse")
    public JAXBElement<GenerarfacturaResponse> createGenerarfacturaResponse(GenerarfacturaResponse value) {
        return new JAXBElement<GenerarfacturaResponse>(_GenerarfacturaResponse_QNAME, GenerarfacturaResponse.class, null, value);
    }

}
