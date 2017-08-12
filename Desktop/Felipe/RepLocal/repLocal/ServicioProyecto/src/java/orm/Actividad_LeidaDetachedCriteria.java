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

public class Actividad_LeidaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression uid_ActLe;
	public final StringExpression fecha_ActLe;
	public final IntegerExpression idContactoId;
	public final AssociationExpression idContacto;
	public final IntegerExpression idActividadId;
	public final AssociationExpression idActividad;
	
	public Actividad_LeidaDetachedCriteria() {
		super(orm.Actividad_Leida.class, orm.Actividad_LeidaCriteria.class);
		uid_ActLe = new IntegerExpression("uid_ActLe", this.getDetachedCriteria());
		fecha_ActLe = new StringExpression("fecha_ActLe", this.getDetachedCriteria());
		idContactoId = new IntegerExpression("idContacto.uid_Cont", this.getDetachedCriteria());
		idContacto = new AssociationExpression("idContacto", this.getDetachedCriteria());
		idActividadId = new IntegerExpression("idActividad.uid_Act", this.getDetachedCriteria());
		idActividad = new AssociationExpression("idActividad", this.getDetachedCriteria());
	}
	
	public Actividad_LeidaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Actividad_LeidaCriteria.class);
		uid_ActLe = new IntegerExpression("uid_ActLe", this.getDetachedCriteria());
		fecha_ActLe = new StringExpression("fecha_ActLe", this.getDetachedCriteria());
		idContactoId = new IntegerExpression("idContacto.uid_Cont", this.getDetachedCriteria());
		idContacto = new AssociationExpression("idContacto", this.getDetachedCriteria());
		idActividadId = new IntegerExpression("idActividad.uid_Act", this.getDetachedCriteria());
		idActividad = new AssociationExpression("idActividad", this.getDetachedCriteria());
	}
	
	public ContactoDetachedCriteria createIdContactoCriteria() {
		return new ContactoDetachedCriteria(createCriteria("idContacto"));
	}
	
	public ActividadDetachedCriteria createIdActividadCriteria() {
		return new ActividadDetachedCriteria(createCriteria("idActividad"));
	}
	
	public Actividad_Leida uniqueActividad_Leida(PersistentSession session) {
		return (Actividad_Leida) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Actividad_Leida[] listActividad_Leida(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Actividad_Leida[]) list.toArray(new Actividad_Leida[list.size()]);
	}
}

