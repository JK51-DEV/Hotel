
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para agregarAlojamiento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="agregarAlojamiento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agregarAlojamiento", propOrder = {
    "codres",
    "emp"
})
public class AgregarAlojamiento {

    protected String codres;
    protected String emp;

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

    /**
     * Obtiene el valor de la propiedad emp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmp() {
        return emp;
    }

    /**
     * Define el valor de la propiedad emp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmp(String value) {
        this.emp = value;
    }

}
