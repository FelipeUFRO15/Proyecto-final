package capaNegocio;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Grupo_Contacto {

	private int uid_Grupo;
	private String nombre_Grupo;
	private String descripcion_Grupo;
        private String fecha_Grupo;
        
        public Grupo_Contacto(){
            super();
        }

	public int getUid_Grupo() {
		return this.uid_Grupo;
	}

	/**
	 * 
	 * @param uid_Grupo
	 */
	public void setUid_Grupo(int uid_Grupo) {
		this.uid_Grupo = uid_Grupo;
	}

	public String getNombre_Grupo() {
		return this.nombre_Grupo;
	}

	/**
	 * 
	 * @param nombre_Grupo
	 */
	public void setNombre_Grupo(String nombre_Grupo) {
		this.nombre_Grupo = nombre_Grupo;
	}

	public String getDescripcion_Grupo() {
		return this.descripcion_Grupo;
	}

	/**
	 * 
	 * @param descripcion_Grupo
	 */
	public void setDescripcion_Grupo(String descripcion_Grupo) {
		this.descripcion_Grupo = descripcion_Grupo;
	}
        
        public String getFecha_Grupo(){
            return this.fecha_Grupo;
        }
        
        /**
         * 
         * @param fecha 
         */
        public void setFecha_Grupo(String fecha){
            this.fecha_Grupo = fecha;
        }

	/**
	 * 
	 * @param grupo
	 */
	public int agregarGrupoContactoCapaNegocio(Grupo_Contacto grupo) throws PersistentException {
            int respuesta = 0;
            PersistentTransaction t = orm.ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
            try{
                    orm.Grupo_Contacto lormGrupo_contacto = orm.Grupo_ContactoDAO.createGrupo_Contacto();
                    lormGrupo_contacto.setNombre_Grupo(grupo.getNombre_Grupo());
                    lormGrupo_contacto.setDescripcion_Grupo(grupo.getDescripcion_Grupo());
                    lormGrupo_contacto.setFecha_Grupo("" + Calendar.getInstance().getTime());
                    orm.Grupo_ContactoDAO.save(lormGrupo_contacto);
                    //orm.Grupo_contactoDAO.refresh(lormGrupo_contacto);
                    t.commit();
                    return lormGrupo_contacto.getUid_Grupo();
            }catch (Exception e){
                    t.rollback();
            }
            return respuesta;
	}
                
	/**
	 * 
	 * @param grupo
	 */
	public int editarGrupoContactoCapaNegocio(Grupo_Contacto grupo) throws PersistentException {
            int respuesta = 0;
            PersistentTransaction t = orm.ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
            try{
                    orm.Grupo_Contacto lormGrupo_contacto = orm.Grupo_ContactoDAO.loadGrupo_ContactoByORMID(grupo.getUid_Grupo());
                    if (grupo.getNombre_Grupo() != ""){
                            lormGrupo_contacto.setNombre_Grupo(grupo.getNombre_Grupo());
                    }
                    if (grupo.getDescripcion_Grupo() != ""){
                            lormGrupo_contacto.setDescripcion_Grupo(grupo.getDescripcion_Grupo());
                    }

                    orm.Grupo_ContactoDAO.save(lormGrupo_contacto);
                    t.commit();
                    return lormGrupo_contacto.getUid_Grupo();
            }catch (Exception e){
                    t.rollback();
            }
            return respuesta;
	}

	/**
	 * 
	 * @param grupo
	 */
	public int eliminarGrupoContactoCapaNegocio(Grupo_Contacto grupo) throws PersistentException {
            int respuesta = 0;
            PersistentTransaction t = orm.ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
            try{
                    orm.Grupo_Contacto lormGrupo_contacto = orm.Grupo_ContactoDAO.loadGrupo_ContactoByORMID(grupo.getUid_Grupo());
                    orm.Grupo_ContactoDAO.delete(lormGrupo_contacto);
                    t.commit();
                    return lormGrupo_contacto.getUid_Grupo();
            }catch (Exception e){
                    t.rollback();
            }
            return respuesta;
	}

	/**
	 * 
	 * @param grupo
	 */
	public List<Grupo_Contacto> busquedaSimpleGrupoContactoCapaNegocio(Grupo_Contacto grupo) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param grupo
	 */
	public List<Grupo_Contacto> busquedaAvanzadaGrupoContactoCapaNegocio(Grupo_Contacto grupo) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param grupo
	 */
	public List<Grupo_Contacto> busquedaMiembrosCapaNegocio(Grupo_Contacto grupo) {
		throw new UnsupportedOperationException();
	}
        
        public int inscribirContactoCapaNegocio(Contacto contacto) throws PersistentException{
            int respuesta = 0;
            PersistentTransaction t = orm.ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
            Membresia nuevaMemb = new Membresia();
            try{
                orm.Contacto lormContacto = new orm.Contacto();
                //lormContacto.setUid_Cont(contacto.getUid_Cont());
                orm.Membresia lormMembresia = orm.MembresiaDAO.createMembresia();
                //lormMembresia.setIdContacto(contacto);
                //lormMembresia.setIdGrupoContacto(this.uid_Grupo);
                orm.MembresiaDAO.save(lormMembresia);
                t.commit();
                return lormMembresia.getUid_Memb();
            } catch (Exception e){
                t.rollback();
            }
            return respuesta;
        }

}