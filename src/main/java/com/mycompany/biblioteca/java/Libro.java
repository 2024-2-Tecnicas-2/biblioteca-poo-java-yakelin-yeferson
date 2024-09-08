package com.mycompany.biblioteca.java;

public class Libro extends Publicacion {
    
    String Autor;
    int Numero_de_paginas;


    
    //Getter and setter

    public Libro() {
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumero_de_paginas() {
        return Numero_de_paginas;
    }

    public void setNumero_de_paginas(int Numero_de_paginas) {
        this.Numero_de_paginas = Numero_de_paginas;
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
