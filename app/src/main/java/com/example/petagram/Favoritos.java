package com.example.petagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;


public class Favoritos extends AppCompatActivity {

    private RecyclerView Favoritos;
    ArrayList<Animales> animales;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        Toolbar MiactionBar=(Toolbar) findViewById(R.id.MiactionBar);
        setSupportActionBar(MiactionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Favoritos=(RecyclerView) findViewById(R.id.RecyclerAnimales);
        LinearLayoutManager llm=new LinearLayoutManager(this);
        GridLayoutManager glm=new GridLayoutManager(this,1);
        Favoritos.setLayoutManager(glm);
        InicializarAnimales();
        InicializarAdapter();
    }

    public void InicializarAdapter(){
        AnimalAdapter CA=new AnimalAdapter(animales);
        Favoritos.setAdapter(CA);
    }



    public void InicializarAnimales(){
        animales = new ArrayList<Animales>();
        animales.add(new Animales(R.drawable.conejito,R.string.NombreAnimal1,R.drawable.hueso_dorado));
        animales.add(new Animales(R.drawable.oso,R.string.NombreAnimal4,R.drawable.hueso_dorado));
        animales.add(new Animales(R.drawable.oso_cazador,R.string.NombreAnimal5,R.drawable.hueso_dorado));
        animales.add(new Animales(R.drawable.zorrote,R.string.NombreAnimal7,R.drawable.hueso_dorado));
        animales.add(new Animales(R.drawable.ardill_removebg_preview,R.string.NombreAnimal9,R.drawable.hueso_dorado));

    }

    public void PantallaFavoritos(View view){
        Intent intent=new Intent(this, com.example.petagram.Favoritos.class);
        startActivity(intent);

    }

}