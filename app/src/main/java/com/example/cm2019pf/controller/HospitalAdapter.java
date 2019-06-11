package com.example.cm2019pf.controller;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cm2019pf.MainActivity;
import com.example.cm2019pf.R;
import com.example.cm2019pf.model.Hospital;

import java.util.List;

import static android.support.constraint.Constraints.TAG;

public class HospitalAdapter extends RecyclerView.Adapter<HospitalAdapter.ViewHolder> {



     Context context;
     List<Hospital> hospitalList;


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
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        viewHolder.textViewnome.setText("Nome: "+ hospitalList.get(position).getName());
        viewHolder.textViewdescricao.setText("Descricao: "+ hospitalList.get(position).getDescription());
        viewHolder.textViewdistro.setText("Distro: "+ hospitalList.get(position).getDistrict());
        //viewHolder.textViewphone.setText(hospitalList.get(position).getPhone());


        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, " Id Hospital "+hospitalList.get(position).getId(), Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {

        return hospitalList.size();

    }


    public static class ViewHolder extends RecyclerView.ViewHolder {


        public TextView textViewnome;
        public TextView textViewdescricao;
        public TextView textViewdistro;




        public ViewHolder(View itemView) {
            super(itemView);


            textViewnome = (TextView)itemView.findViewById(R.id.tztnomeHosp);
            textViewdescricao = (TextView)itemView.findViewById(R.id.txtdescription);
            textViewdistro = (TextView)itemView.findViewById(R.id.txtDistrict);
            //textViewphone = (TextView)itemView.findViewById(R.id.txtPhoneHospital);




    }

    }
}
