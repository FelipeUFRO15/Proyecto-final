package capaNegocio;

import java.util.Calendar;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Actividad {

	private int uid_Act;
	private String fecha_Act;
	private String nombre_Act;
	private String descripcion_Act;
	private int idGrupo;
        
        public Actividad(){
            super();
        }

	public int getUid_Act() {
		return this.uid_Act;
	}

	/**
	 * 
	 * @param uid_Act
	 */
	public void setUid_Act(int uid_Act) {
		this.uid_Act = uid_Act;
	}

	public String getFecha_Act() {
		return this.fecha_Act;
	}

	/**
	 * 
	 * @param fecha_Act
	 */
	public void setFecha_Act(String fecha_Act) {
		this.fecha_Act = fecha_Act;
	}

	public String getNombre_Act() {
		return this.nombre_Act;
	}

	/**
	 * 
	 * @param nombre_Act
	 */
	public void setNombre_Act(String nombre_Act) {
		this.nombre_Act = nombre_Act;
	}

	public String getDescripcion_Act() {
		return this.descripcion_Act;
	}

	/**
	 * 
	 * @param descripcion_Act
	 */
	public void setDescripcion_Act(String descripcion_Act) {
		this.descripcion_Act = descripcion_Act;
	}

	public int getIdGrupo() {
		return this.idGrupo;
	}

	/**
	 * 
	 * @param idGrupo
	 */
	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}
        
        public int agregarActividadAGrupo(Actividad actividad,Grupo_Contacto grupo) throws PersistentException {
        int respuesta = 0;
        PersistentTransaction t = orm.ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
        try {
                    
            orm.Actividad actividadOrm = orm.ActividadDAO.loadActividadByORMID(actividad.getUid_Act());
                      
            orm.Grupo_Contacto grupoOrm = orm.Grupo_ContactoDAO.loadGrupo_ContactoByORMID(grupo.getUid_Grupo());
            
            
            actividadOrm.setIdGrupo(grupoOrm);
            grupoOrm.actividad.add(actividadOrm);
            
            
           
            t.commit();
            respuesta = actividadOrm.getUid_Act();
        } catch (Exception e) {
            t.rollback();
        }
        return respuesta;
    }
public int agregarActividadCapaNegocio(Actividad actividad) throws PersistentException {
            int respuesta=0;
            PersistentTransaction t = orm.ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
            try {
                orm.Actividad lormActividad = orm.ActividadDAO.createActividad();
                orm.Grupo_Contacto grupo = new orm.Grupo_Contacto();
                orm.Grupo_Contacto grupoOrm = orm.Grupo_ContactoDAO.loadGrupo_ContactoByORMID(grupo.getUid_Grupo());
                lormActividad.setNombre_Act(actividad.getNombre_Act()); 
                lormActividad.setDescripcion_Act(actividad.getDescripcion_Act());
                lormActividad.setFecha_Act("fecha");
                lormActividad.setIdGrupo(grupoOrm);
                grupoOrm.actividad.add(lormActividad);
                orm.ActividadDAO.save(lormActividad);
                t.commit();
                respuesta = lormActividad.getUid_Act();
            } catch (Exception e) {
                 t.rollback();
            }
                return respuesta;
	}

}