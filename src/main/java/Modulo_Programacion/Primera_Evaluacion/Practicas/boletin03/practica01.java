package main.java.Modulo_Programacion.Primera_Evaluacion.Practicas.boletin03;

import java.util.Scanner;

public class practica01 {

    /**
     * 1. Escribir un programa que pida una contraseña por teclado (dos veces) y si no
     * coinciden nos lo vuelva a pedir hasta que lo hagan
     */

    public static void main(String[] args) {

        /**
         * Estructura:
         * clase Scanner
         * condicional if
         * bucle do-while
         */

        Scanner teclado = new Scanner(System.in);
        String password, copyPassword;

        // Bucle que se repite mientras las contraseñas no coincidan
        do {
            System.out.println("Escribe tu contraseña: ");
            password = teclado.nextLine();

            System.out.println("Escribe nuevamente tu contraseña: ");
            copyPassword = teclado.nextLine();

            // Condicional para verificar coincidencia
            if (!password.equals(copyPassword)) {
                System.out.println("La contraseña es incorrecta. Inténtelo de nuevo.");
            }

        } while (!password.equals(copyPassword)); // Repetir mientras sean diferentes

        // Mensaje cuando las contraseñas coinciden
        System.out.println("La contraseña es correcta. ¡Felicidades!");
        
        System.out.println();
        System.out.println("*** Fin del Programa ***");

        teclado.close();
    }
}
