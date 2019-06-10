package com.example.cm2019pf.helpers;

import com.example.cm2019pf.model.Hospital;
import com.example.cm2019pf.model.HospitalResult;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IHospitalApi {

    @GET("instituition")
    //Call<Hospital>getHospitals(@Path("Name")String name);
    Call<Hospital>getHospitals();


    @GET("institution")
    Call<HospitalResult> listHospitais();



}
