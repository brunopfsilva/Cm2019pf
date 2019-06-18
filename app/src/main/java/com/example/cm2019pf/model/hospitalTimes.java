package com.example.cm2019pf.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class hospitalTimes {

    @SerializedName("LastUpdate")
    @Expose
    private String LastUpdate;
    @SerializedName("Emergency")
    @Expose
    private String Emergency;

    public String getLastUpdate() {
        return LastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        LastUpdate = lastUpdate;
    }

    public String getEmergency() {
        return Emergency;
    }

    public void setEmergency(String emergency) {
        Emergency = emergency;
    }


    public hospitalTimes(String lastUpdate, String emergency) {
        LastUpdate = lastUpdate;
        Emergency = emergency;
    }
}
