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

public class Contacto {
	public Contacto() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_CONTACTO_MEMBRESIA) {
			return ORM_membresia;
		}
		else if (key == orm.ORMConstants.KEY_CONTACTO_ACTIVIDAD_LEIDA) {
			return ORM_actividad_leida;
		}
		else if (key == orm.ORMConstants.KEY_CONTACTO_NOTIFICACION_LEIDA) {
			return ORM_notificacion_leida;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int uid_Cont;
	
	private String nombre_Cont;
	
	private String apellido_Cont;
	
	private String mail_Cont;
	
	private String telefono_Cont;
	
	private String ciudad_Cont;
	
	private String organizacion_Cont;
	
	private String imagen_Cont;
	
	private java.util.Set ORM_membresia = new java.util.HashSet();
	
	private java.util.Set ORM_actividad_leida = new java.util.HashSet();
	
	private java.util.Set ORM_notificacion_leida = new java.util.HashSet();
	
	/**
	 * Uid del contacto
	 */
	private void setUid_Cont(int value) {
		this.uid_Cont = value;
	}
	
	/**
	 * Uid del contacto
	 */
	public int getUid_Cont() {
		return uid_Cont;
	}
	
	public int getORMID() {
		return getUid_Cont();
	}
	
	/**
	 * Nombre del contacto
	 */
	public void setNombre_Cont(String value) {
		this.nombre_Cont = value;
	}
	
	/**
	 * Nombre del contacto
	 */
	public String getNombre_Cont() {
		return nombre_Cont;
	}
	
	/**
	 * Apellido del contacto
	 */
	public void setApellido_Cont(String value) {
		this.apellido_Cont = value;
	}
	
	/**
	 * Apellido del contacto
	 */
	public String getApellido_Cont() {
		return apellido_Cont;
	}
	
	/**
	 * Email del contacto
	 */
	public void setMail_Cont(String value) {
		this.mail_Cont = value;
	}
	
	/**
	 * Email del contacto
	 */
	public String getMail_Cont() {
		return mail_Cont;
	}
	
	/**
	 * Teléfono del contacto
	 */
	public void setTelefono_Cont(String value) {
		this.telefono_Cont = value;
	}
	
	/**
	 * Teléfono del contacto
	 */
	public String getTelefono_Cont() {
		return telefono_Cont;
	}
	
	/**
	 * ciudad del contacto
	 */
	public void setCiudad_Cont(String value) {
		this.ciudad_Cont = value;
	}
	
	/**
	 * ciudad del contacto
	 */
	public String getCiudad_Cont() {
		return ciudad_Cont;
	}
	
	/**
	 * organizacion del contacto
	 */
	public void setOrganizacion_Cont(String value) {
		this.organizacion_Cont = value;
	}
	
	/**
	 * organizacion del contacto
	 */
	public String getOrganizacion_Cont() {
		return organizacion_Cont;
	}
	
	/**
	 * imagen del contacto
	 */
	public void setImagen_Cont(String value) {
		this.imagen_Cont = value;
	}
	
	/**
	 * imagen del contacto
	 */
	public String getImagen_Cont() {
		return imagen_Cont;
	}
	
	private void setORM_Membresia(java.util.Set value) {
		this.ORM_membresia = value;
	}
	
	private java.util.Set getORM_Membresia() {
		return ORM_membresia;
	}
	
	public final orm.MembresiaSetCollection membresia = new orm.MembresiaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CONTACTO_MEMBRESIA, orm.ORMConstants.KEY_MEMBRESIA_IDCONTACTO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Actividad_leida(java.util.Set value) {
		this.ORM_actividad_leida = value;
	}
	
	private java.util.Set getORM_Actividad_leida() {
		return ORM_actividad_leida;
	}
	
	public final orm.Actividad_LeidaSetCollection actividad_leida = new orm.Actividad_LeidaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CONTACTO_ACTIVIDAD_LEIDA, orm.ORMConstants.KEY_ACTIVIDAD_LEIDA_IDCONTACTO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Notificacion_leida(java.util.Set value) {
		this.ORM_notificacion_leida = value;
	}
	
	private java.util.Set getORM_Notificacion_leida() {
		return ORM_notificacion_leida;
	}
	
	public final orm.Notificacion_LeidaSetCollection notificacion_leida = new orm.Notificacion_LeidaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CONTACTO_NOTIFICACION_LEIDA, orm.ORMConstants.KEY_NOTIFICACION_LEIDA_IDCONTACTO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getUid_Cont());
	}
	
}
