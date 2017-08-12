package capaNegocio;

public class Notificacion_Leida {

	private int uid_NotiLe;
	private String fecha_NotiLe;
	private int idContacto;
	private int idNotificacion;

	public int getUid_NotiLe() {
		return this.uid_NotiLe;
	}

	/**
	 * 
	 * @param uid_NotiLe
	 */
	public void setUid_NotiLe(int uid_NotiLe) {
		this.uid_NotiLe = uid_NotiLe;
	}

	public String getFecha_NotiLe() {
		return this.fecha_NotiLe;
	}

	/**
	 * 
	 * @param fecha_NotiLe
	 */
	public void setFecha_NotiLe(String fecha_NotiLe) {
		this.fecha_NotiLe = fecha_NotiLe;
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

	public int getIdNotificacion() {
		return this.idNotificacion;
	}

	/**
	 * 
	 * @param idNotificacion
	 */
	public void setIdNotificacion(int idNotificacion) {
		this.idNotificacion = idNotificacion;
	}

}