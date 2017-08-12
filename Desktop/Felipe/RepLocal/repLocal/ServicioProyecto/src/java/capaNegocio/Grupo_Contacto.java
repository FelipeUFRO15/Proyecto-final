package capaNegocio;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Grupo_Contacto {

    private int uid_Grupo;
    private String nombre_Grupo;
    private String descripcion_Grupo;
    private String fecha_Grupo;

    public Grupo_Contacto(){
        super();
    }

    public int getUid_Grupo() {
            return this.uid_Grupo;
    }

    /**
     * 
     * @param uid_Grupo
     */
    public void setUid_Grupo(int uid_Grupo) {
            this.uid_Grupo = uid_Grupo;
    }

    public String getNombre_Grupo() {
            return this.nombre_Grupo;
    }

    /**
     * 
     * @param nombre_Grupo
     */
    public void setNombre_Grupo(String nombre_Grupo) {
            this.nombre_Grupo = nombre_Grupo;
    }

    public String getDescripcion_Grupo() {
            return this.descripcion_Grupo;
    }

    /**
     * 
     * @param descripcion_Grupo
     */
    public void setDescripcion_Grupo(String descripcion_Grupo) {
            this.descripcion_Grupo = descripcion_Grupo;
    }

    public String getFecha_Grupo(){
        return this.fecha_Grupo;
    }

    /**
     * 
     * @param fecha 
     */
    public void setFecha_Grupo(String fecha){
        this.fecha_Grupo = fecha;
    }

    /**
     * 
     * @param grupo
     */
    public int agregarGrupoContactoCapaNegocio(Grupo_Contacto grupo) throws PersistentException {
        int respuesta = 0;
        PersistentTransaction t = orm.ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
        try{
                orm.Grupo_Contacto lormGrupo_contacto = orm.Grupo_ContactoDAO.createGrupo_Contacto();
                lormGrupo_contacto.setNombre_Grupo(grupo.getNombre_Grupo());
                lormGrupo_contacto.setDescripcion_Grupo(grupo.getDescripcion_Grupo());
                Calendar c = Calendar.getInstance();
                lormGrupo_contacto.setFecha_Grupo(c.get(Calendar.DATE) + "/" + (c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.YEAR));
                orm.Grupo_ContactoDAO.save(lormGrupo_contacto);
                //orm.Grupo_contactoDAO.refresh(lormGrupo_contacto);
                t.commit();
                return lormGrupo_contacto.getUid_Grupo();
        }catch (Exception e){
                t.rollback();
        }
        return respuesta;
    }

    /**
     * 
     * @param grupo
     */
    public int editarGrupoContactoCapaNegocio(Grupo_Contacto grupo) throws PersistentException {
        int respuesta = 0;
        PersistentTransaction t = orm.ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
        try{
                orm.Grupo_Contacto lormGrupo_contacto = orm.Grupo_ContactoDAO.loadGrupo_ContactoByORMID(grupo.getUid_Grupo());
                if (grupo.getNombre_Grupo() != ""){
                        lormGrupo_contacto.setNombre_Grupo(grupo.getNombre_Grupo());
                }
                if (grupo.getDescripcion_Grupo() != ""){
                        lormGrupo_contacto.setDescripcion_Grupo(grupo.getDescripcion_Grupo());
                }

                orm.Grupo_ContactoDAO.save(lormGrupo_contacto);
                t.commit();
                return lormGrupo_contacto.getUid_Grupo();
        }catch (Exception e){
                t.rollback();
        }
        return respuesta;
    }

    /**
     * 
     * @param grupo
     */
    public int eliminarGrupoContactoCapaNegocio(Grupo_Contacto grupo) throws PersistentException {
        int respuesta = 0;
        PersistentTransaction t = orm.ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
        try{
                orm.Grupo_Contacto lormGrupo_contacto = orm.Grupo_ContactoDAO.loadGrupo_ContactoByORMID(grupo.getUid_Grupo());
                orm.Grupo_ContactoDAO.delete(lormGrupo_contacto);
                t.commit();
                return lormGrupo_contacto.getUid_Grupo();
        }catch (Exception e){
                t.rollback();
        }
        return respuesta;
    }

    /**
     * 
     * @param textoBusqueda
     */
    public List<Grupo_Contacto> busquedaSimpleGrupoContactoCapaNegocio(String textoBusqueda) throws PersistentException {
        List<Grupo_Contacto> listaGrupo = new ArrayList<Grupo_Contacto>();
        List<orm.Grupo_Contacto> listaGrupos = new ArrayList<orm.Grupo_Contacto>();
        if (textoBusqueda != null || !textoBusqueda.equals("")){
            //("(." + textoBusqueda + ".)*")
            listaGrupos = orm.Grupo_ContactoDAO.queryGrupo_Contacto("Grupo_Contacto.nombre_Grupo='" + textoBusqueda + "' or Grupo_Contacto.descripcion_Grupo='" + textoBusqueda + "' ", null);
        }
        if (listaGrupos != null){
            for (orm.Grupo_Contacto grupoOrm : listaGrupos){
                    Grupo_Contacto grupoNegocio = new Grupo_Contacto();
                    grupoNegocio.setUid_Grupo(grupoOrm.getUid_Grupo());
                    grupoNegocio.setNombre_Grupo(grupoOrm.getNombre_Grupo());
                    grupoNegocio.setDescripcion_Grupo(grupoOrm.getDescripcion_Grupo());
                    grupoNegocio.setFecha_Grupo(grupoOrm.getFecha_Grupo());
                    listaGrupo.add(grupoNegocio);
            }
        }
        return listaGrupo;
    }
    
     /* 
     * @param textoBusqueda
     */
    public List<Grupo_Contacto> busquedaIdGrupoContactoCapaNegocio(String textoBusqueda) throws PersistentException {
        List<Grupo_Contacto> listaGrupo = new ArrayList<Grupo_Contacto>();
        List<orm.Grupo_Contacto> listaGrupos = new ArrayList<orm.Grupo_Contacto>();
        if (textoBusqueda != null || !textoBusqueda.equals("")){
            //("(." + textoBusqueda + ".)*")
            listaGrupos = orm.Grupo_ContactoDAO.queryGrupo_Contacto("Grupo_Contacto.uid_Grupo='" + textoBusqueda + "' ", null);
        }
        if (listaGrupos != null){
            for (orm.Grupo_Contacto grupoOrm : listaGrupos){
                    Grupo_Contacto grupoNegocio = new Grupo_Contacto();
                    grupoNegocio.setUid_Grupo(grupoOrm.getUid_Grupo());
                    grupoNegocio.setNombre_Grupo(grupoOrm.getNombre_Grupo());
                    grupoNegocio.setDescripcion_Grupo(grupoOrm.getDescripcion_Grupo());
                    grupoNegocio.setFecha_Grupo(grupoOrm.getFecha_Grupo());
                    listaGrupo.add(grupoNegocio);
            }
        }
        return listaGrupo;
    }

    /**
     * 
     * @param grupo
     */
    public List<Grupo_Contacto> busquedaAvanzadaGrupoContactoCapaNegocio(Grupo_Contacto grupo) throws PersistentException {
        List<Grupo_Contacto> listaGrupo = new ArrayList<Grupo_Contacto>();
        List<orm.Grupo_Contacto> listaGrupos = new ArrayList<orm.Grupo_Contacto>();
        String query = "";
        if (grupo.getNombre_Grupo() != null && !grupo.getNombre_Grupo().equals("")){
                query += "Grupo_Contacto.nombre_Grupo='" + grupo.getNombre_Grupo() + "' ";
        }
        if ((grupo.getNombre_Grupo() != null && !grupo.getNombre_Grupo().trim().equals("")) && (grupo.getDescripcion_Grupo() != null && !grupo.getDescripcion_Grupo().trim().equals(""))){
                query += "and ";
        }
        if (grupo.getDescripcion_Grupo() != null && !grupo.getDescripcion_Grupo().trim().equals("")){
                query += "Grupo_Contacto.descripcion_Grupo='" + grupo.getDescripcion_Grupo() + "' ";
        }
        listaGrupos = orm.Grupo_ContactoDAO.queryGrupo_Contacto(query, null);
        if (listaGrupos != null){
            for (orm.Grupo_Contacto grupoOrm : listaGrupos){
                Grupo_Contacto grupoNegocio = new Grupo_Contacto();
                grupoNegocio.setUid_Grupo(grupoOrm.getUid_Grupo());
                grupoNegocio.setNombre_Grupo(grupoOrm.getNombre_Grupo());
                grupoNegocio.setDescripcion_Grupo(grupoOrm.getDescripcion_Grupo());
                grupoNegocio.setFecha_Grupo(grupoOrm.getFecha_Grupo());
                listaGrupo.add(grupoNegocio);
            }
        }
        return listaGrupo;
    }

    public int inscribirContactoCapaNegocio(Contacto contacto, Grupo_Contacto grupo) throws PersistentException{
        int respuesta = 0;
        PersistentTransaction t = orm.ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
        orm.Membresia lormMembresia = new orm.Membresia();
        if ((grupo.busquedaIdGrupoContactoCapaNegocio("" + grupo.getUid_Grupo()) != null) && (contacto.busquedaIdContactoCapaNegocio("" + contacto.getUid_Cont()) != null)){
            try{
                orm.Contacto contactoOrm = orm.ContactoDAO.loadContactoByORMID(contacto.getUid_Cont());
                orm.Grupo_Contacto grupoOrm = orm.Grupo_ContactoDAO.loadGrupo_ContactoByORMID(grupo.getUid_Grupo());
                lormMembresia.setIdContacto(contactoOrm);
                lormMembresia.setIdGrupoContacto(grupoOrm);
                grupoOrm.membresia.add(lormMembresia);
                t.commit();
                respuesta = lormMembresia.getUid_Memb();
            } catch (Exception e){
                t.rollback();
            }
        }
        return respuesta;
    }
    
    public String agregarNotificacionCapaNegocio(Notificacion notificacion, Grupo_Contacto grupo) throws PersistentException{
        String respuesta = "";
        PersistentTransaction t = orm.ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
        orm.Notificacion lormNotificacion = new orm.Notificacion();
        try{
            orm.Grupo_Contacto grupoOrm = orm.Grupo_ContactoDAO.loadGrupo_ContactoByORMID(grupo.getUid_Grupo());
            lormNotificacion.setIdGrupo(grupoOrm);
            lormNotificacion.setMensaje_Noti(notificacion.getMensaje_Noti());
            Calendar c = Calendar.getInstance();
            lormNotificacion.setFecha_Noti(c.get(Calendar.DATE) + "/" + (c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.YEAR));
            grupoOrm.notificacion.add(lormNotificacion);
            orm.NotificacionDAO.save(lormNotificacion);
            t.commit();
            respuesta = lormNotificacion.getIdGrupo().getNombre_Grupo();
        } catch (Exception e){
            t.rollback();
        }
        
        return respuesta;
    }
    
    public List<Contacto> verLecturasNotificacionCapaNegocio(Notificacion notificacion) throws PersistentException{
        List<Notificacion_Leida> listaNotiLe = new ArrayList<Notificacion_Leida>();
        List<orm.Notificacion_Leida> listaNotiLes = new ArrayList<orm.Notificacion_Leida>();
        Contacto contacto = new Contacto();
        List<Contacto> listaContacto = new ArrayList<Contacto>();
        listaNotiLes = orm.Notificacion_LeidaDAO.queryNotificacion_Leida("Notificacion_Leida.idNotificacion='" + notificacion.getUid_Noti() + "' ", null);
        for (orm.Notificacion_Leida ormNotiLe : listaNotiLes){
            listaContacto.add(contacto.busquedaIdContactoCapaNegocio("" + ormNotiLe.getIdContacto().getUid_Cont()).get(0));
        }
        return listaContacto;
    }
    
    public List<Notificacion> buscarNotificacionesGrupoContactoCapaNegocio (Grupo_Contacto grupo) throws PersistentException{
        List<Notificacion> listaNotificacion = new ArrayList<Notificacion>();
        List<orm.Notificacion> listaNotificacions = new ArrayList<orm.Notificacion>();
        listaNotificacions = orm.NotificacionDAO.queryNotificacion("Notificacion.idGrupo='" + grupo.getUid_Grupo() + "' ", null);
        
        
        for (orm.Notificacion notificacionOrm : listaNotificacions){
            Notificacion notificacionNegocio = new Notificacion();
            notificacionNegocio.setUid_Noti(notificacionOrm.getUid_Noti());
            notificacionNegocio.setMensaje_Noti(notificacionOrm.getMensaje_Noti());
            notificacionNegocio.setFecha_Noti(notificacionOrm.getFecha_Noti());
            notificacionNegocio.setIdGrupo(notificacionOrm.getIdGrupo().getUid_Grupo());
            listaNotificacion.add(notificacionNegocio);
            
        }
        
        return listaNotificacion;
    }
    
    public String leerNotificacionCapaNegocio(Contacto contacto, Notificacion notificacion) throws PersistentException{
        PersistentTransaction t = orm.ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
        orm.Notificacion_Leida lormNotiLe = new orm.Notificacion_Leida();
        Calendar c = Calendar.getInstance();
        try{
            orm.Contacto contactoOrm = orm.ContactoDAO.loadContactoByORMID(contacto.getUid_Cont());
            orm.Notificacion notificacionOrm = orm.NotificacionDAO.loadNotificacionByORMID(notificacion.getUid_Noti());
            lormNotiLe.setIdContacto(contactoOrm);
            lormNotiLe.setIdNotificacion(notificacionOrm);
            lormNotiLe.setFecha_NotiLe(c.get(Calendar.DATE) + "/" + (c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.YEAR));
            orm.Notificacion_LeidaDAO.save(lormNotiLe);
            t.commit();
        } catch (Exception e){
            t.rollback();
        }
        return lormNotiLe.getFecha_NotiLe();
    }
    
    
    /**
     * 
     * @param grupo
     */
    public List<Contacto> busquedaMiembrosCapaNegocio(Grupo_Contacto grupo) throws PersistentException {
        //Membresia[] listaMS = contactoOrm.Membresia.toArray();
        List<Contacto> listaContacto = new ArrayList<Contacto>();
        List<orm.Membresia> listaMembs = new ArrayList<orm.Membresia>();
        int idGrupo = grupo.getUid_Grupo();
        listaMembs = orm.MembresiaDAO.queryMembresia("Membresia.idGrupoContacto='" + idGrupo + "' ", null);
        Contacto contactoBusq = new Contacto();
        for (orm.Membresia membOrm : listaMembs){
            listaContacto.add(contactoBusq.busquedaIdContactoCapaNegocio("" + membOrm.getIdContacto().getUid_Cont()).get(0));            
        }
        return listaContacto;
    }
    
    public String agregarActividadCapaNegocio(Actividad actividad, Grupo_Contacto grupo) throws PersistentException{
        String respuesta = "";
        PersistentTransaction t = orm.ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
        orm.Actividad lormActividad = new orm.Actividad();
        //orm.Membresia lormMembresia = new orm.Membresia();
        try{
            orm.Grupo_Contacto grupoOrm = orm.Grupo_ContactoDAO.loadGrupo_ContactoByORMID(grupo.getUid_Grupo());
            lormActividad.setIdGrupo(grupoOrm);
            lormActividad.setNombre_Act(actividad.getNombre_Act());
            lormActividad.setDescripcion_Act(actividad.getDescripcion_Act());
            Calendar c = Calendar.getInstance();
            lormActividad.setFecha_Act(c.get(Calendar.DATE) + "/" + (c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.YEAR));
            // + Calendar.getInstance().getTime()
            grupoOrm.actividad.add(lormActividad);
            orm.ActividadDAO.save(lormActividad);
            t.commit();
            respuesta = lormActividad.getIdGrupo().getNombre_Grupo();
        } catch (Exception e){
            t.rollback();
        }
        
        return respuesta;
    }
    
    public List<Contacto> verLecturasActividadCapaNegocio(Actividad actividad) throws PersistentException{
        List<Actividad_Leida> listaActLe = new ArrayList<Actividad_Leida>();
        List<orm.Actividad_Leida> listaActLes = new ArrayList<orm.Actividad_Leida>();
        Contacto contacto = new Contacto();
        List<Contacto> listaContacto = new ArrayList<Contacto>();
        listaActLes = orm.Actividad_LeidaDAO.queryActividad_Leida("Actividad_Leida.idActividad='" + actividad.getUid_Act() + "' ", null);
        for (orm.Actividad_Leida ormActLe : listaActLes){
            listaContacto.add(contacto.busquedaIdContactoCapaNegocio("" + ormActLe.getIdContacto().getUid_Cont()).get(0));
        }
        return listaContacto;
    }
    
    public List<Actividad> buscarActividadesGrupoContactoCapaNegocio (Grupo_Contacto grupo) throws PersistentException{
        List<Actividad> listaActividad = new ArrayList<Actividad>();
        List<orm.Actividad> listaActividads = new ArrayList<orm.Actividad>();
        listaActividads = orm.ActividadDAO.queryActividad("Actividad.idGrupo='" + grupo.getUid_Grupo() + "' ", null);
        
        List<Contacto> listaContacto = new ArrayList<Contacto>();
        listaContacto = grupo.busquedaMiembrosCapaNegocio(grupo);
        System.out.println(listaContacto.get(0).getNombre_Cont() + "|" + listaContacto.get(0).getApellido_Cont());
        System.out.println("Debug 1");
        
        for (orm.Actividad actividadOrm : listaActividads){
            Actividad actividadNegocio = new Actividad();
            actividadNegocio.setUid_Act(actividadOrm.getUid_Act());
            actividadNegocio.setNombre_Act(actividadOrm.getNombre_Act());
            actividadNegocio.setDescripcion_Act(actividadOrm.getDescripcion_Act());
            actividadNegocio.setFecha_Act(actividadOrm.getFecha_Act());
            actividadNegocio.setIdGrupo(actividadOrm.getIdGrupo().getUid_Grupo());
            listaActividad.add(actividadNegocio);
            
            /**for (int i = 0; i < listaContacto.size(); i++){
                grupo.leerActividadCapaNegocio(listaContacto.get(i), actividadNegocio);
            }*/
        }
        
        return listaActividad;
    }
    
    public String leerActividadCapaNegocio(Contacto contacto, Actividad actividad) throws PersistentException{
        PersistentTransaction t = orm.ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
        orm.Actividad_Leida lormActLe = new orm.Actividad_Leida();
        Calendar c = Calendar.getInstance();
        try{
            orm.Contacto contactoOrm = orm.ContactoDAO.loadContactoByORMID(contacto.getUid_Cont());
            orm.Actividad actividadOrm = orm.ActividadDAO.loadActividadByORMID(actividad.getUid_Act());
            lormActLe.setIdContacto(contactoOrm);
            lormActLe.setIdActividad(actividadOrm);
            lormActLe.setFecha_ActLe(c.get(Calendar.DATE) + "/" + (c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.YEAR));
            orm.Actividad_LeidaDAO.save(lormActLe);
            t.commit();
        } catch (Exception e){
            t.rollback();
        }
        return lormActLe.getFecha_ActLe();
    }


}