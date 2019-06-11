package com.example.cm2019pf.controller;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cm2019pf.R;
import com.example.cm2019pf.model.Hospital;

import java.util.List;

public class HospitalAdapter extends RecyclerView.Adapter<HospitalAdapter.ViewHolder> {



    private Context context;
    private List<Hospital> hospitalList;






    public HospitalAdapter(Context context, List<Hospital> hospitalList) {
        this.context = context;
        this.hospitalList = hospitalList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View itemview = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardhospital,viewGroup,false);

        return new ViewHolder(itemview);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        viewHolder.textViewnome.setText(hospitalList.get(position).getName());
        viewHolder.textViewdescricao.setText(hospitalList.get(position).getDescription());
        viewHolder.textViewdistro.setText(hospitalList.get(position).getDistrict());
        //viewHolder.textViewphone.setText(hospitalList.get(position).getPhone());

    }

    @Override
    public int getItemCount() {
        return hospitalList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{


        public TextView textViewnome;
        public TextView textViewdescricao;
        public TextView textViewdistro;
        public TextView textViewphone;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            textViewnome = (TextView)itemView.findViewById(R.id.tztnomeHosp);
            textViewdescricao = (TextView)itemView.findViewById(R.id.txtdescription);
            textViewdistro = (TextView)itemView.findViewById(R.id.txtDistrict);
            //textViewphone = (TextView)itemView.findViewById(R.id.txtPhoneHospital);

        }
    }
}
