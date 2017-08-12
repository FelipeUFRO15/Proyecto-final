package capaNegocio;

public class Membresia {

	private int uid_Memb;
	private int idContacto;
	private int idGrupoContacto;

	public int getUid_Memb() {
		return this.uid_Memb;
	}

	/**
	 * 
	 * @param uid_Memb
	 */
	public void setUid_Memb(int uid_Memb) {
		this.uid_Memb = uid_Memb;
	}

	public int getIdContacto() {
		return this.idContacto;
	}

	/**
	 * 
	 * @param idContacto
	 */
	public void setIdContacto(int idContacto) {
		this.idContacto = idContacto;
	}

	public int getIdGrupoContacto() {
		return this.idGrupoContacto;
	}

	/**
	 * 
	 * @param idGrupoContacto
	 */
	public void setIdGrupoContacto(int idGrupoContacto) {
		this.idGrupoContacto = idGrupoContacto;
	}

}