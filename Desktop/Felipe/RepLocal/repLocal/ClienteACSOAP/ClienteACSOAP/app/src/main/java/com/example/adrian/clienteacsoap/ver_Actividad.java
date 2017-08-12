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

import capaNegocio.Actividad;

public class ver_Actividad extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{


    private DrawerLayout drawer;
    private CoordinatorLayout contenedor_principal;
    private Button btn_enviar;
    private EditText texto_busqueda;
    private int texto;
    private String respuesta="";
    private Actividad actividad=new Actividad();
    private TableLayout tablaActividades;
    private List<Actividad> listaActividades=new ArrayList<Actividad>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver__actividad);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.contenedor_principal=(CoordinatorLayout)findViewById(R.id.contenedor_principal);
        this.btn_enviar=(Button)findViewById(R.id.btn_buscar);
        this.texto_busqueda=(EditText)findViewById(R.id.texto_busqueda);
        this.tablaActividades=(TableLayout) findViewById(R.id.lista_actividades);
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
                ver_Actividad.this.texto=Integer.parseInt(ver_Actividad.this.texto_busqueda.getText().toString());
                AsyncCallWS task=new AsyncCallWS();

                task.execute();
                if(ver_Actividad.this.respuesta!=null) {
                    System.out.println(respuesta);
                    ver_Actividad.this.listaActividades = actividad.transformarJsonToListaArrayActividad(ver_Actividad.this.respuesta);
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
        if(id==R.id.action_verNotificaciones){
            Toast.makeText(this, "Ver Notificaciones", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,ver_Notificacion.class);

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
        if(id==R.id.action_verNotificaciones){
            Toast.makeText(this, "Ver Notificaciones", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,ver_Notificacion.class);

            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private void rellenarTabla(){
        tablaActividades.removeAllViews();
        TableRow tbrow1=new TableRow(ver_Actividad.this.tablaActividades.getContext());
        TableRow.LayoutParams param2=new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,TableRow.LayoutParams.WRAP_CONTENT,1f
        );
        TextView txt3=new TextView(ver_Actividad.this.tablaActividades.getContext());
        txt3.setText("Nombre");
        txt3.setLayoutParams(param2);
        txt3.setGravity(Gravity.CENTER);
        TextView txt4=new TextView(ver_Actividad.this.tablaActividades.getContext());
        txt4.setText("Descripcion");
        txt4.setLayoutParams(param2);
        txt4.setGravity(Gravity.CENTER);
        tbrow1.addView(txt3);
        tbrow1.addView(txt4);
        tablaActividades.addView(tbrow1);
        for(Actividad actividadlocal:listaActividades){
            TableRow tbrow0=new TableRow(ver_Actividad.this.tablaActividades.getContext());
            TextView txt=new TextView(ver_Actividad.this.tablaActividades.getContext());
            txt.setText(actividadlocal.getNombre_Act());
            txt.setLayoutParams(param2);
            txt.setGravity(Gravity.CENTER);

            TextView txt2=new TextView(ver_Actividad.this.tablaActividades.getContext());
            txt2.setText(actividadlocal.getDescripcion_Act());
            txt2.setLayoutParams(param2);
            txt2.setGravity(Gravity.CENTER);
            tbrow0.addView(txt);
            tbrow0.addView(txt2);
            tablaActividades.addView(tbrow0);
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
            ver_Actividad.this.respuesta=actividad.buscarActividadesServicioWeb(texto);
        }
        @Override
        protected void onProgressUpdate(Void... values){

        }
    }

}
