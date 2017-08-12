
package capaservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para verLecturasNotificacionServicioWeb complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="verLecturasNotificacionServicioWeb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uid_Noti" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verLecturasNotificacionServicioWeb", propOrder = {
    "uidNoti"
})
public class VerLecturasNotificacionServicioWeb {

    @XmlElement(name = "uid_Noti")
    protected int uidNoti;

    /**
     * Obtiene el valor de la propiedad uidNoti.
     * 
     */
    public int getUidNoti() {
        return uidNoti;
    }

    /**
     * Define el valor de la propiedad uidNoti.
     * 
     */
    public void setUidNoti(int value) {
        this.uidNoti = value;
    }

}
