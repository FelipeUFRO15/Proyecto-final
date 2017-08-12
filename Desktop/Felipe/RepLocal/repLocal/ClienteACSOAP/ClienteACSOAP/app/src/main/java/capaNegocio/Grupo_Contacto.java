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
 * Created by Felipe on 04/07/2016.
 */
public class Grupo_Contacto {

    private int uid_Grupo;
    private String nombre_Grupo;
    private String descripcion_Grupo;
    private String fecha_Grupo;
    private String NAMESPACE;
    private String URL;
    private String SOAP_ACTION;
    private String METHOD_NAME;

    public Grupo_Contacto() {
        this.NAMESPACE="http://capaServicio/";
        this.URL="http://172.23.61.121:8080/ServicioProyecto/Servicio?WSDL";
        this.SOAP_ACTION="Servicio";
        this.METHOD_NAME="gruposDeContactoServicioWeb";
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public int getUid_Grupo() {
        return uid_Grupo;
    }

    public void setUid_Grupo(int uid_Grupo) {
        this.uid_Grupo = uid_Grupo;
    }

    public String getNombre_Grupo() {
        return nombre_Grupo;
    }

    public void setNombre_Grupo(String nombre_Grupo) {
        this.nombre_Grupo = nombre_Grupo;
    }

    public String getDescripcion_Grupo() {
        return descripcion_Grupo;
    }

    public void setDescripcion_Grupo(String descripcion_Grupo) {
        this.descripcion_Grupo = descripcion_Grupo;
    }

    public String getFecha_Grupo() {return fecha_Grupo;}

    public void setFecha_Grupo(String fecha_Grupo){this.fecha_Grupo=fecha_Grupo; }

    public String gruposDeContactoServicioWeb(int uid_Cont){
        StrictMode.ThreadPolicy policy = new StrictMode.
                ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        this.METHOD_NAME="gruposDeContactoServicioWeb";
        this.SOAP_ACTION="\""+this.NAMESPACE+this.METHOD_NAME+"\"";

        SoapObject request=new SoapObject(this.NAMESPACE,this.METHOD_NAME);
        PropertyInfo texto=new PropertyInfo();
        texto.setName("uid_Cont");
        texto.setValue(uid_Cont);
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

    public List<Grupo_Contacto> transformarJsonToListaContacto(String textoBusqueda){
        List<Grupo_Contacto> lista=new ArrayList<Grupo_Contacto>();

        if(!textoBusqueda.equals("error")){
            Gson gson=new Gson();
            Grupo_Contacto[] arrayGrupo =gson.fromJson(textoBusqueda, Grupo_Contacto[].class);
            lista= Arrays.asList(arrayGrupo);
        }
        return lista;
    }

}
