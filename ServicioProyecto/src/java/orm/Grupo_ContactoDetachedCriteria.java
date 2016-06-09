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

public class Grupo_ContactoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression uid_Grupo;
	public final StringExpression nombre_Grupo;
	public final StringExpression descripcion_Grupo;
	public final StringExpression fecha_Grupo;
	public final CollectionExpression actividad;
	public final CollectionExpression notificacion;
	public final CollectionExpression membresia;
	
	public Grupo_ContactoDetachedCriteria() {
		super(orm.Grupo_Contacto.class, orm.Grupo_ContactoCriteria.class);
		uid_Grupo = new IntegerExpression("uid_Grupo", this.getDetachedCriteria());
		nombre_Grupo = new StringExpression("nombre_Grupo", this.getDetachedCriteria());
		descripcion_Grupo = new StringExpression("descripcion_Grupo", this.getDetachedCriteria());
		fecha_Grupo = new StringExpression("fecha_Grupo", this.getDetachedCriteria());
		actividad = new CollectionExpression("ORM_Actividad", this.getDetachedCriteria());
		notificacion = new CollectionExpression("ORM_Notificacion", this.getDetachedCriteria());
		membresia = new CollectionExpression("ORM_Membresia", this.getDetachedCriteria());
	}
	
	public Grupo_ContactoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Grupo_ContactoCriteria.class);
		uid_Grupo = new IntegerExpression("uid_Grupo", this.getDetachedCriteria());
		nombre_Grupo = new StringExpression("nombre_Grupo", this.getDetachedCriteria());
		descripcion_Grupo = new StringExpression("descripcion_Grupo", this.getDetachedCriteria());
		fecha_Grupo = new StringExpression("fecha_Grupo", this.getDetachedCriteria());
		actividad = new CollectionExpression("ORM_Actividad", this.getDetachedCriteria());
		notificacion = new CollectionExpression("ORM_Notificacion", this.getDetachedCriteria());
		membresia = new CollectionExpression("ORM_Membresia", this.getDetachedCriteria());
	}
	
	public ActividadDetachedCriteria createActividadCriteria() {
		return new ActividadDetachedCriteria(createCriteria("ORM_Actividad"));
	}
	
	public NotificacionDetachedCriteria createNotificacionCriteria() {
		return new NotificacionDetachedCriteria(createCriteria("ORM_Notificacion"));
	}
	
	public MembresiaDetachedCriteria createMembresiaCriteria() {
		return new MembresiaDetachedCriteria(createCriteria("ORM_Membresia"));
	}
	
	public Grupo_Contacto uniqueGrupo_Contacto(PersistentSession session) {
		return (Grupo_Contacto) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Grupo_Contacto[] listGrupo_Contacto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Grupo_Contacto[]) list.toArray(new Grupo_Contacto[list.size()]);
	}
}

