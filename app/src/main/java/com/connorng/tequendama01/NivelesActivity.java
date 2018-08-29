package com.connorng.tequendama01;

import android.content.Intent;
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
        facil = (Button)findViewById(R.id.btnNivelFacil);
        normal = (Button)findViewById(R.id.btnNivelNormal);
        dificil = (Button)findViewById(R.id.btnNivelDificil);


    }

    @Override
    public void onClick(View v) {
switch (v.getId()){
    case R.id.btnNivelFacil:
        Intent intentFacil = new Intent(getApplicationContext(),JuegoActivity.class);
        startActivity(intentFacil);
}
    }
}
