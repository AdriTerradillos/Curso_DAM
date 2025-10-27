package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin02;

import java.util.Scanner;

public class practica12 {

    /*

        12. Realiza un juego en el que debes de acertar un número entre el 1 y el 50 que el
        ordenador ha elegido de forma aleatoria. El programa te indicará si has acertado, si te
        has pasado o si te has quedado corto. El programa finaliza cuando se acierta o cuando
        se superan el número máximo de intentos establecidos en 5.

     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numeroSecreto = (int) (Math.random() * 50) + 1;
        int intentos = 0;
        int maxIntentos = 5;
        boolean acertado = false;

        while (intentos < maxIntentos && !acertado) {
            System.out.print("Adivina el número (1–50): ");
            int intento = teclado.nextInt();
            intentos++;

            if (intento == numeroSecreto) {
                acertado = true;
            } else if (intento < numeroSecreto) {
                System.out.println("Demasiado bajo.");
            } else {
                System.out.println("Demasiado alto.");
            }
        }

        if (acertado) {
            System.out.println("¡Has acertado en " + intentos + " intento(s)!");
        } else {
            System.out.println("Has perdido. El número era: " + numeroSecreto);
        }

        teclado.close();


    }
}
