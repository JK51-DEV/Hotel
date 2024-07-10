
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

    private final static QName _Buscardni_QNAME = new QName("http://servicio/", "buscardni");
    private final static QName _BuscardniResponse_QNAME = new QName("http://servicio/", "buscardniResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Buscardni }
     * 
     */
    public Buscardni createBuscardni() {
        return new Buscardni();
    }

    /**
     * Create an instance of {@link BuscardniResponse }
     * 
     */
    public BuscardniResponse createBuscardniResponse() {
        return new BuscardniResponse();
    }

    /**
     * Create an instance of {@link Compra }
     * 
     */
    public Compra createCompra() {
        return new Compra();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Buscardni }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscardni")
    public JAXBElement<Buscardni> createBuscardni(Buscardni value) {
        return new JAXBElement<Buscardni>(_Buscardni_QNAME, Buscardni.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscardniResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscardniResponse")
    public JAXBElement<BuscardniResponse> createBuscardniResponse(BuscardniResponse value) {
        return new JAXBElement<BuscardniResponse>(_BuscardniResponse_QNAME, BuscardniResponse.class, null, value);
    }

}
