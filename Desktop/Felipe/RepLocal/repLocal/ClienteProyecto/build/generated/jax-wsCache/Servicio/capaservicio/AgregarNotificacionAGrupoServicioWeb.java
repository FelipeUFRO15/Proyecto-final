
package capaservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para agregarNotificacionAGrupoServicioWeb complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="agregarNotificacionAGrupoServicioWeb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mensaje_Noti" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uid_Grupo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agregarNotificacionAGrupoServicioWeb", propOrder = {
    "mensajeNoti",
    "uidGrupo"
})
public class AgregarNotificacionAGrupoServicioWeb {

    @XmlElement(name = "mensaje_Noti")
    protected String mensajeNoti;
    @XmlElement(name = "uid_Grupo")
    protected int uidGrupo;

    /**
     * Obtiene el valor de la propiedad mensajeNoti.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeNoti() {
        return mensajeNoti;
    }

    /**
     * Define el valor de la propiedad mensajeNoti.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeNoti(String value) {
        this.mensajeNoti = value;
    }

    /**
     * Obtiene el valor de la propiedad uidGrupo.
     * 
     */
    public int getUidGrupo() {
        return uidGrupo;
    }

    /**
     * Define el valor de la propiedad uidGrupo.
     * 
     */
    public void setUidGrupo(int value) {
        this.uidGrupo = value;
    }

}
