
package capaservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para agregarActividadAGrupoServicioWeb complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="agregarActividadAGrupoServicioWeb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombre_Act" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcion_Act" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "agregarActividadAGrupoServicioWeb", propOrder = {
    "nombreAct",
    "descripcionAct",
    "uidGrupo"
})
public class AgregarActividadAGrupoServicioWeb {

    @XmlElement(name = "nombre_Act")
    protected String nombreAct;
    @XmlElement(name = "descripcion_Act")
    protected String descripcionAct;
    @XmlElement(name = "uid_Grupo")
    protected int uidGrupo;

    /**
     * Obtiene el valor de la propiedad nombreAct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAct() {
        return nombreAct;
    }

    /**
     * Define el valor de la propiedad nombreAct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAct(String value) {
        this.nombreAct = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionAct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionAct() {
        return descripcionAct;
    }

    /**
     * Define el valor de la propiedad descripcionAct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionAct(String value) {
        this.descripcionAct = value;
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
