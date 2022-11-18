package com.example.projectbcalm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }

    //Método para el botón ver Perfil
    public void VerPerfil(View view){
        Intent i = new Intent(this, Perfil.class);
        startActivity(i);
    }

    //Método para el botón ver Frases de emociones
    public void VerFrasesEmociones(View view){
        Intent i = new Intent(this, FrasesEmociones.class);
        startActivity(i);
    }

    //Método para el botón ver Encuesta de emociones
    public void VerEncuestaEmociones(View view){
        Intent i = new Intent(this, EncuestaEmociones.class);
        startActivity(i);
    }

    //Método para el botón ver Lista de emociones
    public void VerListaEmociones(View view){
        Intent i = new Intent(this, ListaEmociones.class);
        startActivity(i);
    }

    //Método para el botón Atrás
    public void Atras(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}