
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para generarfactura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="generarfactura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="compra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generarfactura", propOrder = {
    "dni",
    "reser",
    "compra"
})
public class Generarfactura {

    protected String dni;
    protected String reser;
    protected String compra;

    /**
     * Obtiene el valor de la propiedad dni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDni() {
        return dni;
    }

    /**
     * Define el valor de la propiedad dni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDni(String value) {
        this.dni = value;
    }

    /**
     * Obtiene el valor de la propiedad reser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReser() {
        return reser;
    }

    /**
     * Define el valor de la propiedad reser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReser(String value) {
        this.reser = value;
    }

    /**
     * Obtiene el valor de la propiedad compra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompra() {
        return compra;
    }

    /**
     * Define el valor de la propiedad compra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompra(String value) {
        this.compra = value;
    }

}
