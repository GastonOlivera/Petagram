package com.example.petagram;

public class Animales {
    int foto;
    int nombre;
    int Hueso;

    public Animales(int foto, int nombre, int hueso) {
        this.foto = foto;
        this.nombre=nombre;
        this.Hueso=hueso;
    }

    public int getHueso() {
        return Hueso;
    }

    public void setHueso(int hueso) {
        Hueso = hueso;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;

    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
