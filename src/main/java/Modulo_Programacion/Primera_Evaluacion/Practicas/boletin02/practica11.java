package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin02;

import java.util.Scanner;

public class practica11 {

    /*

        11. Modificar el programa anterior para que, además, nos diga al final cual han sido el
        número mayor y el menor que has introducido

     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;
        int contador = 0;
        double suma = 0;
        int mayor = 0;
        int menor = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.print("Introduce un número entre 1 y 100 (0 para salir): ");
            numero = teclado.nextInt();

            if (numero == 0) {
                continuar = false;
            } else if (numero >= 1 && numero <= 100) {
                suma += numero;
                contador++;

                if (contador == 1) { // Primer número válido
                    mayor = numero;
                    menor = numero;
                } else {
                    if (numero > mayor) {
                        mayor = numero;
                    }
                    if (numero < menor) {
                        menor = numero;
                    }
                }
            } else {
                System.out.println("Número fuera de rango.");
            }
        }

        if (contador > 0) {
            double media = suma / contador;
            System.out.println("Media: " + media);
            System.out.println("Mayor: " + mayor);
            System.out.println("Menor: " + menor);
        } else {
            System.out.println("No se introdujeron números válidos.");
        }

        teclado.close();
    }
}
