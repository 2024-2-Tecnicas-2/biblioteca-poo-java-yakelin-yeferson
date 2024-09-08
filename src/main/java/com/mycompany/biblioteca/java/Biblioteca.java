package com.mycompany.biblioteca.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    static ArrayList publicaciones = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opc;
        while (true) {
            System.out.println("1.Agregar publicacion: ");
            System.out.println("2.Mostrar Publicaciones: ");
            System.out.println("3.Editar publicacion: ");
            opc = Integer.parseInt(sc.nextLine());
            if(opc ==1){
                agregarPublicacion(opc);
            }else if(opc ==2){
                MostrarPublicaciones(opc);
                
            }else if(opc ==3){
                EditarPublicaciones(opc);
            
            }else System.out.println("Ingrese una opcion correcta");
        }

    }

    public static void agregarPublicacion(int opc) {
        Revista rv = new Revista();
        

        switch (opc) {
            case 1:
                System.out.println("Ingrese el titulo de la revista: ");
                String Nomb = sc.nextLine();
                rv.setTitulo(Nomb);
                System.out.println("Ingrese el año de publicacion: ");
                int ano = Integer.parseInt(sc.nextLine());
                rv.setAnoPublicacion(ano);
                System.out.println("Ingrese el numero de revista: ");
                int numbrevista = Integer.parseInt(sc.nextLine());
                rv.setNumeroRevistas(numbrevista);
                System.out.println("Ingrese el nombre de la revista: ");
                String nombRevista = sc.nextLine();
                rv.setNombreRevista(nombRevista);
                publicaciones.add(rv);

                break;
            case 2:
                MostrarPublicaciones(opc);
                break;
            case 3:
                EditarPublicaciones(opc);
            default:
                throw new AssertionError();
        }
    }

    public static void MostrarPublicaciones(int opc) {
        for (int i = 0; i < publicaciones.size(); i++) {
            System.out.println(i + " : " + publicaciones.get(i).toString());
        }

    }

    public static void EditarPublicaciones(int opc) {
        MostrarPublicaciones(opc);

        System.out.println("Ingresa el que quieras editar");

        // int index sirve para identificar cual de la lista quieres editar
        int index = sc.nextInt();
        sc.nextLine();

        if (index < 0 || index >= publicaciones.size()) {
            System.out.println("Indice invalido");

            return; // pa terminar la ejecucion

        }

        Publicacion publicacion = (Publicacion) publicaciones.get(index);

        System.out.println("Introduce el nuevo titulo");
        String nuevoTitulo = sc.nextLine();
        publicacion.setTitulo(nuevoTitulo);

        System.out.println("Publicación actualizada con éxito.");

    }
}
