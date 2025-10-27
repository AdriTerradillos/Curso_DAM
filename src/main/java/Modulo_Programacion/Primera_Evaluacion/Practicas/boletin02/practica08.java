package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin02;

import java.util.Scanner;

public class practica08 {

    /*

        8. Escribe un programa que pida un número por teclado y escriba todos sus divisores
        separados por comas (y evitando poner una coma al final). Por ejemplo, si el número
        introducido es el 14 tu programa debería de mostrar lo siguiente:

        Divisores del número 14: 1, 2, 7, 14

     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();

        System.out.print("Divisores del número " + numero + ": ");

        // 1. Recorremos desde 1 hasta el número
        for (int i = 1; i <= numero; i++) {
            // 2. Si el resto es 0, i es divisor
            if (numero % i == 0) {
                System.out.print(i);
                // 3. Evitamos poner una coma al final
                if (i != numero) {
                    System.out.print(", ");
                }
            }
        }

        System.out.println();
        teclado.close();
    }
}
