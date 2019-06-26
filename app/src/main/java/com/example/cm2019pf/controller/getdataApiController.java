package com.example.cm2019pf.controller;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import com.example.cm2019pf.helpers.Common;
import com.example.cm2019pf.helpers.IHospitalApi;
import com.example.cm2019pf.model.HospitalResultStatus;
import com.example.cm2019pf.model.hospitalTimes;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class getdataApiController {


    private static Retrofit retrofit;

    public static Retrofit getRetrofitInstance() {
        if(retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(Common.URL_API_LISTA_INSTITUICAO_TEMPO_ESPERA)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }





}
