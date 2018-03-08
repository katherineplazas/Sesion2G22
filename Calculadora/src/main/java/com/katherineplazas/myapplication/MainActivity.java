package com.katherineplazas.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText eDatos;
    Button bUno, bDos, bTres, bCuatro, bCinco, bSeis, bSiete, bOcho, bNueve, bCero, bMas, bMenos, bFactor, bDiv, bIgual, bPunto;
    Button bBorrar, bBorrar1;
    char flagpunto = 0;
    char flagoperador = 0;
    double operando1,operando2,resultado;
    char simbolo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eDatos = findViewById(R.id.eDatos);
        bUno = findViewById(R.id.bUno);
        bDos = findViewById(R.id.bDos);
        bTres = findViewById(R.id.bTres);
        bCuatro = findViewById(R.id.bCuatro);
        bCinco = findViewById(R.id.bCinco);
        bSeis = findViewById(R.id.bSeis);
        bSiete = findViewById(R.id.bSiete);
        bOcho = findViewById(R.id.bOcho);
        bNueve = findViewById(R.id.bNueve);
        bCero = findViewById(R.id.bCero);
        bMas = findViewById(R.id.bMas);
        bMenos = findViewById(R.id.bMenos);
        bFactor = findViewById(R.id.bFactor);
        bDiv = findViewById(R.id.bDiv);
        bIgual = findViewById(R.id.bIgual);
        bPunto = findViewById(R.id.bPunto);
        bBorrar = findViewById(R.id.bBorrar);
        bBorrar1 = findViewById(R.id.bBorrar1);
    }

    public void fClear(View view) {
        int keypress = view.getId();
        char ucaracter;
        switch (keypress){
            case R.id.bBorrar:
                eDatos.setText("");
                flagpunto = 0;
                flagoperador = 0;
                break;
            case R.id.bBorrar1:
                if(eDatos.length()>=1) {
                    ucaracter = eDatos.getText().charAt(eDatos.length() - 1);
                    if (ucaracter == 'x' || ucaracter == '-' || ucaracter == '/' || ucaracter == '+') {
                        flagoperador = 0;
                    } else if (ucaracter == '.') {
                        flagpunto = 0;
                    }
                    eDatos.setText(eDatos.getText().subSequence(0, eDatos.length() - 1));
                }
                break;
        }
    }

    public void fNumeros(View view) {
        int keypress = view.getId();
        char ucaracter;

        switch (keypress){
            case R.id.bNueve:
                eDatos.append("9");
                break;
            case R.id.bOcho:
                eDatos.append("8");
                break;
            case R.id.bSiete:
                eDatos.append("7");
                break;
            case R.id.bSeis:
                eDatos.append("6");
                break;
            case R.id.bCinco:
                eDatos.append("5");
                break;
            case R.id.bCuatro:
                eDatos.append("4");
                break;
            case R.id.bTres:
                eDatos.append("3");
                break;
            case R.id.bDos:
                eDatos.append("2");
                break;
            case R.id.bUno:
                eDatos.append("1");
                break;
            case R.id.bCero:
                eDatos.append("0");
                break;
            case R.id.bPunto:
                if(flagpunto == 0){
                    if(eDatos.length()== 0){
                        eDatos.append("0.");
                        flagpunto = 1;
                    }else{
                        ucaracter = eDatos.getText().charAt(eDatos.length()-1);
                        if(eDatos.length()== 0 || ucaracter == 'x' || ucaracter == '-'||ucaracter == '/' || ucaracter == '+'){
                            eDatos.append("0.");
                            flagpunto = 1;
                        }else{
                            eDatos.append(".");
                            flagpunto = 1;
                        }
                    }
                }
                break;
            case R.id.bMas:
                if(eDatos.length()>=1) {
                    if (flagoperador == 0) {
                        eDatos.append("+");
                        flagoperador = 1;
                    } else {
                        ucaracter = eDatos.getText().charAt(eDatos.length() - 1);
                        if (ucaracter == 'x' || ucaracter == '-' || ucaracter == '/') {
                            eDatos.setText(eDatos.getText().subSequence(0, eDatos.length() - 1));
                            eDatos.append("+");
                        }
                    }
                    flagpunto = 0;
                }
                break;
            case R.id.bMenos:
                if(eDatos.length()>=1) {
                    if (flagoperador == 0) {
                        eDatos.append("-");
                        flagoperador = 1;
                    } else {
                        ucaracter = eDatos.getText().charAt(eDatos.length() - 1);
                        if (ucaracter == 'x' || ucaracter == '+' || ucaracter == '/') {
                            eDatos.setText(eDatos.getText().subSequence(0, eDatos.length() - 1));
                            eDatos.append("-");
                        }
                    }
                    flagpunto = 0;
                }
                break;
            case R.id.bFactor:
                if(eDatos.length()>=1) {
                    if (flagoperador == 0) {
                        eDatos.append("x");
                        flagoperador = 1;
                    } else {
                        ucaracter = eDatos.getText().charAt(eDatos.length() - 1);
                        if (ucaracter == '+' || ucaracter == '-' || ucaracter == '/') {
                            eDatos.setText(eDatos.getText().subSequence(0, eDatos.length() - 1));
                            eDatos.append("x");
                        }
                    }
                    flagpunto = 0;
                }
                break;
            case R.id.bDiv:
                if(eDatos.length()>= 1) {
                    if (flagoperador == 0) {
                        eDatos.append("/");
                        flagoperador = 1;
                    } else {
                        ucaracter = eDatos.getText().charAt(eDatos.length() - 1);
                        if (ucaracter == 'x' || ucaracter == '-' || ucaracter == '+') {
                            eDatos.setText(eDatos.getText().subSequence(0, eDatos.length() - 1));
                            eDatos.append("/");
                        }
                    }
                    flagpunto = 0;
                }
                break;
        }

    }

    public void fResultado(View view) {
        int tam_string;
        int i;
        char flag_end = 0;
        tam_string = eDatos.length();
        for (i=0;i<=tam_string;i++){
            simbolo = eDatos.getText().charAt(i);
            switch (simbolo){
                case '+':
                    operando1 = Double.parseDouble(eDatos.getText().subSequence(0,i).toString());
                    operando2 = Double.parseDouble(eDatos.getText().subSequence(i+1,eDatos.length()).toString());
                    resultado = operando1 + operando2;
                    flag_end = 1;
                    break;
                case '-':
                    if(i>=1) {
                        operando1 = Double.parseDouble(eDatos.getText().subSequence(0, i).toString());
                        operando2 = Double.parseDouble(eDatos.getText().subSequence(i + 1, eDatos.length()).toString());
                        resultado = operando1 - operando2;
                        flag_end = 1;
                    }
                    break;
                case 'x':
                    operando1 = Double.parseDouble(eDatos.getText().subSequence(0,i).toString());
                    operando2 = Double.parseDouble(eDatos.getText().subSequence(i+1,eDatos.length()).toString());
                    resultado = operando1 * operando2;
                    flag_end = 1;
                    break;
                case '/':
                    operando1 = Double.parseDouble(eDatos.getText().subSequence(0,i).toString());
                    operando2 = Double.parseDouble(eDatos.getText().subSequence(i+1,eDatos.length()).toString());
                    resultado = operando1 / operando2;
                    flag_end = 1;
                    break;
            }
            if (flag_end == 1){
                break;
            }
        }
        
        eDatos.setText(String.format("%.4f",resultado));
        flagpunto = 1;
        flagoperador = 0;
    }
}
