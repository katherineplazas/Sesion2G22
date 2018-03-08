package com.katherineplazas.calculadoraderesistencias;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spBanda;
    String[] Lista;
    Button bNegro, bCafe, bRojo, bNaranja, bAmarillo, bVerde, bAzul, bPurpura, bGris, bBlanco, bDorado, bPlateado;
    int vBanda1 = 2;
    int vBanda2 = 0;
    int vBanda3 = 1;
    int vTolerancia = 5;
    TextView tvBanda1,tvBanda2,tvBanda3,tvTolerancia;
    TextView tvValorResistencia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spBanda = findViewById(R.id.spBanda);

        bNegro = findViewById(R.id.bNegro);
        bCafe = findViewById(R.id.bCafe);
        bRojo = findViewById(R.id.bRojo);
        bNaranja = findViewById(R.id.bNaranja);
        bAmarillo = findViewById(R.id.bAmarillo);
        bVerde = findViewById(R.id.bVerde);
        bAzul = findViewById(R.id.bAzul);
        bPurpura = findViewById(R.id.bPurpura);
        bGris = findViewById(R.id.bGris);
        bBlanco = findViewById(R.id.bBlanco);
        bDorado = findViewById(R.id.bDorado);
        bPlateado = findViewById(R.id.bPlateado);

        tvBanda1 = findViewById(R.id.tvBanda1);
        tvBanda2 = findViewById(R.id.tvBanda2);
        tvBanda3 = findViewById(R.id.tvBanda3);
        tvTolerancia = findViewById(R.id.tvTolerancia);
        tvValorResistencia = findViewById(R.id.tvValorResistencia);

        Lista = getResources().getStringArray(R.array.lista_bandas);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getBaseContext(), R.layout.spinner_item_banda, Lista);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spBanda.setAdapter(adapter);
        spBanda.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        bNegro.setEnabled(false);
                        bNegro.setBackgroundResource(R.color.mediumaquamarine);
                        bCafe.setEnabled(true);
                        bCafe.setBackgroundResource(R.color.saddlebrown);
                        bRojo.setEnabled(true);
                        bRojo.setBackgroundResource(R.color.red);
                        bNaranja.setEnabled(true);
                        bNaranja.setBackgroundResource(R.color.darkorange);
                        bAmarillo.setEnabled(true);
                        bAmarillo.setBackgroundResource(R.color.yellow);
                        bVerde.setEnabled(true);
                        bVerde.setBackgroundResource(R.color.lime);
                        bAzul.setEnabled(true);
                        bAzul.setBackgroundResource(R.color.blue);
                        bPurpura.setEnabled(true);
                        bPurpura.setBackgroundResource(R.color.purple);
                        bGris.setEnabled(true);
                        bGris.setBackgroundResource(R.color.gray);
                        bBlanco.setEnabled(true);
                        bBlanco.setBackgroundResource(R.color.white);
                        bDorado.setEnabled(false);
                        bDorado.setBackgroundResource(R.color.mediumaquamarine);
                        bPlateado.setEnabled(false);
                        bPlateado.setBackgroundResource(R.color.mediumaquamarine);
                        break;
                    case 1:
                        bNegro.setEnabled(true);
                        bNegro.setBackgroundResource(R.color.black);
                        bCafe.setEnabled(true);
                        bCafe.setBackgroundResource(R.color.saddlebrown);
                        bRojo.setEnabled(true);
                        bRojo.setBackgroundResource(R.color.red);
                        bNaranja.setEnabled(true);
                        bNaranja.setBackgroundResource(R.color.darkorange);
                        bAmarillo.setEnabled(true);
                        bAmarillo.setBackgroundResource(R.color.yellow);
                        bVerde.setEnabled(true);
                        bVerde.setBackgroundResource(R.color.lime);
                        bAzul.setEnabled(true);
                        bAzul.setBackgroundResource(R.color.blue);
                        bPurpura.setEnabled(true);
                        bPurpura.setBackgroundResource(R.color.purple);
                        bGris.setEnabled(true);
                        bGris.setBackgroundResource(R.color.gray);
                        bBlanco.setEnabled(true);
                        bBlanco.setBackgroundResource(R.color.white);
                        bDorado.setEnabled(false);
                        bDorado.setBackgroundResource(R.color.mediumaquamarine);
                        bPlateado.setEnabled(false);
                        bPlateado.setBackgroundResource(R.color.mediumaquamarine);
                        break;
                    case 2:
                        bNegro.setEnabled(true);
                        bNegro.setBackgroundResource(R.color.black);
                        bCafe.setEnabled(true);
                        bCafe.setBackgroundResource(R.color.saddlebrown);
                        bRojo.setEnabled(true);
                        bRojo.setBackgroundResource(R.color.red);
                        bNaranja.setEnabled(true);
                        bNaranja.setBackgroundResource(R.color.darkorange);
                        bAmarillo.setEnabled(true);
                        bAmarillo.setBackgroundResource(R.color.yellow);
                        bVerde.setEnabled(true);
                        bVerde.setBackgroundResource(R.color.lime);
                        bAzul.setEnabled(true);
                        bAzul.setBackgroundResource(R.color.blue);
                        bPurpura.setEnabled(true);
                        bPurpura.setBackgroundResource(R.color.purple);
                        bGris.setEnabled(false);
                        bGris.setBackgroundResource(R.color.mediumaquamarine);
                        bBlanco.setEnabled(false);
                        bBlanco.setBackgroundResource(R.color.mediumaquamarine);
                        bDorado.setEnabled(true);
                        bDorado.setBackgroundResource(R.color.golden1);
                        bPlateado.setEnabled(true);
                        bPlateado.setBackgroundResource(R.color.silver);
                        break;
                    case 3:
                        bNegro.setEnabled(false);
                        bNegro.setBackgroundResource(R.color.mediumaquamarine);
                        bCafe.setEnabled(true);
                        bCafe.setBackgroundResource(R.color.saddlebrown);
                        bRojo.setEnabled(true);
                        bRojo.setBackgroundResource(R.color.red);
                        bNaranja.setEnabled(false);
                        bNaranja.setBackgroundResource(R.color.mediumaquamarine);
                        bAmarillo.setEnabled(false);
                        bAmarillo.setBackgroundResource(R.color.mediumaquamarine);
                        bVerde.setEnabled(false);
                        bVerde.setBackgroundResource(R.color.mediumaquamarine);
                        bAzul.setEnabled(false);
                        bAzul.setBackgroundResource(R.color.mediumaquamarine);
                        bPurpura.setEnabled(false);
                        bPurpura.setBackgroundResource(R.color.mediumaquamarine);
                        bGris.setEnabled(false);
                        bGris.setBackgroundResource(R.color.mediumaquamarine);
                        bBlanco.setEnabled(false);
                        bBlanco.setBackgroundResource(R.color.mediumaquamarine);
                        bDorado.setEnabled(true);
                        bDorado.setBackgroundResource(R.color.golden1);
                        bPlateado.setEnabled(true);
                        bPlateado.setBackgroundResource(R.color.silver);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void select_color(View view) {
        int id = view.getId();
        int sp_pos;
        sp_pos = spBanda.getSelectedItemPosition();
        switch (id){
            case R.id.bNegro:
                switch (sp_pos){
                    case 1:
                        vBanda2 = 0;
                        tvBanda2.setBackgroundResource(R.color.black);
                        //resistor_result();
                        break;
                    case 2:
                        vBanda3 = 0;
                        tvBanda3.setBackgroundResource(R.color.black);
                        //resistor_result();
                        break;
                }
                break;
            case R.id.bCafe:
                switch (sp_pos){
                    case 0:
                        vBanda1 = 1;
                        tvBanda1.setBackgroundResource(R.color.saddlebrown);
                       // resistor_result();
                        break;
                    case 1:
                        vBanda2 = 1;
                        tvBanda2.setBackgroundResource(R.color.saddlebrown);
                        //resistor_result();
                        break;
                    case 2:
                        vBanda3 = 1;
                        tvBanda3.setBackgroundResource(R.color.saddlebrown);
                        //resistor_result();
                        break;
                    case 3:
                        vTolerancia = 1;
                        tvTolerancia.setBackgroundResource(R.color.saddlebrown);
                        //resistor_result();
                        break;
                }
                break;
            case R.id.bRojo:
                switch (sp_pos){
                    case 0:
                        vBanda1 = 2;
                        tvBanda1.setBackgroundResource(R.color.red);
                        //resistor_result();
                        break;
                    case 1:
                        vBanda2 = 2;
                        tvBanda2.setBackgroundResource(R.color.red);
                        //resistor_result();
                        break;
                    case 2:
                        vBanda3 = 2;
                        tvBanda3.setBackgroundResource(R.color.red);
                        //resistor_result();
                        break;
                    case 3:
                        vTolerancia = 2;
                        tvTolerancia.setBackgroundResource(R.color.red);
                        //resistor_result();
                        break;
                }
                break;
            case R.id.bNaranja:
                switch (sp_pos){
                    case 0:
                        vBanda1 = 3;
                        tvBanda1.setBackgroundResource(R.color.darkorange);
                        //resistor_result();
                        break;
                    case 1:
                        vBanda2 = 3;
                        tvBanda2.setBackgroundResource(R.color.darkorange);
                        //resistor_result();
                        break;
                    case 2:
                        vBanda3 = 3;
                        tvBanda3.setBackgroundResource(R.color.darkorange);
                        //resistor_result();
                        break;
                 }
                break;
            case R.id.bAmarillo:
                switch (sp_pos){
                    case 0:
                        vBanda1 = 4;
                        tvBanda1.setBackgroundResource(R.color.yellow);
                        //resistor_result();
                        break;
                    case 1:
                        vBanda2 = 4;
                        tvBanda2.setBackgroundResource(R.color.yellow);
                        //resistor_result();
                        break;
                    case 2:
                        vBanda3 = 4;
                        tvBanda3.setBackgroundResource(R.color.yellow);
                        //resistor_result();
                        break;
                }
                break;
            case R.id.bVerde:
                switch (sp_pos){
                    case 0:
                        vBanda1 = 5;
                        tvBanda1.setBackgroundResource(R.color.lime);
                        //resistor_result();
                        break;
                    case 1:
                        vBanda2 = 5;
                        tvBanda2.setBackgroundResource(R.color.lime);
                        //resistor_result();
                        break;
                    case 2:
                        vBanda3 = 5;
                        tvBanda3.setBackgroundResource(R.color.lime);
                        //resistor_result();
                        break;
                }
                break;
            case R.id.bAzul:
                switch (sp_pos){
                    case 0:
                        vBanda1 = 6;
                        tvBanda1.setBackgroundResource(R.color.blue);
                        //resistor_result();
                        break;
                    case 1:
                        vBanda2 = 6;
                        tvBanda2.setBackgroundResource(R.color.blue);
                        //resistor_result();
                        break;
                    case 2:
                        vBanda3 = 6;
                        tvBanda3.setBackgroundResource(R.color.blue);
                        //resistor_result();
                        break;
                }
                break;
            case R.id.bPurpura:
                switch (sp_pos){
                    case 0:
                        vBanda1 = 7;
                        tvBanda1.setBackgroundResource(R.color.purple);
                        //resistor_result();
                        break;
                    case 1:
                        vBanda2 = 7;
                        tvBanda2.setBackgroundResource(R.color.purple);
                        //resistor_result();
                        break;
                    case 2:
                        vBanda3 = 7;
                        tvBanda3.setBackgroundResource(R.color.purple);
                        //resistor_result();
                        break;
                }
                break;
            case R.id.bGris:
                switch (sp_pos){
                    case 0:
                        vBanda1 = 8;
                        tvBanda1.setBackgroundResource(R.color.gray);
                        //resistor_result();
                        break;
                    case 1:
                        vBanda2 = 8;
                        tvBanda2.setBackgroundResource(R.color.gray);
                        //resistor_result();
                        break;
                    case 2:
                        vBanda3 = 8;
                        tvBanda3.setBackgroundResource(R.color.gray);
                        //resistor_result();
                        break;
                }
                break;
            case R.id.bBlanco:
                switch (sp_pos){
                    case 0:
                        vBanda1 = 9;
                        tvBanda1.setBackgroundResource(R.color.white);
                        //resistor_result();
                        break;
                    case 1:
                        vBanda2 = 9;
                        tvBanda2.setBackgroundResource(R.color.white);
                        //resistor_result();
                        break;
                }
                break;
            case R.id.bDorado:
                switch (sp_pos){
                    case 2:
                        vBanda3 = 10;
                        tvBanda3.setBackgroundResource(R.color.golden1);
                        //resistor_result();
                        break;
                    case 3:
                        vTolerancia = 5;
                        tvTolerancia.setBackgroundResource(R.color.golden1);
                        //resistor_result();
                }
                break;
            case R.id.bPlateado:
                switch (sp_pos){
                    case 2:
                        vBanda3 = 100;
                        tvBanda3.setBackgroundResource(R.color.silver);
                        //resistor_result();
                        break;
                    case 3:
                        vTolerancia = 10;
                        tvTolerancia.setBackgroundResource(R.color.silver);
                        //resistor_result();
                }
                break;
        }
        resistor_result();

        //Log.d("posicion=", String.valueOf(spBanda.getSelectedItemPosition()));
    }

    private void resistor_result() {
        int resultado;
        float resultado2;
        resultado = (vBanda1*10)+vBanda2;
        if(vBanda3 <= 7){
            resultado = resultado*((int)Math.pow(10,vBanda3));
            if(resultado<=999){
                tvValorResistencia.setText(String.valueOf(resultado));
                tvValorResistencia.append("Ω ±");
                tvValorResistencia.append(String.valueOf(vTolerancia));
                tvValorResistencia.append("%");
            }else if(resultado >= 1000 && resultado <= 999999){
                resultado2 = (float)resultado/1000;
                tvValorResistencia.setText(String.valueOf(resultado2));
                tvValorResistencia.append("KΩ ±");
                tvValorResistencia.append(String.valueOf(vTolerancia));
                tvValorResistencia.append("%");
            }else if(resultado >= 1000000 && resultado <= 999999999){
                resultado2 = (float)resultado/1000000;
                tvValorResistencia.setText(String.valueOf(resultado2));
                tvValorResistencia.append("MΩ ±");
                tvValorResistencia.append(String.valueOf(vTolerancia));
                tvValorResistencia.append("%");
            }else {
                tvValorResistencia.setText("Muy grande");
            }


        }else{
            resultado2 = (float)resultado/vBanda3;
            tvValorResistencia.setText(String.valueOf(resultado2));
            tvValorResistencia.append("Ω ±");
            tvValorResistencia.append(String.valueOf(vTolerancia));
            tvValorResistencia.append("%");
        }

    }

}

