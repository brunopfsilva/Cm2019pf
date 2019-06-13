package com.example.cm2019pf.controller;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.util.Log;

import com.example.cm2019pf.helpers.Common;
import com.example.cm2019pf.helpers.IHospitalApi;
import com.example.cm2019pf.model.Hospital;
import com.example.cm2019pf.model.HospitalResult;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class getdataApiController {



    private static List<Hospital> hospitalResultList;
    private static HospitalAdapter hospitalAdapter;


    public static void get_data_from_server() {

         AsyncTask<Void,Void,Void> task = new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {

                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(Common.URL_HOSPITAL_PRINCIPAL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                IHospitalApi hospitalApi = retrofit.create(IHospitalApi.class);
                Call<HospitalResult> requesthospitals =  hospitalApi.listHospitais();

                requesthospitals.enqueue(new Callback<HospitalResult>() {
                    @Override
                    public void onResponse(Call<HospitalResult> call, Response<HospitalResult> response) {
                        if(!response.isSuccessful()){
                            Log.e("erro",""+response.code());
                        }else{
                            //pega a lista de hospital vindo da url
                            HospitalResult hospitals = response.body();
                            try{
                                for(Hospital h: hospitals.getResult()){
                                    Log.i("Hospital "+" Nome "+h.getName(),"Distro "+h.getDistrict());



                                    Hospital hospitaldatamodel = new Hospital(

                                            h.getId(),
                                            h.getName(),
                                            h.getDescription(),
                                            h.getLongitude(),
                                            h.getLatitude(),
                                            h.getAddress(),
                                            h.getPhone(),
                                            h.getEmail(),
                                            h.getDistrict(),
                                            h.getStandbyTimesUrl(),
                                            h.getShareStandbyTimes(),
                                            h.getHasCTH(),
                                            h.getHasSIGLIC(),
                                            h.getHasEmergency(),
                                            h.getInstitutionURL(),
                                            h.getPilot()



                                    );
                                    //adiciona hospitais no array
                                    hospitalResultList.add(hospitaldatamodel);

                                }



                            }catch (Exception ex){

                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<HospitalResult> call, Throwable t) {
                        Log.e("erro",""+t.getMessage());
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
