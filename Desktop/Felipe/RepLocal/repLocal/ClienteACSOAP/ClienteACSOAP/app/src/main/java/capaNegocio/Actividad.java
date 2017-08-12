package capaNegocio;

import android.os.StrictMode;

import com.google.gson.Gson;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Felipe on 05/07/2016.
 */
public class Actividad {

    private int uid_Act;
    private String nombre_Act;
    private String descripcion_Act;
    private String fecha_Act;
    private String NAMESPACE;
    private String URL;
    private String SOAP_ACTION;
    private String METHOD_NAME;

    public Actividad() {
        this.NAMESPACE="http://capaServicio/";
        this.URL="http://172.23.61.121:8080/ServicioProyecto/Servicio?WSDL";
        this.SOAP_ACTION="Servicio";
        this.METHOD_NAME="buscarActividadesServicioWeb";
    }

    public int getUid_Act() {
        return uid_Act;
    }

    public void setUid_Act(int uid_Act) {
        this.uid_Act = uid_Act;
    }

    public String getNombre_Act() {
        return nombre_Act;
    }

    public void setNombre_Act(String nombre_Act) {
        this.nombre_Act = nombre_Act;
    }

    public String getDescripcion_Act() {
        return descripcion_Act;
    }

    public void setDescripcion_Act(String descripcion_Act) {
        this.descripcion_Act = descripcion_Act;
    }


    public String buscarActividadesServicioWeb(int  uid_Grupo){
        StrictMode.ThreadPolicy policy = new StrictMode.
                ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        this.METHOD_NAME="buscarActividadesServicioWeb";
        this.SOAP_ACTION="\""+this.NAMESPACE+this.METHOD_NAME+"\"";

        SoapObject request=new SoapObject(this.NAMESPACE,this.METHOD_NAME);
        PropertyInfo texto=new PropertyInfo();
        texto.setName("uid_Grupo");
        texto.setValue(uid_Grupo);
        texto.setType(int.class);
        request.addProperty(texto);
        SoapSerializationEnvelope envelope=new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(request);
        HttpTransportSE androidHttpTransport=new HttpTransportSE(this.URL);
        try{
            androidHttpTransport.call(this.SOAP_ACTION,envelope);
            SoapPrimitive response=(SoapPrimitive)envelope.getResponse();
            return response.toString();
        }catch(Exception e){
            e.printStackTrace();
        }

        return "error";
    }

    public List<Actividad> transformarJsonToListaArrayActividad(String textoBusqueda){
        List<Actividad> lista=new ArrayList<Actividad>();

        if(!textoBusqueda.equals("error")){
            Gson gson=new Gson();
            Actividad[] arrayActividad =gson.fromJson(textoBusqueda,Actividad[].class);
            lista= Arrays.asList(arrayActividad);
        }
        return lista;
    }


}
