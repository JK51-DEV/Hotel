
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para confirmarReserva complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="confirmarReserva"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confirmarReserva", propOrder = {
    "codRes"
})
public class ConfirmarReserva {

    protected String codRes;

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

}
