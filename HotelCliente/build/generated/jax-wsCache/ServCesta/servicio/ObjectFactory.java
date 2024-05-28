
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

    private final static QName _AgregarLinea_QNAME = new QName("http://servicio/", "agregarLinea");
    private final static QName _AgregarLineaResponse_QNAME = new QName("http://servicio/", "agregarLineaResponse");
    private final static QName _CrearCesta_QNAME = new QName("http://servicio/", "crearCesta");
    private final static QName _CrearCestaResponse_QNAME = new QName("http://servicio/", "crearCestaResponse");
    private final static QName _GetCesta_QNAME = new QName("http://servicio/", "getCesta");
    private final static QName _GetCestaResponse_QNAME = new QName("http://servicio/", "getCestaResponse");
    private final static QName _GetTotal_QNAME = new QName("http://servicio/", "getTotal");
    private final static QName _GetTotalResponse_QNAME = new QName("http://servicio/", "getTotalResponse");
    private final static QName _QuitarLinea_QNAME = new QName("http://servicio/", "quitarLinea");
    private final static QName _QuitarLineaResponse_QNAME = new QName("http://servicio/", "quitarLineaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AgregarLinea }
     * 
     */
    public AgregarLinea createAgregarLinea() {
        return new AgregarLinea();
    }

    /**
     * Create an instance of {@link AgregarLineaResponse }
     * 
     */
    public AgregarLineaResponse createAgregarLineaResponse() {
        return new AgregarLineaResponse();
    }

    /**
     * Create an instance of {@link CrearCesta }
     * 
     */
    public CrearCesta createCrearCesta() {
        return new CrearCesta();
    }

    /**
     * Create an instance of {@link CrearCestaResponse }
     * 
     */
    public CrearCestaResponse createCrearCestaResponse() {
        return new CrearCestaResponse();
    }

    /**
     * Create an instance of {@link GetCesta }
     * 
     */
    public GetCesta createGetCesta() {
        return new GetCesta();
    }

    /**
     * Create an instance of {@link GetCestaResponse }
     * 
     */
    public GetCestaResponse createGetCestaResponse() {
        return new GetCestaResponse();
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
     * Create an instance of {@link QuitarLinea }
     * 
     */
    public QuitarLinea createQuitarLinea() {
        return new QuitarLinea();
    }

    /**
     * Create an instance of {@link QuitarLineaResponse }
     * 
     */
    public QuitarLineaResponse createQuitarLineaResponse() {
        return new QuitarLineaResponse();
    }

    /**
     * Create an instance of {@link Linea }
     * 
     */
    public Linea createLinea() {
        return new Linea();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarLinea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "agregarLinea")
    public JAXBElement<AgregarLinea> createAgregarLinea(AgregarLinea value) {
        return new JAXBElement<AgregarLinea>(_AgregarLinea_QNAME, AgregarLinea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarLineaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "agregarLineaResponse")
    public JAXBElement<AgregarLineaResponse> createAgregarLineaResponse(AgregarLineaResponse value) {
        return new JAXBElement<AgregarLineaResponse>(_AgregarLineaResponse_QNAME, AgregarLineaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearCesta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "crearCesta")
    public JAXBElement<CrearCesta> createCrearCesta(CrearCesta value) {
        return new JAXBElement<CrearCesta>(_CrearCesta_QNAME, CrearCesta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearCestaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "crearCestaResponse")
    public JAXBElement<CrearCestaResponse> createCrearCestaResponse(CrearCestaResponse value) {
        return new JAXBElement<CrearCestaResponse>(_CrearCestaResponse_QNAME, CrearCestaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCesta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "getCesta")
    public JAXBElement<GetCesta> createGetCesta(GetCesta value) {
        return new JAXBElement<GetCesta>(_GetCesta_QNAME, GetCesta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCestaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "getCestaResponse")
    public JAXBElement<GetCestaResponse> createGetCestaResponse(GetCestaResponse value) {
        return new JAXBElement<GetCestaResponse>(_GetCestaResponse_QNAME, GetCestaResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link QuitarLinea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "quitarLinea")
    public JAXBElement<QuitarLinea> createQuitarLinea(QuitarLinea value) {
        return new JAXBElement<QuitarLinea>(_QuitarLinea_QNAME, QuitarLinea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuitarLineaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "quitarLineaResponse")
    public JAXBElement<QuitarLineaResponse> createQuitarLineaResponse(QuitarLineaResponse value) {
        return new JAXBElement<QuitarLineaResponse>(_QuitarLineaResponse_QNAME, QuitarLineaResponse.class, null, value);
    }

}
