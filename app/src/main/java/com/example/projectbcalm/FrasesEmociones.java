package com.example.projectbcalm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class FrasesEmociones extends AppCompatActivity {

    ListView listaFrases;
    TextView listaAutores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frases_emociones);

        //Mostrar frases

        //Para mostrar los datos del List View
        listaFrases= (ListView) findViewById(R.id.lvFrases);

        //Para las emociones
        ArrayAdapter<CharSequence> adaptador= ArrayAdapter.createFromResource(this,R.array.arrayFrases,
                android.R.layout.simple_list_item_1);
        listaFrases.setAdapter(adaptador);
    }

    //Método para el botón Atrás
    public void Atras(View view){
        Intent i = new Intent(this, MenuPrincipal.class);
        startActivity(i);
    }

}