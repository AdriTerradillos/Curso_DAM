package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin02;

import java.util.Scanner;

public class practica05 {

    /*

            5. Escribir un programa que nos pida las notas obtenidas en un trimestre y nos muestre
            la media ponderada sabiendo que;

            1. La primera nota corresponde al trabajo en clase y cuenta como un 5% del total
            2. La segunda corresponde a los ejercicios prácticos: 15%
            3. La tercera la nota del examen: 80%
            El resultado debería de mostrarse de dos formas: redondeado con dos decimales
            (nota real) y sin redpmdeada sin decimales (nota de boletín).

     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // 1️⃣ Pedimos las tres notas
        System.out.print("Introduce la nota del trabajo en clase (0-10): ");
        double trabajo = teclado.nextDouble();

        System.out.print("Introduce la nota de los ejercicios prácticos (0-10): ");
        double practicos = teclado.nextDouble();

        System.out.print("Introduce la nota del examen (0-10): ");
        double examen = teclado.nextDouble();

        // Calculo la nota ponderada
        double notaFinal = (trabajo * 0.05) + (practicos * 0.15) + (examen * 0.80);

        // 3. Muestro la nota real (2 decimales)
        System.out.printf("Nota real: %.2f%n", notaFinal);

        // 4. Muestro la nota del boletín truncada (sin decimales)
        int notaBoletin = (int) notaFinal;
        System.out.println("Nota de boletín (sin decimales): " + notaBoletin);

        teclado.close();
    }


}
