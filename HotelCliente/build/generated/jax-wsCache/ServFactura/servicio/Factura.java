
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para factura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="factura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cliente" type="{http://servicio/}cliente" minOccurs="0"/&gt;
 *         &lt;element name="codfac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comp" type="{http://servicio/}compra" minOccurs="0"/&gt;
 *         &lt;element name="fecfacturacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="res" type="{http://servicio/}reserva" minOccurs="0"/&gt;
 *         &lt;element name="tot" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "factura", propOrder = {
    "cliente",
    "codfac",
    "comp",
    "fecfacturacion",
    "res",
    "tot"
})
public class Factura {

    protected Cliente cliente;
    protected String codfac;
    protected Compra comp;
    protected String fecfacturacion;
    protected Reserva res;
    protected double tot;

    /**
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link Cliente }
     *     
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Cliente }
     *     
     */
    public void setCliente(Cliente value) {
        this.cliente = value;
    }

    /**
     * Obtiene el valor de la propiedad codfac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodfac() {
        return codfac;
    }

    /**
     * Define el valor de la propiedad codfac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodfac(String value) {
        this.codfac = value;
    }

    /**
     * Obtiene el valor de la propiedad comp.
     * 
     * @return
     *     possible object is
     *     {@link Compra }
     *     
     */
    public Compra getComp() {
        return comp;
    }

    /**
     * Define el valor de la propiedad comp.
     * 
     * @param value
     *     allowed object is
     *     {@link Compra }
     *     
     */
    public void setComp(Compra value) {
        this.comp = value;
    }

    /**
     * Obtiene el valor de la propiedad fecfacturacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecfacturacion() {
        return fecfacturacion;
    }

    /**
     * Define el valor de la propiedad fecfacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecfacturacion(String value) {
        this.fecfacturacion = value;
    }

    /**
     * Obtiene el valor de la propiedad res.
     * 
     * @return
     *     possible object is
     *     {@link Reserva }
     *     
     */
    public Reserva getRes() {
        return res;
    }

    /**
     * Define el valor de la propiedad res.
     * 
     * @param value
     *     allowed object is
     *     {@link Reserva }
     *     
     */
    public void setRes(Reserva value) {
        this.res = value;
    }

    /**
     * Obtiene el valor de la propiedad tot.
     * 
     */
    public double getTot() {
        return tot;
    }

    /**
     * Define el valor de la propiedad tot.
     * 
     */
    public void setTot(double value) {
        this.tot = value;
    }

}
