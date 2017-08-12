package capaNegocio;

import capaservicio.PersistentException_Exception;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grupo_Contacto {

	private int uid_Grupo;
	private String nombre_Grupo;
	private String descripcion_Grupo;
	private String fecha_Grupo;

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

	public String getFecha_Grupo() {
		return this.fecha_Grupo;
	}

	/**
	 * 
	 * @param fecha_Grupo
	 */
	public void setFecha_Grupo(String fecha_Grupo) {
		this.fecha_Grupo = fecha_Grupo;
	}

	/**
	 * 
	 * @param grupo
	 */
	public String agregarGrupoContactoCapaNegocio(Grupo_Contacto grupo) {
		String respuesta = "";
                respuesta = agregarGrupoContactoServicioWeb(grupo.getNombre_Grupo(), grupo.getDescripcion_Grupo());
                return respuesta;
	}

	/**
	 * 
	 * @param grupo
	 */
	public String editarGrupoContactoCapaNegocio(Grupo_Contacto grupo) {
		String respuesta = "";
                respuesta = editarGrupoContactoServicioWeb(grupo.getNombre_Grupo(), grupo.getDescripcion_Grupo(), grupo.getUid_Grupo());
                return respuesta;
	}

	/**
	 * 
	 * @param grupo
	 */
	public String eliminarGrupoContactoCapaNegocio(Grupo_Contacto grupo) {
		String respuesta = "";
                respuesta = eliminarGrupoContactoServicioWeb(grupo.getUid_Grupo());
                return respuesta;
	}

	/**
	 * 
	 * @param textoBusqueda
	 */
	public List<Grupo_Contacto> busquedaSimpleGrupoContactoCapaNegocio(String textoBusqueda) {
		String respuesta = "";
                List<Grupo_Contacto> listaGrupo = new ArrayList<Grupo_Contacto>();
                respuesta = busquedaSimpleGrupoContactoServicioWeb(textoBusqueda);
                Gson gson = new Gson();
                Grupo_Contacto[] mcArray = gson.fromJson(respuesta, Grupo_Contacto[].class);
                listaGrupo = Arrays.asList(mcArray);
                return listaGrupo;
	}

	/**
	 * 
	 * @param grupo
	 */
	public List<Grupo_Contacto> busquedaAvanzadaGrupoContactoCapaNegocio(Grupo_Contacto grupo) {
		String respuesta = "";
                String nombre = "";
                String descripcion = "";
                List<Grupo_Contacto> listaGrupo = new ArrayList<Grupo_Contacto>();
                
                if (grupo.getNombre_Grupo() != null){
                    nombre = grupo.getNombre_Grupo();
                }
                if (grupo.getDescripcion_Grupo() != null){
                    descripcion = grupo.getDescripcion_Grupo();
                }
                
                respuesta = busquedaAvanzadaGrupoContactoServicioWeb(nombre, descripcion);
                Gson gson = new Gson();
                Grupo_Contacto[] mcArray = gson.fromJson(respuesta, Grupo_Contacto[].class);
                listaGrupo = Arrays.asList(mcArray);
                return listaGrupo;
	}

	/**
	 * 
	 * @param contacto
	 * @param grupo
	 */
	public String inscribirContactoCapaNegocio(Contacto contacto, Grupo_Contacto grupo) throws PersistentException_Exception {
		String respuesta = "";
                respuesta = inscribirContactoServicioWeb("" + contacto.getUid_Cont(), "" + grupo.getUid_Grupo());
                return respuesta;
	}

	/**
	 * 
	 * @param notificacion
	 * @param grupo
	 */
	public String agregarNotificacionCapaNegocio(Notificacion notificacion, Grupo_Contacto grupo) throws PersistentException_Exception {
		String respuesta = "";
                respuesta = agregarNotificacionAGrupoServicioWeb(notificacion.getMensaje_Noti(), grupo.getUid_Grupo());
                return respuesta;
	}

	/**
	 * 
	 * @param notificacion
	 */
	public List<Contacto> verLecturasNotificacionCapaNegocio(Notificacion notificacion) throws PersistentException_Exception {
		String respuesta = "";
                List<Contacto> listaContacto = new ArrayList<Contacto>();
                respuesta = verLecturasNotificacionServicioWeb(notificacion.getUid_Noti());
                Gson gson = new Gson();
                Contacto[] mcArray = gson.fromJson(respuesta, Contacto[].class);
                listaContacto = Arrays.asList(mcArray);
                return listaContacto;
	}

	/**
	 * 
	 * @param grupo
	 */
	public List<Notificacion> buscarNotificacionesGrupoContactoCapaNegocio(Grupo_Contacto grupo) throws PersistentException_Exception {
		String respuesta = "";
                List<Notificacion> listaNotificacion = new ArrayList<Notificacion>();
                respuesta = buscarNotificacionesServicioWeb(grupo.getUid_Grupo());
                Gson gson = new Gson();
                Notificacion[] mcArray = gson.fromJson(respuesta, Notificacion[].class);
                listaNotificacion = Arrays.asList(mcArray);
                return listaNotificacion;
	}

	/**
	 * 
	 * @param contacto
	 * @param notificacion
	 */
	public String leerNotificacionCapaNegocio(Contacto contacto, Notificacion notificacion) throws PersistentException_Exception {
		String respuesta = "";
                respuesta = leerNotificacionServicioWeb(contacto.getUid_Cont(), notificacion.getUid_Noti());
                return respuesta;
	}

	/**
	 * 
	 * @param actividad
	 * @param grupo
	 */
	public String agregarActividadCapaNegocio(Actividad actividad, Grupo_Contacto grupo) throws PersistentException_Exception {
		String respuesta = "";
                respuesta = agregarActividadAGrupoServicioWeb(actividad.getNombre_Act(), actividad.getDescripcion_Act(), grupo.getUid_Grupo());
                return respuesta;
	}

	/**
	 * 
	 * @param actividad
	 */
	public List<Contacto> verLecturasActividadCapaNegocio(Actividad actividad) throws PersistentException_Exception {
		String respuesta = "";
                List<Contacto> listaContacto = new ArrayList<Contacto>();
                respuesta = verLecturasActividadServicioWeb(actividad.getUid_Act());
                Gson gson = new Gson();
                Contacto[] mcArray = gson.fromJson(respuesta, Contacto[].class);
                listaContacto = Arrays.asList(mcArray);
                return listaContacto;
	}

	/**
	 * 
	 * @param grupo
	 */
	public List<Actividad> buscarActividadesGrupoContactoCapaNegocio(Grupo_Contacto grupo) throws PersistentException_Exception {
		String respuesta = "";
                List<Actividad> listaActividad = new ArrayList<Actividad>();
                respuesta = buscarActividadesServicioWeb(grupo.getUid_Grupo());
                Gson gson = new Gson();
                Actividad[] mcArray = gson.fromJson(respuesta, Actividad[].class);
                listaActividad = Arrays.asList(mcArray);
                return listaActividad;
	}

	/**
	 * 
	 * @param contacto
	 * @param actividad
	 */
	public String leerActividadCapaNegocio(Contacto contacto, Actividad actividad) throws PersistentException_Exception {
		String respuesta = "";
                respuesta = leerActividadServicioWeb(contacto.getUid_Cont(), actividad.getUid_Act());
                return respuesta;
	}

	/**
	 * 
	 * @param grupo
	 */
	public List<Contacto> busquedaMiembrosCapaNegocio(Grupo_Contacto grupo) throws PersistentException_Exception {
		String respuesta = "";                
                List<Contacto> listaContacto = new ArrayList<Contacto>();
                respuesta = miembrosDeGrupoServicioWeb(grupo.getUid_Grupo());
                Gson gson = new Gson();
                Contacto[] mcArray = gson.fromJson(respuesta, Contacto[].class);
                listaContacto = Arrays.asList(mcArray);
                return listaContacto;
	}

    private static String agregarGrupoContactoServicioWeb(java.lang.String nombreGrupo, java.lang.String descripcionGrupo) {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.agregarGrupoContactoServicioWeb(nombreGrupo, descripcionGrupo);
    }

    private static String editarGrupoContactoServicioWeb(java.lang.String nombreGrupo, java.lang.String descripcionGrupo, int uidGrupo) {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.editarGrupoContactoServicioWeb(nombreGrupo, descripcionGrupo, uidGrupo);
    }

    private static String eliminarGrupoContactoServicioWeb(int uidGrupo) {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.eliminarGrupoContactoServicioWeb(uidGrupo);
    }

    private static String busquedaSimpleGrupoContactoServicioWeb(java.lang.String textoBusqueda) {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.busquedaSimpleGrupoContactoServicioWeb(textoBusqueda);
    }

    private static String busquedaAvanzadaGrupoContactoServicioWeb(java.lang.String nombreGrupo, java.lang.String descripcionGrupo) {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.busquedaAvanzadaGrupoContactoServicioWeb(nombreGrupo, descripcionGrupo);
    }

    private static String inscribirContactoServicioWeb(java.lang.String uidCont, java.lang.String uidGrupo) throws PersistentException_Exception {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.inscribirContactoServicioWeb(uidCont, uidGrupo);
    }

    private static String agregarNotificacionAGrupoServicioWeb(java.lang.String mensajeNoti, int uidGrupo) throws PersistentException_Exception {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.agregarNotificacionAGrupoServicioWeb(mensajeNoti, uidGrupo);
    }

    private static String verLecturasNotificacionServicioWeb(int uidNoti) throws PersistentException_Exception {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.verLecturasNotificacionServicioWeb(uidNoti);
    }

    private static String buscarNotificacionesServicioWeb(int uidGrupo) throws PersistentException_Exception {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.buscarNotificacionesServicioWeb(uidGrupo);
    }

    private static String leerNotificacionServicioWeb(int uidCont, int uidNoti) throws PersistentException_Exception {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.leerNotificacionServicioWeb(uidCont, uidNoti);
    }

    private static String agregarActividadAGrupoServicioWeb(java.lang.String nombreAct, java.lang.String descripcionAct, int uidGrupo) throws PersistentException_Exception {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.agregarActividadAGrupoServicioWeb(nombreAct, descripcionAct, uidGrupo);
    }

    private static String verLecturasActividadServicioWeb(int uidAct) throws PersistentException_Exception {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.verLecturasActividadServicioWeb(uidAct);
    }

    private static String buscarActividadesServicioWeb(int uidGrupo) throws PersistentException_Exception {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.buscarActividadesServicioWeb(uidGrupo);
    }

    private static String leerActividadServicioWeb(int uidCont, int uidAct) throws PersistentException_Exception {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.leerActividadServicioWeb(uidCont, uidAct);
    }

    private static String miembrosDeGrupoServicioWeb(int uidGrupo) throws PersistentException_Exception {
        capaservicio.Servicio_Service service = new capaservicio.Servicio_Service();
        capaservicio.Servicio port = service.getServicioPort();
        return port.miembrosDeGrupoServicioWeb(uidGrupo);
    }

}