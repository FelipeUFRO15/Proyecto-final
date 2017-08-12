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
 * Created by Marcos on 05/07/2016.
 */
public class Notificacion {

    private int uid_Noti;
    private String mensaje_Noti;
    private String NAMESPACE;
    private String URL;
    private String SOAP_ACTION;
    private String METHOD_NAME;

    public Notificacion() {
        this.NAMESPACE="http://capaServicio/";
        this.URL="http://172.23.61.121:8080/ServicioProyecto/Servicio?WSDL";
        this.SOAP_ACTION="Servicio";
        this.METHOD_NAME="buscarNotificacionesServicioWeb";
    }

    public int getUid_Noti() {
        return uid_Noti;
    }

    public void setUid_Noti(int uid_Noti) {
        this.uid_Noti = uid_Noti;
    }

    public String getMensaje_Noti() {
        return mensaje_Noti;
    }

    public void setMensaje_Noti(String mensaje_Noti) {
        this.mensaje_Noti = mensaje_Noti;
    }


    public String buscarNotificacionesServicioWeb(int  uid_Grupo){
        StrictMode.ThreadPolicy policy = new StrictMode.
                ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        this.METHOD_NAME="buscarNotificacionesServicioWeb";
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

    public List<Notificacion> transformarJsonToListaNotificacion(String textoBusqueda){
        List<Notificacion> lista=new ArrayList<Notificacion>();

        if(!textoBusqueda.equals("error")){
            Gson gson=new Gson();
            Notificacion[] arrayNotificacion =gson.fromJson(textoBusqueda,Notificacion[].class);
            lista= Arrays.asList(arrayNotificacion);
        }
        return lista;
    }
}
