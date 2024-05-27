
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para agregarReserva complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="agregarReserva"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hab" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cli" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agregarReserva", propOrder = {
    "hab",
    "cli",
    "fecInicio",
    "fecFin"
})
public class AgregarReserva {

    protected String hab;
    protected String cli;
    protected String fecInicio;
    protected String fecFin;

    /**
     * Obtiene el valor de la propiedad hab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHab() {
        return hab;
    }

    /**
     * Define el valor de la propiedad hab.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHab(String value) {
        this.hab = value;
    }

    /**
     * Obtiene el valor de la propiedad cli.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCli() {
        return cli;
    }

    /**
     * Define el valor de la propiedad cli.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCli(String value) {
        this.cli = value;
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

}
