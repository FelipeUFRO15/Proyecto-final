
package capaservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para busquedaAvanzadaContactoServicioWeb complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="busquedaAvanzadaContactoServicioWeb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombre_Cont" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apellido_Cont" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mail_Cont" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefono_Cont" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ciudad_Cont" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="organizacion_Cont" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "busquedaAvanzadaContactoServicioWeb", propOrder = {
    "nombreCont",
    "apellidoCont",
    "mailCont",
    "telefonoCont",
    "ciudadCont",
    "organizacionCont"
})
public class BusquedaAvanzadaContactoServicioWeb {

    @XmlElement(name = "nombre_Cont")
    protected String nombreCont;
    @XmlElement(name = "apellido_Cont")
    protected String apellidoCont;
    @XmlElement(name = "mail_Cont")
    protected String mailCont;
    @XmlElement(name = "telefono_Cont")
    protected String telefonoCont;
    @XmlElement(name = "ciudad_Cont")
    protected String ciudadCont;
    @XmlElement(name = "organizacion_Cont")
    protected String organizacionCont;

    /**
     * Obtiene el valor de la propiedad nombreCont.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCont() {
        return nombreCont;
    }

    /**
     * Define el valor de la propiedad nombreCont.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCont(String value) {
        this.nombreCont = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidoCont.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoCont() {
        return apellidoCont;
    }

    /**
     * Define el valor de la propiedad apellidoCont.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoCont(String value) {
        this.apellidoCont = value;
    }

    /**
     * Obtiene el valor de la propiedad mailCont.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailCont() {
        return mailCont;
    }

    /**
     * Define el valor de la propiedad mailCont.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailCont(String value) {
        this.mailCont = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoCont.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoCont() {
        return telefonoCont;
    }

    /**
     * Define el valor de la propiedad telefonoCont.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoCont(String value) {
        this.telefonoCont = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudadCont.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudadCont() {
        return ciudadCont;
    }

    /**
     * Define el valor de la propiedad ciudadCont.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudadCont(String value) {
        this.ciudadCont = value;
    }

    /**
     * Obtiene el valor de la propiedad organizacionCont.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizacionCont() {
        return organizacionCont;
    }

    /**
     * Define el valor de la propiedad organizacionCont.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizacionCont(String value) {
        this.organizacionCont = value;
    }

}
