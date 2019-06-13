package com.example.cm2019pf.controller;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cm2019pf.R;
import com.example.cm2019pf.view.hospitalDetalheActivity;
import com.example.cm2019pf.view.mapsHospitalsActivity;

import static android.support.v4.content.ContextCompat.startActivity;

public class actionController {

    private Context context;
    hospitalDetalheActivity hospitalDetalheActivity;
    EditText site;

    public void openMap(View view) {



        context.startActivity(new Intent(context, mapsHospitalsActivity.class));

    }


    public void views(){

    }

    public void openSite(View view) {

        site = (EditText)view.findViewById(R.id.hospitalSite);


        Toast.makeText(context, "Ok", Toast.LENGTH_SHORT).show();

    }

}
