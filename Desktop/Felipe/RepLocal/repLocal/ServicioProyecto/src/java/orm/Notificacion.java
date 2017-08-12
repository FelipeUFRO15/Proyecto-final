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

public class Notificacion {
	public Notificacion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_NOTIFICACION_NOTIFICACION_LEIDA) {
			return ORM_notificacion_leida;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_NOTIFICACION_IDGRUPO) {
			this.idGrupo = (orm.Grupo_Contacto) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int uid_Noti;
	
	private String fecha_Noti;
	
	private String mensaje_Noti;
	
	private orm.Grupo_Contacto idGrupo;
	
	private java.util.Set ORM_notificacion_leida = new java.util.HashSet();
	
	/**
	 * Uid de la notificación
	 */
	private void setUid_Noti(int value) {
		this.uid_Noti = value;
	}
	
	/**
	 * Uid de la notificación
	 */
	public int getUid_Noti() {
		return uid_Noti;
	}
	
	public int getORMID() {
		return getUid_Noti();
	}
	
	/**
	 * Fecha de la notificación
	 */
	public void setFecha_Noti(String value) {
		this.fecha_Noti = value;
	}
	
	/**
	 * Fecha de la notificación
	 */
	public String getFecha_Noti() {
		return fecha_Noti;
	}
	
	/**
	 * Contenido de la notificación
	 */
	public void setMensaje_Noti(String value) {
		this.mensaje_Noti = value;
	}
	
	/**
	 * Contenido de la notificación
	 */
	public String getMensaje_Noti() {
		return mensaje_Noti;
	}
	
	public void setIdGrupo(orm.Grupo_Contacto value) {
		if (idGrupo != null) {
			idGrupo.notificacion.remove(this);
		}
		if (value != null) {
			value.notificacion.add(this);
		}
	}
	
	public orm.Grupo_Contacto getIdGrupo() {
		return idGrupo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_IdGrupo(orm.Grupo_Contacto value) {
		this.idGrupo = value;
	}
	
	private orm.Grupo_Contacto getORM_IdGrupo() {
		return idGrupo;
	}
	
	private void setORM_Notificacion_leida(java.util.Set value) {
		this.ORM_notificacion_leida = value;
	}
	
	private java.util.Set getORM_Notificacion_leida() {
		return ORM_notificacion_leida;
	}
	
	public final orm.Notificacion_LeidaSetCollection notificacion_leida = new orm.Notificacion_LeidaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_NOTIFICACION_NOTIFICACION_LEIDA, orm.ORMConstants.KEY_NOTIFICACION_LEIDA_IDNOTIFICACION, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getUid_Noti());
	}
	
}
