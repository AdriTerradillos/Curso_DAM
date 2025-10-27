package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin02;

import java.util.Scanner;

public class practica10 {

    /*

        10. Modificar el programa anterior para que nos muestre al final la media aritmética de
        las entradas válidas

     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;
        int contador = 0;
        double suma = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.print("Introduce un número entre 1 y 100 (0 para salir): ");
            numero = teclado.nextInt();

            if (numero == 0) {
                continuar = false;
            } else if (numero >= 1 && numero <= 100) {
                suma += numero;
                contador++;
            } else {
                System.out.println("Número fuera de rango.");
            }
        }

        if (contador > 0) {
            double media = suma / contador;
            System.out.println("La media es: " + media);
        } else {
            System.out.println("No se introdujeron números válidos.");
        }

        teclado.close();

    }
}
