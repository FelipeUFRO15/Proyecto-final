package capaNegocio;

public class Actividad_Leida {

	private int uid_ActLe;
	private String fecha_ActLe;
	private int idContacto;
	private int idActividad;
        
        public Actividad_Leida(){
            super();
        }

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

	public String getFecha_ActLe() {
		return this.fecha_ActLe;
	}

	/**
	 * 
	 * @param fecha_ActLe
	 */
	public void setFecha_ActLe(String fecha_ActLe) {
		this.fecha_ActLe = fecha_ActLe;
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