package com.mycompany.biblioteca.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    static ArrayList publicaciones = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("");
        

    }
    
    public static void agregarPublicacion(int opc){
        Revista rv = new Revista();
        
        
        switch (opc) {
            case 1:
                System.out.println("Ingrese el titulo de la revista: ");
                String Nomb = sc.nextLine();
                rv.setTitulo(Nomb);
                System.out.println("Ingrese el año de publicacion: ");
                int ano = Integer.getInteger(sc.nextLine());
                rv.setAnoPublicacion(ano);
                System.out.println("Ingrese el numero de revista: ");
                int numbrevista = Integer.getInteger(sc.nextLine());
                rv.setNumeroRevistas(numbrevista);
                System.out.println("Ingrese el nombre de la revista: ");
                String nombRevista = sc.nextLine();
                rv.setNombreRevista(nombRevista);
                publicaciones.add(rv);
                
                
                
                
                break;
            default:
                throw new AssertionError();
        }
    }
    
    
    
    
}
