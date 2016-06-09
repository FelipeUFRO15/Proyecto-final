/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package orm;

public class Grupo_Contacto {
	public Grupo_Contacto() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_GRUPO_CONTACTO_ACTIVIDAD) {
			return ORM_actividad;
		}
		else if (key == orm.ORMConstants.KEY_GRUPO_CONTACTO_NOTIFICACION) {
			return ORM_notificacion;
		}
		else if (key == orm.ORMConstants.KEY_GRUPO_CONTACTO_MEMBRESIA) {
			return ORM_membresia;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int uid_Grupo;
	
	private String nombre_Grupo;
	
	private String descripcion_Grupo;
	
	private String fecha_Grupo;
	
	private java.util.Set ORM_actividad = new java.util.HashSet();
	
	private java.util.Set ORM_notificacion = new java.util.HashSet();
	
	private java.util.Set ORM_membresia = new java.util.HashSet();
	
	/**
	 * Uid del grupo
	 */
	private void setUid_Grupo(int value) {
		this.uid_Grupo = value;
	}
	
	/**
	 * Uid del grupo
	 */
	public int getUid_Grupo() {
		return uid_Grupo;
	}
	
	public int getORMID() {
		return getUid_Grupo();
	}
	
	/**
	 * Nombre del grupo de contactos
	 */
	public void setNombre_Grupo(String value) {
		this.nombre_Grupo = value;
	}
	
	/**
	 * Nombre del grupo de contactos
	 */
	public String getNombre_Grupo() {
		return nombre_Grupo;
	}
	
	/**
	 * Descripción del grupo de contactos
	 */
	public void setDescripcion_Grupo(String value) {
		this.descripcion_Grupo = value;
	}
	
	/**
	 * Descripción del grupo de contactos
	 */
	public String getDescripcion_Grupo() {
		return descripcion_Grupo;
	}
	
	/**
	 * Fecha de creación del grupo
	 */
	public void setFecha_Grupo(String value) {
		this.fecha_Grupo = value;
	}
	
	/**
	 * Fecha de creación del grupo
	 */
	public String getFecha_Grupo() {
		return fecha_Grupo;
	}
	
	private void setORM_Actividad(java.util.Set value) {
		this.ORM_actividad = value;
	}
	
	private java.util.Set getORM_Actividad() {
		return ORM_actividad;
	}
	
	public final orm.ActividadSetCollection actividad = new orm.ActividadSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_GRUPO_CONTACTO_ACTIVIDAD, orm.ORMConstants.KEY_ACTIVIDAD_IDGRUPO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Notificacion(java.util.Set value) {
		this.ORM_notificacion = value;
	}
	
	private java.util.Set getORM_Notificacion() {
		return ORM_notificacion;
	}
	
	public final orm.NotificacionSetCollection notificacion = new orm.NotificacionSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_GRUPO_CONTACTO_NOTIFICACION, orm.ORMConstants.KEY_NOTIFICACION_IDGRUPO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Membresia(java.util.Set value) {
		this.ORM_membresia = value;
	}
	
	private java.util.Set getORM_Membresia() {
		return ORM_membresia;
	}
	
	public final orm.MembresiaSetCollection membresia = new orm.MembresiaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_GRUPO_CONTACTO_MEMBRESIA, orm.ORMConstants.KEY_MEMBRESIA_IDGRUPOCONTACTO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getUid_Grupo());
	}
	
}
