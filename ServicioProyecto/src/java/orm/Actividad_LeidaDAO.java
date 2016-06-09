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

public class Actividad_LeidaDAO {
	public static Actividad_Leida loadActividad_LeidaByORMID(int uid_ActLe) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return loadActividad_LeidaByORMID(session, uid_ActLe);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_Leida getActividad_LeidaByORMID(int uid_ActLe) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return getActividad_LeidaByORMID(session, uid_ActLe);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_Leida loadActividad_LeidaByORMID(int uid_ActLe, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return loadActividad_LeidaByORMID(session, uid_ActLe, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_Leida getActividad_LeidaByORMID(int uid_ActLe, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return getActividad_LeidaByORMID(session, uid_ActLe, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_Leida loadActividad_LeidaByORMID(PersistentSession session, int uid_ActLe) throws PersistentException {
		try {
			return (Actividad_Leida) session.load(orm.Actividad_Leida.class, new Integer(uid_ActLe));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_Leida getActividad_LeidaByORMID(PersistentSession session, int uid_ActLe) throws PersistentException {
		try {
			return (Actividad_Leida) session.get(orm.Actividad_Leida.class, new Integer(uid_ActLe));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_Leida loadActividad_LeidaByORMID(PersistentSession session, int uid_ActLe, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Actividad_Leida) session.load(orm.Actividad_Leida.class, new Integer(uid_ActLe), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_Leida getActividad_LeidaByORMID(PersistentSession session, int uid_ActLe, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Actividad_Leida) session.get(orm.Actividad_Leida.class, new Integer(uid_ActLe), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActividad_Leida(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return queryActividad_Leida(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActividad_Leida(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return queryActividad_Leida(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_Leida[] listActividad_LeidaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return listActividad_LeidaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_Leida[] listActividad_LeidaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return listActividad_LeidaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActividad_Leida(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Actividad_Leida as Actividad_Leida");
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
	
	public static List queryActividad_Leida(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Actividad_Leida as Actividad_Leida");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Actividad_Leida", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_Leida[] listActividad_LeidaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryActividad_Leida(session, condition, orderBy);
			return (Actividad_Leida[]) list.toArray(new Actividad_Leida[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_Leida[] listActividad_LeidaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryActividad_Leida(session, condition, orderBy, lockMode);
			return (Actividad_Leida[]) list.toArray(new Actividad_Leida[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_Leida loadActividad_LeidaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return loadActividad_LeidaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_Leida loadActividad_LeidaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return loadActividad_LeidaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_Leida loadActividad_LeidaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Actividad_Leida[] actividad_Leidas = listActividad_LeidaByQuery(session, condition, orderBy);
		if (actividad_Leidas != null && actividad_Leidas.length > 0)
			return actividad_Leidas[0];
		else
			return null;
	}
	
	public static Actividad_Leida loadActividad_LeidaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Actividad_Leida[] actividad_Leidas = listActividad_LeidaByQuery(session, condition, orderBy, lockMode);
		if (actividad_Leidas != null && actividad_Leidas.length > 0)
			return actividad_Leidas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateActividad_LeidaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return iterateActividad_LeidaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateActividad_LeidaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoFinalPersistentManager.instance().getSession();
			return iterateActividad_LeidaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateActividad_LeidaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Actividad_Leida as Actividad_Leida");
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
	
	public static java.util.Iterator iterateActividad_LeidaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Actividad_Leida as Actividad_Leida");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Actividad_Leida", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_Leida createActividad_Leida() {
		return new orm.Actividad_Leida();
	}
	
	public static boolean save(orm.Actividad_Leida actividad_Leida) throws PersistentException {
		try {
			orm.ProyectoFinalPersistentManager.instance().saveObject(actividad_Leida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Actividad_Leida actividad_Leida) throws PersistentException {
		try {
			orm.ProyectoFinalPersistentManager.instance().deleteObject(actividad_Leida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Actividad_Leida actividad_Leida)throws PersistentException {
		try {
			if (actividad_Leida.getIdContacto() != null) {
				actividad_Leida.getIdContacto().actividad_leida.remove(actividad_Leida);
			}
			
			if (actividad_Leida.getIdActividad() != null) {
				actividad_Leida.getIdActividad().actividad_leida.remove(actividad_Leida);
			}
			
			return delete(actividad_Leida);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Actividad_Leida actividad_Leida, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (actividad_Leida.getIdContacto() != null) {
				actividad_Leida.getIdContacto().actividad_leida.remove(actividad_Leida);
			}
			
			if (actividad_Leida.getIdActividad() != null) {
				actividad_Leida.getIdActividad().actividad_leida.remove(actividad_Leida);
			}
			
			try {
				session.delete(actividad_Leida);
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
	
	public static boolean refresh(orm.Actividad_Leida actividad_Leida) throws PersistentException {
		try {
			orm.ProyectoFinalPersistentManager.instance().getSession().refresh(actividad_Leida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Actividad_Leida actividad_Leida) throws PersistentException {
		try {
			orm.ProyectoFinalPersistentManager.instance().getSession().evict(actividad_Leida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad_Leida loadActividad_LeidaByCriteria(Actividad_LeidaCriteria actividad_LeidaCriteria) {
		Actividad_Leida[] actividad_Leidas = listActividad_LeidaByCriteria(actividad_LeidaCriteria);
		if(actividad_Leidas == null || actividad_Leidas.length == 0) {
			return null;
		}
		return actividad_Leidas[0];
	}
	
	public static Actividad_Leida[] listActividad_LeidaByCriteria(Actividad_LeidaCriteria actividad_LeidaCriteria) {
		return actividad_LeidaCriteria.listActividad_Leida();
	}
}
