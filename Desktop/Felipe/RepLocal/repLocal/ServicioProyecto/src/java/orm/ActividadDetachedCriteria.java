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

public class ActividadDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression uid_Act;
	public final StringExpression fecha_Act;
	public final StringExpression nombre_Act;
	public final StringExpression descripcion_Act;
	public final IntegerExpression idGrupoId;
	public final AssociationExpression idGrupo;
	public final CollectionExpression actividad_leida;
	
	public ActividadDetachedCriteria() {
		super(orm.Actividad.class, orm.ActividadCriteria.class);
		uid_Act = new IntegerExpression("uid_Act", this.getDetachedCriteria());
		fecha_Act = new StringExpression("fecha_Act", this.getDetachedCriteria());
		nombre_Act = new StringExpression("nombre_Act", this.getDetachedCriteria());
		descripcion_Act = new StringExpression("descripcion_Act", this.getDetachedCriteria());
		idGrupoId = new IntegerExpression("idGrupo.uid_Grupo", this.getDetachedCriteria());
		idGrupo = new AssociationExpression("idGrupo", this.getDetachedCriteria());
		actividad_leida = new CollectionExpression("ORM_Actividad_leida", this.getDetachedCriteria());
	}
	
	public ActividadDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.ActividadCriteria.class);
		uid_Act = new IntegerExpression("uid_Act", this.getDetachedCriteria());
		fecha_Act = new StringExpression("fecha_Act", this.getDetachedCriteria());
		nombre_Act = new StringExpression("nombre_Act", this.getDetachedCriteria());
		descripcion_Act = new StringExpression("descripcion_Act", this.getDetachedCriteria());
		idGrupoId = new IntegerExpression("idGrupo.uid_Grupo", this.getDetachedCriteria());
		idGrupo = new AssociationExpression("idGrupo", this.getDetachedCriteria());
		actividad_leida = new CollectionExpression("ORM_Actividad_leida", this.getDetachedCriteria());
	}
	
	public Grupo_ContactoDetachedCriteria createIdGrupoCriteria() {
		return new Grupo_ContactoDetachedCriteria(createCriteria("idGrupo"));
	}
	
	public Actividad_LeidaDetachedCriteria createActividad_leidaCriteria() {
		return new Actividad_LeidaDetachedCriteria(createCriteria("ORM_Actividad_leida"));
	}
	
	public Actividad uniqueActividad(PersistentSession session) {
		return (Actividad) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Actividad[] listActividad(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Actividad[]) list.toArray(new Actividad[list.size()]);
	}
}

