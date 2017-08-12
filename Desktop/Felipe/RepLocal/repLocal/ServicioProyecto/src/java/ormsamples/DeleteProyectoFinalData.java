/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteProyectoFinalData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Contacto lormContacto = orm.ContactoDAO.loadContactoByQuery(null, null);
			// Delete the persistent object
			orm.ContactoDAO.delete(lormContacto);
			orm.Grupo_Contacto lormGrupo_Contacto = orm.Grupo_ContactoDAO.loadGrupo_ContactoByQuery(null, null);
			// Delete the persistent object
			orm.Grupo_ContactoDAO.delete(lormGrupo_Contacto);
			orm.Membresia lormMembresia = orm.MembresiaDAO.loadMembresiaByQuery(null, null);
			// Delete the persistent object
			orm.MembresiaDAO.delete(lormMembresia);
			orm.Notificacion lormNotificacion = orm.NotificacionDAO.loadNotificacionByQuery(null, null);
			// Delete the persistent object
			orm.NotificacionDAO.delete(lormNotificacion);
			orm.Actividad lormActividad = orm.ActividadDAO.loadActividadByQuery(null, null);
			// Delete the persistent object
			orm.ActividadDAO.delete(lormActividad);
			orm.Actividad_Leida lormActividad_Leida = orm.Actividad_LeidaDAO.loadActividad_LeidaByQuery(null, null);
			// Delete the persistent object
			orm.Actividad_LeidaDAO.delete(lormActividad_Leida);
			orm.Notificacion_Leida lormNotificacion_Leida = orm.Notificacion_LeidaDAO.loadNotificacion_LeidaByQuery(null, null);
			// Delete the persistent object
			orm.Notificacion_LeidaDAO.delete(lormNotificacion_Leida);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteProyectoFinalData deleteProyectoFinalData = new DeleteProyectoFinalData();
			try {
				deleteProyectoFinalData.deleteTestData();
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
