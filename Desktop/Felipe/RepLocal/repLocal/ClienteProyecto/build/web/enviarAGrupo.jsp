<%-- 
    Document   : enviarAGrupo
    Created on : 04-07-2016, 20:36:18
    Author     : Felipe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enviar a grupo</title>
    </head>
    <body style="background-color:burlywood;">
        <jsp:include page="menu.jsp" />
        <div class = "container">
            <div class = "jumbotron" style = "background-color:bisque;">
                <form class = "form-horizontal" method = "post" action = "EnviarAGrupo" id = "formRegistroTrabajador">
                    <center>
                        <div class = "row">
                            <div class = "col-sm-12">
                                <center>
                                    <h2>
                                        <b><font face = "Calibri light" size = "10" color = "burlywood">Enviar Actividad a Grupo</font></b>
                                    </h2>
                                </center>
                            </div>
                        </div>
                        <div class = "col-sm-8">
                            <div class = "form-group">
                                <label for = "nombre_Act" class = "col-sm-5 control-label"><font face = "Calibri light" size = "4" color = "burlywood">Nombre de la actividad:</font></label>
                                <div class = "col-sm-7">
                                    <input type = "text" name = "nombre_Act" placeholder = "nombre actividad" class = "form-control" id = "nombre_Act"/>
                                </div>
                            </div>
                            <div class = "form-group">
                                <label for = "descripcion_Act" class = "col-sm-5 control-label"><font face = "Calibri light" size = "4" color = "burlywood">Descripción de la actividad:</font></label>
                                <div class = "col-sm-7">
                                    <input type = "text" name = "descripcion_Act" placeholder = "descripción actividad" class = "form-control" id = "descripcion_Act"/>
                                </div>
                            </div>
                            <div class = "form-group">
                                <label for = "uid_Grupo" class = "col-sm-5 control-label"><font face = "Calibri light" size = "4" color = "burlywood">Uid del grupo:</font></label>
                                <div class = "col-sm-7">
                                    <input type = "number" name = "uid_Grupo" placeholder = "uid grupo" class = "form-control" id = "uid_Grupo"/>
                                </div>
                            </div>
                        </div>
                    </center>
                    <div class = "row">
                        <div class = "col-sm-12">
                            <center><button type = "submit" class = "btn btn-danger btn-lg" value = "actividad" name = "btn_accion"><font color = "burlywood">Enviar</button></button></center>
                        </div>
                    </div>
                    <center>
                        <div class = "row">
                            <div class = "col-sm-12">
                                <center>
                                    <h2>
                                        <b><font face = "Calibri light" size = "10" color = "burlywood">Enviar Notificación a Grupo</font></b>
                                    </h2>
                                </center>
                            </div>
                        </div>
                        <div class = "col-sm-8">
                            <div class = "form-group">
                                <label for = "mensaje_Noti" class = "col-sm-5 control-label"><font face = "Calibri light" size = "4" color = "burlywood">Mensaje de la notificación:</font></label>
                                <div class = "col-sm-7">
                                    <input type = "text" name = "mensaje_Noti" placeholder = "mensaje notificación" class = "form-control" id = "mensaje_Noti"/>
                                </div>
                            </div>
                            <div class = "form-group">
                                <label for = "uid_Grupoo" class = "col-sm-5 control-label"><font face = "Calibri light" size = "4" color = "burlywood">Uid del grupo:</font></label>
                                <div class = "col-sm-7">
                                    <input type = "number" name = "uid_Grupoo" placeholder = "uid grupo" class = "form-control" id = "uid_Grupoo"/>
                                </div>
                            </div>
                        </div>
                    </center>
                        <div class = "row">
                            <div class = "col-sm-12">
                                <center><button type = "submit" class = "btn btn-danger btn-lg" value = "notificación" name = "btn_accion"><font color = "burlywood">Enviar</font></button></center>
                            </div>
                        </div>
                </form>
            </div>
        </div>
        <h1 class = "text-center" class = "letra"><font color = "firebrick">${resultado}</font></h1>
    </body>
</html>
