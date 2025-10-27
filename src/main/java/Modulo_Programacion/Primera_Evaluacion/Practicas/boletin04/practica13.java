package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin04;

import java.util.Scanner;

public class practica13 {


    /*
        13. Hacer un programa que lea un número y un carácter y visualice una matriz compacta
        repitiendo ese carácter y con tantas filas y columnas como indique el número. Por
        ejemplo, si metemos el 4 y la x nos debería de mostrar esto:

            --> xxxx
            --> xxxx
            --> xxxx
            --> xxxx
     */


    public static void main(String[] args) {

        // Voy a pedir un tamaño y un carácter para dibujar una matriz cuadrada
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el tamaño de la matriz:");
        int n = teclado.nextInt();
        teclado.nextLine(); // limpio buffer
        System.out.println("Introduce un carácter:");
        char c = teclado.nextLine().charAt(0);

        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                System.out.print(c);
                j++;
            }
            System.out.println();
            i++;
        }

        teclado.close();
    }
}
