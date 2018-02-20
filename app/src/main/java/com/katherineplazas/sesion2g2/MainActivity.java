package com.katherineplazas.sesion2g2;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText eNombre, eCorreo;
    Button bGuardar;
    String nombre;
    CheckBox cNadar, cCorrer, cCine;
    TextView tFecha;
    DatePickerDialog datePickerDialog;
    int y,m,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eNombre = findViewById(R.id.eNombre);
        eCorreo = findViewById(R.id.eCorreo);
        cCine = findViewById(R.id.cCine);
        cNadar = findViewById(R.id.cNadar);
        cCorrer = findViewById(R.id.cCorrer);
        tFecha = findViewById(R.id.tFecha);
        bGuardar = findViewById(R.id.bGuardar);

       /* bGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre = eNombre.getText().toString();
                eCorreo.setText(tAux);
            }
        });*/
    }

    public void clickboton(View view) {

        nombre = eNombre.getText().toString();
        eCorreo.setText(nombre);
    }

    public void onRadioButtonClicked(View view) {
        int id = view.getId();
        if(id == R.id.rMasculino){
            eCorreo.setText("Masculino");
        } else {
            eCorreo.setText("Femenino");
        }
    }

    public void onCheckboxClicked(View view) {
        int id = view.getId();
        switch (id){
            case R.id.cNadar:
                if(cNadar.isChecked()){
                eCorreo.setText("Nadar");}
                break;
            case R.id.cCorrer:
                if(cCorrer.isChecked()){
                eCorreo.setText("Correr");}
                break;
            case R.id.cCine:
                if(cCine.isChecked()){
                eCorreo.setText("Cine");}
                break;
        }
    }

    public void LlamarFecha(View view) {

        datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month +1;
                tFecha.setText(day+"/"+month+"/"+year);
                y = year;
                d = day;
                m = month;
                eNombre.setText(d+"/"+m+"/"+y);
            }
        },y,m,d);
        datePickerDialog.show();
    }
}



