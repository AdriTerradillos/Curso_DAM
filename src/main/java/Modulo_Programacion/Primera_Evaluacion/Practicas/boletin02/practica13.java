package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin02;

import java.util.Scanner;

public class practica13 {

    /*

        13. Modifica el programa anterior para que el programa te de todos los intentos que
        necesites pero que cuando aciertes te informe de cuantas veces has fallado antes de
        lograrlo

     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numeroSecreto = (int) (Math.random() * 50) + 1;
        int fallos = 0;
        boolean acertado = false;

        while (!acertado) {
            System.out.print("Adivina el número (1–50): ");
            int intento = teclado.nextInt();

            if (intento == numeroSecreto) {
                acertado = true;
            } else {
                if (intento < numeroSecreto) {
                    System.out.println("Demasiado bajo.");
                } else {
                    System.out.println("Demasiado alto.");
                }
                fallos++;
            }
        }

        System.out.println("¡Acertaste! Fallaste " + fallos + " veces.");
        teclado.close();
    }
}
