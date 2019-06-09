package com.example.cm2019pf.helpers;

import com.example.cm2019pf.model.Hospital;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IHospitalApi {

    @GET("instituition")
    //Call<Hospital>getHospitals(@Path("Name")String name);
    Call<Hospital>getHospitals();





    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(Common.URL_HOSPITAL_PRINCIPAL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();


}
