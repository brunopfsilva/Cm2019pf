package com.example.cm2019pf.controller;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import com.example.cm2019pf.helpers.Common;
import com.example.cm2019pf.helpers.IHospitalApi;
import com.example.cm2019pf.model.hospitalTimes;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class getdataApiController {



    private static List<hospitalTimes> hospitalResultList;
    private static HospitalAdapter hospitalAdapter;


    public static void get_data_from_server_urgency(final String id) {

         AsyncTask<Void,Void,Void> task = new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {

                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(Common.URL_API_LISTA_INSTITUICAO_TEMPO_ESPERA)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                IHospitalApi hospitalApi = retrofit.create(IHospitalApi.class);
                Call<hospitalTimes> requesthospitaltypeandtimes = hospitalApi.getHospitalstype(id);

                requesthospitaltypeandtimes.enqueue(new Callback<hospitalTimes>() {
                    @Override
                    public void onResponse(Call<hospitalTimes> call, Response<hospitalTimes> response) {
                        if (!response.isSuccessful()){
                            Log.e("error",response.toString());
                        }else{
                            hospitalTimes gethospitalTimes = response.body();

                            Log.i("gethospitalTimes","gethospitalTimes "+gethospitalTimes.toString());
                        }
                    }

                    @Override
                    public void onFailure(Call<hospitalTimes> call, Throwable t) {

                    }
                });





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
