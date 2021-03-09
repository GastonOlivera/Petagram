package com.example.petagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView ListaAnimales;
    private RecyclerView ListaHuesos;
    ArrayList<Animales> animales;
    ImageView estrella;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar MiactionBar=(Toolbar) findViewById(R.id.MiactionBar);
        setSupportActionBar(MiactionBar);

        ListaAnimales=(RecyclerView) findViewById(R.id.RecyclerAnimales);
        estrella=(ImageView) findViewById(R.id.BotonEstrella);


        LinearLayoutManager llm=new LinearLayoutManager(this);
        GridLayoutManager glm=new GridLayoutManager(this,1);
        ListaAnimales.setLayoutManager(glm);

        InicializarAnimales();
        InicializarAdapter();



    }

    public void InicializarAdapter(){
        AnimalAdapter CA=new AnimalAdapter(animales);
        ListaAnimales.setAdapter(CA);
    }



    public void InicializarAnimales(){
        animales = new ArrayList<Animales>();
        animales.add(new Animales(R.drawable.conejito,R.string.NombreAnimal1,R.drawable.hueso_dorado));
        animales.add(new Animales(R.drawable.peque_o_pony,R.string.NombreAnimal2,R.drawable.hueso_vacio));
        animales.add(new Animales(R.drawable.max ,R.string.NombreAnimal3,R.drawable.hueso_vacio));
        animales.add(new Animales(R.drawable.oso,R.string.NombreAnimal4,R.drawable.hueso_dorado));
        animales.add(new Animales(R.drawable.oso_cazador,R.string.NombreAnimal5,R.drawable.hueso_dorado));
        animales.add(new Animales(R.drawable.bambi,R.string.NombreAnimal6,R.drawable.hueso_vacio));
        animales.add(new Animales(R.drawable.zorrote,R.string.NombreAnimal7,R.drawable.hueso_dorado));
        animales.add(new Animales(R.drawable.pajaro,R.string.NombreAnimal8,R.drawable.hueso_vacio));
        animales.add(new Animales(R.drawable.ardill_removebg_preview,R.string.NombreAnimal9,R.drawable.hueso_dorado));
        animales.add(new Animales(R.drawable.erizo,R.string.NombreAnimal10,R.drawable.hueso_vacio));
    }

















    public void PantallaFavoritos(View view){
        Intent intent=new Intent(this, Favoritos.class);
        startActivity(intent);

    }







}