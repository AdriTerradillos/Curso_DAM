package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin04;

import java.util.Scanner;

public class practica10 {

    /*
        10. Escribir un programa que nos pida una cadena por teclado y luego nos imprima sólo
        las cifras que aparecen en ella.
        Por ejemplo, si introducimos la cadena “Beverly Hills, 5. CP: 28934” Debería
        devolvernos: 528934
     */


    public static void main(String[] args) {

        // Voy a pedir una cadena y mostrar solo los dígitos que contiene
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena:");
        String cadena = teclado.nextLine();

        int i = 0;
        while (i < cadena.length()) {
            char c = cadena.charAt(i);
            if (c >= '0' && c <= '9') {
                System.out.print(c);
            }
            i++;
        }
        System.out.println();

        teclado.close();

    }
}
