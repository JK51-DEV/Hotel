
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listar_avanzado_reserva complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listar_avanzado_reserva"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dni_cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listar_avanzado_reserva", propOrder = {
    "dniCliente"
})
public class ListarAvanzadoReserva {

    @XmlElement(name = "dni_cliente")
    protected String dniCliente;

    /**
     * Obtiene el valor de la propiedad dniCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDniCliente() {
        return dniCliente;
    }

    /**
     * Define el valor de la propiedad dniCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDniCliente(String value) {
        this.dniCliente = value;
    }

}
