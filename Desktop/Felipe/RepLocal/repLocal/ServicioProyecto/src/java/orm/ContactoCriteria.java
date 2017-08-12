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

public class ContactoCriteria extends AbstractORMCriteria {
	public final IntegerExpression uid_Cont;
	public final StringExpression nombre_Cont;
	public final StringExpression apellido_Cont;
	public final StringExpression mail_Cont;
	public final StringExpression telefono_Cont;
	public final StringExpression ciudad_Cont;
	public final StringExpression organizacion_Cont;
	public final StringExpression imagen_Cont;
	public final CollectionExpression membresia;
	public final CollectionExpression actividad_leida;
	public final CollectionExpression notificacion_leida;
	
	public ContactoCriteria(Criteria criteria) {
		super(criteria);
		uid_Cont = new IntegerExpression("uid_Cont", this);
		nombre_Cont = new StringExpression("nombre_Cont", this);
		apellido_Cont = new StringExpression("apellido_Cont", this);
		mail_Cont = new StringExpression("mail_Cont", this);
		telefono_Cont = new StringExpression("telefono_Cont", this);
		ciudad_Cont = new StringExpression("ciudad_Cont", this);
		organizacion_Cont = new StringExpression("organizacion_Cont", this);
		imagen_Cont = new StringExpression("imagen_Cont", this);
		membresia = new CollectionExpression("ORM_Membresia", this);
		actividad_leida = new CollectionExpression("ORM_Actividad_leida", this);
		notificacion_leida = new CollectionExpression("ORM_Notificacion_leida", this);
	}
	
	public ContactoCriteria(PersistentSession session) {
		this(session.createCriteria(Contacto.class));
	}
	
	public ContactoCriteria() throws PersistentException {
		this(orm.ProyectoFinalPersistentManager.instance().getSession());
	}
	
	public MembresiaCriteria createMembresiaCriteria() {
		return new MembresiaCriteria(createCriteria("ORM_Membresia"));
	}
	
	public Actividad_LeidaCriteria createActividad_leidaCriteria() {
		return new Actividad_LeidaCriteria(createCriteria("ORM_Actividad_leida"));
	}
	
	public Notificacion_LeidaCriteria createNotificacion_leidaCriteria() {
		return new Notificacion_LeidaCriteria(createCriteria("ORM_Notificacion_leida"));
	}
	
	public Contacto uniqueContacto() {
		return (Contacto) super.uniqueResult();
	}
	
	public Contacto[] listContacto() {
		java.util.List list = super.list();
		return (Contacto[]) list.toArray(new Contacto[list.size()]);
	}
}

