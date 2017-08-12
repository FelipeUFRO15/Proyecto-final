
package capaservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para busquedaSimpleContactoServicioWeb complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="busquedaSimpleContactoServicioWeb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="textoBusqueda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "busquedaSimpleContactoServicioWeb", propOrder = {
    "textoBusqueda"
})
public class BusquedaSimpleContactoServicioWeb {

    protected String textoBusqueda;

    /**
     * Obtiene el valor de la propiedad textoBusqueda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextoBusqueda() {
        return textoBusqueda;
    }

    /**
     * Define el valor de la propiedad textoBusqueda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextoBusqueda(String value) {
        this.textoBusqueda = value;
    }

}
