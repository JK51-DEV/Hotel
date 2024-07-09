
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listar_factura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listar_factura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codfac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listar_factura", propOrder = {
    "codfac"
})
public class ListarFactura {

    protected String codfac;

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

}
