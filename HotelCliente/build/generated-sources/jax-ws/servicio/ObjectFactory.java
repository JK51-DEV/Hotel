
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

    private final static QName _ListarArticulos_QNAME = new QName("http://servicio/", "listarArticulos");
    private final static QName _ListarArticulosResponse_QNAME = new QName("http://servicio/", "listarArticulosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarArticulos }
     * 
     */
    public ListarArticulos createListarArticulos() {
        return new ListarArticulos();
    }

    /**
     * Create an instance of {@link ListarArticulosResponse }
     * 
     */
    public ListarArticulosResponse createListarArticulosResponse() {
        return new ListarArticulosResponse();
    }

    /**
     * Create an instance of {@link Articulo }
     * 
     */
    public Articulo createArticulo() {
        return new Articulo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarArticulos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "listarArticulos")
    public JAXBElement<ListarArticulos> createListarArticulos(ListarArticulos value) {
        return new JAXBElement<ListarArticulos>(_ListarArticulos_QNAME, ListarArticulos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarArticulosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "listarArticulosResponse")
    public JAXBElement<ListarArticulosResponse> createListarArticulosResponse(ListarArticulosResponse value) {
        return new JAXBElement<ListarArticulosResponse>(_ListarArticulosResponse_QNAME, ListarArticulosResponse.class, null, value);
    }

}
