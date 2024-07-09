
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para alojamiento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="alojamiento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codAloj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="empleado" type="{http://servicio/}empleado" minOccurs="0"/&gt;
 *         &lt;element name="fecCreacionAloj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reserva" type="{http://servicio/}reserva" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alojamiento", propOrder = {
    "codAloj",
    "empleado",
    "fecCreacionAloj",
    "reserva"
})
public class Alojamiento {

    protected String codAloj;
    protected Empleado empleado;
    protected String fecCreacionAloj;
    protected Reserva reserva;

    /**
     * Obtiene el valor de la propiedad codAloj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodAloj() {
        return codAloj;
    }

    /**
     * Define el valor de la propiedad codAloj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodAloj(String value) {
        this.codAloj = value;
    }

    /**
     * Obtiene el valor de la propiedad empleado.
     * 
     * @return
     *     possible object is
     *     {@link Empleado }
     *     
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * Define el valor de la propiedad empleado.
     * 
     * @param value
     *     allowed object is
     *     {@link Empleado }
     *     
     */
    public void setEmpleado(Empleado value) {
        this.empleado = value;
    }

    /**
     * Obtiene el valor de la propiedad fecCreacionAloj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecCreacionAloj() {
        return fecCreacionAloj;
    }

    /**
     * Define el valor de la propiedad fecCreacionAloj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecCreacionAloj(String value) {
        this.fecCreacionAloj = value;
    }

    /**
     * Obtiene el valor de la propiedad reserva.
     * 
     * @return
     *     possible object is
     *     {@link Reserva }
     *     
     */
    public Reserva getReserva() {
        return reserva;
    }

    /**
     * Define el valor de la propiedad reserva.
     * 
     * @param value
     *     allowed object is
     *     {@link Reserva }
     *     
     */
    public void setReserva(Reserva value) {
        this.reserva = value;
    }

}
