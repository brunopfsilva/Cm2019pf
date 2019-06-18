package com.example.cm2019pf.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ScaleType {

    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("Time")
    @Expose
    private String Time;
    @SerializedName("Length")
    @Expose
    private String Length;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getLength() {
        return Length;
    }

    public void setLength(String length) {
        Length = length;
    }


    public ScaleType(String color, String time, String length) {
        this.color = color;
        Time = time;
        Length = length;
    }
}
