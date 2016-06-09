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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Notificacion_LeidaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression uid_NotiLe;
	public final StringExpression fecha_NotiLe;
	public final IntegerExpression idContactoId;
	public final AssociationExpression idContacto;
	public final IntegerExpression idNotificacionId;
	public final AssociationExpression idNotificacion;
	
	public Notificacion_LeidaDetachedCriteria() {
		super(orm.Notificacion_Leida.class, orm.Notificacion_LeidaCriteria.class);
		uid_NotiLe = new IntegerExpression("uid_NotiLe", this.getDetachedCriteria());
		fecha_NotiLe = new StringExpression("fecha_NotiLe", this.getDetachedCriteria());
		idContactoId = new IntegerExpression("idContacto.uid_Cont", this.getDetachedCriteria());
		idContacto = new AssociationExpression("idContacto", this.getDetachedCriteria());
		idNotificacionId = new IntegerExpression("idNotificacion.uid_Noti", this.getDetachedCriteria());
		idNotificacion = new AssociationExpression("idNotificacion", this.getDetachedCriteria());
	}
	
	public Notificacion_LeidaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Notificacion_LeidaCriteria.class);
		uid_NotiLe = new IntegerExpression("uid_NotiLe", this.getDetachedCriteria());
		fecha_NotiLe = new StringExpression("fecha_NotiLe", this.getDetachedCriteria());
		idContactoId = new IntegerExpression("idContacto.uid_Cont", this.getDetachedCriteria());
		idContacto = new AssociationExpression("idContacto", this.getDetachedCriteria());
		idNotificacionId = new IntegerExpression("idNotificacion.uid_Noti", this.getDetachedCriteria());
		idNotificacion = new AssociationExpression("idNotificacion", this.getDetachedCriteria());
	}
	
	public ContactoDetachedCriteria createIdContactoCriteria() {
		return new ContactoDetachedCriteria(createCriteria("idContacto"));
	}
	
	public NotificacionDetachedCriteria createIdNotificacionCriteria() {
		return new NotificacionDetachedCriteria(createCriteria("idNotificacion"));
	}
	
	public Notificacion_Leida uniqueNotificacion_Leida(PersistentSession session) {
		return (Notificacion_Leida) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Notificacion_Leida[] listNotificacion_Leida(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Notificacion_Leida[]) list.toArray(new Notificacion_Leida[list.size()]);
	}
}

