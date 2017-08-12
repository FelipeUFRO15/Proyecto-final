package capaNegocio;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Contacto {

    private String nombre_Cont;
    private String apellido_Cont;
    private String telefono_Cont;
    private String mail_Cont;
    private String ciudad_Cont;
    private String organizacion_Cont;
    private String imagen_Cont;
    private int uid_Cont;
    private Membresia[] membresias;

    public Contacto(){
        super();
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

    /**
     * 
     * @param contacto
     */
    public int agregarContactoCapaNegocio(Contacto contacto) throws PersistentException {
        int respuesta = 0;
        PersistentTransaction t = orm.ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
        try{
                orm.Contacto lormContacto = orm.ContactoDAO.createContacto();
                lormContacto.setNombre_Cont(contacto.getNombre_Cont());
                lormContacto.setApellido_Cont(contacto.getApellido_Cont());
                lormContacto.setMail_Cont(contacto.getMail_Cont());
                lormContacto.setTelefono_Cont(contacto.getTelefono_Cont());
                lormContacto.setCiudad_Cont(contacto.getCiudad_Cont());
                lormContacto.setOrganizacion_Cont(contacto.getOrganizacion_Cont());
                lormContacto.setImagen_Cont(contacto.getImagen_Cont());
                orm.ContactoDAO.save(lormContacto);
                t.commit();
                return lormContacto.getUid_Cont();
        }catch (Exception e){
                t.rollback();
        }
        return respuesta;
    }

    /**
     * 
     * @param contacto
     */
    public int editarContactoCapaNegocio(Contacto contacto) throws PersistentException {
        int respuesta = 0;
        PersistentTransaction t = orm.ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
        try{
            orm.Contacto lormContacto = orm.ContactoDAO.loadContactoByORMID(contacto.getUid_Cont());
            
            if (contacto.getNombre_Cont() != ""){
                    lormContacto.setNombre_Cont(contacto.getNombre_Cont());
            }
            if (contacto.getApellido_Cont() != ""){
                    lormContacto.setApellido_Cont(contacto.getApellido_Cont());
            }

            if (contacto.getMail_Cont() != ""){
                    lormContacto.setMail_Cont(contacto.getMail_Cont());
            }
            
            if (contacto.getTelefono_Cont() != ""){
                    lormContacto.setTelefono_Cont(contacto.getTelefono_Cont());
            }
            
            if (contacto.getCiudad_Cont() != ""){
                    lormContacto.setCiudad_Cont(contacto.getCiudad_Cont());
            }

            if (contacto.getOrganizacion_Cont() != ""){
                    lormContacto.setOrganizacion_Cont(contacto.getOrganizacion_Cont());
            }
            
            if (contacto.getOrganizacion_Cont() != ""){
                    lormContacto.setOrganizacion_Cont(contacto.getOrganizacion_Cont());
            }
            
            if (contacto.getImagen_Cont() != ""){
                    lormContacto.setImagen_Cont(contacto.getImagen_Cont());
            }
            orm.ContactoDAO.save(lormContacto);
            t.commit();
            return lormContacto.getUid_Cont();
        }catch (Exception e){
            t.rollback();
        }
        return respuesta;
    }

    /**
     * 
     * @param contacto
     */
    public int eliminarContactoCapaNegocio(Contacto contacto) throws PersistentException {
        int respuesta = 0;
        PersistentTransaction t = orm.ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
        try{
            orm.Contacto lormContacto = orm.ContactoDAO.loadContactoByORMID(contacto.getUid_Cont());
            orm.ContactoDAO.delete(lormContacto);        
            t.commit();
            return lormContacto.getUid_Cont();
        }catch (Exception e){
                t.rollback();
        }
        return respuesta;
    }

    /**
     * 
     * @param textoBusqueda
     */
    public List<Contacto> busquedaSimpleContactoCapaNegocio(String busqueda) throws PersistentException {
        List<Contacto> listaContacto = new ArrayList<Contacto>();
        List<orm.Contacto> listaContactos = new ArrayList<orm.Contacto>();
        if (busqueda != null || !busqueda.equals("")){
            listaContactos = orm.ContactoDAO.queryContacto("Contacto.nombre_Cont='" + busqueda + "' or Contacto.apellido_Cont='" + busqueda + "' or Contacto.mail_Cont='" + busqueda + "' or Contacto.telefono_Cont='" + busqueda + "' or Contacto.ciudad_Cont='" + busqueda + "' or Contacto.organizacion_Cont='" + busqueda + "' ", null);
        }
        if (listaContactos != null){
            for (orm.Contacto contactoOrm : listaContactos){
                Contacto contactoNegocio = new Contacto();
                contactoNegocio.setUid_Cont(contactoOrm.getUid_Cont());
                contactoNegocio.setNombre_Cont(contactoOrm.getNombre_Cont());
                contactoNegocio.setApellido_Cont(contactoOrm.getApellido_Cont());
                contactoNegocio.setTelefono_Cont(contactoOrm.getTelefono_Cont());
                contactoNegocio.setMail_Cont(contactoOrm.getMail_Cont());
                contactoNegocio.setCiudad_Cont(contactoOrm.getCiudad_Cont());
                contactoNegocio.setOrganizacion_Cont(contactoOrm.getOrganizacion_Cont());
                contactoNegocio.setImagen_Cont(contactoOrm.getImagen_Cont());
                listaContacto.add(contactoNegocio);
            }
        }
        return listaContacto;
    }
    
    /**
     * 
     * @param textoBusqueda
     */
    public List<Contacto> busquedaIdContactoCapaNegocio(String busqueda) throws PersistentException {
        List<Contacto> listaContacto = new ArrayList<Contacto>();
        List<orm.Contacto> listaContactos = new ArrayList<orm.Contacto>();
        if (busqueda != null || !busqueda.equals("")){
            listaContactos = orm.ContactoDAO.queryContacto("Contacto.uid_Cont='" + busqueda + "' ", null);
        }
        if (listaContactos != null){
            for (orm.Contacto contactoOrm : listaContactos){
                Contacto contactoNegocio = new Contacto();
                contactoNegocio.setUid_Cont(contactoOrm.getUid_Cont());
                contactoNegocio.setNombre_Cont(contactoOrm.getNombre_Cont());
                contactoNegocio.setApellido_Cont(contactoOrm.getApellido_Cont());
                contactoNegocio.setTelefono_Cont(contactoOrm.getTelefono_Cont());
                contactoNegocio.setMail_Cont(contactoOrm.getMail_Cont());
                contactoNegocio.setCiudad_Cont(contactoOrm.getCiudad_Cont());
                contactoNegocio.setOrganizacion_Cont(contactoOrm.getOrganizacion_Cont());
                contactoNegocio.setImagen_Cont(contactoOrm.getImagen_Cont());
                listaContacto.add(contactoNegocio);
            }
        }
        return listaContacto;
    }

    /**
     * 
     * @param contacto
     */
    public List<Contacto> busquedaAvanzadaContactoCapaNegocio(Contacto contacto) throws PersistentException {
        List<Contacto> listaContacto = new ArrayList<Contacto>();
        List<orm.Contacto> listaContactos = new ArrayList<orm.Contacto>();
        String query = "";
        if (contacto.getNombre_Cont() != null && !contacto.getNombre_Cont().equals("")){
                query += "Contacto.nombre_Cont='" + contacto.getNombre_Cont() + "' ";
        }
        if ((contacto.getNombre_Cont() != null && !contacto.getNombre_Cont().trim().equals("")) && (contacto.getApellido_Cont() != null && !contacto.getApellido_Cont().trim().equals(""))){
                query += "and ";
        }
        if (contacto.getApellido_Cont() != null && !contacto.getApellido_Cont().trim().equals("")){
                query += "Contacto.apellido_Cont='" + contacto.getApellido_Cont() + "' ";
        }
        if (((contacto.getNombre_Cont() != null && !contacto.getNombre_Cont().trim().equals("")) || contacto.getApellido_Cont() != null && !contacto.getApellido_Cont().trim().equals("")) && (contacto.getMail_Cont() != null && !contacto.getMail_Cont().trim().equals(""))){
                query += "and ";
        }
        if (contacto.getMail_Cont() != null && !contacto.getMail_Cont().trim().equals("")){
                query += "Contacto.mail_Cont='" + contacto.getMail_Cont() + "' ";
        }
        if (((contacto.getNombre_Cont() != null && !contacto.getNombre_Cont().trim().equals("")) || contacto.getApellido_Cont() != null && !contacto.getApellido_Cont().trim().equals("") || contacto.getMail_Cont() != null && !contacto.getMail_Cont().trim().equals("")) && (contacto.getTelefono_Cont() != null && !contacto.getTelefono_Cont().trim().equals(""))){
                query += "and ";
        }
        if (contacto.getTelefono_Cont() != null && !contacto.getTelefono_Cont().trim().equals("")){
                query += "Contacto.telefono_Cont='" + contacto.getTelefono_Cont() + "' ";
        }
        if (((contacto.getNombre_Cont() != null && !contacto.getNombre_Cont().trim().equals("")) || contacto.getApellido_Cont() != null && !contacto.getApellido_Cont().trim().equals("") || contacto.getMail_Cont() != null && !contacto.getMail_Cont().trim().equals("")) || (contacto.getTelefono_Cont() != null && !contacto.getTelefono_Cont().trim().equals("")) && (contacto.getCiudad_Cont() != null && !contacto.getCiudad_Cont().trim().equals(""))){
                query += "and ";
        }
        if (contacto.getCiudad_Cont() != null && !contacto.getCiudad_Cont().trim().equals("")){
                query += "Contacto.ciudad_Cont='" + contacto.getCiudad_Cont() + "' ";
        }
        if (((contacto.getNombre_Cont() != null && !contacto.getNombre_Cont().trim().equals("")) || contacto.getApellido_Cont() != null && !contacto.getApellido_Cont().trim().equals("") || contacto.getMail_Cont() != null && !contacto.getMail_Cont().trim().equals("")) || (contacto.getTelefono_Cont() != null && !contacto.getTelefono_Cont().trim().equals("")) || (contacto.getCiudad_Cont() != null && !contacto.getCiudad_Cont().trim().equals("")) && (contacto.getOrganizacion_Cont() != null && !contacto.getOrganizacion_Cont().trim().equals(""))){
                query += "and ";
        }
        if (contacto.getOrganizacion_Cont() != null && !contacto.getOrganizacion_Cont().trim().equals("")){
                query += "Contacto.organizacion_Cont='" + contacto.getOrganizacion_Cont() + "' ";
        }


        listaContactos = orm.ContactoDAO.queryContacto(query, null);
        if (listaContactos != null){
            for (orm.Contacto contactoOrm : listaContactos){
                Contacto contactoNegocio = new Contacto();
                contactoNegocio.setUid_Cont(contactoOrm.getUid_Cont());
                contactoNegocio.setNombre_Cont(contactoOrm.getNombre_Cont());
                contactoNegocio.setApellido_Cont(contactoOrm.getApellido_Cont());
                contactoNegocio.setTelefono_Cont(contactoOrm.getTelefono_Cont());
                contactoNegocio.setMail_Cont(contactoOrm.getMail_Cont());
                contactoNegocio.setCiudad_Cont(contactoOrm.getCiudad_Cont());
                contactoNegocio.setOrganizacion_Cont(contactoOrm.getOrganizacion_Cont());
                contactoNegocio.setImagen_Cont(contactoOrm.getImagen_Cont());
                listaContacto.add(contactoNegocio);
            }
        }
        return listaContacto;
    }

    /**
     * 
     * @param contacto
     */
    public List<Grupo_Contacto> gruposDeContactoCapaNegocio(Contacto contacto) throws PersistentException {
        List<Grupo_Contacto> listaGrupo = new ArrayList<Grupo_Contacto>();
        List<orm.Membresia> listaMembs = new ArrayList<orm.Membresia>();
        int idContacto = contacto.getUid_Cont();
        listaMembs = orm.MembresiaDAO.queryMembresia("Membresia.idContacto='" + idContacto + "' ", null);
        Grupo_Contacto grupoBusq = new Grupo_Contacto();
        for (orm.Membresia membOrm : listaMembs){
            listaGrupo.add(grupoBusq.busquedaIdGrupoContactoCapaNegocio("" + membOrm.getIdGrupoContacto().getUid_Grupo()).get(0));            
        }
        return listaGrupo;
    }

}