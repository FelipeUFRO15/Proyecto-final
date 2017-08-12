package capaNegocio;

public class Actividad_Leida {

	private int uid_ActLe;
	private String fechaActLe;
	private int idContacto;
	private int idActividad;

	public int getUid_ActLe() {
		return this.uid_ActLe;
	}

	/**
	 * 
	 * @param uid_ActLe
	 */
	public void setUid_ActLe(int uid_ActLe) {
		this.uid_ActLe = uid_ActLe;
	}

	public String getFechaActLe() {
		return this.fechaActLe;
	}

	/**
	 * 
	 * @param fechaActLe
	 */
	public void setFechaActLe(String fechaActLe) {
		this.fechaActLe = fechaActLe;
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

	public int getIdActividad() {
		return this.idActividad;
	}

	/**
	 * 
	 * @param idActividad
	 */
	public void setIdActividad(int idActividad) {
		this.idActividad = idActividad;
	}

}