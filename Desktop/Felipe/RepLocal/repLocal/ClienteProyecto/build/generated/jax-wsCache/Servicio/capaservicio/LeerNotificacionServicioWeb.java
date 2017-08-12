
package capaservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para leerNotificacionServicioWeb complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="leerNotificacionServicioWeb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uid_Cont" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "leerNotificacionServicioWeb", propOrder = {
    "uidCont",
    "uidNoti"
})
public class LeerNotificacionServicioWeb {

    @XmlElement(name = "uid_Cont")
    protected int uidCont;
    @XmlElement(name = "uid_Noti")
    protected int uidNoti;

    /**
     * Obtiene el valor de la propiedad uidCont.
     * 
     */
    public int getUidCont() {
        return uidCont;
    }

    /**
     * Define el valor de la propiedad uidCont.
     * 
     */
    public void setUidCont(int value) {
        this.uidCont = value;
    }

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
