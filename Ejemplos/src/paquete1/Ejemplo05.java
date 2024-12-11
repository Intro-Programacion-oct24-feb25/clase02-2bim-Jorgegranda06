/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java

       Scanner entrada = new Scanner (System.in);
        // Declarar y generar arreglos en Java
        
        System.out.println("Ingrese el numero de elementos");
        int numeroElementos = entrada.nextInt();
        
        // arreglo de tipo entero
        int[] arreglo1 = new int[numeroElementos];

        System.out.printf("%d\n", arreglo1.length);
        // Se hace uso del ciclo repetitivo for para recorrer el arreglo
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.printf("Subíndice o Índice %d, con valor %d\n",
                    i, arreglo1[i]);
        }
        
    }

}
