package capaNegocio;

public class Notificacion {

	private int uid_Noti;
	private String fecha_Noti;
	private String mensaje_Noti;
	private int idGrupo;

	public int getUid_Noti() {
		return this.uid_Noti;
	}

	/**
	 * 
	 * @param uid_Noti
	 */
	public void setUid_Noti(int uid_Noti) {
		this.uid_Noti = uid_Noti;
	}

	public String getFecha_Noti() {
		return this.fecha_Noti;
	}

	/**
	 * 
	 * @param fecha_Noti
	 */
	public void setFecha_Noti(String fecha_Noti) {
		this.fecha_Noti = fecha_Noti;
	}

	public String getMensaje_Noti() {
		return this.mensaje_Noti;
	}

	/**
	 * 
	 * @param mensaje_Noti
	 */
	public void setMensaje_Noti(String mensaje_Noti) {
		this.mensaje_Noti = mensaje_Noti;
	}

	public int getIdGrupo() {
		return this.idGrupo;
	}

	/**
	 * 
	 * @param idGrupo
	 */
	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}

}