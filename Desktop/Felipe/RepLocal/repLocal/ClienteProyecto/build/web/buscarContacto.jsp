
<%-- 
    Document   : buscarContacto
    Created on : 23-06-2016, 11:50:03
    Author     : Felipe
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="capaNegocio.Contacto"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "i"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Búsqueda Contacto</title>
    </head>
    <body style="background-color:burlywood;">
        <jsp:include page = "menu.jsp"/>
        <div class = "container">
            <div class = "jumbotron" style = "background-color:bisque;">
                <center>
                    <form class = "form-inline" method = "post" action = "BuscarContacto" id = "formRegistroTrabajador">
                        <div class = "row">
                            <div class = "col-sm-12">
                                <center>
                                    <h2>
                                        <b><font face = "Calibri light" size = "10" color = "burlywood">Búsqueda simple contacto</font></b>
                                    </h2>
                                </center>
                            </div>
                        </div>
                        <div class = "col-sm-12">
                            <div class = "form-group">
                                <label for = "textoBusqueda"><font face = "Calibri light" size = "4" color = "burlywood">Texto a buscar:</font></label>
                                <input type = "text" placeholder = "texto búsqueda" class = "form-control" id = "textoBusqueda" name = "textoBusqueda"/>
                                <button type = "submit" value = "simple" name = "btn_accion" class = "btn btn-danger btn-sm"><font color = "burlywood">Buscar</font></button>
                            </div>
                        </div>
                    </form>
                </center>
                <center>
                    <form class = "form-horizontal" method = "post" action = "BuscarContacto" id = "formRegistroTrabajador">
                        <div class = "row">
                            <div class = "col-sm-12">
                                <center>
                                    <h2>
                                        <b><font face = "Calibri light" size = "10" color = "burlywood">Búsqueda avanzada contacto</font></b>
                                    </h2>
                                </center>
                            </div>
                        </div>
                        <div class = "col-sm-8">
                            <div class = "form-group">
                                <label for = "nombre_Cont" class = "col-sm-5 control-label"><font face = "Calibri light" size = "4" color = "burlywood">Nombre del contacto:</font></label>
                                <div class = "col-sm-7">
                                    <input type = "text" placeholder = "nombre contacto" class = "form-control" id = "nombre_Cont" name = "nombre_Cont" pattern = "[a-zA-ZáéíóúñÑ]{2,20}"/>
                                </div>
                            </div>
                            <div class = "form-group">
                                <label for = "apellido_Cont" class = "col-sm-5 control-label"><font face = "Calibri light" size = "4" color = "burlywood">Apellido del contacto:</font></label>
                                <div class = "col-sm-7">
                                    <input type = "text" class = "form-control" id = "apellido_Cont" placeholder = "apellido contacto"  name = "apellido_Cont" pattern = "[a-zA-ZáéíóúñÑ]{2,20}"/>
                                </div>
                            </div>
                            <div class = "form-group">
                                <label for = "mail_Cont" class = "col-sm-5 control-label"><font face = "Calibri light" size = "4" color = "burlywood">Mail del contacto:</font></label>
                                <div class = "col-sm-7">
                                    <input type = "text" class = "form-control" id = "mail_Cont" placeholder = "mail contacto"  name = "mail_Cont" pattern = "\w*(\.\w*){0,5}@{1,1}\w*\.{1,1}\w{1,5}"/>
                                </div>
                            </div>
                            <div class = "form-group">
                                <label for = "telefono_Cont" class = "col-sm-5 control-label"><font face = "Calibri light" size = "4" color = "burlywood">Teléfono del contacto:</font></label>
                                <div class = "col-sm-7">
                                    <input type = "text" class = "form-control" id = "telefono_Cont" placeholder = "teléfono contacto"  name = "telefono_Cont" pattern = "\d{6,10}"/>
                                </div>
                            </div>
                            <div class = "form-group">
                                <label for = "ciudad_Cont" class = "col-sm-5 control-label"><font face = "Calibri light" size = "4" color = "burlywood">Ciudad del contacto:</font></label>
                                <div class = "col-sm-7">
                                    <input type = "text" class = "form-control" id = "ciudad_Cont" placeholder = "ciudad contacto"  name = "ciudad_Cont"/>
                                </div>
                            </div>
                            <div class = "form-group">
                                <label for = "organizacion_Cont" class = "col-sm-5 control-label"><font face = "Calibri light" size = "4" color = "burlywood">Organizacion del contacto:</font></label>
                                <div class = "col-sm-7">
                                    <input type = "text" class = "form-control" id = "organizacion_Cont" placeholder = "organizacion contacto"  name = "organizacion_Cont"/>
                                </div>
                            </div>
                        </div>
                        <div class = "row">
                                <div class = "col-sm-12">
                                    <center><button type = "submit" value = "avanzado" name = "btn_accion" class = "btn btn-danger btn-lg"><font color = "burlywood">Buscar</font></button></center>
                                </div>
                        </div>
                    </form>
                </center>
                <h2></h2>
                <center>
                    <table class = "table table-striped table-bordered table-hover">
                        <thead>
                        <th>Foto</th>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Mail</th>
                        <th>Teléfono</th>
                        <th>Ciudad</th>
                        <th>Organización</th>
                        </thead>
                        <tbody>
                            <i:forEach items = "${listaContacto}" var = "contactoNegocio">
                                <tr>
                                    <td><center><img src = "${contactoNegocio.imagen_Cont}" width = "50" length = "50"/></center></td>
                                    <td>${contactoNegocio.nombre_Cont}</td><!--button><a href = "EditarContacto">Editar Contacto</a></button--> 
                                    <td>${contactoNegocio.apellido_Cont}</td>
                                    <td>${contactoNegocio.mail_Cont}</td>
                                    <td>${contactoNegocio.telefono_Cont}</td>
                                    <td>${contactoNegocio.ciudad_Cont}</td>
                                    <td>${contactoNegocio.organizacion_Cont}</td>
                                </tr>
                            </i:forEach>
                        </tbody>
                    </table>
                </center>
            </div>                
        </div>        
    </body>
</html>