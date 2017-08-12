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

public class Grupo_ContactoCriteria extends AbstractORMCriteria {
	public final IntegerExpression uid_Grupo;
	public final StringExpression nombre_Grupo;
	public final StringExpression descripcion_Grupo;
	public final StringExpression fecha_Grupo;
	public final CollectionExpression actividad;
	public final CollectionExpression notificacion;
	public final CollectionExpression membresia;
	
	public Grupo_ContactoCriteria(Criteria criteria) {
		super(criteria);
		uid_Grupo = new IntegerExpression("uid_Grupo", this);
		nombre_Grupo = new StringExpression("nombre_Grupo", this);
		descripcion_Grupo = new StringExpression("descripcion_Grupo", this);
		fecha_Grupo = new StringExpression("fecha_Grupo", this);
		actividad = new CollectionExpression("ORM_Actividad", this);
		notificacion = new CollectionExpression("ORM_Notificacion", this);
		membresia = new CollectionExpression("ORM_Membresia", this);
	}
	
	public Grupo_ContactoCriteria(PersistentSession session) {
		this(session.createCriteria(Grupo_Contacto.class));
	}
	
	public Grupo_ContactoCriteria() throws PersistentException {
		this(orm.ProyectoFinalPersistentManager.instance().getSession());
	}
	
	public ActividadCriteria createActividadCriteria() {
		return new ActividadCriteria(createCriteria("ORM_Actividad"));
	}
	
	public NotificacionCriteria createNotificacionCriteria() {
		return new NotificacionCriteria(createCriteria("ORM_Notificacion"));
	}
	
	public MembresiaCriteria createMembresiaCriteria() {
		return new MembresiaCriteria(createCriteria("ORM_Membresia"));
	}
	
	public Grupo_Contacto uniqueGrupo_Contacto() {
		return (Grupo_Contacto) super.uniqueResult();
	}
	
	public Grupo_Contacto[] listGrupo_Contacto() {
		java.util.List list = super.list();
		return (Grupo_Contacto[]) list.toArray(new Grupo_Contacto[list.size()]);
	}
}

