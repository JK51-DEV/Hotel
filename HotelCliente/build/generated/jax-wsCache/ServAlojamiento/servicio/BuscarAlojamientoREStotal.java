
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscarAlojamientoREStotal complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscarAlojamientoREStotal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscarAlojamientoREStotal", propOrder = {
    "codres"
})
public class BuscarAlojamientoREStotal {

    protected String codres;

    /**
     * Obtiene el valor de la propiedad codres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodres() {
        return codres;
    }

    /**
     * Define el valor de la propiedad codres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodres(String value) {
        this.codres = value;
    }

}
