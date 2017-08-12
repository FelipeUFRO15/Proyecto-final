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

public class Actividad {
	public Actividad() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_ACTIVIDAD_ACTIVIDAD_LEIDA) {
			return ORM_actividad_leida;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_ACTIVIDAD_IDGRUPO) {
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
	
	private int uid_Act;
	
	private String fecha_Act;
	
	private String nombre_Act;
	
	private String descripcion_Act;
	
	private orm.Grupo_Contacto idGrupo;
	
	private java.util.Set ORM_actividad_leida = new java.util.HashSet();
	
	/**
	 * Uid de la actividad
	 */
	private void setUid_Act(int value) {
		this.uid_Act = value;
	}
	
	/**
	 * Uid de la actividad
	 */
	public int getUid_Act() {
		return uid_Act;
	}
	
	public int getORMID() {
		return getUid_Act();
	}
	
	/**
	 * Fecha de la actividad
	 */
	public void setFecha_Act(String value) {
		this.fecha_Act = value;
	}
	
	/**
	 * Fecha de la actividad
	 */
	public String getFecha_Act() {
		return fecha_Act;
	}
	
	/**
	 * Nombre de la actividad
	 */
	public void setNombre_Act(String value) {
		this.nombre_Act = value;
	}
	
	/**
	 * Nombre de la actividad
	 */
	public String getNombre_Act() {
		return nombre_Act;
	}
	
	/**
	 * Descripción de la actividad
	 */
	public void setDescripcion_Act(String value) {
		this.descripcion_Act = value;
	}
	
	/**
	 * Descripción de la actividad
	 */
	public String getDescripcion_Act() {
		return descripcion_Act;
	}
	
	public void setIdGrupo(orm.Grupo_Contacto value) {
		if (idGrupo != null) {
			idGrupo.actividad.remove(this);
		}
		if (value != null) {
			value.actividad.add(this);
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
	
	private void setORM_Actividad_leida(java.util.Set value) {
		this.ORM_actividad_leida = value;
	}
	
	private java.util.Set getORM_Actividad_leida() {
		return ORM_actividad_leida;
	}
	
	public final orm.Actividad_LeidaSetCollection actividad_leida = new orm.Actividad_LeidaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_ACTIVIDAD_ACTIVIDAD_LEIDA, orm.ORMConstants.KEY_ACTIVIDAD_LEIDA_IDACTIVIDAD, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getUid_Act());
	}
	
}
