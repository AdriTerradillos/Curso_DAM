package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin04;

import java.util.Scanner;

public class practica09 {


    /*

        9. Escribir un programa que nos pida por teclado primero una cadena y luego un
        carácter. A continuación debe de imprimirnos cuantas veces aparece dicho carácter y
        en las posiciones de la cadena donde lo hace. Por ejemplo, si nuestra cadena es Hola
        Mundo y el carácter la o nos debería de decir algo así:

            --> La o aparece en 2 ocasiones
            --> Las posiciones en las que aparece son: 1,9
     */


    public static void main(String[] args) {

        // Voy a pedir una cadena y un carácter para contar cuántas veces aparece y sus posiciones
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena:");
        String cadena = teclado.nextLine();

        System.out.println("Introduce un carácter:");
        char c = teclado.nextLine().charAt(0);

        int contador = 0;
        int posicion = 0;

        System.out.print("El carácter '" + c + "' aparece en las posiciones: ");
        while (posicion < cadena.length()) {
            if (cadena.charAt(posicion) == c) {
                if (contador > 0) System.out.print(",");
                System.out.print(posicion);
                contador++;
            }
            posicion++;
        }

        System.out.println("\nNúmero de apariciones: " + contador);

        teclado.close();

    }
}
