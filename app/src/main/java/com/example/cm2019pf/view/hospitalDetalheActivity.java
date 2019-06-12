package com.example.cm2019pf.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.cm2019pf.R;

public class hospitalDetalheActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        initViews();

        Intent intent = getIntent();
        if(intent != null) {
            intent.getExtras();
            String name = intent.getStringExtra("hopitalnome");


            this.setTitle(name);

        }

    }

    public void initViews(){

    }


    public void openMap(View view) {



        startActivity(new Intent(hospitalDetalheActivity.this,mapsHospitalsActivity.class));

    }

}
