package com.mycompany.biblioteca.java;

public class Publicacion {
    String Titulo;
    int anoPublicacion;

    public Publicacion(String Titulo, int anoPublicacion) {
        this.Titulo = Titulo;
        this.anoPublicacion = anoPublicacion;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "Titulo=" + Titulo + ", anoPublicacion=" + anoPublicacion + '}';
    }
    
}
