package com.katherineplazas.calculadorageometrica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static com.katherineplazas.calculadorageometrica.R.string.*;

public class MainActivity extends AppCompatActivity {

    RadioButton rbCuadrado,rbTriangulo,rbCirculo,rbCubo;
    EditText eLadoCuadrado,eATriangulo,eBTriangulo,eCTriangulo,eRadioCirculo,eLadoCubo;
    TextView tvAreaCuadrado,tvPerimetroCuadrado,tvAreaTriangulo,tvPerimetroTriangulo,tvAreaCirculo,tvPerimetroCirculo;
    TextView tvAreaCubo,tvVolumenCubo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rbCuadrado = findViewById(R.id.rbCuadrado);
        rbTriangulo = findViewById(R.id.rbTriangulo);
        rbCirculo = findViewById(R.id.rbCirculo);
        rbCubo = findViewById(R.id.rbCubo);
        eLadoCuadrado = findViewById(R.id.eLadoCuadrado);
        eATriangulo = findViewById(R.id.eATriangulo);
        eBTriangulo = findViewById(R.id.eBTriangulo);
        eCTriangulo = findViewById(R.id.eCTriangulo);
        eRadioCirculo = findViewById(R.id.eRadioCirculo);
        eLadoCubo = findViewById(R.id.eLadoCubo);
        tvAreaCuadrado = findViewById(R.id.tvAreaCuadrado);
        tvPerimetroCuadrado = findViewById(R.id.tvPerimetroCuadrado);
        tvAreaTriangulo = findViewById(R.id.tvAreaTriangulo);
        tvPerimetroTriangulo = findViewById(R.id.tvPerimetroTriangulo);
        tvAreaCirculo = findViewById(R.id.tvAreaCirculo);
        tvPerimetroCirculo = findViewById(R.id.tvPerimetroCirculo);
        tvAreaCubo = findViewById(R.id.tvAreaCubo);
        tvVolumenCubo = findViewById(R.id.tvVolumenCubo);

    }

    public void fselecfigura(View view) {
        int id = view.getId();
        eLadoCuadrado.setText("");
        tvAreaCuadrado.setText("");
        tvPerimetroCuadrado.setText("");
        eATriangulo.setText("");
        eBTriangulo.setText("");
        eCTriangulo.setText("");
        tvPerimetroTriangulo.setText("");
        tvAreaTriangulo.setText("");
        eRadioCirculo.setText("");
        tvPerimetroCirculo.setText("");
        tvAreaCirculo.setText("");
        eLadoCubo.setText("");
        tvAreaCubo.setText("");
        tvVolumenCubo.setText("");
        switch (id){
            case R.id.rbCuadrado:
                    eLadoCuadrado.setEnabled(true);
                    eATriangulo.setEnabled(false);
                    eBTriangulo.setEnabled(false);
                    eCTriangulo.setEnabled(false);
                    eRadioCirculo.setEnabled(false);
                    eLadoCubo.setEnabled(false);
                break;
            case R.id.rbTriangulo:
                    eLadoCuadrado.setEnabled(false);
                    eATriangulo.setEnabled(true);
                    eBTriangulo.setEnabled(true);
                    eCTriangulo.setEnabled(true);
                    eRadioCirculo.setEnabled(false);
                    eLadoCubo.setEnabled(false);
                break;
            case R.id.rbCirculo:
                    eLadoCuadrado.setEnabled(false);
                    eATriangulo.setEnabled(false);
                    eBTriangulo.setEnabled(false);
                    eCTriangulo.setEnabled(false);
                    eRadioCirculo.setEnabled(true);
                    eLadoCubo.setEnabled(false);
                break;
            case R.id.rbCubo:
                    eLadoCuadrado.setEnabled(false);
                    eATriangulo.setEnabled(false);
                    eBTriangulo.setEnabled(false);
                    eCTriangulo.setEnabled(false);
                    eRadioCirculo.setEnabled(false);
                    eLadoCubo.setEnabled(true);
                break;
        }
    }

    public void fcalcular(View view) {
        float LadoCudrado;
        float LadoA, LadoB,LadoC,Radio,LadoCubo;
        float Area,Periemtro,Volumen;
        CharSequence Mensaje,Mensaje2;
        Mensaje = getResources().getString(R.string.llenarcampo);

        if (rbCuadrado.isChecked()== true){
            if (eLadoCuadrado.getText().toString().trim().equalsIgnoreCase("")){
                eLadoCuadrado.setError(Mensaje);
            }else{
                LadoCudrado = Float.parseFloat(eLadoCuadrado.getText().toString());
                Area = (float)(Math.pow(LadoCudrado,2));
                Periemtro = 4*LadoCudrado;
                tvAreaCuadrado.setText(String.format("%.2f",Area));
                tvPerimetroCuadrado.setText(String.format("%.2f",Periemtro));
            }
        }else if(rbTriangulo.isChecked() == true)
        {
            if(eATriangulo.getText().toString().trim().equalsIgnoreCase("")){
                eATriangulo.setError(Mensaje);
            }else if(eBTriangulo.getText().toString().trim().equalsIgnoreCase("")){
                eBTriangulo.setError(Mensaje);
            }else if (eCTriangulo.getText().toString().trim().equalsIgnoreCase("")){
                eCTriangulo.setError(Mensaje);
            }else{
                LadoA = Float.parseFloat(eATriangulo.getText().toString());
                LadoB = Float.parseFloat(eBTriangulo.getText().toString());
                LadoC = Float.parseFloat(eCTriangulo.getText().toString());
                if(LadoA<LadoC+LadoB && LadoB<LadoC+LadoA && LadoC<LadoA+LadoB ){
                    Periemtro = LadoA + LadoB + LadoC;
                    Area = (float)((LadoA + LadoB + LadoC)/2.0);
                    Area = (float) Math.sqrt(Area*(Area-LadoA)*(Area-LadoB)*(Area-LadoC));
                    tvAreaTriangulo.setText(String.format("%.2f",Area));
                    tvPerimetroTriangulo.setText(String.format("%.2f",Periemtro));
                }else {
                    Mensaje2 = getResources().getString(R.string.notriangulo);
                    Toast.makeText(this, Mensaje2, Toast.LENGTH_SHORT).show();
                    tvAreaTriangulo.setText("");
                    tvPerimetroTriangulo.setText("");
                }
            }
        }else if (rbCirculo.isChecked()== true){
            if (eRadioCirculo.getText().toString().trim().equalsIgnoreCase("")){
                eRadioCirculo.setError(Mensaje);
            }else {
                Radio = Float.parseFloat(eRadioCirculo.getText().toString());
                Area = (float) (Math.PI*(Math.pow(Radio,2)));
                Periemtro = (float) (2*Math.PI*Radio);
                tvPerimetroCirculo.setText(String.format("%.2f",Periemtro));
                tvAreaCirculo.setText(String.format("%.2f",Area));
            }
        }else if (rbCubo.isChecked()==true){
            if(eLadoCubo.getText().toString().trim().equalsIgnoreCase("")){
                eLadoCubo.setError(Mensaje);
            }else {
                LadoCubo = Float.parseFloat(eLadoCubo.getText().toString());
                Volumen = (float)(Math.pow(LadoCubo,3));
                Area = (float)(6*Math.pow(LadoCubo,2));
                tvAreaCubo.setText(String.format("%.2f",Area));
                tvVolumenCubo.setText(String.format("%.2f",Volumen));
            }
        }
        //operando1 = Float.parseFloat(eDatos.getText().subSequence(0,i).toString());
        //LadoCudrado = Float.parseFloat(eLadoCuadrado.getText().toString());
        //tvAreaCuadrado.setText(Float.toString(LadoCudrado));
    }

}
