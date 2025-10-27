package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin02;

import java.util.Scanner;

public class practica15 {

    /*

        15. Modifica el programa anterior para que al iniciar el juego te pida dos parámetros con
        objeto de cambiar la dificultad del juego: el número máximo (antes era siempre 50) o
        el número de intentos posibles (antes era siempre 5)

     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el número máximo posible: ");
        int maxNumero = teclado.nextInt();

        System.out.print("Introduce el número máximo de intentos: ");
        int maxIntentos = teclado.nextInt();

        int numeroSecreto = (int) (Math.random() * maxNumero) + 1;
        boolean acertado = false;
        int intentoActual = 0;

        while (intentoActual < maxIntentos && !acertado) {
            intentoActual++;
            System.out.print("Intento " + intentoActual + ": ");
            int intento = teclado.nextInt();

            if (intento == numeroSecreto) {
                acertado = true;
            } else if (intento < numeroSecreto) {
                System.out.println("Demasiado bajo.");
            } else {
                System.out.println("Demasiado alto.");
            }
        }


        if (acertado) {
            System.out.println("¡Has acertado!");
        } else {
            System.out.println("Has perdido. El número era: " + numeroSecreto);
        }

        teclado.close();
    }
}
