<%-- 
    Document   : agregarGrupoContacto
    Created on : 23-06-2016, 10:31:47
    Author     : Felipe
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
            <title>Agregar Grupo Contacto</title>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    </head>
    <body style="background-color:burlywood;">
        <jsp:include page="menu.jsp" />
        <div class = "container">
            <div class = "jumbotron" style = "background-color:bisque;">
                <form class = "form-horizontal" method = "post" action = "AgregarGrupoContacto" id = "formRegistroTrabajador">
                    <center>
                        <div class = "row">
                            <div class = "col-sm-12">
                                <center>
                                    <h2>
                                        <b><font face = "Calibri light" size = "10" color = "burlywood">Agregar Grupo Contacto</font></b>
                                    </h2>
                                </center>
                            </div>
                        </div>
                        <div class = "col-sm-8">
                            <div class = "form-group">
                                <label for = "nombre_Grupo" class = "col-sm-5 control-label"><font face = "Calibri light" size = "4" color = "burlywood">Nombre del grupo:</font></label>
                                <div class = "col-sm-7">
                                    <input type = "text" class = "form-control" id = "nombre_Grupo" placeholder = "nombre grupo contacto" name = "nombre_Grupo" required>
                                </div>
                            </div>
                            <div class = "form-group">
                                <label for = "descripcion_Grupo" class = "col-sm-5 control-label"><font face = "Calibri light" size = "4" color = "burlywood">Descripción del grupo:</font></label>
                                <div class = "col-sm-7">
                                    <input type = "text" class = "form-control" id = "descripcion_Grupo" placeholder = "descripción grupo contacto" name = "descripcion_Grupo"/>
                                </div>
                            </div>
                        </div>
                    </center>
                    <div class = "row">
                        <div class = "col-sm-12">
                            <center><button type = "submit" class = "btn btn-danger btn-lg"><font color = "burlywood">Agregar</font></button></center>
                        </div>
                    </div>
                </form>
            </div>
        </div>
        <h1 class = "text-center" class = "letra"><font color = "firebrick">${resultado}</font></h1>
    </body>
</html>
