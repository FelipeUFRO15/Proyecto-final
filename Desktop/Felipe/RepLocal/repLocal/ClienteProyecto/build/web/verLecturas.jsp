<%-- 
    Document   : verLecturas
    Created on : 04-07-2016, 20:36:55
    Author     : Felipe
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="capaNegocio.Contacto"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "i"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style = "background-color:burlywood;">
        <jsp:include page = "menu.jsp"/>
        <div class = "container">
            <div class = "jumbotron" style = "background-color:bisque;">
                <div class = "row">
                    <center>
                        <h2>
                            <b><font face = "Calibri light" size = "10" color = "burlywood">Ver Lecturas de Actividad/Notificación</font></b>
                        </h2>
                    </center>
                </div>
                <center>
                    <form class = "form-inline" method = "post" action = "VerLecturas" id = "formRegistroTrabajador">
                        <center>
                            <div class = "row">
                                <div class = "col-sm-12">
                                    <div class = "form-group">
                                        <label for = "uid_Act"><font face = "Calibri light" size = "4" color = "burlywood">ID:</font></label>
                                        <input type = "text" placeholder = "uid actividad" class = "form-control" id = "uid_Act" name = "uid_Act"/>
                                        <button type = "submit" value = "actividad" name = "btn_accion" class = "btn btn-danger btn-sm"><font color = "burlywood">Buscar</font></button>
                                    </div>
                                </div>
                            </div>
                        </center>
                    </form>
                </center>
                <h2></h2>
                <center>
                    <form class = "form-inline" method = "post" action = "VerLecturas" id = "formRegistroTrabajador">
                        <center>
                            <div class = "row">
                                <div class = "col-sm-12">
                                    <div class = "form-group">
                                        <label for = "uid_Noti"><font face = "Calibri light" size = "4" color = "burlywood">ID:</font></label>
                                        <input type = "text" placeholder = "uid notificación" class = "form-control" id = "uid_Noti" name = "uid_Noti"/>
                                        <button type = "submit" value = "notificacion" name = "btn_accion" class = "btn btn-danger btn-sm"><font color = "burlywood">Buscar</font></button>
                                    </div>
                                </div>
                            </div>
                        </center>
                    </form>
                </center>
                <h2></h2>
                <center>
                    <table class = "table table-bordered table-striped table-hover">
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
                            <i:forEach items = "${listaContacto}" var = "contacto">
                                <tr>
                                    <td><center><img src = "${contacto.imagen_Cont}" width = "50" length = "50"/></center></td>
                                    <td>${contacto.nombre_Cont}</td><!--button><a href = "EditarContacto">Editar Contacto</a></button--> 
                                    <td>${contacto.apellido_Cont}</td>
                                    <td>${contacto.mail_Cont}</td>
                                    <td>${contacto.telefono_Cont}</td>
                                    <td>${contacto.ciudad_Cont}</td>
                                    <td>${contacto.organizacion_Cont}</td>
                                </tr>
                            </i:forEach>
                        </tbody>
                    </table>
                </center>
            </div>
        </div>
    </body>
</html>
