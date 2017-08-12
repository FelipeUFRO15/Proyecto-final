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

public class ActividadCriteria extends AbstractORMCriteria {
	public final IntegerExpression uid_Act;
	public final StringExpression fecha_Act;
	public final StringExpression nombre_Act;
	public final StringExpression descripcion_Act;
	public final IntegerExpression idGrupoId;
	public final AssociationExpression idGrupo;
	public final CollectionExpression actividad_leida;
	
	public ActividadCriteria(Criteria criteria) {
		super(criteria);
		uid_Act = new IntegerExpression("uid_Act", this);
		fecha_Act = new StringExpression("fecha_Act", this);
		nombre_Act = new StringExpression("nombre_Act", this);
		descripcion_Act = new StringExpression("descripcion_Act", this);
		idGrupoId = new IntegerExpression("idGrupo.uid_Grupo", this);
		idGrupo = new AssociationExpression("idGrupo", this);
		actividad_leida = new CollectionExpression("ORM_Actividad_leida", this);
	}
	
	public ActividadCriteria(PersistentSession session) {
		this(session.createCriteria(Actividad.class));
	}
	
	public ActividadCriteria() throws PersistentException {
		this(orm.ProyectoFinalPersistentManager.instance().getSession());
	}
	
	public Grupo_ContactoCriteria createIdGrupoCriteria() {
		return new Grupo_ContactoCriteria(createCriteria("idGrupo"));
	}
	
	public Actividad_LeidaCriteria createActividad_leidaCriteria() {
		return new Actividad_LeidaCriteria(createCriteria("ORM_Actividad_leida"));
	}
	
	public Actividad uniqueActividad() {
		return (Actividad) super.uniqueResult();
	}
	
	public Actividad[] listActividad() {
		java.util.List list = super.list();
		return (Actividad[]) list.toArray(new Actividad[list.size()]);
	}
}

