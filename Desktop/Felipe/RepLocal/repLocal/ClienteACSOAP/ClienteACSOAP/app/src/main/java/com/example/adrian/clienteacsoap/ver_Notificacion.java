package com.example.adrian.clienteacsoap;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import capaNegocio.Notificacion;

public class ver_Notificacion extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{


    private DrawerLayout drawer;
    private CoordinatorLayout contenedor_principal;
    private Button btn_enviar;
    private EditText texto_busqueda;
    private int texto;
    private String respuesta="";
    private Notificacion notificacion=new Notificacion();
    private TableLayout tablaNotificaciones;
    private List<Notificacion> listaNotificaciones=new ArrayList<Notificacion>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver__notificacion);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.contenedor_principal=(CoordinatorLayout)findViewById(R.id.contenedor_principal);
        this.btn_enviar=(Button)findViewById(R.id.btn_buscar);
        this.texto_busqueda=(EditText)findViewById(R.id.texto_busqueda);
        this.tablaNotificaciones=(TableLayout) findViewById(R.id.lista_notificaciones);
        drawer=(DrawerLayout)findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        //drawer.setDrawerListener(toggle);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        this.btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ver_Notificacion.this.texto=Integer.parseInt(ver_Notificacion.this.texto_busqueda.getText().toString());
                AsyncCallWS task=new AsyncCallWS();

                task.execute();
                if(ver_Notificacion.this.respuesta!=null) {
                    System.out.println(respuesta);
                    ver_Notificacion.this.listaNotificaciones = notificacion.transformarJsonToListaNotificacion(ver_Notificacion.this.respuesta);
                    rellenarTabla();
                }
            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            Toast.makeText(this, "Busqueda simple", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,Principal.class);

            startActivity(intent);
            return true;
        }
        if(id==R.id.action_buscarGrupos){
            Toast.makeText(this, "Busqueda grupo", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,busqueda_Grupos.class);

            startActivity(intent);
            return true;
        }

        if(id==R.id.action_verActividades){
            Toast.makeText(this, "Ver Actividades", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,ver_Actividad.class);

            startActivity(intent);
            return true;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.opciones_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            Toast.makeText(this, "Busqueda simple", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,Principal.class);

            startActivity(intent);
            return true;
        }
        if(id==R.id.action_buscarGrupos){
            Toast.makeText(this, "Busqueda grupo", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,busqueda_Grupos.class);

            startActivity(intent);
            return true;
        }

        if(id==R.id.action_verActividades){
            Toast.makeText(this, "Ver Actividades", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,ver_Actividad.class);

            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void rellenarTabla(){
        tablaNotificaciones.removeAllViews();
        TableRow tbrow1=new TableRow(ver_Notificacion.this.tablaNotificaciones.getContext());
        TableRow.LayoutParams param2=new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,TableRow.LayoutParams.WRAP_CONTENT,1f
        );
        TextView txt3=new TextView(ver_Notificacion.this.tablaNotificaciones.getContext());
        txt3.setText("Mensaje");
        txt3.setLayoutParams(param2);
        txt3.setGravity(Gravity.CENTER);
        TextView txt4=new TextView(ver_Notificacion.this.tablaNotificaciones.getContext());
        txt4.setText("Uid Grupo");
        txt4.setLayoutParams(param2);
        txt4.setGravity(Gravity.CENTER);
        tbrow1.addView(txt3);
        tbrow1.addView(txt4);
        tablaNotificaciones.addView(tbrow1);
        for(Notificacion notificacionlocal:listaNotificaciones){
            TableRow tbrow0=new TableRow(ver_Notificacion.this.tablaNotificaciones.getContext());
            TextView txt=new TextView(ver_Notificacion.this.tablaNotificaciones.getContext());
            txt.setText(notificacionlocal.getMensaje_Noti());
            txt.setLayoutParams(param2);
            txt.setGravity(Gravity.CENTER);

            TextView txt2=new TextView(ver_Notificacion.this.tablaNotificaciones.getContext());
            txt2.setText(notificacionlocal.getUid_Noti());
            txt2.setLayoutParams(param2);
            txt2.setGravity(Gravity.CENTER);
            tbrow0.addView(txt);
            tbrow0.addView(txt2);
            tablaNotificaciones.addView(tbrow0);
        }
    }

    private class AsyncCallWS extends AsyncTask<String, Void,Void> {

        @Override
        protected Void doInBackground(String... params){

            return null;
        }

        @Override
        protected void onPostExecute(Void result){

        }

        @Override
        protected void onPreExecute(){
            ver_Notificacion.this.respuesta=notificacion.buscarNotificacionesServicioWeb(texto);
        }
        @Override
        protected void onProgressUpdate(Void... values){

        }
    }
}
