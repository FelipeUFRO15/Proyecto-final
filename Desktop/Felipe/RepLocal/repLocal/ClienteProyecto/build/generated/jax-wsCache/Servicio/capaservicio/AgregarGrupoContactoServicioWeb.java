
package capaservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para agregarGrupoContactoServicioWeb complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="agregarGrupoContactoServicioWeb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombre_Grupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcion_Grupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agregarGrupoContactoServicioWeb", propOrder = {
    "nombreGrupo",
    "descripcionGrupo"
})
public class AgregarGrupoContactoServicioWeb {

    @XmlElement(name = "nombre_Grupo")
    protected String nombreGrupo;
    @XmlElement(name = "descripcion_Grupo")
    protected String descripcionGrupo;

    /**
     * Obtiene el valor de la propiedad nombreGrupo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreGrupo() {
        return nombreGrupo;
    }

    /**
     * Define el valor de la propiedad nombreGrupo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreGrupo(String value) {
        this.nombreGrupo = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionGrupo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionGrupo() {
        return descripcionGrupo;
    }

    /**
     * Define el valor de la propiedad descripcionGrupo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionGrupo(String value) {
        this.descripcionGrupo = value;
    }

}
