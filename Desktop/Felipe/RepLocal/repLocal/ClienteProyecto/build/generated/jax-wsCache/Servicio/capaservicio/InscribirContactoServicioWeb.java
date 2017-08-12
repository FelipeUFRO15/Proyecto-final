
package capaservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para inscribirContactoServicioWeb complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="inscribirContactoServicioWeb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uid_Cont" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uid_Grupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inscribirContactoServicioWeb", propOrder = {
    "uidCont",
    "uidGrupo"
})
public class InscribirContactoServicioWeb {

    @XmlElement(name = "uid_Cont")
    protected String uidCont;
    @XmlElement(name = "uid_Grupo")
    protected String uidGrupo;

    /**
     * Obtiene el valor de la propiedad uidCont.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidCont() {
        return uidCont;
    }

    /**
     * Define el valor de la propiedad uidCont.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidCont(String value) {
        this.uidCont = value;
    }

    /**
     * Obtiene el valor de la propiedad uidGrupo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidGrupo() {
        return uidGrupo;
    }

    /**
     * Define el valor de la propiedad uidGrupo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidGrupo(String value) {
        this.uidGrupo = value;
    }

}
