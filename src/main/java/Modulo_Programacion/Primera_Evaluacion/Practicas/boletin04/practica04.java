package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin04;

import java.util.Scanner;

public class practica04 {

    /*
        4. Escribir un programa que cuente el número de cifras que tiene un número (por
        ejemplo, el 8 tiene una cifra, el 221 tres y el 456789 seis).
     */

    public static void main(String[] args) {

        // Voy a pedir un número al usuario para contar cuántas cifras tiene
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número entero:");
        int n = teclado.nextInt();

        if (n == 0) {
            System.out.println("El número tiene 1 cifra.");
        } else {
            // Hago positivo el número si es negativo
            int numero = (n < 0) ? -n : n;

            int cifras = 0;
            // Divido sucesivamente entre 10 hasta que el número sea 0
            while (numero > 0) {
                numero /= 10;
                cifras++;
            }
            System.out.println("El número tiene " + cifras + " cifras.");
        }

        teclado.close();
    }
}

