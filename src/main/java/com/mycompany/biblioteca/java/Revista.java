package com.mycompany.biblioteca.java;

public class Revista extends Publicacion {
    
    int NumeroRevistas;
    String NombreRevista;

    public Revista(int NumeroRevistas, String NombreRevista, String Titulo, int anoPublicacion) {
        super(Titulo, anoPublicacion);
        this.NumeroRevistas = NumeroRevistas;
        this.NombreRevista = NombreRevista;
    }
    
    //Overrida

    @Override
    public String toString() {
        return "Revista{"+ "Titulo=" + super.Titulo + ", anoPublicacion=" + super.anoPublicacion + "NumeroRevistas=" + NumeroRevistas + ", NombreRevista=" + NombreRevista + '}';
    }
    
    
   
}
