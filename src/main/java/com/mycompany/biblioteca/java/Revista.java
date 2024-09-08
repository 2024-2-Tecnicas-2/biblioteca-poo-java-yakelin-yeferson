package com.mycompany.biblioteca.java;

public class Revista extends Publicacion {
    
    int NumeroRevistas;
    String NombreRevista;
    
    //Getter and setter

    public int getNumeroRevistas() {
        return NumeroRevistas;
    }

    public void setNumeroRevistas(int NumeroRevistas) {
        this.NumeroRevistas = NumeroRevistas;
    }

    public String getNombreRevista() {
        return NombreRevista;
    }

    public void setNombreRevista(String NombreRevista) {
        this.NombreRevista = NombreRevista;
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
    
      
    //constructor Vacio

    public Revista() {
    }
    

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
