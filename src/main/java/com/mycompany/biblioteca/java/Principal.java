package com.mycompany.biblioteca.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    static ArrayList publicaciones = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MostrarPublicaciones();

    }

    public static void agregarPublicacion() {

        int opc = Integer.parseInt(sc.nextLine());

        switch (opc) {
            case 1:
                System.out.println("Ingrese el nombre de la revista: ");

                break;
            default:
                throw new AssertionError();
        }
    }

    public static void MostrarPublicaciones() {
        for (int i = 0; i < publicaciones.size(); i++) {
            System.out.println(i + " : " + publicaciones.get(i).toString());
        }

    }

    public static void EditarPublicaciones() {
        MostrarPublicaciones();

        System.out.println("Ingresa el que quieras editar");
        // int index sirve para identificar cual de la lista quieres editar
        int index = sc.nextInt();
        sc.nextLine();

        if (index < 0 || index >= publicaciones.size()) {
            System.out.println("Indice invalido");
        
        return; // pa terminar la ejecucion
    }
    
       Publicacion publicacion = (Publicacion) publicaciones.get(index);


}
}