package capaNegocio;

import capaservicio.PersistentException_Exception;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Contacto {

    private int uid_Cont;
    private String nombre_Cont;
    private String apellido_Cont;
    private String mail_Cont;
    private String telefono_Cont;
    private String ciudad_Cont;
    private String organizacion_Cont;
    private String imagen_Cont;

    public int getUid_Cont() {
            return this.uid_Cont;
    }

    /**
     * 
     * @param uid_Cont
     */
    public void setUid_Cont(int uid_Cont) {
            this.uid_Cont = uid_Cont;
    }

    public String getNombre_Cont() {
            return this.nombre_Cont;
    }

    /**
     * 
     * @param nombre_Cont
     */
    public void setNombre_Cont(String nombre_Cont) {
            this.nombre_Cont = nombre_Cont;
    }

    public String getApellido_Cont() {
            return this.apellido_Cont;
    }

    /**
     * 
     * @param apellido_Cont
     */
    public void setApellido_Cont(String apellido_Cont) {
            this.apellido_Cont = apellido_Cont;
    }

    public String getMail_Cont() {
            return this.mail_Cont;
    }

    /**
     * 
     * @param mail_Cont
     */
    public void setMail_Cont(String mail_Cont) {
            this.mail_Cont = mail_Cont;
    }

    public String getTelefono_Cont() {
            return this.telefono_Cont;
    }

    /**
     * 
     * @param telefono_Cont
     */
    public void setTelefono_Cont(String telefono_Cont) {
            this.telefono_Cont = telefono_Cont;
    }

    public String getCiudad_Cont() {
            return this.ciudad_Cont;
    }

    /**
     * 
     * @param ciudad_Cont
     */
    public void setCiudad_Cont(String ciudad_Cont) {
            this.ciudad_Cont = ciudad_Cont;
    }

    public String getOrganizacion_Cont() {
            return this.organizacion_Cont;
    }

    /**
     * 
     * @param organizacion_Cont
     */
    public void setOrganizacion_Cont(String organizacion_Cont) {
            this.organizacion_Cont = organizacion_Cont;
    }

    public String getImagen_Cont() {
            return this.imagen_Cont;
    }

    /**
     * 
     * @param imagen_Cont
     */
    public void setImagen_Cont(String imagen_Cont) {
            this.imagen_Cont = imagen_Cont;
    }

    /**
     * 
     * @param contacto
     */
    public String agregarContactoCapaNegocio(Contacto contacto) {
            String respuesta = "";
            respuesta = agregarContactoServicioWeb(contacto.getNombre_Cont(), contacto.getApellido_Cont(), contacto.getMail_Cont(), contacto.getTelefono_Cont(), contacto.getCiudad_Cont(), contacto.getOrganizacion_Cont(), contacto.getImagen_Cont());
            return respuesta;
    }

    /**
     * 
     * @param contacto
     */
    public String editarContactoCapaNegocio(Contacto contacto) {
            String respuesta = "";
            respuesta = editarContactoServicioWeb(contacto.getNombre_Cont(), contacto.getApellido_Cont(), contacto.getMail_Cont(), contacto.getTelefono_Cont(), contacto.getCiudad_Cont(), contacto.getOrganizacion_Cont(), contacto.getImagen_Cont(), contacto.getUid_Cont());
            return respuesta;
    }

    /**
     * 
     * @param contacto
     */
    public String eliminarContactoCapaNegocio(Contacto contacto) {
            String respuesta = "";
            respuesta = eliminarContactoServicioWeb(contacto.getUid_Cont());
            return respuesta;
    }

    /**
     * 
     * @param busqueda
     */
    public List<Contacto> busquedaSimpleContactoCapaNegocio(String busqueda) {
            String respuesta = "";
            List<Contacto> listaContacto = new ArrayList<Contacto>();

            respuesta = busquedaSimpleContactoServicioWeb(busqueda);
            Gson gson = new Gson();
            Contacto[] mcArray = gson.fromJson(respuesta, Contacto[].class);
            listaContacto = Arrays.asList(mcArray);
            return listaContacto;
    }

    /**
     * 
     * @param contacto
     */
    public List<Contacto> busquedaAvanzadaContactoCapaNegocio(Contacto contacto) {
            String respuesta = "";
            String nombre = "";
            String apellido = "";
            String mail = "";
            String telefono = "";
            String ciudad = "";
            String organizacion = "";
            List<Contacto> listaContacto = new ArrayList<Contacto>();
            if (contacto.getNombre_Cont() != null){
                nombre = contacto.getNombre_Cont();
            }
            if (contacto.getApellido_Cont() != null){
                apellido = contacto.getApellido_Cont();
            }
            if (contacto.getMail_Cont() != null){
                mail = contacto.getMail_Cont();
            }
            if (contacto.getTelefono_Cont() != null){
                telefono = contacto.getTelefono_Cont();
            }
            if (contacto.getCiudad_Cont() != null){
                ciudad = contacto.getCiudad_Cont();
            }
            if (contacto.getOrganizacion_Cont() != null){
                organizacion = contacto.getOrganizacion_Cont();
            }

            respuesta = busquedaAvanzadaContactoServicioWeb(nombre, apellido, mail, telefono, ciudad, organizacion);
            Gson gson = new Gson();
            Contacto[] mcArray = gson.fromJson(respuesta, Contacto[].class);
            listaContacto = Arrays.asList(mcArray);
            return listaContacto;
    }

    /**
     * 
     * @param contacto
     */
    public List<Grupo_Contacto> busquedaGrupoContactoCapaNegocio(Contacto contacto) throws PersistentException_Exception {
            String respuesta = "";
            List<Grupo_Contacto> listaGrupos = new ArrayList<Grupo_Contacto>();
            
            respuesta = gruposDeContactoServicioWeb(contacto.getUid_Cont());
            Gson gson = new Gson();
            Grupo_Contacto[] mcArray = gson.fromJson(respuesta, Grupo_Contacto[].class);
            listaGrupos = Arrays.asList(mcArray);
            return listaGrupos;
    }

    private static String agregarContactoServicioWeb(java.lang.String nombreCont, java.lang.String apellidoCont, java.lang.String mailCont, java.lang.String telefonoCont, java.lang.String ciudadCont, java.lang.String organizacionCont, java.lang.String imagenCont) {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.agregarContactoServicioWeb(nombreCont, apellidoCont, mailCont, telefonoCont, ciudadCont, organizacionCont, imagenCont);
    }

    private static String editarContactoServicioWeb(java.lang.String nuevoNombreCont, java.lang.String nuevoApellidoCont, java.lang.String nuevoMailCont, java.lang.String nuevoTelefonoCont, java.lang.String nuevoCiudadCont, java.lang.String nuevoOrganizacionCont, java.lang.String nuevoImagenCont, int uidCont) {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.editarContactoServicioWeb(nuevoNombreCont, nuevoApellidoCont, nuevoMailCont, nuevoTelefonoCont, nuevoCiudadCont, nuevoOrganizacionCont, nuevoImagenCont, uidCont);
    }

    private static String eliminarContactoServicioWeb(int uidCont) {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.eliminarContactoServicioWeb(uidCont);
    }

    private static String busquedaSimpleContactoServicioWeb(java.lang.String textoBusqueda) {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.busquedaSimpleContactoServicioWeb(textoBusqueda);
    }

    private static String busquedaAvanzadaContactoServicioWeb(java.lang.String nombreCont, java.lang.String apellidoCont, java.lang.String mailCont, java.lang.String telefonoCont, java.lang.String ciudadCont, java.lang.String organizacionCont) {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.busquedaAvanzadaContactoServicioWeb(nombreCont, apellidoCont, mailCont, telefonoCont, ciudadCont, organizacionCont);
    }

    private static String gruposDeContactoServicioWeb(int uidCont) throws PersistentException_Exception {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.gruposDeContactoServicioWeb(uidCont);
    }

}