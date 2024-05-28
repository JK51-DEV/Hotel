
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

    private final static QName _GrabarVenta_QNAME = new QName("http://servicio/", "grabarVenta");
    private final static QName _GrabarVentaResponse_QNAME = new QName("http://servicio/", "grabarVentaResponse");
    private final static QName _NuevaVenta_QNAME = new QName("http://servicio/", "nuevaVenta");
    private final static QName _NuevaVentaResponse_QNAME = new QName("http://servicio/", "nuevaVentaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GrabarVenta }
     * 
     */
    public GrabarVenta createGrabarVenta() {
        return new GrabarVenta();
    }

    /**
     * Create an instance of {@link GrabarVentaResponse }
     * 
     */
    public GrabarVentaResponse createGrabarVentaResponse() {
        return new GrabarVentaResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GrabarVenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "grabarVenta")
    public JAXBElement<GrabarVenta> createGrabarVenta(GrabarVenta value) {
        return new JAXBElement<GrabarVenta>(_GrabarVenta_QNAME, GrabarVenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrabarVentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "grabarVentaResponse")
    public JAXBElement<GrabarVentaResponse> createGrabarVentaResponse(GrabarVentaResponse value) {
        return new JAXBElement<GrabarVentaResponse>(_GrabarVentaResponse_QNAME, GrabarVentaResponse.class, null, value);
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
