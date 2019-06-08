package com.example.cm2019pf.helpers;

import com.example.cm2019pf.model.Hospital;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServiceHospitalApi {

    @GET
    Call<Hospital>getHospitals();


}
