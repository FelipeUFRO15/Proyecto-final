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

public class Membresia {
	public Membresia() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_MEMBRESIA_IDCONTACTO) {
			this.idContacto = (orm.Contacto) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_MEMBRESIA_IDGRUPOCONTACTO) {
			this.idGrupoContacto = (orm.Grupo_Contacto) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int uid_Memb;
	
	private orm.Grupo_Contacto idGrupoContacto;
	
	private orm.Contacto idContacto;
	
	/**
	 * Uid de la membresía
	 */
	private void setUid_Memb(int value) {
		this.uid_Memb = value;
	}
	
	/**
	 * Uid de la membresía
	 */
	public int getUid_Memb() {
		return uid_Memb;
	}
	
	public int getORMID() {
		return getUid_Memb();
	}
	
	public void setIdContacto(orm.Contacto value) {
		if (idContacto != null) {
			idContacto.membresia.remove(this);
		}
		if (value != null) {
			value.membresia.add(this);
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
	
	public void setIdGrupoContacto(orm.Grupo_Contacto value) {
		if (idGrupoContacto != null) {
			idGrupoContacto.membresia.remove(this);
		}
		if (value != null) {
			value.membresia.add(this);
		}
	}
	
	public orm.Grupo_Contacto getIdGrupoContacto() {
		return idGrupoContacto;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_IdGrupoContacto(orm.Grupo_Contacto value) {
		this.idGrupoContacto = value;
	}
	
	private orm.Grupo_Contacto getORM_IdGrupoContacto() {
		return idGrupoContacto;
	}
	
	public String toString() {
		return String.valueOf(getUid_Memb());
	}
	
}
