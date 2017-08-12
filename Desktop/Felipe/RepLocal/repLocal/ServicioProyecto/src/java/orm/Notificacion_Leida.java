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

public class Notificacion_Leida {
	public Notificacion_Leida() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_NOTIFICACION_LEIDA_IDCONTACTO) {
			this.idContacto = (orm.Contacto) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_NOTIFICACION_LEIDA_IDNOTIFICACION) {
			this.idNotificacion = (orm.Notificacion) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int uid_NotiLe;
	
	private String fecha_NotiLe;
	
	private orm.Contacto idContacto;
	
	private orm.Notificacion idNotificacion;
	
	/**
	 * Uid de la notificación leída
	 */
	private void setUid_NotiLe(int value) {
		this.uid_NotiLe = value;
	}
	
	/**
	 * Uid de la notificación leída
	 */
	public int getUid_NotiLe() {
		return uid_NotiLe;
	}
	
	public int getORMID() {
		return getUid_NotiLe();
	}
	
	/**
	 * Fecha en que fue leída la actividad
	 */
	public void setFecha_NotiLe(String value) {
		this.fecha_NotiLe = value;
	}
	
	/**
	 * Fecha en que fue leída la actividad
	 */
	public String getFecha_NotiLe() {
		return fecha_NotiLe;
	}
	
	public void setIdContacto(orm.Contacto value) {
		if (idContacto != null) {
			idContacto.notificacion_leida.remove(this);
		}
		if (value != null) {
			value.notificacion_leida.add(this);
		}
	}
	
	public orm.Contacto getIdContacto() {
		return idContacto;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_IdContacto(orm.Contacto value) {
		this.idContacto = value;
	}
	
	private orm.Contacto getORM_IdContacto() {
		return idContacto;
	}
	
	public void setIdNotificacion(orm.Notificacion value) {
		if (idNotificacion != null) {
			idNotificacion.notificacion_leida.remove(this);
		}
		if (value != null) {
			value.notificacion_leida.add(this);
		}
	}
	
	public orm.Notificacion getIdNotificacion() {
		return idNotificacion;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_IdNotificacion(orm.Notificacion value) {
		this.idNotificacion = value;
	}
	
	private orm.Notificacion getORM_IdNotificacion() {
		return idNotificacion;
	}
	
	public String toString() {
		return String.valueOf(getUid_NotiLe());
	}
	
}
