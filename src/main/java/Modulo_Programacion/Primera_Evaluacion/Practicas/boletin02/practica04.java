package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin02;

import java.util.Scanner;

public class practica04 {

    /*

        4. Escribir un programa que nos pida por teclado dos calificaciones numéricas de un
        alumno y nos muestre la media aritmética resultante redondeada sin decimales. Las
        notas introducidas deben de estar entre 0 y 10 y admiten decimales. Caso de que una
        entrada sea errónea debería de advertirnos de ello y no hacer el cálculo

     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Pido las dos calificaciones
        System.out.print("Introduce la primera nota (0-10): ");
        double nota1 = teclado.nextDouble();

        System.out.print("Introduce la segunda nota (0-10): ");
        double nota2 = teclado.nextDouble();

        // Verifico que ambas notas sean válidas
        if ((nota1 < 0 || nota1 > 10) || (nota2 < 0 || nota2 > 10)) {
            System.out.println("Error: Las notas deben estar entre 0 y 10.");
        } else {
            // Calculo la media
            double media = (nota1 + nota2) / 2;

            //  Redondeo SIN decimales → Math.round devuelve un long
            long mediaRedondeada = Math.round(media);

            System.out.println("La media aritmética (redondeada) es: " + mediaRedondeada);
        }

        teclado.close();

    }
}
