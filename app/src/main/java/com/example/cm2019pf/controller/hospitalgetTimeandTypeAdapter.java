package com.example.cm2019pf.controller;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.cm2019pf.R;
import com.example.cm2019pf.model.HospitalResultStatus;
import com.example.cm2019pf.model.hospitalTimes;
import com.example.cm2019pf.view.hospitalDetalheActivity;

import java.util.List;

public class hospitalgetTimeandTypeAdapter extends ArrayAdapter<hospitalTimes> {

    private final Context context;
    private final List<hospitalTimes>elementosStatus;


    public hospitalgetTimeandTypeAdapter(Context context, List<hospitalTimes> elementosStatus){
        super(context, R.layout.hospitaltimesandtype,elementosStatus);
        this.context = context;
        this.elementosStatus =  elementosStatus;
    }



    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        @SuppressLint("ViewHolder")
        View rowview = inflater.inflate(R.layout.layout_status,parent,false);

        TextView tempo = (TextView)rowview.findViewById(R.id.tempoespera);

        tempo.setText(elementosStatus.get(position).getLastUpdate());

        return rowview;
    }
}
