
package servicio;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServListarArticulos", targetNamespace = "http://servicio/", wsdlLocation = "http://localhost:8080/HotelServicios/ServListarArticulos?wsdl")
public class ServListarArticulos_Service
    extends Service
{

    private final static URL SERVLISTARARTICULOS_WSDL_LOCATION;
    private final static WebServiceException SERVLISTARARTICULOS_EXCEPTION;
    private final static QName SERVLISTARARTICULOS_QNAME = new QName("http://servicio/", "ServListarArticulos");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/HotelServicios/ServListarArticulos?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVLISTARARTICULOS_WSDL_LOCATION = url;
        SERVLISTARARTICULOS_EXCEPTION = e;
    }

    public ServListarArticulos_Service() {
        super(__getWsdlLocation(), SERVLISTARARTICULOS_QNAME);
    }

    public ServListarArticulos_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVLISTARARTICULOS_QNAME, features);
    }

    public ServListarArticulos_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVLISTARARTICULOS_QNAME);
    }

    public ServListarArticulos_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVLISTARARTICULOS_QNAME, features);
    }

    public ServListarArticulos_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServListarArticulos_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServListarArticulos
     */
    @WebEndpoint(name = "ServListarArticulosPort")
    public ServListarArticulos getServListarArticulosPort() {
        return super.getPort(new QName("http://servicio/", "ServListarArticulosPort"), ServListarArticulos.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServListarArticulos
     */
    @WebEndpoint(name = "ServListarArticulosPort")
    public ServListarArticulos getServListarArticulosPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servicio/", "ServListarArticulosPort"), ServListarArticulos.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVLISTARARTICULOS_EXCEPTION!= null) {
            throw SERVLISTARARTICULOS_EXCEPTION;
        }
        return SERVLISTARARTICULOS_WSDL_LOCATION;
    }

}
