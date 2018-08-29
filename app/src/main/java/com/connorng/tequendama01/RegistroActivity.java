package com.connorng.tequendama01;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistroActivity extends AppCompatActivity {

    EditText nicknameUno,nicknameDos;
    Button ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        nicknameUno = (EditText)findViewById(R.id.etNicknameUno);
        nicknameDos = (EditText)findViewById(R.id.etNicknameDos);
        ingresar = (Button)findViewById(R.id.btnIngresar);

        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                if (!TextUtils.isEmpty(nicknameUno.getText().toString()) && !TextUtils.isEmpty(nicknameDos.getText().toString().trim())){
                    String nombre1 =nicknameUno.getText().toString();
                    String nombre2 = nicknameDos.getText().toString();
                    Toast.makeText(getApplicationContext(),""+nicknameUno.getText().toString(),Toast.LENGTH_SHORT).show();
                    editor.putString("JUGADORUNO",nombre1);
                    editor.putString("JUGADORDOS",nombre2);
                    editor.commit();
                    Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(),"error",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
