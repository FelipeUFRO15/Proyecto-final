/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListProyectoFinalData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Contacto...");
		orm.Contacto[] ormContactos = orm.ContactoDAO.listContactoByQuery(null, null);
		int length = Math.min(ormContactos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormContactos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Grupo_Contacto...");
		orm.Grupo_Contacto[] ormGrupo_Contactos = orm.Grupo_ContactoDAO.listGrupo_ContactoByQuery(null, null);
		length = Math.min(ormGrupo_Contactos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormGrupo_Contactos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Membresia...");
		orm.Membresia[] ormMembresias = orm.MembresiaDAO.listMembresiaByQuery(null, null);
		length = Math.min(ormMembresias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormMembresias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Notificacion...");
		orm.Notificacion[] ormNotificacions = orm.NotificacionDAO.listNotificacionByQuery(null, null);
		length = Math.min(ormNotificacions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormNotificacions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Actividad...");
		orm.Actividad[] ormActividads = orm.ActividadDAO.listActividadByQuery(null, null);
		length = Math.min(ormActividads.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormActividads[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Actividad_Leida...");
		orm.Actividad_Leida[] ormActividad_Leidas = orm.Actividad_LeidaDAO.listActividad_LeidaByQuery(null, null);
		length = Math.min(ormActividad_Leidas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormActividad_Leidas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Notificacion_Leida...");
		orm.Notificacion_Leida[] ormNotificacion_Leidas = orm.Notificacion_LeidaDAO.listNotificacion_LeidaByQuery(null, null);
		length = Math.min(ormNotificacion_Leidas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormNotificacion_Leidas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Contacto by Criteria...");
		orm.ContactoCriteria lormContactoCriteria = new orm.ContactoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormContactoCriteria.uid_Cont.eq();
		lormContactoCriteria.setMaxResults(ROW_COUNT);
		orm.Contacto[] ormContactos = lormContactoCriteria.listContacto();
		int length =ormContactos== null ? 0 : Math.min(ormContactos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormContactos[i]);
		}
		System.out.println(length + " Contacto record(s) retrieved."); 
		
		System.out.println("Listing Grupo_Contacto by Criteria...");
		orm.Grupo_ContactoCriteria lormGrupo_ContactoCriteria = new orm.Grupo_ContactoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormGrupo_ContactoCriteria.uid_Grupo.eq();
		lormGrupo_ContactoCriteria.setMaxResults(ROW_COUNT);
		orm.Grupo_Contacto[] ormGrupo_Contactos = lormGrupo_ContactoCriteria.listGrupo_Contacto();
		length =ormGrupo_Contactos== null ? 0 : Math.min(ormGrupo_Contactos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormGrupo_Contactos[i]);
		}
		System.out.println(length + " Grupo_Contacto record(s) retrieved."); 
		
		System.out.println("Listing Membresia by Criteria...");
		orm.MembresiaCriteria lormMembresiaCriteria = new orm.MembresiaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormMembresiaCriteria.uid_Memb.eq();
		lormMembresiaCriteria.setMaxResults(ROW_COUNT);
		orm.Membresia[] ormMembresias = lormMembresiaCriteria.listMembresia();
		length =ormMembresias== null ? 0 : Math.min(ormMembresias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormMembresias[i]);
		}
		System.out.println(length + " Membresia record(s) retrieved."); 
		
		System.out.println("Listing Notificacion by Criteria...");
		orm.NotificacionCriteria lormNotificacionCriteria = new orm.NotificacionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormNotificacionCriteria.uid_Noti.eq();
		lormNotificacionCriteria.setMaxResults(ROW_COUNT);
		orm.Notificacion[] ormNotificacions = lormNotificacionCriteria.listNotificacion();
		length =ormNotificacions== null ? 0 : Math.min(ormNotificacions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormNotificacions[i]);
		}
		System.out.println(length + " Notificacion record(s) retrieved."); 
		
		System.out.println("Listing Actividad by Criteria...");
		orm.ActividadCriteria lormActividadCriteria = new orm.ActividadCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormActividadCriteria.uid_Act.eq();
		lormActividadCriteria.setMaxResults(ROW_COUNT);
		orm.Actividad[] ormActividads = lormActividadCriteria.listActividad();
		length =ormActividads== null ? 0 : Math.min(ormActividads.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormActividads[i]);
		}
		System.out.println(length + " Actividad record(s) retrieved."); 
		
		System.out.println("Listing Actividad_Leida by Criteria...");
		orm.Actividad_LeidaCriteria lormActividad_LeidaCriteria = new orm.Actividad_LeidaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormActividad_LeidaCriteria.uid_ActLe.eq();
		lormActividad_LeidaCriteria.setMaxResults(ROW_COUNT);
		orm.Actividad_Leida[] ormActividad_Leidas = lormActividad_LeidaCriteria.listActividad_Leida();
		length =ormActividad_Leidas== null ? 0 : Math.min(ormActividad_Leidas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormActividad_Leidas[i]);
		}
		System.out.println(length + " Actividad_Leida record(s) retrieved."); 
		
		System.out.println("Listing Notificacion_Leida by Criteria...");
		orm.Notificacion_LeidaCriteria lormNotificacion_LeidaCriteria = new orm.Notificacion_LeidaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormNotificacion_LeidaCriteria.uid_NotiLe.eq();
		lormNotificacion_LeidaCriteria.setMaxResults(ROW_COUNT);
		orm.Notificacion_Leida[] ormNotificacion_Leidas = lormNotificacion_LeidaCriteria.listNotificacion_Leida();
		length =ormNotificacion_Leidas== null ? 0 : Math.min(ormNotificacion_Leidas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormNotificacion_Leidas[i]);
		}
		System.out.println(length + " Notificacion_Leida record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListProyectoFinalData listProyectoFinalData = new ListProyectoFinalData();
			try {
				listProyectoFinalData.listTestData();
				//listProyectoFinalData.listByCriteria();
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
