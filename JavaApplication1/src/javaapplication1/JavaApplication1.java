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
      
        Scanner sc = new Scanner(System.in);
        int[][] numeros = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                System.out.println("ingrese elemento para la posicion" + i + "columna" + j);
                numeros[i][j] = sc.nextInt();
                
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                System.out.print(numeros[i][j]+"\t");
            }
            System.out.print("\n");
}
    }
