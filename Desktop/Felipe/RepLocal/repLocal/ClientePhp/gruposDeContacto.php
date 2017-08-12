<html>
    <head>
        <meta charset="UTF-8">
        <title>Buscar grupos de un contacto</title>
    </head>
    <body style = "background-color:cadetblue;">
        <?php include 'menu.php' ?>
        <div class = "container">
            <div class = "jumbotron">
                <center>
                    <form method = "post" action = "gruposDeContacto.php"/>
                        <div class = "row">
                            <div class = "col-sm-12">
                                <center>
                                    <h2>
                                        <b><font face = "Calibri light" size = "10" color = "cadetblue">Grupos de Contacto</font></b>
                                    </h2>
                                </center>
                            </div>
                        </div>
                        <div class = "col-sm-8">
                            <div class = "form-group">
                                <label for = "uid contacto" class = "col-sm-5 control-label"><font face = "Calibri light" size = "4" color = "cadetblue">Uid contacto:</font></label>
                                <div class = "col-sm-7">
                                    <input type = "text" name = "entrada"  placeholder = "uid contacto" class = "form-control"/>
                                </div>
                            </div>
                        </div>
                        <div class = "row">
                            <div class = "col-sm-12">
                                <center><button type = "submit" value = "simple" name = "boton" class = "btn btn-info btn-lg">Buscar</button></center>
                            </div>
                        </div>
                    </form>
                </center>
                <table class = "table table-bordered table-striped table-hover">
                    <thead>
                    <th><font color = "cadetblue">Nombre</font></th>
                    <th><font color = "cadetblue">Descripción</font></th>
                    <th><font color = "cadetblue">Fecha de Creacion</font></th>
                    </thead>
                    <tbody>
                        <?php
                        error_reporting(0);
                            try {
                                if ($_POST['contacto'] != null){
                                    try {
                                        $wsdl_url = 'http://localhost:8080/ServicioProyecto/Servicio?WSDL';
                                        $client = new SOAPClient($wsdl_url);
                                        $params = array(
                                            'uid_Cont' => $_POST['contacto'],
                                        );
                                        $return = $client->gruposDeContactoServicioWeb($params);
                                        $obj = json_decode($return -> return);
                                        for ($index = 0; $index < count($obj); $index++){
                                            echo "<tr>";
                                            echo '<td><font color = "cadetblue">'. $obj[$index]->{'nombre_Grupo'}. "</font></td>";
                                            echo '<td><font color = "cadetblue">'. $obj[$index]->{'descripcion_Grupo'}. "</font></td>";
                                            echo '<td><font color = "cadetblue">'. $obj[$index]->{'fecha_Grupo'}. "</font></td>"; 
                                            echo "</tr>";
                                        }
                                    }catch (Exception $e) {
                                        echo "Exception occured: " . $e;
                                    }
                                }else {
                                    $wsdl_url = 'http://localhost:8080/ServicioProyecto/Servicio?WSDL';
                                    $client = new SOAPClient($wsdl_url);
                                    $params = array(
                                        'uid_Cont' => $_POST['entrada'],
                                    );
                                    $return = $client->gruposDeContactoServicioWeb($params);
                                    $obj = json_decode($return -> return);
                                    for ($index = 0; $index < count($obj); $index++){
                                        echo "<tr>";
                                        echo '<td><font color = "cadetblue">'. $obj[$index]->{'nombre_Grupo'}. "</font></td>";
                                        echo '<td><font color = "cadetblue">'. $obj[$index]->{'descripcion_Grupo'}. "</font></td>";
                                        echo '<td><font color = "cadetblue">'. $obj[$index]->{'fecha_Grupo'}. "</font></td>"; 
                                        echo "</tr>";
                                    }
                                }
                            }catch (Exception $e) {
                                echo "Exception occured: " . $e;
                            }
                        ?>
                        <?php
                        error_reporting(0);
                            
                        ?>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
