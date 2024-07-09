
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para agregar_factura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="agregar_factura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cli" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codaloj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agregar_factura", propOrder = {
    "cli",
    "codaloj",
    "comp"
})
public class AgregarFactura {

    protected String cli;
    protected String codaloj;
    protected String comp;

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

    /**
     * Obtiene el valor de la propiedad comp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComp() {
        return comp;
    }

    /**
     * Define el valor de la propiedad comp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComp(String value) {
        this.comp = value;
    }

}
