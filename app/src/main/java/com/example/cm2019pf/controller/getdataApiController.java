package com.example.cm2019pf.controller;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.util.Log;

import com.example.cm2019pf.helpers.Common;
import com.example.cm2019pf.helpers.IHospitalApi;
import com.example.cm2019pf.model.Hospital;
import com.example.cm2019pf.model.HospitalResult;
import com.example.cm2019pf.model.hospitalType;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class getdataApiController {



    private static List<hospitalType> hospitalResultList;
    private static HospitalAdapter hospitalAdapter;


    public static void get_data_from_server(final String id) {

         AsyncTask<Void,Void,Void> task = new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {

                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(Common.URL_API_LISTA_INSTITUICAO_TEMPO_ESPERA)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                IHospitalApi hospitalApi = retrofit.create(IHospitalApi.class);




                return null;

            }

            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);
                hospitalAdapter.notifyDataSetChanged();
            }
        };

        task.execute();

    }


}
