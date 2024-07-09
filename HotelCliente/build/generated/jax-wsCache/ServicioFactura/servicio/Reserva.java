
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reserva complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reserva"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cli" type="{http://servicio/}cliente" minOccurs="0"/&gt;
 *         &lt;element name="codRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dia" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fecCreacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hab" type="{http://servicio/}habitacion" minOccurs="0"/&gt;
 *         &lt;element name="imp" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reserva", propOrder = {
    "cli",
    "codRes",
    "dia",
    "fecCreacion",
    "fecFin",
    "fecInicio",
    "hab",
    "imp"
})
public class Reserva {

    protected Cliente cli;
    protected String codRes;
    protected int dia;
    protected String fecCreacion;
    protected String fecFin;
    protected String fecInicio;
    protected Habitacion hab;
    protected Double imp;

    /**
     * Obtiene el valor de la propiedad cli.
     * 
     * @return
     *     possible object is
     *     {@link Cliente }
     *     
     */
    public Cliente getCli() {
        return cli;
    }

    /**
     * Define el valor de la propiedad cli.
     * 
     * @param value
     *     allowed object is
     *     {@link Cliente }
     *     
     */
    public void setCli(Cliente value) {
        this.cli = value;
    }

    /**
     * Obtiene el valor de la propiedad codRes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRes() {
        return codRes;
    }

    /**
     * Define el valor de la propiedad codRes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRes(String value) {
        this.codRes = value;
    }

    /**
     * Obtiene el valor de la propiedad dia.
     * 
     */
    public int getDia() {
        return dia;
    }

    /**
     * Define el valor de la propiedad dia.
     * 
     */
    public void setDia(int value) {
        this.dia = value;
    }

    /**
     * Obtiene el valor de la propiedad fecCreacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecCreacion() {
        return fecCreacion;
    }

    /**
     * Define el valor de la propiedad fecCreacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecCreacion(String value) {
        this.fecCreacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fecFin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecFin() {
        return fecFin;
    }

    /**
     * Define el valor de la propiedad fecFin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecFin(String value) {
        this.fecFin = value;
    }

    /**
     * Obtiene el valor de la propiedad fecInicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecInicio() {
        return fecInicio;
    }

    /**
     * Define el valor de la propiedad fecInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecInicio(String value) {
        this.fecInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad hab.
     * 
     * @return
     *     possible object is
     *     {@link Habitacion }
     *     
     */
    public Habitacion getHab() {
        return hab;
    }

    /**
     * Define el valor de la propiedad hab.
     * 
     * @param value
     *     allowed object is
     *     {@link Habitacion }
     *     
     */
    public void setHab(Habitacion value) {
        this.hab = value;
    }

    /**
     * Obtiene el valor de la propiedad imp.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImp() {
        return imp;
    }

    /**
     * Define el valor de la propiedad imp.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImp(Double value) {
        this.imp = value;
    }

}
