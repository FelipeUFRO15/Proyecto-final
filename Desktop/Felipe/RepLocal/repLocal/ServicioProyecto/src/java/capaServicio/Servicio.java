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
import capaNegocio.Notificacion;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.awt.BorderLayout;
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
     * Agregar contacto:
     * Recibe los atríbutos de contacto: nombre (String), apellido (String), mail (String), teléfono (String), 
     * ciudad (String), organización (String) e imagen (String).
     * Devuelve un mensaje junto al id del contacto nuevo
     * En caso de que el método no se ejecute bien, retorna un mensaje avisando la situación
     */
    @WebMethod(operationName = "agregarContactoServicioWeb")
    public String agregarContactoServicioWeb(@WebParam(name = "nombre_Cont") String nombre_Cont, @WebParam(name = "apellido_Cont") String apellido_Cont, @WebParam(name = "mail_Cont") String mail_Cont, @WebParam(name = "telefono_Cont") String telefono_Cont, @WebParam(name = "ciudad_Cont") String ciudad_Cont, @WebParam(name = "organizacion_Cont") String organizacion_Cont, @WebParam(name = "imagen_Cont") String imagen_Cont) {
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
        if (imagen_Cont != null){
                contacto.setImagen_Cont(imagen_Cont);
        }else{
                contacto.setImagen_Cont("Imagenes\\contacto.png");
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
     * Editar contacto:
     * Recibe los atríbutos del contacto a editar: id (int), nombre (String), apellido (String), mail (String),
     * teléfono (String), ciudad (String), organización (String) e imagen (String).
     * Devuelve un mensaje junto al id del contacto editado
     * En caso de que el método no se ejecute bien, retorna un mensaje avisando la situación
     * Si uno de los parámetros viene vacío, el dato no se edita
     */
    @WebMethod(operationName = "editarContactoServicioWeb")
    public String editarContactoServicioWeb(@WebParam(name = "nuevoNombre_Cont") String nuevoNombre_Cont, @WebParam(name = "nuevoApellido_Cont") String nuevoApellido_Cont, @WebParam(name = "nuevoMail_Cont") String nuevoMail_Cont, @WebParam(name = "nuevoTelefono_Cont") String nuevoTelefono_Cont, @WebParam(name = "nuevoCiudad_Cont") String nuevoCiudad_Cont, @WebParam(name = "nuevoOrganizacion_Cont") String nuevoOrganizacion_Cont, @WebParam(name = "nuevoImagen_Cont") String nuevoImagen_Cont, @WebParam(name = "uid_Cont") int uid_Cont) {
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
        if (nuevoImagen_Cont != null){
                contacto.setImagen_Cont(nuevoImagen_Cont);
        }else{
                contacto.setImagen_Cont("C:\\Users\\Felipe\\Desktop\\iconos\\contacto.png");
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
     * Recibe el id del contacto (int)
     * Devuelve un mensaje indicando que fue eliminado, o que no se pudo eliminar en caso contrario
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
     * Recibe una palabra como parámetro de búsqueda, devuelve una lista con los contactos resultantes
     * dentro de un Json
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
     * Recibe todos los parámetros de un contacto, devuelve una lista con los contactos resultantes
     * dentro de un Json
     */
    @WebMethod(operationName = "busquedaAvanzadaContactoServicioWeb")
    public String busquedaAvanzadaContactoServicioWeb(@WebParam(name = "nombre_Cont") String nombre_Cont, @WebParam(name = "apellido_Cont") String apellido_Cont, @WebParam(name = "mail_Cont") String mail_Cont, @WebParam(name = "telefono_Cont") String telefono_Cont, @WebParam(name = "ciudad_Cont") String ciudad_Cont, @WebParam(name = "organizacion_Cont") String organizacion_Cont) {
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
     * Recibe el nombre(String) y la descripción de un grupo
     * Retorna un mensaje de respuesta tras agregarlo
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
     * Recibe el nombre, descripción y id (int) de un grupo
     * Lo edita y devuelve un mensaje
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
     * Recibe el id del grupo a eliminar, devuelve un mensaje
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
     * Recibe un texto de búsqueda
     * Retorna una lista de grupos dentro de un json
     */
    @WebMethod(operationName = "busquedaSimpleGrupoContactoServicioWeb")
    public String busquedaSimpleGrupoContactoServicioWeb(@WebParam(name = "textoBusqueda") String textoBusqueda) {
        String listaResultado = "La búsqueda no devolvió resultados";
        List<Grupo_Contacto> lista = new ArrayList<Grupo_Contacto>();
        Gson gson = new GsonBuilder().create();
        try{
                Grupo_Contacto grupo = new Grupo_Contacto();
                lista = grupo.busquedaSimpleGrupoContactoCapaNegocio(textoBusqueda);
                listaResultado = gson.toJson(lista);
        }catch (PersistentException ex){
                java.util.logging.Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaResultado;
    }

    /**
     * Recibe el nombre y descripción a buscar
     * Retorna una lista de grupos dentro de un json
     */
    @WebMethod(operationName = "busquedaAvanzadaGrupoContactoServicioWeb")
    public String busquedaAvanzadaGrupoContactoServicioWeb(@WebParam(name = "nombre_Grupo") String nombre_Grupo, @WebParam(name = "descripcion_Grupo") String descripcion_Grupo) {
        String listaResultado = "";
        List<capaNegocio.Grupo_Contacto> lista = new ArrayList<capaNegocio.Grupo_Contacto>();
        capaNegocio.Grupo_Contacto grupo = new capaNegocio.Grupo_Contacto();
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
        
        Gson gson = new GsonBuilder().create();
        try{
                lista = grupo.busquedaAvanzadaGrupoContactoCapaNegocio(grupo);
                listaResultado = gson.toJson(lista);
        }catch(PersistentException ex){
                listaResultado = null;
        }
        return listaResultado;
    }

    /**
     * Recibe el id (int) de un contacto
     * Devuelve lista de grupos en un json
     */
    @WebMethod(operationName = "gruposDeContactoServicioWeb")
    public String gruposDeContactoServicioWeb(@WebParam(name = "uid_Cont") int uid_Cont) throws PersistentException {
        String respuesta = "No se encontraron grupos del contacto";
        Contacto contacto = new Contacto();
        contacto.setUid_Cont(uid_Cont);
        List<Grupo_Contacto> lista = new ArrayList<Grupo_Contacto>();
        lista = contacto.gruposDeContactoCapaNegocio(contacto);
        Gson gson = new GsonBuilder().create();
        respuesta = gson.toJson(lista);
        return respuesta;
    }

    /**
     * Recibe el id (int) de un grupo
     * Devuelve una lista de contactos en un json
     */
    @WebMethod(operationName = "miembrosDeGrupoServicioWeb")
    public String miembrosDeGrupoServicioWeb(@WebParam(name = "uid_Grupo") int uid_Grupo) throws PersistentException {
        String respuesta = "No se encontraron miembros del grupo";
        Grupo_Contacto grupo = new Grupo_Contacto();
        grupo.setUid_Grupo(uid_Grupo);
        List<Contacto> lista = new ArrayList<Contacto>();
        lista = grupo.busquedaMiembrosCapaNegocio(grupo);
        Gson gson = new GsonBuilder().create();
        respuesta = gson.toJson(lista);
        return respuesta;
    }

    /**
     * Recibe el id del contacto y el grupo al cual se inscribirá
     * Devuelve un mensaje
     */
    @WebMethod(operationName = "inscribirContactoServicioWeb")
    public String inscribirContactoServicioWeb(@WebParam(name = "uid_Cont") String uid_Cont, @WebParam(name = "uid_Grupo") String uid_Grupo) throws PersistentException {
        String respuesta = "No se pudo vincular el contacto al grupo";
        capaNegocio.Contacto contacto = new Contacto();
        capaNegocio.Grupo_Contacto grupo = new Grupo_Contacto();
        //if (uid_Cont.matches("\\d") && uid_Grupo.matches("\\d")){
            contacto.setUid_Cont(Integer.parseInt(uid_Cont));
            grupo.setUid_Grupo(Integer.parseInt(uid_Grupo));
            respuesta = "Se ha agregado el contacto al grupo, el id de la membresía es " + grupo.inscribirContactoCapaNegocio(contacto, grupo);
            return respuesta;
        //}else System.out.println("Debug");
        //return respuesta;
    }
    
    /**
     * Recibe el nombre y descripción de una actividad
     * Devuelve un mensaje
     */
    @WebMethod(operationName = "agregarActividadAGrupoServicioWeb")
    public String agregarActividadAGrupoServicioWeb(@WebParam(name = "nombre_Act") String nombre_Act, @WebParam(name = "descripcion_Act") String descripcion_Act, @WebParam(name = "uid_Grupo") int uid_Grupo) throws PersistentException{
        String respuesta = "No se pudo enviar actividad a grupo";
        Actividad actividad = new Actividad();
        actividad.setNombre_Act(nombre_Act);
        actividad.setDescripcion_Act(descripcion_Act);
        
        Grupo_Contacto grupo = new Grupo_Contacto();
        grupo.setUid_Grupo(uid_Grupo);  
        try{
            String resultado = grupo.agregarActividadCapaNegocio(actividad, grupo);
            System.out.println("Debug ServicioCliente" + resultado);
            respuesta = "Se agrego correctamente una actividad al grupo " + resultado;            
        }catch(PersistentException ex){
            Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE,null, ex);
        }
        
        return respuesta;
    }
    
    /**
     * Recibe el id de un grupo
     * Devuelve sus actividades en una lista a traves de un json
     */
    @WebMethod(operationName = "buscarActividadesServicioWeb")
    public String buscarActividadesServicioWeb(@WebParam(name = "uid_Grupo") int uid_Grupo) throws PersistentException {
        String respuesta = "No se encontraron actividades del grupo";
        Grupo_Contacto grupo = new Grupo_Contacto();
        grupo.setUid_Grupo(uid_Grupo);
        List<Actividad> lista = new ArrayList<Actividad>();
        lista = grupo.buscarActividadesGrupoContactoCapaNegocio(grupo);
        Gson gson = new GsonBuilder().create();
        respuesta = gson.toJson(lista);
        return respuesta;
    }
    
    /**
     * Recibe el id de una actividad
     */
    @WebMethod(operationName = "verLecturasActividadServicioWeb")
    public String verLecturasActividadServicioWeb(@WebParam(name = "uid_Act") int uid_Act) throws PersistentException {
        String respuesta = "Ningun miembro leyó esta actividad";
        Grupo_Contacto grupo = new Grupo_Contacto();
        Actividad actividad = new Actividad();
        actividad.setUid_Act(uid_Act);
        List<Contacto> lista = new ArrayList<Contacto>();
        lista = grupo.verLecturasActividadCapaNegocio(actividad);
        Gson gson = new GsonBuilder().create();
        respuesta = gson.toJson(lista);
        return respuesta;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "leerActividadServicioWeb")
    public String leerActividadServicioWeb(@WebParam(name = "uid_Cont") int uid_Cont, @WebParam(name = "uid_Act") int uid_Act) throws PersistentException{
        String respuesta = "No se pudo leer la actividad";
        Grupo_Contacto grupo = new Grupo_Contacto();
        Contacto contacto = new Contacto();
        contacto.setUid_Cont(uid_Cont);
        Actividad actividad = new Actividad();
        actividad.setUid_Act(uid_Act);
        respuesta = "Se leyó la actividad en la fecha " + grupo.leerActividadCapaNegocio(contacto, actividad);
        return respuesta;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregarNotificacionAGrupoServicioWeb")
    public String agregarNotificacionAGrupoServicioWeb(@WebParam(name = "mensaje_Noti") String mensaje_Noti, @WebParam(name = "uid_Grupo") int uid_Grupo) throws PersistentException{
        String respuesta = "No se pudo enviar notificacion a grupo";
        Notificacion notificacion = new Notificacion();
        notificacion.setMensaje_Noti(mensaje_Noti);
        
        Grupo_Contacto grupo = new Grupo_Contacto();
        grupo.setUid_Grupo(uid_Grupo);  
        try{
            String resultado = grupo.agregarNotificacionCapaNegocio(notificacion, grupo);
            respuesta = "Se agrego correctamente una notificacion al grupo " + resultado;            
        }catch(PersistentException ex){
            Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE,null, ex);
        }
        
        return respuesta;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "buscarNotificacionesServicioWeb")
    public String buscarNotificacionesServicioWeb(@WebParam(name = "uid_Grupo") int uid_Grupo) throws PersistentException {
        String respuesta = "No se encontraron notificaciones del grupo";
        Grupo_Contacto grupo = new Grupo_Contacto();
        grupo.setUid_Grupo(uid_Grupo);
        List<Notificacion> lista = new ArrayList<Notificacion>();
        lista = grupo.buscarNotificacionesGrupoContactoCapaNegocio(grupo);
        Gson gson = new GsonBuilder().create();
        respuesta = gson.toJson(lista);
        return respuesta;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "verLecturasNotificacionServicioWeb")
    public String verLecturasNotificacionServicioWeb(@WebParam(name = "uid_Noti") int uid_Noti) throws PersistentException {
        String respuesta = "Ningun miembro leyó esta notificacion";
        Grupo_Contacto grupo = new Grupo_Contacto();
        Notificacion notificacion = new Notificacion();
        notificacion.setUid_Noti(uid_Noti);
        List<Contacto> lista = new ArrayList<Contacto>();
        lista = grupo.verLecturasNotificacionCapaNegocio(notificacion);
        Gson gson = new GsonBuilder().create();
        respuesta = gson.toJson(lista);
        return respuesta;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "leerNotificacionServicioWeb")
    public String leerNotificacionServicioWeb(@WebParam(name = "uid_Cont") int uid_Cont, @WebParam(name = "uid_Noti") int uid_Noti) throws PersistentException{
        String respuesta = "No se pudo leer la notificacion";
        Grupo_Contacto grupo = new Grupo_Contacto();
        Contacto contacto = new Contacto();
        contacto.setUid_Cont(uid_Cont);
        Notificacion notificacion = new Notificacion();
        notificacion.setUid_Noti(uid_Noti);
        respuesta = "Se leyó la notificacion en la fecha " + grupo.leerNotificacionCapaNegocio(contacto, notificacion);
        return respuesta;
    }
}
