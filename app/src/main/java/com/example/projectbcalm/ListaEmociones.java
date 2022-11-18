package com.example.projectbcalm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListaEmociones extends AppCompatActivity {

    ListView listaEmociones;
    ListView listaSignificado;
    TextView Significado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_emociones);

        //Para mostrar los datos del List View
        listaEmociones= (ListView) findViewById(R.id.lv1);
        listaSignificado= (ListView) findViewById(R.id.lv3);
        Significado= (TextView) findViewById(R.id.tv1);

        //Para las emociones
        ArrayAdapter<CharSequence> adaptador= ArrayAdapter.createFromResource(this,R.array.arrayEmociones,
                android.R.layout.simple_list_item_1);
        listaEmociones.setAdapter(adaptador);

        //Para los significados
        ArrayAdapter<CharSequence> adaptador1= ArrayAdapter.createFromResource(this,R.array.arraySignificados,
                android.R.layout.simple_list_item_1);
        listaSignificado.setAdapter(adaptador1);

        //Click en el list
        listaEmociones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Significado.setText(listaSignificado.getItemAtPosition(i).toString());
            }
        });

    }

    //Método para el botón Atrás
    public void Atras(View view){
        Intent i = new Intent(this, MenuPrincipal.class);
        startActivity(i);
    }

}