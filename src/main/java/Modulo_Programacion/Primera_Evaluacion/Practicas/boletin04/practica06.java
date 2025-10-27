package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin04;

import java.util.Scanner;

public class practica06 {

    /*
        6. Escribir un programa que muestre por pantalla los 50 primeros números primos, sus
        raíces cuadradas, sus cuadrados y sus cubos
     */

    public static void main(String[] args) {

        // Voy a mostrar los 50 primeros números primos junto con su raíz, cuadrado y cubo
        Scanner teclado = new Scanner(System.in);

        int contador = 0;
        int numero = 2;

        System.out.println("Nº | Raíz | Cuadrado | Cubo");

        while (contador < 50) {
            boolean esPrimo = true;
            int i = 2;
            while (i <= numero / 2) {
                if (numero % i == 0) esPrimo = false;
                i++;
            }

            if (esPrimo) {
                double raiz = Math.sqrt(numero);
                double cuadrado = numero * numero;
                double cubo = numero * numero * numero;
                System.out.printf("%d | %.2f | %.0f | %.0f%n", numero, raiz, cuadrado, cubo);
                contador++;
            }
            numero++;
        }

        teclado.close();

    }
}
