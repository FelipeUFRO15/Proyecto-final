/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateProyectoFinalData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm.ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Contacto lormContacto = orm.ContactoDAO.loadContactoByQuery(null, null);
			// Update the properties of the persistent object
			orm.ContactoDAO.save(lormContacto);
			orm.Grupo_Contacto lormGrupo_Contacto = orm.Grupo_ContactoDAO.loadGrupo_ContactoByQuery(null, null);
			// Update the properties of the persistent object
			orm.Grupo_ContactoDAO.save(lormGrupo_Contacto);
			orm.Membresia lormMembresia = orm.MembresiaDAO.loadMembresiaByQuery(null, null);
			// Update the properties of the persistent object
			orm.MembresiaDAO.save(lormMembresia);
			orm.Notificacion lormNotificacion = orm.NotificacionDAO.loadNotificacionByQuery(null, null);
			// Update the properties of the persistent object
			orm.NotificacionDAO.save(lormNotificacion);
			orm.Actividad lormActividad = orm.ActividadDAO.loadActividadByQuery(null, null);
			// Update the properties of the persistent object
			orm.ActividadDAO.save(lormActividad);
			orm.Actividad_Leida lormActividad_Leida = orm.Actividad_LeidaDAO.loadActividad_LeidaByQuery(null, null);
			// Update the properties of the persistent object
			orm.Actividad_LeidaDAO.save(lormActividad_Leida);
			orm.Notificacion_Leida lormNotificacion_Leida = orm.Notificacion_LeidaDAO.loadNotificacion_LeidaByQuery(null, null);
			// Update the properties of the persistent object
			orm.Notificacion_LeidaDAO.save(lormNotificacion_Leida);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Contacto by ContactoCriteria");
		orm.ContactoCriteria lormContactoCriteria = new orm.ContactoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormContactoCriteria.uid_Cont.eq();
		System.out.println(lormContactoCriteria.uniqueContacto());
		
		System.out.println("Retrieving Grupo_Contacto by Grupo_ContactoCriteria");
		orm.Grupo_ContactoCriteria lormGrupo_ContactoCriteria = new orm.Grupo_ContactoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormGrupo_ContactoCriteria.uid_Grupo.eq();
		System.out.println(lormGrupo_ContactoCriteria.uniqueGrupo_Contacto());
		
		System.out.println("Retrieving Membresia by MembresiaCriteria");
		orm.MembresiaCriteria lormMembresiaCriteria = new orm.MembresiaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormMembresiaCriteria.uid_Memb.eq();
		System.out.println(lormMembresiaCriteria.uniqueMembresia());
		
		System.out.println("Retrieving Notificacion by NotificacionCriteria");
		orm.NotificacionCriteria lormNotificacionCriteria = new orm.NotificacionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormNotificacionCriteria.uid_Noti.eq();
		System.out.println(lormNotificacionCriteria.uniqueNotificacion());
		
		System.out.println("Retrieving Actividad by ActividadCriteria");
		orm.ActividadCriteria lormActividadCriteria = new orm.ActividadCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormActividadCriteria.uid_Act.eq();
		System.out.println(lormActividadCriteria.uniqueActividad());
		
		System.out.println("Retrieving Actividad_Leida by Actividad_LeidaCriteria");
		orm.Actividad_LeidaCriteria lormActividad_LeidaCriteria = new orm.Actividad_LeidaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormActividad_LeidaCriteria.uid_ActLe.eq();
		System.out.println(lormActividad_LeidaCriteria.uniqueActividad_Leida());
		
		System.out.println("Retrieving Notificacion_Leida by Notificacion_LeidaCriteria");
		orm.Notificacion_LeidaCriteria lormNotificacion_LeidaCriteria = new orm.Notificacion_LeidaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormNotificacion_LeidaCriteria.uid_NotiLe.eq();
		System.out.println(lormNotificacion_LeidaCriteria.uniqueNotificacion_Leida());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateProyectoFinalData retrieveAndUpdateProyectoFinalData = new RetrieveAndUpdateProyectoFinalData();
			try {
				retrieveAndUpdateProyectoFinalData.retrieveAndUpdateTestData();
				//retrieveAndUpdateProyectoFinalData.retrieveByCriteria();
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
