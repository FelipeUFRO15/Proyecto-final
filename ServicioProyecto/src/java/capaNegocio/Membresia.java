package capaNegocio;
 
//s
public class Membresia {

	private int uid_Memb;
	private int idGrupoContacto;
	private int idContacto;
        
        public Membresia(){
            super();
        }

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

}