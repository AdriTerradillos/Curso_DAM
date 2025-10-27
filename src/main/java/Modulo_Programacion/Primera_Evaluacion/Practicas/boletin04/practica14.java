package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin04;

import java.util.Scanner;

public class practica14 {

    /*
        14. Escribe un programa que lea una hora por teclado en formato 24 horas (HH:MM). Tu
        programa debería de decir si corresponde a la mañana (entre las 6 y las 11, ambas
        inclusive), si es una hora de la tarde (entre las 12 y las 19, ambas inclusive), si es de la
        noche (entre las 20 y las 23, ambas inclusive), si es de la madrugada (entre las 0 y las
        5, ambas inclusive) o bien, si el formato no es correcto o no se corresponde con una
        hora real (minutos de mas de 60, horas negativas o por encima de 23, etc.
     */


    public static void main(String[] args) {

        // Voy a pedir una hora en formato HH:MM y decir a qué momento del día pertenece
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la hora en formato HH:MM:");
        String entrada = teclado.nextLine();

        if (entrada.length() != 5 || entrada.charAt(2) != ':') {
            System.out.println("Formato incorrecto.");
        } else {
            int hora = Integer.parseInt(entrada.substring(0, 2));
            int minuto = Integer.parseInt(entrada.substring(3, 5));

            if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59) {
                System.out.println("Hora no válida.");
            } else if (hora >= 6 && hora <= 11) {
                System.out.println("Mañana");
            } else if (hora >= 12 && hora <= 19) {
                System.out.println("Tarde");
            } else if (hora >= 20 && hora <= 23) {
                System.out.println("Noche");
            } else {
                System.out.println("Madrugada");
            }
        }

        teclado.close();
    }
}
