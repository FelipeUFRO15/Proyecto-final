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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Notificacion_LeidaCriteria extends AbstractORMCriteria {
	public final IntegerExpression uid_NotiLe;
	public final StringExpression fecha_NotiLe;
	public final IntegerExpression idContactoId;
	public final AssociationExpression idContacto;
	public final IntegerExpression idNotificacionId;
	public final AssociationExpression idNotificacion;
	
	public Notificacion_LeidaCriteria(Criteria criteria) {
		super(criteria);
		uid_NotiLe = new IntegerExpression("uid_NotiLe", this);
		fecha_NotiLe = new StringExpression("fecha_NotiLe", this);
		idContactoId = new IntegerExpression("idContacto.uid_Cont", this);
		idContacto = new AssociationExpression("idContacto", this);
		idNotificacionId = new IntegerExpression("idNotificacion.uid_Noti", this);
		idNotificacion = new AssociationExpression("idNotificacion", this);
	}
	
	public Notificacion_LeidaCriteria(PersistentSession session) {
		this(session.createCriteria(Notificacion_Leida.class));
	}
	
	public Notificacion_LeidaCriteria() throws PersistentException {
		this(orm.ProyectoFinalPersistentManager.instance().getSession());
	}
	
	public ContactoCriteria createIdContactoCriteria() {
		return new ContactoCriteria(createCriteria("idContacto"));
	}
	
	public NotificacionCriteria createIdNotificacionCriteria() {
		return new NotificacionCriteria(createCriteria("idNotificacion"));
	}
	
	public Notificacion_Leida uniqueNotificacion_Leida() {
		return (Notificacion_Leida) super.uniqueResult();
	}
	
	public Notificacion_Leida[] listNotificacion_Leida() {
		java.util.List list = super.list();
		return (Notificacion_Leida[]) list.toArray(new Notificacion_Leida[list.size()]);
	}
}

