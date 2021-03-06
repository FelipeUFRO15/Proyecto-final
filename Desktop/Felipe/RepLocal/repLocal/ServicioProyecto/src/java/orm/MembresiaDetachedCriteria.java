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

public class MembresiaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression uid_Memb;
	public final IntegerExpression idGrupoContactoId;
	public final AssociationExpression idGrupoContacto;
	public final IntegerExpression idContactoId;
	public final AssociationExpression idContacto;
	
	public MembresiaDetachedCriteria() {
		super(orm.Membresia.class, orm.MembresiaCriteria.class);
		uid_Memb = new IntegerExpression("uid_Memb", this.getDetachedCriteria());
		idGrupoContactoId = new IntegerExpression("idGrupoContacto.uid_Grupo", this.getDetachedCriteria());
		idGrupoContacto = new AssociationExpression("idGrupoContacto", this.getDetachedCriteria());
		idContactoId = new IntegerExpression("idContacto.uid_Cont", this.getDetachedCriteria());
		idContacto = new AssociationExpression("idContacto", this.getDetachedCriteria());
	}
	
	public MembresiaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.MembresiaCriteria.class);
		uid_Memb = new IntegerExpression("uid_Memb", this.getDetachedCriteria());
		idGrupoContactoId = new IntegerExpression("idGrupoContacto.uid_Grupo", this.getDetachedCriteria());
		idGrupoContacto = new AssociationExpression("idGrupoContacto", this.getDetachedCriteria());
		idContactoId = new IntegerExpression("idContacto.uid_Cont", this.getDetachedCriteria());
		idContacto = new AssociationExpression("idContacto", this.getDetachedCriteria());
	}
	
	public Grupo_ContactoDetachedCriteria createIdGrupoContactoCriteria() {
		return new Grupo_ContactoDetachedCriteria(createCriteria("idGrupoContacto"));
	}
	
	public ContactoDetachedCriteria createIdContactoCriteria() {
		return new ContactoDetachedCriteria(createCriteria("idContacto"));
	}
	
	public Membresia uniqueMembresia(PersistentSession session) {
		return (Membresia) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Membresia[] listMembresia(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Membresia[]) list.toArray(new Membresia[list.size()]);
	}
}

