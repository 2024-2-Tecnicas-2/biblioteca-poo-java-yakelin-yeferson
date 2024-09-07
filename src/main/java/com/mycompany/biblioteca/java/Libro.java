package com.mycompany.biblioteca.java;

public class Libro extends Publicacion {
    
    String Autor;
    int Numero_de_paginas;
    

    //Contructor

    public Libro(String Autor, int Numero_de_paginas, String Titulo, int anoPublicacion) {
        super(Titulo, anoPublicacion);
        this.Autor = Autor;
        this.Numero_de_paginas = Numero_de_paginas;
    }
    
    //Override

    @Override
    public String toString() {
        return "Libro{"+ "Titulo=" + super.Titulo + ", anoPublicacion=" + super.anoPublicacion + "Autor=" + Autor + ", Numero_de_paginas=" + Numero_de_paginas + '}';
    }
    
    
    
    
    
}
