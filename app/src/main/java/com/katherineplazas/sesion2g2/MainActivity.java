package com.katherineplazas.sesion2g2;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spCiudades;
    String[] Lista;

    EditText eNombre, eCorreo, ePass, eRpass;
    Button bGuardar;
    String nombre, pass, rpass, correo, sexo, fecha, ciudad, nadar, correr, cine, bailar;
    CheckBox cNadar, cCorrer, cCine, cBailar;
    RadioButton rFemenino, rMasculino;
    TextView tFecha, tvDatos;
    DatePickerDialog datePickerDialog;
    int y, m, d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eNombre = findViewById(R.id.eNombre);
        eCorreo = findViewById(R.id.eCorreo);
        ePass = findViewById(R.id.ePass);
        eRpass = findViewById(R.id.eRpass);
        cCine = findViewById(R.id.cCine);
        cNadar = findViewById(R.id.cNadar);
        cCorrer = findViewById(R.id.cCorrer);
        cBailar = findViewById(R.id.cBailar);
        tFecha = findViewById(R.id.tFecha);
        rMasculino = findViewById(R.id.rMasculino);
        rFemenino = findViewById(R.id.rFemenino);
        bGuardar = findViewById(R.id.bGuardar);
        tvDatos = findViewById(R.id.tvDatos);


        //Spinner
        spCiudades = findViewById(R.id.spCiudades);
        Lista = getResources().getStringArray(R.array.lista_ciudedes);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getBaseContext(), R.layout.spinner_item_ciudades, Lista);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spCiudades.setAdapter(adapter);
    }

    public void clickboton(View view) {
        CharSequence Mensaje, Mensaje2, Mensaje3, Mensaje4, Mensaje5;
        Mensaje = getResources().getString(R.string.llenarcampo);
        Mensaje2 = getResources().getString(R.string.diferentepass);
        Mensaje3 = getResources().getString(R.string.selsexo);
        Mensaje4 = getResources().getString(R.string.selfecha);
        Mensaje5 = getResources().getString(R.string.selpasatiempo);
        int sp_pos;
        if (eNombre.getText().toString().trim().equalsIgnoreCase("")) {
            eNombre.setError(Mensaje);
        } else if (ePass.getText().toString().trim().equalsIgnoreCase("")) {
            ePass.setError(Mensaje);
        } else if (eRpass.getText().toString().trim().equalsIgnoreCase("")) {
            eRpass.setError(Mensaje);
        } else {
            pass = ePass.getText().toString();
            rpass = eRpass.getText().toString();
            if (pass.equalsIgnoreCase(rpass)) {
                if (eCorreo.getText().toString().trim().equalsIgnoreCase("")) {
                    eCorreo.setError(Mensaje);
                } else if (rFemenino.isChecked() == false && rMasculino.isChecked() == false) {
                    Toast.makeText(this, Mensaje3, Toast.LENGTH_SHORT).show();
                } else if (tFecha.getText().toString().equalsIgnoreCase("Fecha")) {
                    Toast.makeText(this, Mensaje4, Toast.LENGTH_SHORT).show();
                } else if (cCorrer.isChecked() == false && cNadar.isChecked() == false && cCine.isChecked() == false && cBailar.isChecked() == false) {
                    Toast.makeText(this, Mensaje5, Toast.LENGTH_SHORT).show();
                } else {
                    nombre = eNombre.getText().toString();
                    tvDatos.setText(getResources().getString(R.string.usuario));
                    tvDatos.append(nombre);

                    correo = eCorreo.getText().toString();
                    tvDatos.append("\n");
                    tvDatos.append(getResources().getString(R.string.correoeletronico));
                    tvDatos.append(correo);

                    if (rMasculino.isChecked()) {
                        sexo = getResources().getString(R.string.masculino);
                    } else {
                        sexo = getResources().getString(R.string.femenino);
                    }
                    tvDatos.append("\n");
                    tvDatos.append(getResources().getString(R.string.Sexo));
                    tvDatos.append(sexo);

                    sp_pos = spCiudades.getSelectedItemPosition();
                    ciudad = Lista[sp_pos];

                    fecha = tFecha.getText().toString();
                    tvDatos.append("\n");
                    tvDatos.append(getResources().getString(R.string.nacimiento));
                    tvDatos.append(fecha);

                    tvDatos.append("\n");
                    tvDatos.append(getResources().getString(R.string.cuidad));
                    tvDatos.append(ciudad);

                    tvDatos.append("\n");
                    tvDatos.append(getResources().getString(R.string.pasatiempos));

                    if (cNadar.isChecked()) {
                        nadar = getResources().getString(R.string.nadar);
                        tvDatos.append(nadar);
                        tvDatos.append(", ");
                    }
                    if (cCorrer.isChecked()) {
                        correr = getResources().getString(R.string.correr);
                        tvDatos.append(correr);
                        tvDatos.append(", ");
                    }
                    if (cCine.isChecked()) {
                        cine = getResources().getString(R.string.cine);
                        tvDatos.append(cine);
                        tvDatos.append(", ");
                    }
                    if (cBailar.isChecked()) {
                        bailar = getResources().getString(R.string.bailar);
                        tvDatos.append(bailar);
                        tvDatos.append(".");
                    }
                    eNombre.setText("");
                    ePass.setText("");
                    eRpass.setText("");
                    eCorreo.setText("");
                    rMasculino.setChecked(false);
                    rFemenino.setChecked(false);
                    tFecha.setText(getResources().getString(R.string.fecha));
                    cNadar.setChecked(false);
                    cCine.setChecked(false);
                    cCorrer.setChecked(false);
                    cBailar.setChecked(false);
                }
            } else {
                Toast.makeText(this, Mensaje2, Toast.LENGTH_SHORT).show();
            }
        }

        /*nombre = eNombre.getText().toString();
        eCorreo.setText(nombre);
        Toast.makeText(this, "Debe llenar todos los campos", Toast.LENGTH_SHORT).show();*/
    }

    //metodo para el radiobutton
    /*public void onRadioButtonClicked(View view) {
        int id = view.getId();
        if (id == R.id.rMasculino) {
            eCorreo.setText("Masculino");
        } else {
            eCorreo.setText("Femenino");
        }
    }*/

    //metodo para
    /*public void onCheckboxClicked(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.cNadar:
                if (cNadar.isChecked()) {
                    eCorreo.setText("Nadar");
                }
                break;
            case R.id.cCorrer:
                if (cCorrer.isChecked()) {
                    eCorreo.setText("Correr");
                }
                break;
            case R.id.cCine:
                if (cCine.isChecked()) {
                    eCorreo.setText("Cine");
                }
                break;
        }
    }*/

    public void LlamarFecha(View view) {
        datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                tFecha.setText(day + "/" + month + "/" + year);
                y = year;
                d = day;
                m = month;
            }
        }, y, m, d);
        datePickerDialog.show();
    }
}



