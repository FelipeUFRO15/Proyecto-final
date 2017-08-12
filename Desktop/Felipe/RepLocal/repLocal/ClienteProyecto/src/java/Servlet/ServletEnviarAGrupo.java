/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import capaNegocio.Actividad;
import capaNegocio.Grupo_Contacto;
import capaNegocio.Notificacion;
import capaservicio.PersistentException_Exception;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Felipe
 */
@WebServlet(name = "ServletEnviarAGrupo", urlPatterns = {"/EnviarAGrupo"})
public class ServletEnviarAGrupo extends HttpServlet {


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("enviarAGrupo.jsp");
        dispatcher.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String tipoEnviar = "";
        tipoEnviar = request.getParameter("btn_accion");
        if (tipoEnviar.equals("actividad")){
            String nombre_Act = "";
            String descripcion_Act = "";
            int uid_Grupo = 0;
            if (request.getParameter("nombre_Act") != null){
                nombre_Act = request.getParameter("nombre_Act");
            }
            if (request.getParameter("descripcion_Act") != null){
                descripcion_Act = request.getParameter("descripcion_Act");
            }
            uid_Grupo = Integer.parseInt(request.getParameter("uid_Grupo"));
            Actividad actividadNegocio = new Actividad();
            actividadNegocio.setNombre_Act(nombre_Act);
            actividadNegocio.setDescripcion_Act(descripcion_Act);
            actividadNegocio.setIdGrupo(uid_Grupo);
            Grupo_Contacto grupoNegocio = new Grupo_Contacto();
            grupoNegocio.setUid_Grupo(uid_Grupo);
            try {
                String resultado = grupoNegocio.agregarActividadCapaNegocio(actividadNegocio, grupoNegocio);
                request.setAttribute("resultado", resultado);
                System.out.println("Debug ServletEnviarAGrupo " + resultado);
            } catch (PersistentException_Exception ex) {
                Logger.getLogger(ServletEnviarAGrupo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else {
            String mensaje_Noti = "";
            int uid_Grupoo = 0;
            if (request.getParameter("mensaje_Noti") != null){
                mensaje_Noti = request.getParameter("mensaje_Noti");
            }
            uid_Grupoo = Integer.parseInt(request.getParameter("uid_Grupoo"));
            Notificacion notificacionNegocio = new Notificacion();
            notificacionNegocio.setIdGrupo(uid_Grupoo);
            notificacionNegocio.setMensaje_Noti(mensaje_Noti);
            Grupo_Contacto grupoNegocio = new Grupo_Contacto();
            grupoNegocio.setUid_Grupo(uid_Grupoo);
            try {
                String resultado = grupoNegocio.agregarNotificacionCapaNegocio(notificacionNegocio, grupoNegocio);
                request.setAttribute("resultado", resultado);
                System.out.println("Debug ServletEnviarAGrupo " + resultado);
            } catch (PersistentException_Exception ex) {
                Logger.getLogger(ServletEnviarAGrupo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("enviarAGrupo.jsp");
        dispatcher.forward(request, response);
    }

}
