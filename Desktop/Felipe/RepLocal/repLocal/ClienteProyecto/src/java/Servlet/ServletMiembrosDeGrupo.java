/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import capaNegocio.Contacto;
import capaNegocio.Grupo_Contacto;
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
@WebServlet(name = "ServletMiembrosDeGrupo", urlPatterns = {"/MiembrosDeGrupo"})
public class ServletMiembrosDeGrupo extends HttpServlet {

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
        RequestDispatcher dispatcher = request.getRequestDispatcher("miembrosDeGrupo.jsp");
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
        int uid_Grupo = 0;
        uid_Grupo = Integer.parseInt(request.getParameter("uid_Cont"));
        
        Grupo_Contacto grupo = new Grupo_Contacto();
        grupo.setUid_Grupo(uid_Grupo);
        
        List<Contacto> listaContacto = new ArrayList<Contacto>();
        try {
            listaContacto = grupo.busquedaMiembrosCapaNegocio(grupo);
        } catch (PersistentException_Exception ex) {
            Logger.getLogger(ServletMiembrosDeGrupo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.setAttribute("listaContacto", listaContacto);
        RequestDispatcher dispatcher = request.getRequestDispatcher("miembrosDeGrupo.jsp");
        dispatcher.forward(request, response);
    }

}
