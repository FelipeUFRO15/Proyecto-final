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

import capaNegocio.Grupo_Contacto;

public class busqueda_Grupos extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{


    private DrawerLayout drawer;
    private CoordinatorLayout contenedor_principal;
    private Button btn_enviar;
    private EditText texto_busqueda;
    private int texto;
    private String respuesta="";
    private Grupo_Contacto grupo=new Grupo_Contacto();
    private TableLayout tablaGrupos;
    private List<Grupo_Contacto> listaGrupos=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda__grupos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.contenedor_principal=(CoordinatorLayout)findViewById(R.id.contenedor_principal);
        this.btn_enviar=(Button)findViewById(R.id.btn_buscar);
        this.texto_busqueda=(EditText)findViewById(R.id.texto_busqueda);
        this.tablaGrupos=(TableLayout) findViewById(R.id.lista_grupos);
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
                busqueda_Grupos.this.texto=Integer.parseInt(busqueda_Grupos.this.texto_busqueda.getText().toString());
                AsyncCallWS task=new AsyncCallWS();

                task.execute();
                if(busqueda_Grupos.this.respuesta!=null) {
                    System.out.println(respuesta);
                    busqueda_Grupos.this.listaGrupos = grupo.transformarJsonToListaContacto(busqueda_Grupos.this.respuesta);
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

        if(id==R.id.action_verNotificaciones){
           
        }
       
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

   

    private void rellenarTabla(){
        tablaGrupos.removeAllViews();
        TableRow tbrow1=new TableRow(busqueda_Grupos.this.tablaGrupos.getContext());
        TableRow.LayoutParams param2=new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,TableRow.LayoutParams.WRAP_CONTENT,1f
        );
        TextView txt3=new TextView(busqueda_Grupos.this.tablaGrupos.getContext());
        txt3.setText("Nombre");
        txt3.setLayoutParams(param2);
        txt3.setGravity(Gravity.CENTER);
        TextView txt4=new TextView(busqueda_Grupos.this.tablaGrupos.getContext());
        txt4.setText("Descripcion");
        txt4.setLayoutParams(param2);
        txt4.setGravity(Gravity.CENTER);
        tbrow1.addView(txt3);
        tbrow1.addView(txt4);
        tablaGrupos.addView(tbrow1);
        for(Grupo_Contacto grupolocal:listaGrupos){
            TableRow tbrow0=new TableRow(busqueda_Grupos.this.tablaGrupos.getContext());
            TextView txt=new TextView(busqueda_Grupos.this.tablaGrupos.getContext());
            txt.setText(grupolocal.getNombre_Grupo());
            txt.setLayoutParams(param2);
            txt.setGravity(Gravity.CENTER);

            TextView txt2=new TextView(busqueda_Grupos.this.tablaGrupos.getContext());
            txt2.setText(grupolocal.getDescripcion_Grupo());
            txt2.setLayoutParams(param2);
            txt2.setGravity(Gravity.CENTER);
            tbrow0.addView(txt);
            tbrow0.addView(txt2);
            tablaGrupos.addView(tbrow0);
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
            busqueda_Grupos.this.respuesta=grupo.gruposDeContactoServicioWeb(texto);
        }
        @Override
        protected void onProgressUpdate(Void... values){

        }
    }
}
