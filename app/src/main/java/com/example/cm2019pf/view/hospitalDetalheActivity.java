package com.example.cm2019pf.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cm2019pf.R;
import com.example.cm2019pf.controller.actionController;

public class hospitalDetalheActivity extends AppCompatActivity {


    EditText nome,email,telefone,descricao,site;
    actionController actionControllerCall;
    View view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        initViews();

        Intent intent = getIntent();
        if(intent != null) {


            intent.getExtras();

            String getname = intent.getStringExtra("hopitalnome");
            String getdescricao = intent.getStringExtra("hopitaldescricao");
            String getfone = intent.getStringExtra("hopitaltelefone");
            String getemail = intent.getStringExtra("hopitalemail");
            String geturlinstituicao = intent.getStringExtra("hopitalsite");

            descricao.setFocusable(false);
            telefone.setFocusable(false);
            email.setFocusable(false);
            site.setFocusable(false);
            descricao.setText(getdescricao);
            telefone.setText(getfone);
            email.setText(getemail);
            site.setText(geturlinstituicao);

            this.setTitle(getname);



        }



    }

    public void initViews(){

        descricao = (EditText)findViewById(R.id.hospitalDescricao);
        email = (EditText)findViewById(R.id.hospitalEmail);
        telefone = (EditText)findViewById(R.id.hospitalTelefone);
        site = (EditText)findViewById(R.id.hospitalSite);




    }

    public void openSite(View view) {


        Toast.makeText(this, "Abri site "+site.getText().toString(), Toast.LENGTH_SHORT).show();

    }



}
