
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscarAlojamiento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscarAlojamiento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codaloj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscarAlojamiento", propOrder = {
    "codaloj"
})
public class BuscarAlojamiento {

    protected String codaloj;

    /**
     * Obtiene el valor de la propiedad codaloj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodaloj() {
        return codaloj;
    }

    /**
     * Define el valor de la propiedad codaloj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodaloj(String value) {
        this.codaloj = value;
    }

}
