
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
    private final static QName _AgregarResumenFactura_QNAME = new QName("http://servicio/", "agregar_resumen_factura");
    private final static QName _AgregarResumenFacturaResponse_QNAME = new QName("http://servicio/", "agregar_resumen_facturaResponse");
    private final static QName _BuscarMontoCompra_QNAME = new QName("http://servicio/", "buscarMontoCompra");
    private final static QName _BuscarMontoCompraResponse_QNAME = new QName("http://servicio/", "buscarMontoCompraResponse");
    private final static QName _Codigoautomatic_QNAME = new QName("http://servicio/", "codigoautomatic");
    private final static QName _CodigoautomaticResponse_QNAME = new QName("http://servicio/", "codigoautomaticResponse");
    private final static QName _Guardarfactura_QNAME = new QName("http://servicio/", "guardarfactura");
    private final static QName _GuardarfacturaResponse_QNAME = new QName("http://servicio/", "guardarfacturaResponse");
    private final static QName _ListarFactura_QNAME = new QName("http://servicio/", "listar_factura");
    private final static QName _ListarFacturaResponse_QNAME = new QName("http://servicio/", "listar_facturaResponse");
    private final static QName _Listarfacturas_QNAME = new QName("http://servicio/", "listarfacturas");
    private final static QName _ListarfacturasResponse_QNAME = new QName("http://servicio/", "listarfacturasResponse");
    private final static QName _RegistrarFactura_QNAME = new QName("http://servicio/", "registrar_Factura");
    private final static QName _RegistrarFacturaResponse_QNAME = new QName("http://servicio/", "registrar_FacturaResponse");
    private final static QName _ResumenFactura_QNAME = new QName("http://servicio/", "resumenFactura");
    private final static QName _ResumenFacturaResponse_QNAME = new QName("http://servicio/", "resumenFacturaResponse");

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
     * Create an instance of {@link AgregarResumenFactura }
     * 
     */
    public AgregarResumenFactura createAgregarResumenFactura() {
        return new AgregarResumenFactura();
    }

    /**
     * Create an instance of {@link AgregarResumenFacturaResponse }
     * 
     */
    public AgregarResumenFacturaResponse createAgregarResumenFacturaResponse() {
        return new AgregarResumenFacturaResponse();
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
     * Create an instance of {@link Guardarfactura }
     * 
     */
    public Guardarfactura createGuardarfactura() {
        return new Guardarfactura();
    }

    /**
     * Create an instance of {@link GuardarfacturaResponse }
     * 
     */
    public GuardarfacturaResponse createGuardarfacturaResponse() {
        return new GuardarfacturaResponse();
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
     * Create an instance of {@link RegistrarFactura }
     * 
     */
    public RegistrarFactura createRegistrarFactura() {
        return new RegistrarFactura();
    }

    /**
     * Create an instance of {@link RegistrarFacturaResponse }
     * 
     */
    public RegistrarFacturaResponse createRegistrarFacturaResponse() {
        return new RegistrarFacturaResponse();
    }

    /**
     * Create an instance of {@link ResumenFactura }
     * 
     */
    public ResumenFactura createResumenFactura() {
        return new ResumenFactura();
    }

    /**
     * Create an instance of {@link ResumenFacturaResponse }
     * 
     */
    public ResumenFacturaResponse createResumenFacturaResponse() {
        return new ResumenFacturaResponse();
    }

    /**
     * Create an instance of {@link Factura }
     * 
     */
    public Factura createFactura() {
        return new Factura();
    }

    /**
     * Create an instance of {@link Alojamiento }
     * 
     */
    public Alojamiento createAlojamiento() {
        return new Alojamiento();
    }

    /**
     * Create an instance of {@link Empleado }
     * 
     */
    public Empleado createEmpleado() {
        return new Empleado();
    }

    /**
     * Create an instance of {@link Reserva }
     * 
     */
    public Reserva createReserva() {
        return new Reserva();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link Habitacion }
     * 
     */
    public Habitacion createHabitacion() {
        return new Habitacion();
    }

    /**
     * Create an instance of {@link Compra }
     * 
     */
    public Compra createCompra() {
        return new Compra();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarResumenFactura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "agregar_resumen_factura")
    public JAXBElement<AgregarResumenFactura> createAgregarResumenFactura(AgregarResumenFactura value) {
        return new JAXBElement<AgregarResumenFactura>(_AgregarResumenFactura_QNAME, AgregarResumenFactura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarResumenFacturaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "agregar_resumen_facturaResponse")
    public JAXBElement<AgregarResumenFacturaResponse> createAgregarResumenFacturaResponse(AgregarResumenFacturaResponse value) {
        return new JAXBElement<AgregarResumenFacturaResponse>(_AgregarResumenFacturaResponse_QNAME, AgregarResumenFacturaResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Guardarfactura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "guardarfactura")
    public JAXBElement<Guardarfactura> createGuardarfactura(Guardarfactura value) {
        return new JAXBElement<Guardarfactura>(_Guardarfactura_QNAME, Guardarfactura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarfacturaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "guardarfacturaResponse")
    public JAXBElement<GuardarfacturaResponse> createGuardarfacturaResponse(GuardarfacturaResponse value) {
        return new JAXBElement<GuardarfacturaResponse>(_GuardarfacturaResponse_QNAME, GuardarfacturaResponse.class, null, value);
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarFactura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "registrar_Factura")
    public JAXBElement<RegistrarFactura> createRegistrarFactura(RegistrarFactura value) {
        return new JAXBElement<RegistrarFactura>(_RegistrarFactura_QNAME, RegistrarFactura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarFacturaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "registrar_FacturaResponse")
    public JAXBElement<RegistrarFacturaResponse> createRegistrarFacturaResponse(RegistrarFacturaResponse value) {
        return new JAXBElement<RegistrarFacturaResponse>(_RegistrarFacturaResponse_QNAME, RegistrarFacturaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResumenFactura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "resumenFactura")
    public JAXBElement<ResumenFactura> createResumenFactura(ResumenFactura value) {
        return new JAXBElement<ResumenFactura>(_ResumenFactura_QNAME, ResumenFactura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResumenFacturaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "resumenFacturaResponse")
    public JAXBElement<ResumenFacturaResponse> createResumenFacturaResponse(ResumenFacturaResponse value) {
        return new JAXBElement<ResumenFacturaResponse>(_ResumenFacturaResponse_QNAME, ResumenFacturaResponse.class, null, value);
    }

}
