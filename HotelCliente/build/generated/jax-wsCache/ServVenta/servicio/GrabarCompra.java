
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para grabarCompra complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="grabarCompra"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tot" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "grabarCompra", propOrder = {
    "num",
    "fec",
    "tot"
})
public class GrabarCompra {

    protected String num;
    protected String fec;
    protected double tot;

    /**
     * Obtiene el valor de la propiedad num.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNum() {
        return num;
    }

    /**
     * Define el valor de la propiedad num.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNum(String value) {
        this.num = value;
    }

    /**
     * Obtiene el valor de la propiedad fec.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFec() {
        return fec;
    }

    /**
     * Define el valor de la propiedad fec.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFec(String value) {
        this.fec = value;
    }

    /**
     * Obtiene el valor de la propiedad tot.
     * 
     */
    public double getTot() {
        return tot;
    }

    /**
     * Define el valor de la propiedad tot.
     * 
     */
    public void setTot(double value) {
        this.tot = value;
    }

}
