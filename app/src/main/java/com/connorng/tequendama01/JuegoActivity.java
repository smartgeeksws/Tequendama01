package com.connorng.tequendama01;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class JuegoActivity extends Activity implements View.OnClickListener {

    ArrayList<Integer> arregloImagenes = new ArrayList<Integer>();
    ImageView iv00, iv01, iv10, iv11, iv20, iv21, iv30,iv31, imgTemp1, imgTemp2;
    View imagenSeleccionada1 = null, imagenSeleccionada2 = null;
    int puntaje = 0;
    int parejasCorrectas = 0;
    Boolean turno = true;
    String jugador1 , jugador2;
    TextView tvJugador1, tvJugador2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);

        tvJugador1 = (TextView)findViewById(R.id.tvJugador1);
        tvJugador2 = (TextView)findViewById(R.id.tvJugador2);
        iv00 = (ImageView)findViewById(R.id.iv00);
        iv01 = (ImageView)findViewById(R.id.iv01);
        iv10 = (ImageView)findViewById(R.id.iv10);
        iv11 = (ImageView)findViewById(R.id.iv11);
        iv20 = (ImageView)findViewById(R.id.iv20);
        iv21 = (ImageView)findViewById(R.id.iv21);
        iv30 = (ImageView)findViewById(R.id.iv30);
        iv31= (ImageView)findViewById(R.id.iv31);

        SharedPreferences jugadores = getSharedPreferences("jugadores",Context.MODE_PRIVATE);
        jugador1 = jugadores.getString("JUGADORUNO","No hay");
        jugador2 = jugadores.getString("JUGADORDOS","No hay");

        tvJugador1.setText(""+jugador1);
        tvJugador2.setText(""+jugador2);
        primerTurno();
        arregloimagenes();
        asignarImagenes();

        iv00.setOnClickListener(this);
        iv01.setOnClickListener(this);
        iv10.setOnClickListener(this);
        iv11.setOnClickListener(this);
        iv20.setOnClickListener(this);
        iv21.setOnClickListener(this);
        iv30.setOnClickListener(this);
        iv31.setOnClickListener(this);


    }

    private void arregloimagenes() {
        arregloImagenes.add(R.drawable.imagen1);
        arregloImagenes.add(R.drawable.imagen2);
        arregloImagenes.add(R.drawable.imagen3);
        arregloImagenes.add(R.drawable.imagen4);
        arregloImagenes.add(R.drawable.imagen1);
        arregloImagenes.add(R.drawable.imagen2);
        arregloImagenes.add(R.drawable.imagen3);
        arregloImagenes.add(R.drawable.imagen4);

    }

    private void asignarImagenes() {
        iv00.setTag(asignarImagenesAleatorias());
        iv01.setTag(asignarImagenesAleatorias());
        iv10.setTag(asignarImagenesAleatorias());
        iv11.setTag(asignarImagenesAleatorias());
        iv20.setTag(asignarImagenesAleatorias());
        iv21.setTag(asignarImagenesAleatorias());
        iv30.setTag(asignarImagenesAleatorias());
        iv31.setTag(asignarImagenesAleatorias());
    }

    private Object asignarImagenesAleatorias() {
        int imagenSeleccionada = 0;

        Collections.shuffle(arregloImagenes);
        int indiceAleatorio = (int)(Math.random()*arregloImagenes.size());
        imagenSeleccionada = arregloImagenes.get(indiceAleatorio);
        arregloImagenes.remove(indiceAleatorio);
        return imagenSeleccionada;


    }


    private void primerTurno() {
        final ArrayList<String> jugadores = new ArrayList<>();
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        int random = (int)(Math.random()*jugadores.size());
        if(random == 0){
            tvJugador1.setTextColor(Color.BLACK);
            tvJugador2.setTextColor(Color.GRAY);
        }else{
            tvJugador1.setTextColor(Color.GRAY);
            tvJugador2.setTextColor(Color.BLACK);
        }
    }

    @Override
    public void onClick(View view) {

    }
}
