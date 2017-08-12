/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import capaNegocio.Grupo_Contacto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
@WebServlet(name = "BuscarGrupoContacto", urlPatterns = {"/BuscarGrupoContacto"})
public class ServletBuscarGrupoContacto extends HttpServlet {

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
        RequestDispatcher dispatcher = request.getRequestDispatcher("buscarGrupoContacto.jsp");
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
        String tipoBusqueda = "";
        tipoBusqueda = request.getParameter("btn_accion");
        if (tipoBusqueda.equals("simple")){
            String textoBusqueda = request.getParameter("textoBusqueda");			
            Grupo_Contacto grupo = new Grupo_Contacto();
            List<Grupo_Contacto> listaGrupo = new ArrayList<Grupo_Contacto>(); 
            listaGrupo = grupo.busquedaSimpleGrupoContactoCapaNegocio(textoBusqueda);
            request.removeAttribute("listaGrupo");
            request.setAttribute("listaGrupo", listaGrupo);
            RequestDispatcher dispatcher = request.getRequestDispatcher("buscarGrupoContacto.jsp");
            dispatcher.forward(request, response);
        }else {
            String nombre_Grupo = "", descripcion_Grupo = "";

            try{
                if (request.getParameter("nombre_Grupo") != null){
                    nombre_Grupo = request.getParameter("nombre_Grupo");
                }
            }catch (NullPointerException e){ }

            try{
                if (request.getParameter("descripcion__Grupo") != null){
                    descripcion_Grupo = request.getParameter("descripcion_Grupo");
                }
            }catch (NullPointerException e){ }

            Grupo_Contacto grupoNegocio = new Grupo_Contacto();
            grupoNegocio.setNombre_Grupo(nombre_Grupo);
            grupoNegocio.setDescripcion_Grupo(descripcion_Grupo);
            List<Grupo_Contacto> listaGrupo = new ArrayList<Grupo_Contacto>();
            listaGrupo = grupoNegocio.busquedaAvanzadaGrupoContactoCapaNegocio(grupoNegocio);
            request.removeAttribute("listaGrupo");
            request.setAttribute("listaGrupo", listaGrupo);
            RequestDispatcher dispatcher = request.getRequestDispatcher("buscarGrupoContacto.jsp");
            dispatcher.forward(request, response);
        }
    }

}
