/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import capaNegocio.Contacto;
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
@WebServlet(name = "ServletEditarContacto", urlPatterns = {"/EditarContacto"})
public class ServletEditarContacto extends HttpServlet {

    

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
        RequestDispatcher dispatcher = request.getRequestDispatcher("editarContacto.jsp");
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
        int uid_Cont = Integer.parseInt(request.getParameter("uid_Cont"));
        String nombre_Cont = "";
        String apellido_Cont = "";
        String telefono_Cont = "";
        String mail_Cont = "";
        String ciudad_Cont = "";
        String organizacion_Cont = "";
        String imagen_Cont = "";

        if (request.getParameter("nombre_Cont") == null || !request.getParameter("nombre_Cont").matches("[a-zA-ZáéíóúñÑ]{2,20}")){
                nombre_Cont = "";
        }else nombre_Cont = request.getParameter("nombre_Cont");

        if (request.getParameter("apellido_Cont") == null || !request.getParameter("apellido_Cont").matches("[a-zA-ZáéíóúñÑ]{2,20}")){
                apellido_Cont = "";
        }else apellido_Cont = request.getParameter("apellido_Cont");

        if (request.getParameter("mail_Cont") == null || !request.getParameter("mail_Cont").matches("\\w*(\\.\\w*){0,5}@{1,1}\\w*\\.{1,1}\\w{1,5}")){
                mail_Cont = "";
        }else mail_Cont = request.getParameter("mail_Cont");
        
        if (request.getParameter("telefono_Cont") == null || !request.getParameter("telefono_Cont").matches("\\d{6,10}")){
                telefono_Cont = "";
        }else telefono_Cont = request.getParameter("telefono_Cont");

        if (request.getParameter("ciudad_Cont") == null || !request.getParameter("ciudad_Cont").matches("[a-zA-ZáéíóúñÑ]{2,20}")){
                ciudad_Cont = "";
        }else ciudad_Cont = request.getParameter("ciudad_Cont");
        
        if (request.getParameter("organizacion_Cont") == null){
                organizacion_Cont = "";
        }else organizacion_Cont = request.getParameter("organizacion_Cont");
        
        if (request.getParameter("imagen_Cont") == null){
                imagen_Cont = "";
        }else imagen_Cont = request.getParameter("imagen_Cont");


        Contacto contactoNegocio = new Contacto();
        
        contactoNegocio.setUid_Cont(uid_Cont);
        contactoNegocio.setNombre_Cont(nombre_Cont);
        contactoNegocio.setApellido_Cont(apellido_Cont);
        contactoNegocio.setMail_Cont(mail_Cont);
        contactoNegocio.setTelefono_Cont(telefono_Cont);
        contactoNegocio.setCiudad_Cont(ciudad_Cont);
        contactoNegocio.setOrganizacion_Cont(organizacion_Cont);
        contactoNegocio.setImagen_Cont(imagen_Cont);
        String resultado = contactoNegocio.editarContactoCapaNegocio(contactoNegocio);
        System.out.println("//////////////////////////////////////////////////");
        System.out.println("Debug ServletEditarContacto " + resultado);
        System.out.println("//////////////////////////////////////////////////");
        request.setAttribute("resultado", resultado);
        RequestDispatcher dispatcher = request.getRequestDispatcher("editarContacto.jsp");
        dispatcher.forward(request, response);
    }

}
