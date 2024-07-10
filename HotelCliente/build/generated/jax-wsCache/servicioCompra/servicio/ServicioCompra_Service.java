
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
@WebServiceClient(name = "servicioCompra", targetNamespace = "http://servicio/", wsdlLocation = "http://localhost:8080/HotelServicios/servicioCompra?wsdl")
public class ServicioCompra_Service
    extends Service
{

    private final static URL SERVICIOCOMPRA_WSDL_LOCATION;
    private final static WebServiceException SERVICIOCOMPRA_EXCEPTION;
    private final static QName SERVICIOCOMPRA_QNAME = new QName("http://servicio/", "servicioCompra");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/HotelServicios/servicioCompra?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOCOMPRA_WSDL_LOCATION = url;
        SERVICIOCOMPRA_EXCEPTION = e;
    }

    public ServicioCompra_Service() {
        super(__getWsdlLocation(), SERVICIOCOMPRA_QNAME);
    }

    public ServicioCompra_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOCOMPRA_QNAME, features);
    }

    public ServicioCompra_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOCOMPRA_QNAME);
    }

    public ServicioCompra_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOCOMPRA_QNAME, features);
    }

    public ServicioCompra_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioCompra_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicioCompra
     */
    @WebEndpoint(name = "servicioCompraPort")
    public ServicioCompra getServicioCompraPort() {
        return super.getPort(new QName("http://servicio/", "servicioCompraPort"), ServicioCompra.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioCompra
     */
    @WebEndpoint(name = "servicioCompraPort")
    public ServicioCompra getServicioCompraPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servicio/", "servicioCompraPort"), ServicioCompra.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOCOMPRA_EXCEPTION!= null) {
            throw SERVICIOCOMPRA_EXCEPTION;
        }
        return SERVICIOCOMPRA_WSDL_LOCATION;
    }

}