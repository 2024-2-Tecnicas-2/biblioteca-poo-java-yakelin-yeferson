package com.mycompany.biblioteca.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    static ArrayList publicaciones = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        

    }
    
    public static void agregarPublicacion(){
        
        int opc = Integer.parseInt(sc.nextLine());
        
        switch (opc) {
            case 1:
                System.out.println("Ingrese el nombre de la revista: ");
                
                
                break;
            default:
                throw new AssertionError();
        }
    }
    
    
}
