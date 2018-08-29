package com.connorng.tequendama01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener{

    Button play,config,puntajes,info;
    TextView jugadores;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        play = (Button)findViewById(R.id.btnPlay);
        config = (Button)findViewById(R.id.btnConfiguraciones);
        info = (Button)findViewById(R.id.btnInformacion);
        puntajes = (Button)findViewById(R.id.btnPuntajes);

        play.setOnClickListener(this);
        config.setOnClickListener(this);
        info.setOnClickListener(this);
        puntajes.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnPlay:
                Intent intentPlay = new Intent(getApplicationContext(),NivelesActivity.class);
                startActivity(intentPlay);
                break;
            case R.id.btnPuntajes:
                break;
            case R.id.btnConfiguraciones:
                break;
            case R.id.btnInformacion:
                break;
        }
    }
}
