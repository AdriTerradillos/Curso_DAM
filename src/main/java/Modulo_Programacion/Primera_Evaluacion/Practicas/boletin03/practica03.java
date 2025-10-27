package main.java.Modulo_Programacion.Primera_Evaluacion.Practicas.boletin03;

import java.util.Scanner;


public class practica03 {

    /**
     * 3. Escribir un programa que nos pida nuestro nombre y apellidos (dos peticiones
     * diferentes hechas en ese orden) y nos lo escriba formateado de la siguiente forma:
     * Morales Vázquez, José María
     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Pedimos el nombre al usuario
        System.out.println("Introduce tu nombre:");
        String nombre = teclado.nextLine();

        // Pedimos el apellido al usuario
        System.out.println("Introduce tus apellidos:");
        String apellidos = teclado.nextLine();

        // Mostramos el mensaje
        System.out.println(apellidos + ", " + nombre);

        teclado.close();
    }
}
