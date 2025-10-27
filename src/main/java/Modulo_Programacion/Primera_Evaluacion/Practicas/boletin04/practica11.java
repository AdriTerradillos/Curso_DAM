package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin04;

import java.util.Scanner;

public class practica11 {

    /*

        11. Escribir un programa que nos pida una frase por teclado y luego nos la imprima
        separando todos los caracteres de sus palabras (excepto los espacios) con un guión.

        Por ejemplo, si la frase introducida es “esto es una prueba” la salida del programa
        debería de ser “e-s-t-o e-s u-n-a p-r-u-e-b-a”
     */


    public static void main(String[] args) {

        // Voy a pedir una frase y separar cada carácter de sus palabras con guiones
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = teclado.nextLine();

        int i = 0;
        while (i < frase.length()) {
            char c = frase.charAt(i);
            if (c != ' ') {
                System.out.print(c);
                // Agrego guión si no es el último carácter de la palabra
                if (i + 1 < frase.length() && frase.charAt(i + 1) != ' ') {
                    System.out.print("-");
                }
            } else {
                System.out.print(" ");
            }
            i++;
        }
        System.out.println();

        teclado.close();

    }
}
