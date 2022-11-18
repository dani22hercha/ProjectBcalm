package com.example.projectbcalm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Método para el botón iniciar
    public void Iniciar(View view){
        Intent i = new Intent(this, MenuPrincipal.class);
        startActivity(i);
    }
}