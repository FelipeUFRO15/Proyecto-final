package com.example.adrian.clienteacsoap;

import android.content.Intent;
import android.net.Uri;
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
import android.view.View;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import capaNegocio.Contacto;
import android.view.Menu;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private DrawerLayout drawer;
    private CoordinatorLayout contenedor_principal;
    private Button btn_enviar;
    private EditText texto_busqueda;
    private String texto="";
    private String respuesta="";
    private Contacto contacto=new Contacto();
    private TableLayout tablaContacto;
    private List<Contacto> listaContactos=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.contenedor_principal=(CoordinatorLayout)findViewById(R.id.contenedor_principal);
        this.btn_enviar=(Button)findViewById(R.id.btn_buscar);
        this.texto_busqueda=(EditText)findViewById(R.id.texto_busqueda);
        this.tablaContacto=(TableLayout) findViewById(R.id.tabla_contactos);
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
                Principal.this.texto=Principal.this.texto_busqueda.getText().toString();
                AsyncCallWS task=new AsyncCallWS();

                task.execute();
                if(Principal.this.respuesta!=null) {
                    System.out.println(respuesta);
                    Principal.this.listaContactos = contacto.transformarJsonToListaContacto(Principal.this.respuesta);
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
        if(id==R.id.action_verNotificaciones){
            Toast.makeText(this, "Ver Notificaciones", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,ver_Notificacion.class);

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
        tablaContacto.removeAllViews();
        TableRow tbrow1=new TableRow(Principal.this.tablaContacto.getContext());
        TableRow.LayoutParams param2=new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,TableRow.LayoutParams.WRAP_CONTENT,1f
        );
        TextView txt3=new TextView(Principal.this.tablaContacto.getContext());
        txt3.setText("Nombre");
        txt3.setLayoutParams(param2);
        txt3.setGravity(Gravity.CENTER);
        TextView txt4=new TextView(Principal.this.tablaContacto.getContext());
        txt4.setText("Apellido");
        txt4.setLayoutParams(param2);
        txt4.setGravity(Gravity.CENTER);
        tbrow1.addView(txt3);
        tbrow1.addView(txt4);
        tablaContacto.addView(tbrow1);
        for(Contacto contactolocal:listaContactos){
            TableRow tbrow0=new TableRow(Principal.this.tablaContacto.getContext());
            TextView txt=new TextView(Principal.this.tablaContacto.getContext());
            txt.setText(contactolocal.getNombre_Cont());
            txt.setLayoutParams(param2);
            txt.setGravity(Gravity.CENTER);

            TextView txt2=new TextView(Principal.this.tablaContacto.getContext());
            txt2.setText(contactolocal.getApellido_Cont());
            txt2.setLayoutParams(param2);
            txt2.setGravity(Gravity.CENTER);
            tbrow0.addView(txt);
            tbrow0.addView(txt2);
            tablaContacto.addView(tbrow0);
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
            Principal.this.respuesta=contacto.busquedaSimpleServicioWeb(texto);
        }
        @Override
        protected void onProgressUpdate(Void... values){

        }
    }
}
