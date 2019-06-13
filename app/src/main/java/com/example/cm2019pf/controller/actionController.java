package com.example.cm2019pf.controller;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.example.cm2019pf.view.hospitalDetalheActivity;
import com.example.cm2019pf.view.mapsHospitalsActivity;

import static android.support.v4.content.ContextCompat.startActivity;

public class actionController {

    private Context context;


    public void openMap(View view) {



        context.startActivity(new Intent(context, mapsHospitalsActivity.class));

    }

    public void openSite(View view) {


    }

}
