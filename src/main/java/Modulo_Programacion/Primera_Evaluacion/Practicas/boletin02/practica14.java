package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin02;

import java.util.Scanner;

public class practica14 {

    /*

        14. Modifica el programa anterior para que al final del programa te pida si quieres volver
        a jugar y en caso afirmativo comience una nueva partida

     */

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        String respuesta;

        do {
            int numeroSecreto = (int) (Math.random() * 50) + 1;
            boolean acertado = false;
            int intentos = 0;

            while (!acertado) {
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

            System.out.println("¡Acertaste en " + intentos + " intento(s)!");

            System.out.print("¿Quieres jugar otra vez? (S/N): ");
            respuesta = teclado.next();

        } while (respuesta.equalsIgnoreCase("S"));

        System.out.println("Fin del juego. ¡Gracias por jugar!");
        teclado.close();
    }
}
