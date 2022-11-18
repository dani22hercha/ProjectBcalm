package com.example.projectbcalm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EncuestaEmociones extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private EditText et4;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta_emociones);

        et1= (EditText) findViewById(R.id.txt1);
        et2= (EditText) findViewById(R.id.txt2);
        et3= (EditText) findViewById(R.id.txt3);
        et4= (EditText) findViewById(R.id.txt4);
        tv1= (TextView) findViewById(R.id.txtPromedio);
    }

    //Método para calcular el promedio
    public void Calcular(View view){

        int pregunta1 = Integer.parseInt(et1.getText().toString());
        int pregunta2 = Integer.parseInt(et2.getText().toString());
        int pregunta3 = Integer.parseInt(et3.getText().toString());
        int pregunta4 = Integer.parseInt(et4.getText().toString());

        int promedio = (pregunta1+pregunta2+pregunta3+pregunta4)/4;

        tv1.setText("tu día fue de: "+promedio);
    }

    //Método para el botón Atrás
    public void Atras(View view){
        Intent i = new Intent(this, MenuPrincipal.class);
        startActivity(i);
    }

}