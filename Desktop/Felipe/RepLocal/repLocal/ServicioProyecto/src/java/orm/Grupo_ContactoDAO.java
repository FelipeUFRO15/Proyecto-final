/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package orm;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Grupo_ContactoDAO {
	public static Grupo_Contacto loadGrupo_ContactoByORMID(int uid_Grupo) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return loadGrupo_ContactoByORMID(session, uid_Grupo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_Contacto getGrupo_ContactoByORMID(int uid_Grupo) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return getGrupo_ContactoByORMID(session, uid_Grupo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_Contacto loadGrupo_ContactoByORMID(int uid_Grupo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return loadGrupo_ContactoByORMID(session, uid_Grupo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_Contacto getGrupo_ContactoByORMID(int uid_Grupo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return getGrupo_ContactoByORMID(session, uid_Grupo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_Contacto loadGrupo_ContactoByORMID(PersistentSession session, int uid_Grupo) throws PersistentException {
		try {
			return (Grupo_Contacto) session.load(orm.Grupo_Contacto.class, new Integer(uid_Grupo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_Contacto getGrupo_ContactoByORMID(PersistentSession session, int uid_Grupo) throws PersistentException {
		try {
			return (Grupo_Contacto) session.get(orm.Grupo_Contacto.class, new Integer(uid_Grupo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_Contacto loadGrupo_ContactoByORMID(PersistentSession session, int uid_Grupo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Grupo_Contacto) session.load(orm.Grupo_Contacto.class, new Integer(uid_Grupo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_Contacto getGrupo_ContactoByORMID(PersistentSession session, int uid_Grupo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Grupo_Contacto) session.get(orm.Grupo_Contacto.class, new Integer(uid_Grupo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGrupo_Contacto(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return queryGrupo_Contacto(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGrupo_Contacto(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return queryGrupo_Contacto(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_Contacto[] listGrupo_ContactoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return listGrupo_ContactoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_Contacto[] listGrupo_ContactoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return listGrupo_ContactoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGrupo_Contacto(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Grupo_Contacto as Grupo_Contacto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGrupo_Contacto(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Grupo_Contacto as Grupo_Contacto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Grupo_Contacto", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_Contacto[] listGrupo_ContactoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryGrupo_Contacto(session, condition, orderBy);
			return (Grupo_Contacto[]) list.toArray(new Grupo_Contacto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_Contacto[] listGrupo_ContactoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryGrupo_Contacto(session, condition, orderBy, lockMode);
			return (Grupo_Contacto[]) list.toArray(new Grupo_Contacto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_Contacto loadGrupo_ContactoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return loadGrupo_ContactoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_Contacto loadGrupo_ContactoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return loadGrupo_ContactoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_Contacto loadGrupo_ContactoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Grupo_Contacto[] grupo_Contactos = listGrupo_ContactoByQuery(session, condition, orderBy);
		if (grupo_Contactos != null && grupo_Contactos.length > 0)
			return grupo_Contactos[0];
		else
			return null;
	}
	
	public static Grupo_Contacto loadGrupo_ContactoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Grupo_Contacto[] grupo_Contactos = listGrupo_ContactoByQuery(session, condition, orderBy, lockMode);
		if (grupo_Contactos != null && grupo_Contactos.length > 0)
			return grupo_Contactos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateGrupo_ContactoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return iterateGrupo_ContactoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGrupo_ContactoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return iterateGrupo_ContactoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGrupo_ContactoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Grupo_Contacto as Grupo_Contacto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGrupo_ContactoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Grupo_Contacto as Grupo_Contacto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Grupo_Contacto", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_Contacto createGrupo_Contacto() {
		return new orm.Grupo_Contacto();
	}
	
	public static boolean save(orm.Grupo_Contacto grupo_Contacto) throws PersistentException {
		try {
			orm.ProyectoFinalPersistentManager.instance().saveObject(grupo_Contacto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Grupo_Contacto grupo_Contacto) throws PersistentException {
		try {
			orm.ProyectoFinalPersistentManager.instance().deleteObject(grupo_Contacto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Grupo_Contacto grupo_Contacto)throws PersistentException {
		try {
			orm.Actividad[] lActividads = grupo_Contacto.actividad.toArray();
			for(int i = 0; i < lActividads.length; i++) {
				lActividads[i].setIdGrupo(null);
			}
			orm.Notificacion[] lNotificacions = grupo_Contacto.notificacion.toArray();
			for(int i = 0; i < lNotificacions.length; i++) {
				lNotificacions[i].setIdGrupo(null);
			}
			orm.Membresia[] lMembresias = grupo_Contacto.membresia.toArray();
			for(int i = 0; i < lMembresias.length; i++) {
				lMembresias[i].setIdGrupoContacto(null);
			}
			return delete(grupo_Contacto);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Grupo_Contacto grupo_Contacto, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Actividad[] lActividads = grupo_Contacto.actividad.toArray();
			for(int i = 0; i < lActividads.length; i++) {
				lActividads[i].setIdGrupo(null);
			}
			orm.Notificacion[] lNotificacions = grupo_Contacto.notificacion.toArray();
			for(int i = 0; i < lNotificacions.length; i++) {
				lNotificacions[i].setIdGrupo(null);
			}
			orm.Membresia[] lMembresias = grupo_Contacto.membresia.toArray();
			for(int i = 0; i < lMembresias.length; i++) {
				lMembresias[i].setIdGrupoContacto(null);
			}
			try {
				session.delete(grupo_Contacto);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(orm.Grupo_Contacto grupo_Contacto) throws PersistentException {
		try {
			orm.ProyectoFinalPersistentManager.instance().getSession().refresh(grupo_Contacto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Grupo_Contacto grupo_Contacto) throws PersistentException {
		try {
			orm.ProyectoFinalPersistentManager.instance().getSession().evict(grupo_Contacto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo_Contacto loadGrupo_ContactoByCriteria(Grupo_ContactoCriteria grupo_ContactoCriteria) {
		Grupo_Contacto[] grupo_Contactos = listGrupo_ContactoByCriteria(grupo_ContactoCriteria);
		if(grupo_Contactos == null || grupo_Contactos.length == 0) {
			return null;
		}
		return grupo_Contactos[0];
	}
	
	public static Grupo_Contacto[] listGrupo_ContactoByCriteria(Grupo_ContactoCriteria grupo_ContactoCriteria) {
		return grupo_ContactoCriteria.listGrupo_Contacto();
	}
}
