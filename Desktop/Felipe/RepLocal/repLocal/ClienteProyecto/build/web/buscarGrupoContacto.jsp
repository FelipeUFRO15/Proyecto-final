<%-- 
    Document   : buscarGrupoContacto
    Created on : 23-06-2016, 20:11:03
    Author     : Felipe
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="capaNegocio.Contacto"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "i"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD 
    HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Búsqueda Contacto</title>
    </head>
    <body style="background-color:burlywood;">
        <jsp:include page = "menu.jsp"/>
        <div class = "container">
            <div class = "jumbotron" style = "background-color:bisque;">
                <div class = "row">
                    <center>
                        <h2>
                            <b><font face = "Calibri light" size = "10" color = "burlywood">Búsqueda simple grupo</font></b>
                        </h2>
                    </center>
                </div>
                <center>
                    <form class = "form-inline" method = "post" action = "BuscarGrupoContacto" id = "formRegistroTrabajador">
                        <div class = "row">
                            <div class = "col-sm-12">
                                <div class = "form-group">
                                    <div class = "col-sm-12">
                                        <label for = "textoBusqueda"><font face = "Calibri light" size = "4" color = "burlywood">Texto:</font></label>
                                        <input type = "text" placeholder = "texto búsqueda" class = "form-control" id = "textoBusqueda" name = "textoBusqueda"/>
                                        <button type = "submit" value = "simple" name = "btn_accion" class = "btn btn-danger btn-sm"><font color = "burlywood">Buscar</font></button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </form>
                </center>
                <center>
                    <form class = "form-horizontal" method = "post" action = "BuscarGrupoContacto" id = "formRegistroTrabajador">
                        <div class = "row">
                            <div class = "col-sm-12">
                                <center>
                                    <h2>
                                        <b><font face = "Calibri light" size = "10" color = "burlywood">Búsqueda avanzada grupo contacto</font></b>
                                    </h2>
                                </center>
                            </div>
                        </div>
                        <div class = "col-sm-8">
                            <div class = "form-group">
                                <label for = "nombre_Grupo" class = "col-sm-5 control-label"><font face = "Calibri light" size = "4" color = "burlywood">Nombre del grupo:</font></label>
                                <div class = "col-sm-7">
                                    <input type = "text" placeholder = "nombre grupo" class = "form-control" id = "nombre_Grupo" name = "nombre_Grupo"/>
                                </div>
                            </div>
                            <div class = "form-group">
                                <label for = "descripcion_Grupo" class = "col-sm-5 control-label"><font face = "Calibri light" size = "4" color = "burlywood">Apellido del grupo:</font></label>
                                <div class = "col-sm-7">
                                    <input type = "text" class = "form-control" id = "descripcion_Grupo" placeholder = "descripcion grupo"  name = "descripcion_Grupo"/>
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
                <center>
                    <table class = "table table-bordered table-striped table-hover">
                        <thead>
                        <th>Nombre</th>
                        <th>Descripcion</th>
                        <th>Fecha</th>
                        </thead>
                        <tbody>
                            <i:forEach items = "${listaGrupo}" var = "grupoNegocio">
                                <tr>
                                    <td>${grupoNegocio.nombre_Grupo}</td><!--button><a href = "EditarGrupo">Editar Grupo</a></button--> 
                                    <td>${grupoNegocio.descripcion_Grupo}</td>
                                    <td>${grupoNegocio.fecha_Grupo}</td>
                                </tr>
                            </i:forEach>
                        </tbody>
                    </table>
                </center>
            </div>
        </div>
    </body>
</html>
