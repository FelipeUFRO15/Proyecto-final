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

public class ContactoDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public ContactoDetachedCriteria() {
		super(orm.Contacto.class, orm.ContactoCriteria.class);
		uid_Cont = new IntegerExpression("uid_Cont", this.getDetachedCriteria());
		nombre_Cont = new StringExpression("nombre_Cont", this.getDetachedCriteria());
		apellido_Cont = new StringExpression("apellido_Cont", this.getDetachedCriteria());
		mail_Cont = new StringExpression("mail_Cont", this.getDetachedCriteria());
		telefono_Cont = new StringExpression("telefono_Cont", this.getDetachedCriteria());
		ciudad_Cont = new StringExpression("ciudad_Cont", this.getDetachedCriteria());
		organizacion_Cont = new StringExpression("organizacion_Cont", this.getDetachedCriteria());
		imagen_Cont = new StringExpression("imagen_Cont", this.getDetachedCriteria());
		membresia = new CollectionExpression("ORM_Membresia", this.getDetachedCriteria());
		actividad_leida = new CollectionExpression("ORM_Actividad_leida", this.getDetachedCriteria());
		notificacion_leida = new CollectionExpression("ORM_Notificacion_leida", this.getDetachedCriteria());
	}
	
	public ContactoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.ContactoCriteria.class);
		uid_Cont = new IntegerExpression("uid_Cont", this.getDetachedCriteria());
		nombre_Cont = new StringExpression("nombre_Cont", this.getDetachedCriteria());
		apellido_Cont = new StringExpression("apellido_Cont", this.getDetachedCriteria());
		mail_Cont = new StringExpression("mail_Cont", this.getDetachedCriteria());
		telefono_Cont = new StringExpression("telefono_Cont", this.getDetachedCriteria());
		ciudad_Cont = new StringExpression("ciudad_Cont", this.getDetachedCriteria());
		organizacion_Cont = new StringExpression("organizacion_Cont", this.getDetachedCriteria());
		imagen_Cont = new StringExpression("imagen_Cont", this.getDetachedCriteria());
		membresia = new CollectionExpression("ORM_Membresia", this.getDetachedCriteria());
		actividad_leida = new CollectionExpression("ORM_Actividad_leida", this.getDetachedCriteria());
		notificacion_leida = new CollectionExpression("ORM_Notificacion_leida", this.getDetachedCriteria());
	}
	
	public MembresiaDetachedCriteria createMembresiaCriteria() {
		return new MembresiaDetachedCriteria(createCriteria("ORM_Membresia"));
	}
	
	public Actividad_LeidaDetachedCriteria createActividad_leidaCriteria() {
		return new Actividad_LeidaDetachedCriteria(createCriteria("ORM_Actividad_leida"));
	}
	
	public Notificacion_LeidaDetachedCriteria createNotificacion_leidaCriteria() {
		return new Notificacion_LeidaDetachedCriteria(createCriteria("ORM_Notificacion_leida"));
	}
	
	public Contacto uniqueContacto(PersistentSession session) {
		return (Contacto) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Contacto[] listContacto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Contacto[]) list.toArray(new Contacto[list.size()]);
	}
}

