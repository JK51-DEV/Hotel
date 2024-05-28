
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

    private final static QName _BuscarCliente_QNAME = new QName("http://servicio/", "buscarCliente");
    private final static QName _BuscarClienteResponse_QNAME = new QName("http://servicio/", "buscarClienteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicio
     * 
     */
    public ObjectFactory() {
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

}
