/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import capaNegocio.Contacto;
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
@WebServlet(name = "ServletBuscarContacto", urlPatterns = {"/BuscarContacto"})
public class ServletBuscarContacto extends HttpServlet {

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
        RequestDispatcher dispatcher = request.getRequestDispatcher("buscarContacto.jsp");
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
            Contacto contacto = new Contacto();
            List<Contacto> listaContacto = contacto.busquedaSimpleContactoCapaNegocio(textoBusqueda);
            request.removeAttribute("listaContacto");
            request.setAttribute("listaContacto", listaContacto);
            RequestDispatcher dispatcher = request.getRequestDispatcher("buscarContacto.jsp");
            dispatcher.forward(request, response);
        }else {
            String nombre_Cont = "", apellido_Cont = "", mail_Cont = "", telefono_Cont = "", ciudad_Cont = "", organizacion_Cont = "";

            try{
                if (request.getParameter("nombre_Cont") != null && request.getParameter("nombre_Cont").matches("[a-zA-ZáéíóúñÑ]{2,20}")){
                    nombre_Cont = request.getParameter("nombre_Cont");
                }
            }catch (NullPointerException e){ }

            try{
                if (request.getParameter("apellido_Cont") != null && request.getParameter("apellido_Cont").matches("[a-zA-ZáéíóúñÑ]{2,20}")){
                    apellido_Cont = request.getParameter("apellido_Cont");
                }
            }catch (NullPointerException e){ }

            try{
                if (request.getParameter("mail_Cont") != null && request.getParameter("mail_Cont").matches("\\w*(\\.\\w*){0,5}@{1,1}\\w*\\.{1,1}\\w{1,5}")){
                        mail_Cont = request.getParameter("mail_Cont");
                }
            }catch (NullPointerException e){ }
            
            try{
                if (request.getParameter("telefono_Cont") != null && request.getParameter("telefono_Cont").matches("\\d{6,10}")){
                        telefono_Cont = request.getParameter("telefono_Cont");
                }
            }catch (NullPointerException e){ }
            
            try{
                if (request.getParameter("ciudad_Cont") != null && request.getParameter("ciudad_Cont").matches("\\w*(\\.\\w*){0,5}@{1,1}\\w*\\.{1,1}\\w{1,5}")){
                        ciudad_Cont = request.getParameter("ciudad_Cont");
                }
            }catch (NullPointerException e){ }

            
            
            Contacto contactoNegocio = new Contacto();
            contactoNegocio.setNombre_Cont(nombre_Cont);
            contactoNegocio.setApellido_Cont(apellido_Cont);
            contactoNegocio.setMail_Cont(mail_Cont);
            contactoNegocio.setTelefono_Cont(telefono_Cont);
            contactoNegocio.setCiudad_Cont(ciudad_Cont);
            contactoNegocio.setOrganizacion_Cont(organizacion_Cont);
            
            System.out.println(contactoNegocio.getNombre_Cont());
            System.out.println(contactoNegocio.getApellido_Cont());
            System.out.println(contactoNegocio.getMail_Cont());
            System.out.println(contactoNegocio.getTelefono_Cont());
            System.out.println(contactoNegocio.getCiudad_Cont());
            System.out.println(contactoNegocio.getOrganizacion_Cont());            
            List<Contacto> listaContacto = new ArrayList<Contacto>();
            listaContacto = contactoNegocio.busquedaAvanzadaContactoCapaNegocio(contactoNegocio);
            System.out.println("//////////////////////////////////////////////////");
            for (int i = 0; i < listaContacto.size(); i++){
                System.out.println("Debug ServletBuscarContacto = " + listaContacto.get(i).getNombre_Cont() + listaContacto.get(i).getApellido_Cont());
            }
            System.out.println("//////////////////////////////////////////////////");
            request.removeAttribute("listaContacto");
            request.setAttribute("listaContacto", listaContacto);
            RequestDispatcher dispatcher = request.getRequestDispatcher("buscarContacto.jsp");
            dispatcher.forward(request, response);
        }
    }

}
