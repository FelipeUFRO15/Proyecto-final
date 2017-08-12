
package capaservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para verLecturasActividadServicioWeb complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="verLecturasActividadServicioWeb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uid_Act" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verLecturasActividadServicioWeb", propOrder = {
    "uidAct"
})
public class VerLecturasActividadServicioWeb {

    @XmlElement(name = "uid_Act")
    protected int uidAct;

    /**
     * Obtiene el valor de la propiedad uidAct.
     * 
     */
    public int getUidAct() {
        return uidAct;
    }

    /**
     * Define el valor de la propiedad uidAct.
     * 
     */
    public void setUidAct(int value) {
        this.uidAct = value;
    }

}
