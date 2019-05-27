/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author io
 */
public class JavaApplication1 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String... ejemplo) {
        
        System.out.println ("ingrese el tamaño del vector");
        Scanner sc = new Scanner(System.in);
        int tamano = sc.nextInt();
        
        String[] vector = new String [3];
        
        for(int i = 0; i < vector.length; i++){
            System.out.println("ingrese contenido para la posicion" + i + " : ");
            vector[i]= sc.next();
        }
     
        System.out.println ("--------------");
        
        for(String dato : vector) {
            System.out.println(dato);
        }
  }     
        
}
