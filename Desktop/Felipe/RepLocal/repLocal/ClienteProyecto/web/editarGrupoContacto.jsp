<%-- 
    Document   : editarGrupoContacto
    Created on : 23-06-2016, 11:15:19
    Author     : Felipe
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
            <title>Editar Grupo Contacto</title>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    </head>
    <body style="background-color:burlywood;">
        <jsp:include page="menu.jsp" />
        <div class = "container">
            <div class = "jumbotron" style = "background-color:bisque;">
                <form class = "form-horizontal" method = "post" action = "EditarGrupoContacto" id = "formRegistroTrabajador">
                    <center>
                        <div class = "row">
                            <div class = "col-sm-12">
                                <center>
                                    <h2>
                                        <b><font face = "Calibri light" size = "10" color = "burlywood">Editar Grupo Contacto</font></b>
                                    </h2>
                                </center>
                            </div>
                        </div>
                        <div class = "col-sm-8">
                            <div class = "form-group">
                                <label for = "uid_Grupo" class = "col-sm-5 control-label"><font face = "Calibri light" size = "4" color = "burlywood">Uid del grupo:</font></label>
                                <div class = "col-sm-7">
                                    <input type = "number" name ="uid_Grupo" placeholder = "uid grupo" class = "form-control" id = "uid_Grupo" required>
                                </div>
                            </div>
                            <div class = "form-group">
                                <label for = "nombre_Grupo" class = "col-sm-5 control-label"><font face = "Calibri light" size = "4" color = "burlywood">Nombre del grupo:</font></label>
                                <div class =  "col-sm-7">
                                    <input type = "text" placeholder = "nombre grupo" class = "form-control" id = "nombre_Grupo" name = "nombre_Grupo"/>
                                </div>
                            </div>
                            <div class = "form-group">
                                <label for = "descripcion_Grupo" class = "col-sm-5 control-label"><font face = "Calibri light" size = "4" color = "burlywood">Descripci�n del grupo:</font></label>
                                <div class =  "col-sm-7">
                                    <input type = "text" class = "form-control" id = "descripcion_Grupo" placeholder = "descripci�n grupo" name = "descripcion_Grupo"/>
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
