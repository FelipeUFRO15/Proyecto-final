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

public class Actividad_Leida {
	public Actividad_Leida() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_ACTIVIDAD_LEIDA_IDCONTACTO) {
			this.idContacto = (orm.Contacto) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_ACTIVIDAD_LEIDA_IDACTIVIDAD) {
			this.idActividad = (orm.Actividad) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int uid_ActLe;
	
	private String fecha_ActLe;
	
	private orm.Contacto idContacto;
	
	private orm.Actividad idActividad;
	
	/**
	 * Uid de la actividad leida
	 */
	private void setUid_ActLe(int value) {
		this.uid_ActLe = value;
	}
	
	/**
	 * Uid de la actividad leida
	 */
	public int getUid_ActLe() {
		return uid_ActLe;
	}
	
	public int getORMID() {
		return getUid_ActLe();
	}
	
	/**
	 * Fecha en que fue leída la actividad
	 */
	public void setFecha_ActLe(String value) {
		this.fecha_ActLe = value;
	}
	
	/**
	 * Fecha en que fue leída la actividad
	 */
	public String getFecha_ActLe() {
		return fecha_ActLe;
	}
	
	public void setIdContacto(orm.Contacto value) {
		if (idContacto != null) {
			idContacto.actividad_leida.remove(this);
		}
		if (value != null) {
			value.actividad_leida.add(this);
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
	
	public void setIdActividad(orm.Actividad value) {
		if (idActividad != null) {
			idActividad.actividad_leida.remove(this);
		}
		if (value != null) {
			value.actividad_leida.add(this);
		}
	}
	
	public orm.Actividad getIdActividad() {
		return idActividad;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_IdActividad(orm.Actividad value) {
		this.idActividad = value;
	}
	
	private orm.Actividad getORM_IdActividad() {
		return idActividad;
	}
	
	public String toString() {
		return String.valueOf(getUid_ActLe());
	}
	
}
