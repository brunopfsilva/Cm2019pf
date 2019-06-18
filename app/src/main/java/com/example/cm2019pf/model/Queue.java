package com.example.cm2019pf.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Queue {

    @SerializedName("Queue")
    @Expose
    private String Queue;
    @SerializedName("Code")
    @Expose
    private Double Code;
    @SerializedName("Description")
    @Expose
    private String Description;


    public String getQueue() {
        return Queue;
    }

    public void setQueue(String queue) {
        Queue = queue;
    }

    public Double getCode() {
        return Code;
    }

    public void setCode(Double code) {
        Code = code;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }


    public Queue(String queue, Double code, String description) {
        Queue = queue;
        Code = code;
        Description = description;
    }
}
