<html>
    <head>
        <meta charset="UTF-8">
        <title>Buscar Actividades</title>
    </head>
    <body style="background-color:cadetblue;">
        <?php include 'menu.php' ?>
        <div class = "container">
            <div class = "jumbotron">
                <center>
                    <form method = "post" action = "buscarActividades.php"/>
                        <div class = "row">
                            <div class = "col-sm-12">
                                <center>
                                    <h2>
                                        <b><font face = "Calibri light" size = "10" color = "cadetblue">Actividades de Grupo</font></b>
                                    </h2>
                                </center>
                            </div>
                        </div>
                        <div class = "col-sm-8">
                            <div class = "form-group">
                                <label for = "uid grupo" class = "col-sm-5 control-label"><font face = "Calibri light" size = "4" color = "cadetblue">Uid grupo:</font></label>
                                <div class = "col-sm-7">
                                    <input type = "text" name = "entrada"  placeholder = "uid grupo" class = "form-control"/>
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
                <table class = "table table-striped table-bordered table-hover">
                    <thead>
                    <th><font color = "cadetblue">Nombre</font></th>
                    <th><font color = "cadetblue">Descripción</font></th>
                    <th><font color = "cadetblue">Fecha</font></th>
                    <th><font color = "cadetblue">Leído por:</font></th>
                    </thead>
                    <tbody>
                        <?php
                        error_reporting(0);
                        try {
                            $wsdl_url = 'http://localhost:8080/ServicioProyecto/Servicio?WSDL';
                            $client = new SOAPClient($wsdl_url);
                            $params = array(
                                'uid_Grupo' => $_POST['entrada'],
                            );
                            $return = $client->buscarActividadesServicioWeb($params);
                            $obj = json_decode($return->return);
                            for ($index = 0; $index < count($obj); $index++) {
                                echo "<tr>";
                                echo '<td><font color = "cadetblue">' . $obj[$index]->{'nombre_Act'} . "</font></td>";
                                echo '<td><font color = "cadetblue">' . $obj[$index]->{'descripcion_Act'} . "</font></td>";
                                echo '<td><font color = "cadetblue">' . $obj[$index]->{'fecha_Act'} . "</font></td>";
                                echo "<td>";
                                echo '<form action = "gruposDeContacto.php" method = "post">';
                                echo '<select name = "Contactos">';
                                    $params2 = array(
                                    'uid_Act' => $obj[$index]->{'uid_Act'},
                                    );
                                    $return2 = $client->verLecturasActividadServicioWeb($params2);
                                    $obj2 = json_decode($return2->return);
                                    for ($ind = 0; $ind < count($obj2); $ind++) {
                                        echo '  <option value = "4">'. $obj2[$ind]->{'uid_Cont'}. '.- '. $obj2[$ind]->{'nombre_Cont'}. ' '. $obj2[$ind]->{'apellido_Cont'}. '</option>';
                                    }
                                echo "</select>";
                                echo "</td>";
                                echo "</tr>";
                            }
                        } catch (Exception $e) {
                            //echo "Exception occured: " . $e;
                        }
                        ?>
                    </tbody>
                </table>
            </div>
        </div>
    </form>
</body>
</html>


