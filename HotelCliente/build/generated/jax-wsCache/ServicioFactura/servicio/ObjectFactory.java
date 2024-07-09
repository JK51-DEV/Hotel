
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

    private final static QName _AgregarFactura_QNAME = new QName("http://servicio/", "agregar_factura");
    private final static QName _AgregarFacturaResponse_QNAME = new QName("http://servicio/", "agregar_facturaResponse");
    private final static QName _BuscarMontoCompra_QNAME = new QName("http://servicio/", "buscarMontoCompra");
    private final static QName _BuscarMontoCompraResponse_QNAME = new QName("http://servicio/", "buscarMontoCompraResponse");
    private final static QName _Codigoautomatic_QNAME = new QName("http://servicio/", "codigoautomatic");
    private final static QName _CodigoautomaticResponse_QNAME = new QName("http://servicio/", "codigoautomaticResponse");
    private final static QName _Generarfactura_QNAME = new QName("http://servicio/", "generarfactura");
    private final static QName _GenerarfacturaResponse_QNAME = new QName("http://servicio/", "generarfacturaResponse");
    private final static QName _ListarFactura_QNAME = new QName("http://servicio/", "listar_factura");
    private final static QName _ListarFacturaResponse_QNAME = new QName("http://servicio/", "listar_facturaResponse");
    private final static QName _Listarfacturas_QNAME = new QName("http://servicio/", "listarfacturas");
    private final static QName _ListarfacturasResponse_QNAME = new QName("http://servicio/", "listarfacturasResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AgregarFactura }
     * 
     */
    public AgregarFactura createAgregarFactura() {
        return new AgregarFactura();
    }

    /**
     * Create an instance of {@link AgregarFacturaResponse }
     * 
     */
    public AgregarFacturaResponse createAgregarFacturaResponse() {
        return new AgregarFacturaResponse();
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
     * Create an instance of {@link Codigoautomatic }
     * 
     */
    public Codigoautomatic createCodigoautomatic() {
        return new Codigoautomatic();
    }

    /**
     * Create an instance of {@link CodigoautomaticResponse }
     * 
     */
    public CodigoautomaticResponse createCodigoautomaticResponse() {
        return new CodigoautomaticResponse();
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
     * Create an instance of {@link ListarFactura }
     * 
     */
    public ListarFactura createListarFactura() {
        return new ListarFactura();
    }

    /**
     * Create an instance of {@link ListarFacturaResponse }
     * 
     */
    public ListarFacturaResponse createListarFacturaResponse() {
        return new ListarFacturaResponse();
    }

    /**
     * Create an instance of {@link Listarfacturas }
     * 
     */
    public Listarfacturas createListarfacturas() {
        return new Listarfacturas();
    }

    /**
     * Create an instance of {@link ListarfacturasResponse }
     * 
     */
    public ListarfacturasResponse createListarfacturasResponse() {
        return new ListarfacturasResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarFactura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "agregar_factura")
    public JAXBElement<AgregarFactura> createAgregarFactura(AgregarFactura value) {
        return new JAXBElement<AgregarFactura>(_AgregarFactura_QNAME, AgregarFactura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarFacturaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "agregar_facturaResponse")
    public JAXBElement<AgregarFacturaResponse> createAgregarFacturaResponse(AgregarFacturaResponse value) {
        return new JAXBElement<AgregarFacturaResponse>(_AgregarFacturaResponse_QNAME, AgregarFacturaResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Codigoautomatic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "codigoautomatic")
    public JAXBElement<Codigoautomatic> createCodigoautomatic(Codigoautomatic value) {
        return new JAXBElement<Codigoautomatic>(_Codigoautomatic_QNAME, Codigoautomatic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodigoautomaticResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "codigoautomaticResponse")
    public JAXBElement<CodigoautomaticResponse> createCodigoautomaticResponse(CodigoautomaticResponse value) {
        return new JAXBElement<CodigoautomaticResponse>(_CodigoautomaticResponse_QNAME, CodigoautomaticResponse.class, null, value);
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarFactura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "listar_factura")
    public JAXBElement<ListarFactura> createListarFactura(ListarFactura value) {
        return new JAXBElement<ListarFactura>(_ListarFactura_QNAME, ListarFactura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarFacturaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "listar_facturaResponse")
    public JAXBElement<ListarFacturaResponse> createListarFacturaResponse(ListarFacturaResponse value) {
        return new JAXBElement<ListarFacturaResponse>(_ListarFacturaResponse_QNAME, ListarFacturaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listarfacturas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "listarfacturas")
    public JAXBElement<Listarfacturas> createListarfacturas(Listarfacturas value) {
        return new JAXBElement<Listarfacturas>(_Listarfacturas_QNAME, Listarfacturas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarfacturasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "listarfacturasResponse")
    public JAXBElement<ListarfacturasResponse> createListarfacturasResponse(ListarfacturasResponse value) {
        return new JAXBElement<ListarfacturasResponse>(_ListarfacturasResponse_QNAME, ListarfacturasResponse.class, null, value);
    }

}
