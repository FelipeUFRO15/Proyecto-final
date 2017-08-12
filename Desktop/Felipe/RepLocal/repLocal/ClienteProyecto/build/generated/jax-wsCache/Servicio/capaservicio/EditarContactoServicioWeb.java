
package capaservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para editarContactoServicioWeb complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="editarContactoServicioWeb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nuevoNombre_Cont" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nuevoApellido_Cont" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nuevoMail_Cont" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nuevoTelefono_Cont" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nuevoCiudad_Cont" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nuevoOrganizacion_Cont" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nuevoImagen_Cont" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uid_Cont" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editarContactoServicioWeb", propOrder = {
    "nuevoNombreCont",
    "nuevoApellidoCont",
    "nuevoMailCont",
    "nuevoTelefonoCont",
    "nuevoCiudadCont",
    "nuevoOrganizacionCont",
    "nuevoImagenCont",
    "uidCont"
})
public class EditarContactoServicioWeb {

    @XmlElement(name = "nuevoNombre_Cont")
    protected String nuevoNombreCont;
    @XmlElement(name = "nuevoApellido_Cont")
    protected String nuevoApellidoCont;
    @XmlElement(name = "nuevoMail_Cont")
    protected String nuevoMailCont;
    @XmlElement(name = "nuevoTelefono_Cont")
    protected String nuevoTelefonoCont;
    @XmlElement(name = "nuevoCiudad_Cont")
    protected String nuevoCiudadCont;
    @XmlElement(name = "nuevoOrganizacion_Cont")
    protected String nuevoOrganizacionCont;
    @XmlElement(name = "nuevoImagen_Cont")
    protected String nuevoImagenCont;
    @XmlElement(name = "uid_Cont")
    protected int uidCont;

    /**
     * Obtiene el valor de la propiedad nuevoNombreCont.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevoNombreCont() {
        return nuevoNombreCont;
    }

    /**
     * Define el valor de la propiedad nuevoNombreCont.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevoNombreCont(String value) {
        this.nuevoNombreCont = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevoApellidoCont.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevoApellidoCont() {
        return nuevoApellidoCont;
    }

    /**
     * Define el valor de la propiedad nuevoApellidoCont.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevoApellidoCont(String value) {
        this.nuevoApellidoCont = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevoMailCont.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevoMailCont() {
        return nuevoMailCont;
    }

    /**
     * Define el valor de la propiedad nuevoMailCont.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevoMailCont(String value) {
        this.nuevoMailCont = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevoTelefonoCont.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevoTelefonoCont() {
        return nuevoTelefonoCont;
    }

    /**
     * Define el valor de la propiedad nuevoTelefonoCont.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevoTelefonoCont(String value) {
        this.nuevoTelefonoCont = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevoCiudadCont.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevoCiudadCont() {
        return nuevoCiudadCont;
    }

    /**
     * Define el valor de la propiedad nuevoCiudadCont.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevoCiudadCont(String value) {
        this.nuevoCiudadCont = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevoOrganizacionCont.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevoOrganizacionCont() {
        return nuevoOrganizacionCont;
    }

    /**
     * Define el valor de la propiedad nuevoOrganizacionCont.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevoOrganizacionCont(String value) {
        this.nuevoOrganizacionCont = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevoImagenCont.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevoImagenCont() {
        return nuevoImagenCont;
    }

    /**
     * Define el valor de la propiedad nuevoImagenCont.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevoImagenCont(String value) {
        this.nuevoImagenCont = value;
    }

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

}
