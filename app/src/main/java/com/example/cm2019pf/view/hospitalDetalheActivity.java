package com.example.cm2019pf.view;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cm2019pf.R;
import com.example.cm2019pf.controller.getdataApiController;

import cn.carbs.android.library.MDDialog;

public class hospitalDetalheActivity extends AppCompatActivity {


    EditText nome,email,telefone,descricao,site;
    WebView webView;
    FloatingActionButton fbsendmail,fbopensite;
    String id;

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
            id = intent.getStringExtra("hospitalId");
            webView = new WebView(this);

            descricao.setFocusable(false);
            telefone.setFocusable(false);
            email.setFocusable(false);
            site.setFocusable(false);
            //troca da descricao pelo nome pois tem menos texto
            descricao.setText(getname);
            telefone.setText(getfone);
            email.setText(getemail);
            site.setText(geturlinstituicao);

            this.setTitle(getdescricao);





            fbsendmail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    sendEmail(v);
                }
            });

        }

            fbopensite.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openSite(v);
                }
            });


    }

    public void initViews(){

        descricao = (EditText)findViewById(R.id.hospitalDescricao);
        email = (EditText)findViewById(R.id.hospitalEmail);
        telefone = (EditText)findViewById(R.id.hospitalTelefone);
        site = (EditText)findViewById(R.id.hospitalSite);
        fbsendmail = (FloatingActionButton)findViewById(R.id.fcsendMail);
        fbopensite = (FloatingActionButton)findViewById(R.id.fopenSite);

    }

    public void openSite(View view) {


        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        String url = site.getText().toString();
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);

    }



    @SuppressLint("IntentReset")
    public void sendEmail(View view) {

        final Intent emailIntent = new Intent(Intent.ACTION_SEND);

        runOnUiThread(new Runnable() {
            @Override
            public void run() {


                emailIntent.setData(Uri.parse("mailto:"));
                emailIntent.setType("text/plain");


                emailIntent.putExtra(Intent.EXTRA_EMAIL, email.getText().toString());
                emailIntent.putExtra(Intent.EXTRA_CC, "CC");
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Your subject");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message goes here");

                try {
                    startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                    finish();
                    Log.i("Finished sending email", "");
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(hospitalDetalheActivity.this,
                            "There is no email client installed.", Toast.LENGTH_SHORT).show();
                }

            }

        });

    }

    public void openTimes(View view) {

        new MDDialog.Builder(hospitalDetalheActivity.this)
                .setTitle("Status Hospital")
                .setContentView(R.layout.hospitaltimesandtype)
                .setPositiveButton("Positivo", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(hospitalDetalheActivity.this, "Acao a implementar", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("Negativo", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(hospitalDetalheActivity.this, "Acao a implementar", Toast.LENGTH_SHORT).show();
                    }
                })
                .create()
                .show();

        getdataApiController.get_data_from_server_urgency(id);


    }
}
