package com.example.nacheen.appmoviles;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.content.res.Configuration;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class Main extends Activity {
    private String[] titulos;
    private DrawerLayout NavDrawerLayout;
    private ListView NavList;
    private ArrayList<item_objct> NavItems;
    private TypedArray NavIcons;
    NavigationAdapter NavAdapter;
    private ActionBarDrawerToggle mDrawerToggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("AppMoviles","OnCreate() iniciado");

        NavDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavList = (ListView) findViewById(R.id.lista);
        View header = getLayoutInflater().inflate(R.layout.header_menu,null);
        NavList.addHeaderView(header);
        NavIcons = getResources().obtainTypedArray(R.array.nav_iconos);
        titulos = getResources().getStringArray(R.array.nav_opciones);
        NavItems = new ArrayList<item_objct>();
        NavItems.add(new item_objct(titulos[0], NavIcons.getResourceId(0,-1)));
        NavItems.add(new item_objct(titulos[1], NavIcons.getResourceId(1,-1)));
        NavItems.add(new item_objct(titulos[2], NavIcons.getResourceId(2,-1)));
        NavItems.add(new item_objct(titulos[3], NavIcons.getResourceId(3,-1)));
        NavItems.add(new item_objct(titulos[4], NavIcons.getResourceId(4,-1)));

        NavAdapter= new NavigationAdapter(this, NavItems);
        NavList.setAdapter(NavAdapter);

        //Declaracion del boton y las imagenes a utilizar
        mDrawerToggle = new ActionBarDrawerToggle(
                this, /*host activiry*/
                NavDrawerLayout, /*DrawerLayer objeto*/
                R.drawable.ic_drawer,
                R.string.app_name, /*"open drawer" description*/
                R.string.hello_world /*"close drawer" description*/
        ){
            public void onDrawerClosed(View view){
                Log.e("Cerrado completo","!!");
            }

            public void onDrawerOpened(View view){
                Log.e("Apertura completa","!!");
            }
        };

        //Declaramos que el mDrawable declarado anteriormente sea el DrawerListener
        NavDrawerLayout.setDrawerListener(mDrawerToggle);
        //Establecemos que el ActionBar muestre el boton home
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);


    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // call ActionBarDrawerToggle.onOptionsItemSelected(), if it returns true
        // then it has handled the app icon touch event
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("AppMoviles","OnStart() iniciado");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("AppMoviles","OnRestart() iniciado");
    }

    @Override
    protected void onResume() {

        super.onResume();
        Log.d("AppMoviles","OnResume() iniciado");
    }

    @Override
    protected void onPause() {

        super.onPause();
        Log.d("AppMoviles","OnPause() iniciado");
    }

    @Override
    protected void onStop() {

        super.onStop();
        Log.d("AppMoviles","OnStop() iniciado");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("AppMoviles","OnDestroy() iniciado");
    }

    /*public void accionBoton(View v){
        Log.d("AppMoviles","El boton fue clickeado");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/
}
