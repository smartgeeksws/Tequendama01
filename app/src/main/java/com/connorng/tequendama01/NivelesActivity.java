package com.connorng.tequendama01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NivelesActivity extends AppCompatActivity implements View.OnClickListener {
    Button facil,normal,dificil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niveles);



    }

    @Override
    public void onClick(View v) {

    }
}
