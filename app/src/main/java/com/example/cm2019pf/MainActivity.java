package com.example.cm2019pf;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cm2019pf.helpers.IHospitalApi;
import com.example.cm2019pf.model.Hospital;
import com.example.cm2019pf.model.HospitalResult;
import com.example.cm2019pf.view.MapsActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(it);
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);


 /*

                IHospitalApi hospitalinfo = IHospitalApi.retrofit.create(IHospitalApi.class);

                Call<HospitalResult> call = hospitalinfo.listHospitais();

                call.enqueue(new Callback<HospitalResult>() {
                    @Override
                    public void onResponse(Call<HospitalResult> call, Response<HospitalResult> response) {
                        int code = response.code();
                        Toast.makeText(MainActivity.this, ""+code, Toast.LENGTH_SHORT).show();
                        if (code == 200) {

                            Toast.makeText(MainActivity.this, " Ok " , Toast.LENGTH_SHORT).show();

                            HospitalResult hospital = response.body();

                            System.out.println(" hospital "+hospital.getResult());

//                            txt.setText( hospital.toString() );
                        }
                    }

                    @Override
                    public void onFailure(Call<HospitalResult> call, Throwable t) {
                        Toast.makeText(MainActivity.this, " "+t, Toast.LENGTH_SHORT).show();

                    }
                });


                try {
                    Hospital hospital = call.execute().body();
                    Toast.makeText(MainActivity.this, " "+hospital.getName(), Toast.LENGTH_SHORT).show();
                }
                catch (Exception ex){
                    Toast.makeText(MainActivity.this, " "+ex, Toast.LENGTH_SHORT).show();
                }

                */
            }




    private void initiViews(){



    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
