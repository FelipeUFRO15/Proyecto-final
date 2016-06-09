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

public class Notificacion_LeidaDAO {
	public static Notificacion_Leida loadNotificacion_LeidaByORMID(int uid_NotiLe) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return loadNotificacion_LeidaByORMID(session, uid_NotiLe);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_Leida getNotificacion_LeidaByORMID(int uid_NotiLe) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return getNotificacion_LeidaByORMID(session, uid_NotiLe);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_Leida loadNotificacion_LeidaByORMID(int uid_NotiLe, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return loadNotificacion_LeidaByORMID(session, uid_NotiLe, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_Leida getNotificacion_LeidaByORMID(int uid_NotiLe, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return getNotificacion_LeidaByORMID(session, uid_NotiLe, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_Leida loadNotificacion_LeidaByORMID(PersistentSession session, int uid_NotiLe) throws PersistentException {
		try {
			return (Notificacion_Leida) session.load(orm.Notificacion_Leida.class, new Integer(uid_NotiLe));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_Leida getNotificacion_LeidaByORMID(PersistentSession session, int uid_NotiLe) throws PersistentException {
		try {
			return (Notificacion_Leida) session.get(orm.Notificacion_Leida.class, new Integer(uid_NotiLe));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_Leida loadNotificacion_LeidaByORMID(PersistentSession session, int uid_NotiLe, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Notificacion_Leida) session.load(orm.Notificacion_Leida.class, new Integer(uid_NotiLe), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_Leida getNotificacion_LeidaByORMID(PersistentSession session, int uid_NotiLe, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Notificacion_Leida) session.get(orm.Notificacion_Leida.class, new Integer(uid_NotiLe), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNotificacion_Leida(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return queryNotificacion_Leida(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNotificacion_Leida(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return queryNotificacion_Leida(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_Leida[] listNotificacion_LeidaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return listNotificacion_LeidaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_Leida[] listNotificacion_LeidaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return listNotificacion_LeidaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNotificacion_Leida(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Notificacion_Leida as Notificacion_Leida");
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
	
	public static List queryNotificacion_Leida(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Notificacion_Leida as Notificacion_Leida");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Notificacion_Leida", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_Leida[] listNotificacion_LeidaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryNotificacion_Leida(session, condition, orderBy);
			return (Notificacion_Leida[]) list.toArray(new Notificacion_Leida[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_Leida[] listNotificacion_LeidaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryNotificacion_Leida(session, condition, orderBy, lockMode);
			return (Notificacion_Leida[]) list.toArray(new Notificacion_Leida[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_Leida loadNotificacion_LeidaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return loadNotificacion_LeidaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_Leida loadNotificacion_LeidaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return loadNotificacion_LeidaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_Leida loadNotificacion_LeidaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Notificacion_Leida[] notificacion_Leidas = listNotificacion_LeidaByQuery(session, condition, orderBy);
		if (notificacion_Leidas != null && notificacion_Leidas.length > 0)
			return notificacion_Leidas[0];
		else
			return null;
	}
	
	public static Notificacion_Leida loadNotificacion_LeidaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Notificacion_Leida[] notificacion_Leidas = listNotificacion_LeidaByQuery(session, condition, orderBy, lockMode);
		if (notificacion_Leidas != null && notificacion_Leidas.length > 0)
			return notificacion_Leidas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateNotificacion_LeidaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return iterateNotificacion_LeidaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNotificacion_LeidaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return iterateNotificacion_LeidaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNotificacion_LeidaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Notificacion_Leida as Notificacion_Leida");
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
	
	public static java.util.Iterator iterateNotificacion_LeidaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Notificacion_Leida as Notificacion_Leida");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Notificacion_Leida", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_Leida createNotificacion_Leida() {
		return new orm.Notificacion_Leida();
	}
	
	public static boolean save(orm.Notificacion_Leida notificacion_Leida) throws PersistentException {
		try {
			orm.ProyectoFinalPersistentManager.instance().saveObject(notificacion_Leida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Notificacion_Leida notificacion_Leida) throws PersistentException {
		try {
			orm.ProyectoFinalPersistentManager.instance().deleteObject(notificacion_Leida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Notificacion_Leida notificacion_Leida)throws PersistentException {
		try {
			if (notificacion_Leida.getIdContacto() != null) {
				notificacion_Leida.getIdContacto().notificacion_leida.remove(notificacion_Leida);
			}
			
			if (notificacion_Leida.getIdNotificacion() != null) {
				notificacion_Leida.getIdNotificacion().notificacion_leida.remove(notificacion_Leida);
			}
			
			return delete(notificacion_Leida);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Notificacion_Leida notificacion_Leida, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (notificacion_Leida.getIdContacto() != null) {
				notificacion_Leida.getIdContacto().notificacion_leida.remove(notificacion_Leida);
			}
			
			if (notificacion_Leida.getIdNotificacion() != null) {
				notificacion_Leida.getIdNotificacion().notificacion_leida.remove(notificacion_Leida);
			}
			
			try {
				session.delete(notificacion_Leida);
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
	
	public static boolean refresh(orm.Notificacion_Leida notificacion_Leida) throws PersistentException {
		try {
			orm.ProyectoFinalPersistentManager.instance().getSession().refresh(notificacion_Leida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Notificacion_Leida notificacion_Leida) throws PersistentException {
		try {
			orm.ProyectoFinalPersistentManager.instance().getSession().evict(notificacion_Leida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion_Leida loadNotificacion_LeidaByCriteria(Notificacion_LeidaCriteria notificacion_LeidaCriteria) {
		Notificacion_Leida[] notificacion_Leidas = listNotificacion_LeidaByCriteria(notificacion_LeidaCriteria);
		if(notificacion_Leidas == null || notificacion_Leidas.length == 0) {
			return null;
		}
		return notificacion_Leidas[0];
	}
	
	public static Notificacion_Leida[] listNotificacion_LeidaByCriteria(Notificacion_LeidaCriteria notificacion_LeidaCriteria) {
		return notificacion_LeidaCriteria.listNotificacion_Leida();
	}
}
