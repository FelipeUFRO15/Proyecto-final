/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import capaNegocio.Grupo_Contacto;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "ServletEditarGrupoContacto", urlPatterns = {"/EditarGrupoContacto"})
public class ServletEditarGrupoContacto extends HttpServlet {

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
        RequestDispatcher dispatcher = request.getRequestDispatcher("editarGrupoContacto.jsp");
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
        String nombre_Grupo = "";
        String descripcion_Grupo = "";
        int uid_Grupo = 0;
        
        if (request.getParameter("nombre_Grupo") != null){
            nombre_Grupo = request.getParameter("nombre_Grupo");
        }
        if (request.getParameter("descripcion_Grupo") != null){
            descripcion_Grupo = request.getParameter("descripcion_Grupo");
        }
        uid_Grupo = Integer.parseInt(request.getParameter("uid_Cont"));
        
        Grupo_Contacto grupoNegocio = new Grupo_Contacto();
        grupoNegocio.setUid_Grupo(uid_Grupo);
        grupoNegocio.setNombre_Grupo(nombre_Grupo);
        grupoNegocio.setDescripcion_Grupo(descripcion_Grupo);
        
        String resultado = "";
        resultado = grupoNegocio.editarGrupoContactoCapaNegocio(grupoNegocio);
        request.setAttribute("resultado", resultado);        
        RequestDispatcher dispatcher = request.getRequestDispatcher("editarGrupoContacto.jsp");
        dispatcher.forward(request, response);
    }

}
