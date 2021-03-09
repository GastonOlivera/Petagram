package com.example.petagram;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder> {

    ArrayList<Animales> animales;
    public AnimalAdapter(ArrayList<Animales> animales)
    {
        this.animales=animales;
    }

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardviewanimales,parent,false);
        return new AnimalViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
        Animales a=animales.get(position);
        holder.imgFotoA.setImageResource(a.getFoto());
        holder.nombreA.setText(a.getNombre());
        holder.FotoH.setImageResource(a.getHueso());
    }

    @Override
    public int getItemCount() { //Cantidad Elemento Contiene Lista
        return animales.size();
    }

    public static class AnimalViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgFotoA;
        private ImageView FotoH;
        private TextView nombreA;


        public AnimalViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFotoA=(ImageView) itemView.findViewById(R.id.imgAnimal);
            nombreA=(TextView)  itemView.findViewById(R.id.NombreA);
            FotoH=(ImageView) itemView.findViewById(R.id.ImgHueso);

        }
    }
}


