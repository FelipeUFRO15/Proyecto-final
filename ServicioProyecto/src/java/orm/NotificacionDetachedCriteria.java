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

public class NotificacionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression uid_Noti;
	public final StringExpression fecha_Noti;
	public final StringExpression mensaje_Noti;
	public final IntegerExpression idGrupoId;
	public final AssociationExpression idGrupo;
	public final CollectionExpression notificacion_leida;
	
	public NotificacionDetachedCriteria() {
		super(orm.Notificacion.class, orm.NotificacionCriteria.class);
		uid_Noti = new IntegerExpression("uid_Noti", this.getDetachedCriteria());
		fecha_Noti = new StringExpression("fecha_Noti", this.getDetachedCriteria());
		mensaje_Noti = new StringExpression("mensaje_Noti", this.getDetachedCriteria());
		idGrupoId = new IntegerExpression("idGrupo.uid_Grupo", this.getDetachedCriteria());
		idGrupo = new AssociationExpression("idGrupo", this.getDetachedCriteria());
		notificacion_leida = new CollectionExpression("ORM_Notificacion_leida", this.getDetachedCriteria());
	}
	
	public NotificacionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.NotificacionCriteria.class);
		uid_Noti = new IntegerExpression("uid_Noti", this.getDetachedCriteria());
		fecha_Noti = new StringExpression("fecha_Noti", this.getDetachedCriteria());
		mensaje_Noti = new StringExpression("mensaje_Noti", this.getDetachedCriteria());
		idGrupoId = new IntegerExpression("idGrupo.uid_Grupo", this.getDetachedCriteria());
		idGrupo = new AssociationExpression("idGrupo", this.getDetachedCriteria());
		notificacion_leida = new CollectionExpression("ORM_Notificacion_leida", this.getDetachedCriteria());
	}
	
	public Grupo_ContactoDetachedCriteria createIdGrupoCriteria() {
		return new Grupo_ContactoDetachedCriteria(createCriteria("idGrupo"));
	}
	
	public Notificacion_LeidaDetachedCriteria createNotificacion_leidaCriteria() {
		return new Notificacion_LeidaDetachedCriteria(createCriteria("ORM_Notificacion_leida"));
	}
	
	public Notificacion uniqueNotificacion(PersistentSession session) {
		return (Notificacion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Notificacion[] listNotificacion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Notificacion[]) list.toArray(new Notificacion[list.size()]);
	}
}

