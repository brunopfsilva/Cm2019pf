package com.example.cm2019pf.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HospitalResultStatus {


    @SerializedName("Result")
    @Expose
    private List<statusHospital> result;

    public List<statusHospital> getResult() {
        return result;
    }

    public void setResult(List<statusHospital> result) {
        this.result = result;
    }
}
