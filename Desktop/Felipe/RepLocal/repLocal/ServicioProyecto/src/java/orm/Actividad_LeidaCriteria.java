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

public class Actividad_LeidaCriteria extends AbstractORMCriteria {
	public final IntegerExpression uid_ActLe;
	public final StringExpression fecha_ActLe;
	public final IntegerExpression idContactoId;
	public final AssociationExpression idContacto;
	public final IntegerExpression idActividadId;
	public final AssociationExpression idActividad;
	
	public Actividad_LeidaCriteria(Criteria criteria) {
		super(criteria);
		uid_ActLe = new IntegerExpression("uid_ActLe", this);
		fecha_ActLe = new StringExpression("fecha_ActLe", this);
		idContactoId = new IntegerExpression("idContacto.uid_Cont", this);
		idContacto = new AssociationExpression("idContacto", this);
		idActividadId = new IntegerExpression("idActividad.uid_Act", this);
		idActividad = new AssociationExpression("idActividad", this);
	}
	
	public Actividad_LeidaCriteria(PersistentSession session) {
		this(session.createCriteria(Actividad_Leida.class));
	}
	
	public Actividad_LeidaCriteria() throws PersistentException {
		this(orm.ProyectoFinalPersistentManager.instance().getSession());
	}
	
	public ContactoCriteria createIdContactoCriteria() {
		return new ContactoCriteria(createCriteria("idContacto"));
	}
	
	public ActividadCriteria createIdActividadCriteria() {
		return new ActividadCriteria(createCriteria("idActividad"));
	}
	
	public Actividad_Leida uniqueActividad_Leida() {
		return (Actividad_Leida) super.uniqueResult();
	}
	
	public Actividad_Leida[] listActividad_Leida() {
		java.util.List list = super.list();
		return (Actividad_Leida[]) list.toArray(new Actividad_Leida[list.size()]);
	}
}

