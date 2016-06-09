/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaServicio;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import capaNegocio.Contacto;
import capaNegocio.Grupo_Contacto;
import capaNegocio.Actividad;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.orm.PersistentException;

/**
 *
 * @author Felipe
 */
@WebService(serviceName = "Servicio")
public class Servicio {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregarContactoServicioWeb")
    public String agregarContactoServicioWeb(@WebParam(name = "nombre_Cont") String nombre_Cont, @WebParam(name = "apellido_Cont") String apellido_Cont, @WebParam(name = "telefono_Cont") String telefono_Cont, @WebParam(name = "mail_Cont") String mail_Cont, @WebParam(name = "ciudad_Cont") String ciudad_Cont, @WebParam(name = "organizacion_Cont") String organizacion_Cont) {
        String respuesta = "No se pudo almacenar el contacto";
        Contacto contacto = new Contacto();

        if (nombre_Cont != null && nombre_Cont.matches("[a-zA-ZáéíóúñÑ]{2,20}")){
                contacto.setNombre_Cont(nombre_Cont);
        }else{
                contacto.setNombre_Cont("");
        }
        if (apellido_Cont != null && apellido_Cont.matches("[a-zA-ZáéíóúñÑ]{2,20}")){
                contacto.setApellido_Cont(apellido_Cont);
        }else{
                contacto.setApellido_Cont("");
        }
        if (mail_Cont != null && mail_Cont.matches("\\w*(\\.\\w*){0,5}@{1,1}\\w*\\.{1,1}\\w{1,5}")){
                contacto.setMail_Cont(mail_Cont);
        }else{
                contacto.setMail_Cont("");
        }
        if (telefono_Cont != null && telefono_Cont.matches("\\d{6,10}")){
                contacto.setTelefono_Cont(telefono_Cont);
        }else{
                contacto.setTelefono_Cont("");
        }
        if (ciudad_Cont != null && ciudad_Cont.matches("[a-zA-ZáéíóúñÑ]*")){
                contacto.setCiudad_Cont(ciudad_Cont);
        }else{
                contacto.setCiudad_Cont("");
        }
        if (organizacion_Cont != null){
                contacto.setOrganizacion_Cont(organizacion_Cont);
        }else{
                contacto.setOrganizacion_Cont("");
        }
        
        try {
            int resultado = contacto.agregarContactoCapaNegocio(contacto);
            if (resultado != 0) {
                    respuesta = "Creación del contacto exitoso, su uid es: " + resultado;
            }
        } catch (PersistentException ex) {
                Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "editarContactoServicioWeb")
    public String editarContactoServicioWeb(@WebParam(name = "nuevoNombre_Cont") String nuevoNombre_Cont, @WebParam(name = "nuevoApellido_Cont") String nuevoApellido_Cont, @WebParam(name = "nuevoTelefono_Cont") String nuevoTelefono_Cont, @WebParam(name = "nuevoMail_Cont") String nuevoMail_Cont, @WebParam(name = "nuevoCiudad_Cont") String nuevoCiudad_Cont, @WebParam(name = "nuevoOrganizacion_Cont") String nuevoOrganizacion_Cont, @WebParam(name = "uid_Cont") int uid_Cont) {
        String respuesta = "No se ha editado el contacto";
        Contacto contacto = new Contacto();
        contacto.setUid_Cont(uid_Cont);
        
        if (nuevoNombre_Cont != null && nuevoNombre_Cont.matches("[a-zA-ZáéíóúñÑ]{2,20}")){
                contacto.setNombre_Cont(nuevoNombre_Cont);
        }else{
                contacto.setNombre_Cont("");
        }
        if (nuevoApellido_Cont != null && nuevoApellido_Cont.matches("[a-zA-ZáéíóúñÑ]{2,20}")){
                contacto.setApellido_Cont(nuevoApellido_Cont);
        }else{
                contacto.setApellido_Cont("");
        }
        if (nuevoMail_Cont != null && nuevoMail_Cont.matches("\\w*(\\.\\w*){0,5}@{1,1}\\w*\\.{1,1}\\w{1,5}")){
                contacto.setMail_Cont(nuevoMail_Cont);
        }else{
                contacto.setMail_Cont("");
        }
        if (nuevoTelefono_Cont != null && nuevoTelefono_Cont.matches("\\d{6,10}")){
                contacto.setTelefono_Cont(nuevoTelefono_Cont);
        }else{
                contacto.setTelefono_Cont("");
        }
        if (nuevoCiudad_Cont != null && nuevoCiudad_Cont.matches("[a-zA-ZáéíóúñÑ]*")){
                contacto.setCiudad_Cont(nuevoCiudad_Cont);
        }else{
                contacto.setCiudad_Cont("");
        }
        if (nuevoOrganizacion_Cont != null){
                contacto.setOrganizacion_Cont(nuevoOrganizacion_Cont);
        }else{
                contacto.setOrganizacion_Cont("");
        }
        
        try{
            int resultado = contacto.editarContactoCapaNegocio(contacto);
            if (resultado != 0){
                    respuesta = "Se ha modificado el contacto cuyo uid es: " + resultado;
            }
        }catch (PersistentException ex){
                Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null,  ex);
        }
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarContactoServicioWeb")
    public String eliminarContactoServicioWeb(@WebParam(name = "uid_Cont") int uid_Cont) {
        String respuesta = "No se ha podido eliminar el contacto";
        Contacto contacto = new Contacto();
        contacto.setUid_Cont(uid_Cont);
        
        try {
            int resultado = contacto.eliminarContactoCapaNegocio(contacto);
            if (resultado != 0) {
                    respuesta = "Se ha eliminado el contacto cuyo uid es: " + resultado;
            }
        } catch (PersistentException ex) {
                Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "busquedaSimpleContactoServicioWeb")
    public String busquedaSimpleContactoServicioWeb(@WebParam(name = "textoBusqueda") String textoBusqueda) {
        String listaResultado = "";
        List<Contacto> lista = new ArrayList<Contacto>();
        Gson gson = new GsonBuilder().create();
        try{
                Contacto contacto = new Contacto();
                lista = contacto.busquedaSimpleContactoCapaNegocio(textoBusqueda);
                listaResultado = gson.toJson(lista);
        }catch (PersistentException ex){
                java.util.logging.Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaResultado;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "busquedaAvanzadaContactoServicioWeb")
    public String busquedaAvanzadaContactoServicioWeb(@WebParam(name = "nombre_Cont") String nombre_Cont, @WebParam(name = "apellido_Cont") String apellido_Cont, @WebParam(name = "telefono_Cont") String telefono_Cont, @WebParam(name = "mail_Cont") String mail_Cont, @WebParam(name = "ciudad_Cont") String ciudad_Cont, @WebParam(name = "organizacion_Cont") String organizacion_Cont) {
        String listaResultado = "";
        List<capaNegocio.Contacto> lista = new ArrayList<capaNegocio.Contacto>();
        capaNegocio.Contacto contacto = new capaNegocio.Contacto();
        if (nombre_Cont != null && nombre_Cont.matches("[a-zA-ZáéíóúñÑ]{2,20}")){
                contacto.setNombre_Cont(nombre_Cont);
        }else{
                contacto.setNombre_Cont("");
        }
        if (apellido_Cont != null && apellido_Cont.matches("[a-zA-ZáéíóúñÑ]{2,20}")){
                contacto.setApellido_Cont(apellido_Cont);
        }else{
                contacto.setApellido_Cont("");
        }
        if (mail_Cont != null && mail_Cont.matches("\\w*(\\.\\w*){0,5}@{1,1}\\w*\\.{1,1}\\w{1,5}")){
                contacto.setMail_Cont(mail_Cont);
        }else{
                contacto.setMail_Cont("");
        }
        if (telefono_Cont != null && telefono_Cont.matches("\\d{6,10}")){
                contacto.setTelefono_Cont(telefono_Cont);
        }else{
                contacto.setTelefono_Cont("");
        }
        if (ciudad_Cont != null){
            contacto.setCiudad_Cont(ciudad_Cont);
        }
        if (organizacion_Cont != null){
            contacto.setOrganizacion_Cont(organizacion_Cont);
        }
        
        Gson gson = new GsonBuilder().create();
        try{
                lista = contacto.busquedaAvanzadaContactoCapaNegocio(contacto);
                listaResultado = gson.toJson(lista);
        }catch(PersistentException ex){
                listaResultado = null;
        }
        return listaResultado;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "busquedaGrupoContactoServicioWeb")
    public String busquedaGrupoContactoServicioWeb(@WebParam(name = "nombre_Cont") String nombre_Cont, @WebParam(name = "apellido_Cont") String apellido_Cont, @WebParam(name = "telefono_Cont") String telefono_Cont, @WebParam(name = "mail_Cont") String mail_Cont, @WebParam(name = "ciudad_Cont") String ciudad_Cont, @WebParam(name = "organizacion_Cont") String organizacion_Cont) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregarGrupoContactoServicioWeb")
    public String agregarGrupoContactoServicioWeb(@WebParam(name = "nombre_Grupo") String nombre_Grupo, @WebParam(name = "descripcion_Grupo") String descripcion_Grupo) {
        String respuesta = "No se pudo almacenar el grupo de contactos";
        Grupo_Contacto grupo = new Grupo_Contacto();

        if (nombre_Grupo != null){
                grupo.setNombre_Grupo(nombre_Grupo);
        }else{
                grupo.setNombre_Grupo("");
        }
        if (descripcion_Grupo != null){
                grupo.setDescripcion_Grupo(descripcion_Grupo);
        }else{
                grupo.setDescripcion_Grupo("");
        }
          
        try {
            int resultado = grupo.agregarGrupoContactoCapaNegocio(grupo);
            if (resultado != 0) {
                    respuesta = "Creación del grupo exitoso, su uid es: " + resultado;
            }
        } catch (PersistentException ex) {
                Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "editarGrupoContactoServicioWeb")
    public String editarGrupoContactoServicioWeb(@WebParam(name = "nombre_Grupo") String nombre_Grupo, @WebParam(name = "descripcion_Grupo") String descripcion_Grupo, @WebParam(name = "uid_Grupo") int uid_Grupo) {
        String respuesta = "No se ha editado el grupo de contactos";
        Grupo_Contacto grupo = new Grupo_Contacto();
        grupo.setUid_Grupo(uid_Grupo);
        
        if (nombre_Grupo != null){
                grupo.setNombre_Grupo(nombre_Grupo);
        }else{
                grupo.setNombre_Grupo("");
        }
        if (descripcion_Grupo != null){
                grupo.setDescripcion_Grupo(descripcion_Grupo);
        }else{
                grupo.setDescripcion_Grupo("");
        }
                
        try{
            int resultado = grupo.editarGrupoContactoCapaNegocio(grupo);
            if (resultado != 0){
                    respuesta = "Se ha modificado el grupo de contactos cuyo uid es: " + resultado;
            }
        }catch (PersistentException ex){
                Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null,  ex);
        }
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarGrupoContactoServicioWeb")
    public String eliminarGrupoContactoServicioWeb(@WebParam(name = "uid_Grupo") int uid_Grupo) {
        String respuesta = "No se ha podido eliminar el grupo de contactos";
        Grupo_Contacto grupo = new Grupo_Contacto();
        grupo.setUid_Grupo(uid_Grupo);
        
        try {
            int resultado = grupo.eliminarGrupoContactoCapaNegocio(grupo);
            if (resultado != 0) {
                    respuesta = "Se ha eliminado el grupo de contactos cuyo uid es: " + resultado;
            }
        } catch (PersistentException ex) {
                Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "busquedaSimpleGrupoContactoServicioWeb")
    public String busquedaSimpleGrupoContactoServicioWeb(@WebParam(name = "textoBusqueda") String textoBusqueda) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "busquedaAvanzadaGrupoContactoServicioWeb")
    public String busquedaAvanzadaGrupoContactoServicioWeb(@WebParam(name = "nombre_Grupo") String nombre_Grupo, @WebParam(name = "descripcion_Grupo") String descripcion_Grupo) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "busquedaMiembrosServicioWeb")
    public String busquedaMiembrosServicioWeb(@WebParam(name = "textoBusqueda") String textoBusqueda) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "inscribirContactoServicioWeb")
    public String inscribirContactoServicioWeb(@WebParam(name = "uid_Cont") String uid_Cont) {
        //TODO write your implementation code here:
        return null;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregarActividadServicioWeb")
    public String agregarActividadServicioWeb(@WebParam(name = "nombre_Act") String nombre_Act, @WebParam(name = "descripcion_Act") String descripcion_Act, @WebParam(name = "id_Grupo") int id_Grupo, @WebParam(name = "id_Act") int id_Act) {
        String respuesta = "No se pudo almacenar el grupo de contactos";
        Actividad actividad = new Actividad();
        capaNegocio.Grupo_Contacto grupo = new capaNegocio.Grupo_Contacto();
        
        actividad.setUid_Act(id_Act);
        grupo.setUid_Grupo(id_Grupo);

        if (nombre_Act != null){
                actividad.setNombre_Act(nombre_Act);
        }else{
                actividad.setNombre_Act("");
        }
        if (descripcion_Act != null){
                actividad.setDescripcion_Act(descripcion_Act);
        }else{
            actividad.setDescripcion_Act("");
        }
          
        try {
            int resultado = actividad.agregarActividadCapaNegocio(actividad);
            if (resultado != 0) {
                    respuesta = "Creación del acti exitoso, su uid es: " + resultado;
            }
        } catch (PersistentException ex) {
                Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }
    
    @WebMethod(operationName = "agregarActividadAGrupo")
    public String agregarActividadAGrupo(@WebParam(name = "uidActividad") int uidActividad,
            @WebParam(name = "uid_Grupo") int uid_Grupo){
        
        String respuesta ="no se puede almacenar cotacto";
        capaNegocio.Actividad actividad =new capaNegocio.Actividad();
        capaNegocio.Grupo_Contacto grupo = new capaNegocio.Grupo_Contacto();
        
        actividad.setUid_Act(uidActividad);
        grupo.setUid_Grupo(uid_Grupo);
        
        
        try{
            int resultado = actividad.agregarActividadAGrupo(actividad, grupo);
            if (resultado != 0) {
                respuesta = "se agrego correctamente un contacto al grupo " + resultado;
                                
            }
        }catch(PersistentException ex){
            Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE,null, ex);
        }
                
        
        return respuesta;
    }
}
