
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

    private final static QName _GrabarCompra_QNAME = new QName("http://servicio/", "grabarCompra");
    private final static QName _GrabarCompraResponse_QNAME = new QName("http://servicio/", "grabarCompraResponse");
    private final static QName _GrabarDetalleCompra_QNAME = new QName("http://servicio/", "grabarDetalleCompra");
    private final static QName _GrabarDetalleCompraResponse_QNAME = new QName("http://servicio/", "grabarDetalleCompraResponse");
    private final static QName _NuevaVenta_QNAME = new QName("http://servicio/", "nuevaVenta");
    private final static QName _NuevaVentaResponse_QNAME = new QName("http://servicio/", "nuevaVentaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GrabarCompra }
     * 
     */
    public GrabarCompra createGrabarCompra() {
        return new GrabarCompra();
    }

    /**
     * Create an instance of {@link GrabarCompraResponse }
     * 
     */
    public GrabarCompraResponse createGrabarCompraResponse() {
        return new GrabarCompraResponse();
    }

    /**
     * Create an instance of {@link GrabarDetalleCompra }
     * 
     */
    public GrabarDetalleCompra createGrabarDetalleCompra() {
        return new GrabarDetalleCompra();
    }

    /**
     * Create an instance of {@link GrabarDetalleCompraResponse }
     * 
     */
    public GrabarDetalleCompraResponse createGrabarDetalleCompraResponse() {
        return new GrabarDetalleCompraResponse();
    }

    /**
     * Create an instance of {@link NuevaVenta }
     * 
     */
    public NuevaVenta createNuevaVenta() {
        return new NuevaVenta();
    }

    /**
     * Create an instance of {@link NuevaVentaResponse }
     * 
     */
    public NuevaVentaResponse createNuevaVentaResponse() {
        return new NuevaVentaResponse();
    }

    /**
     * Create an instance of {@link Venta }
     * 
     */
    public Venta createVenta() {
        return new Venta();
    }

    /**
     * Create an instance of {@link Linea }
     * 
     */
    public Linea createLinea() {
        return new Linea();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrabarCompra }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "grabarCompra")
    public JAXBElement<GrabarCompra> createGrabarCompra(GrabarCompra value) {
        return new JAXBElement<GrabarCompra>(_GrabarCompra_QNAME, GrabarCompra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrabarCompraResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "grabarCompraResponse")
    public JAXBElement<GrabarCompraResponse> createGrabarCompraResponse(GrabarCompraResponse value) {
        return new JAXBElement<GrabarCompraResponse>(_GrabarCompraResponse_QNAME, GrabarCompraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrabarDetalleCompra }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "grabarDetalleCompra")
    public JAXBElement<GrabarDetalleCompra> createGrabarDetalleCompra(GrabarDetalleCompra value) {
        return new JAXBElement<GrabarDetalleCompra>(_GrabarDetalleCompra_QNAME, GrabarDetalleCompra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrabarDetalleCompraResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "grabarDetalleCompraResponse")
    public JAXBElement<GrabarDetalleCompraResponse> createGrabarDetalleCompraResponse(GrabarDetalleCompraResponse value) {
        return new JAXBElement<GrabarDetalleCompraResponse>(_GrabarDetalleCompraResponse_QNAME, GrabarDetalleCompraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NuevaVenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "nuevaVenta")
    public JAXBElement<NuevaVenta> createNuevaVenta(NuevaVenta value) {
        return new JAXBElement<NuevaVenta>(_NuevaVenta_QNAME, NuevaVenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NuevaVentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "nuevaVentaResponse")
    public JAXBElement<NuevaVentaResponse> createNuevaVentaResponse(NuevaVentaResponse value) {
        return new JAXBElement<NuevaVentaResponse>(_NuevaVentaResponse_QNAME, NuevaVentaResponse.class, null, value);
    }

}
