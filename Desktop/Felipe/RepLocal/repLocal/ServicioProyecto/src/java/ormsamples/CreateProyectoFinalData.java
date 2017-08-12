/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateProyectoFinalData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Contacto lormContacto = orm.ContactoDAO.createContacto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : notificacion_leida, actividad_leida, membresia, telefono_Cont, mail_Cont, apellido_Cont, nombre_Cont
			orm.ContactoDAO.save(lormContacto);
			orm.Grupo_Contacto lormGrupo_Contacto = orm.Grupo_ContactoDAO.createGrupo_Contacto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : membresia, notificacion, actividad, fecha_Grupo, descripcion_Grupo, nombre_Grupo
			orm.Grupo_ContactoDAO.save(lormGrupo_Contacto);
			orm.Membresia lormMembresia = orm.MembresiaDAO.createMembresia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : idContacto, idGrupoContacto
			orm.MembresiaDAO.save(lormMembresia);
			orm.Notificacion lormNotificacion = orm.NotificacionDAO.createNotificacion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : notificacion_leida, idGrupo, fecha_Noti
			orm.NotificacionDAO.save(lormNotificacion);
			orm.Actividad lormActividad = orm.ActividadDAO.createActividad();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : actividad_leida, idGrupo, nombre_Act, fecha_Act
			orm.ActividadDAO.save(lormActividad);
			orm.Actividad_Leida lormActividad_Leida = orm.Actividad_LeidaDAO.createActividad_Leida();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : idActividad, idContacto, fecha_ActLe
			orm.Actividad_LeidaDAO.save(lormActividad_Leida);
			orm.Notificacion_Leida lormNotificacion_Leida = orm.Notificacion_LeidaDAO.createNotificacion_Leida();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : idNotificacion, idContacto, fecha_NotiLe
			orm.Notificacion_LeidaDAO.save(lormNotificacion_Leida);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateProyectoFinalData createProyectoFinalData = new CreateProyectoFinalData();
			try {
				createProyectoFinalData.createTestData();
			}
			finally {
				orm.ProyectoFinalPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
