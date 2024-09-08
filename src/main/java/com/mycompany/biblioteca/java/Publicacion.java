package com.mycompany.biblioteca.java;

public class Publicacion {
    String Titulo;
    int anoPublicacion;

    public Publicacion(String Titulo, int anoPublicacion) {
        this.Titulo = Titulo;
        this.anoPublicacion = anoPublicacion;
    }

    public Publicacion() {
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }
       

    @Override
    public String toString() {
        return "Publicacion{" + "Titulo=" + Titulo + ", anoPublicacion=" + anoPublicacion + '}';
    }
    
}
