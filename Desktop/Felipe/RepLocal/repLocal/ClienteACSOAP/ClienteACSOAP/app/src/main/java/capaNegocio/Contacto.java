package capaNegocio;

/**
 * Created by altair141 on 19-05-2016.
 */


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


public class Contacto {

    private int uid_Cont;
    private String nombre_Cont;
    private String apellido_Cont;
    private String mail_Cont;
    private String telefono_Cont;
    private String NAMESPACE;
    private String URL;
    private String SOAP_ACTION;
    private String METHOD_NAME;

    public Contacto() {
        this.NAMESPACE="http://capaServicio/";
        this.URL="http://192.168.0.8:8080/ServicioProyecto/Servicio?WSDL";
        this.SOAP_ACTION="Servicio";
        this.METHOD_NAME="busquedaSimple";
    }

    public int getUid_Cont() {
        return uid_Cont;
    }

    public void setUid_Cont(int uid_Cont) {
        this.uid_Cont = uid_Cont;
    }

    public String getNombre_Cont() {
        return nombre_Cont;
    }

    public void setNombre_Cont(String nombre_Cont) {
        this.nombre_Cont = nombre_Cont;
    }

    public String getApellido_Cont() {
        return apellido_Cont;
    }

    public void setApellido_Cont(String apellido_Cont) {
        this.apellido_Cont = apellido_Cont;
    }

    public String getMail_Cont() {
        return mail_Cont;
    }

    public void setMail_Cont(String mail_Cont) {
        this.mail_Cont = mail_Cont;
    }

    public String getTelefono_Cont() {
        return telefono_Cont;
    }

    public void setTelefono_Cont(String telefono_Cont) {
        this.telefono_Cont = telefono_Cont;
    }

    public String busquedaSimpleServicioWeb(String textoBusqueda){
        StrictMode.ThreadPolicy policy = new StrictMode.
                ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        this.METHOD_NAME="busquedaSimpleContactoServicioWeb";
        this.SOAP_ACTION="\""+this.NAMESPACE+this.METHOD_NAME+"\"";

        SoapObject request=new SoapObject(this.NAMESPACE,this.METHOD_NAME);
        PropertyInfo texto=new PropertyInfo();
        texto.setName("textoBusqueda");
        texto.setValue(textoBusqueda);
        texto.setType(String.class);
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



    public List<Contacto> transformarJsonToListaContacto(String textoBusqueda){
        List<Contacto> lista=new ArrayList<Contacto>();

        if(!textoBusqueda.equals("error")){
            Gson gson=new Gson();
            Contacto[] arrayContacto =gson.fromJson(textoBusqueda,Contacto[].class);
            lista= Arrays.asList(arrayContacto);
        }
        return lista;
    }
}
