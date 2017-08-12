<%-- 
    Document   : editarContacto
    Created on : 23-06-2016, 10:52:52
    Author     : Felipe
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
            <title>Editar Contacto</title>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    </head>
    <body style="background-color:burlywood;">
        <jsp:include page="menu.jsp" />
        <div class = "container">
            <div class = "jumbotron" style = "background-color:bisque;">
                <form class = "form-horizontal" method = "post" action = "EditarContacto" id = "formRegistroTrabajador">
                    <center>
                        <div class = "row">
                            <div class = "col-sm-12">
                                <center>
                                    <h2>
                                        <b><font face = "Calibri light" size = "10" color = "burlywood">Editar Contacto</font></b>
                                    </h2>
                                </center>
                            </div>
                        </div>
                        <div class = "col-sm-8">
                            <div class = "form-group">
                                <label for = "uid_Cont" class = "col-sm-5 control-label"><font face = "Calibri light" size = "4" color = "burlywood">Uid del contacto:</font></label>
                                <div class = "col-sm-7">
                                    <input type = "number" name ="uid_Cont" placeholder = "uid contacto" class = "form-control" id = "uid_Cont" required>
                                </div>
                            </div>
                            <div class = "form-group">
                                <label for = "nombre_Cont" class = "col-sm-5 control-label"><font face = "Calibri light" size = "4" color = "burlywood">Nombre del contacto:</font></label>
                                <div class =  "col-sm-7">
                                    <input type = "text" placeholder = "nombre contacto" class = "form-control" id = "nombre_Cont" name = "nombre_Cont" pattern = "[a-zA-ZáéíóúñÑ]{2,20}"/>
                                </div>
                            </div>
                            <div class = "form-group">
                                <label for = "apellido_Cont" class = "col-sm-5 control-label"><font face = "Calibri light" size = "4" color = "burlywood">Apellido del contacto:</font></label>
                                <div class =  "col-sm-7">
                                    <input type = "text" class = "form-control" id = "apellido_Cont" placeholder = "apellido contacto" name = "apellido_Cont" pattern = "[a-zA-ZáéíóúñÑ]{2,20}"/>
                                </div>
                            </div>
                            <div class = "form-group">
                                <label for = "mail_Cont" class = "col-sm-5 control-label"><font face = "Calibri light" size = "4" color = "burlywood">Mail del contacto:</font></label>
                                <div class =  "col-sm-7">
                                    <input type = "text" class = "form-control" id = "mail_Cont" placeholder = "mail contacto" name = "mail_Cont" pattern = "\w*(\.\w*){0,5}@{1,1}\w*\.{1,1}\w{1,5}"/>
                                </div>
                            </div>
                            <div class = "form-group">
                                <label for = "telefono_Cont" class = "col-sm-5 control-label"><font face = "Calibri light" size = "4" color = "burlywood">Teléfono del contacto:</font></label>
                                <div class =  "col-sm-7">
                                    <input type = "text" class = "form-control" id = "telefono_Cont" placeholder = "teléfono contacto" name = "telefono_Cont" pattern = "\d{6,10}"/>
                                </div>
                            </div>
                            <div class = "form-group">
                                <label for = "ciudad_Cont" class = "col-sm-5 control-label"><font face = "Calibri light" size = "4" color = "burlywood">Ciudad del contacto:</font></label>
                                <div class =  "col-sm-7">
                                    <input type = "text" class = "form-control" id = "ciudad_Cont" placeholder = "ciudad contacto" name = "ciudad_Cont" pattern = "[a-zA-ZáéíóúñÑ]{2,20}"/>
                                </div>
                            </div>
                            <div class = "form-group">
                                <label for = "organizacion_Cont" class = "col-sm-5 control-label"><font face = "Calibri light" size = "4" color = "burlywood">Organizacion del contacto:</font></label>
                                <div class =  "col-sm-7">
                                    <input type = "text" class = "form-control" id = "organizacion_Cont" placeholder = "organizacion contacto" name = "organizacion_Cont"/>
                                </div>
                            </div>
                            <div class = "form-group">
                                <label for = "imagen_Cont" class = "col-sm-5 control-label"><font face = "Calibri light" size = "4" color = "burlywood">Imagen del contacto:</font></label>
                                <div class =  "col-sm-7">
                                    <input type = "text" class = "form-control" id = "imagen_Cont" placeholder = "imagen contacto" name = "imagen_Cont"/>
                                </div>
                            </div>
                        </div>
                    </center>
                        <div class = "row">
                            <div class = "col-sm-12">
                                <center><button type = "submit" class = "btn btn-danger btn-lg"><font color = "burlywood">Editar</font></button></center>
                            </div>
                        </div>
                </form>
            </div>
        </div>
        <h1 class = "text-center" class = "letra"><font color = "firebrick">${resultado}</font></h1>
    </body>
</html>
