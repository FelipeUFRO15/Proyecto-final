package Servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Servlet.ServletEnviarAGrupo;
import capaNegocio.Actividad;
import capaNegocio.Contacto;
import capaNegocio.Grupo_Contacto;
import capaNegocio.Notificacion;
import capaservicio.PersistentException_Exception;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
@WebServlet(name = "ServletVerLecturas",urlPatterns = {"/VerLecturas"})
public class ServletVerLecturas extends HttpServlet {
   
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
        RequestDispatcher dispatcher = request.getRequestDispatcher("verLecturas.jsp");
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
        String verLectura = "";
        verLectura = request.getParameter("btn_accion");
        if (verLectura.equals("actividad")) {
            int uid_Act = 0;
            if (request.getParameter("uid_Act") != null){
                uid_Act = Integer.parseInt(request.getParameter("uid_Act"));
            }
            
            Actividad actividadNegocio = new Actividad();
            actividadNegocio.setUid_Act(uid_Act);
            Grupo_Contacto grupoNegocio = new Grupo_Contacto();
            List<Contacto> listaContacto = new ArrayList<Contacto>();
            try {
                listaContacto = grupoNegocio.verLecturasActividadCapaNegocio(actividadNegocio);
            } catch (PersistentException_Exception ex) {
                Logger.getLogger(ServletEnviarAGrupo.class.getName()).log(Level.SEVERE, null, ex);
            }
            request.removeAttribute("listaContacto");
            request.setAttribute("listaContacto", listaContacto);
            RequestDispatcher dispatcher = request.getRequestDispatcher("verLecturas.jsp");
            dispatcher.forward(request, response);
        }else {
            int uid_Noti = 0;
            if (request.getParameter("uid_Noti") != null){
                uid_Noti = Integer.parseInt(request.getParameter("uid_Noti"));
            }
            
            Notificacion notificacionNegocio = new Notificacion();
            notificacionNegocio.setUid_Noti(1);
            Grupo_Contacto grupoNegocio = new Grupo_Contacto();
            List<Contacto> listaContacto = new ArrayList<Contacto>();
            try {
                listaContacto = grupoNegocio.verLecturasNotificacionCapaNegocio(notificacionNegocio);
            } catch (PersistentException_Exception ex) {
                Logger.getLogger(ServletEnviarAGrupo.class.getName()).log(Level.SEVERE, null, ex);
            }
            request.removeAttribute("listaContacto");
            request.setAttribute("listaContacto", listaContacto);
            RequestDispatcher dispatcher = request.getRequestDispatcher("verLecturas.jsp");
            dispatcher.forward(request, response);
        }
    }

}
