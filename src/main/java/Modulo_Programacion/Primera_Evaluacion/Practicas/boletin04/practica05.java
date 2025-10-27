package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin04;

import java.util.Scanner;

public class practica05 {

    /*
        5. Escribir un programa que nos diga si un número es capicúa.
     */

    public static void main(String[] args) {


        // Voy a pedir un número al usuario y comprobar si es capicúa
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número entero:");
        int n = teclado.nextInt();

        int original = n;
        int num = (n < 0) ? -n : n; // Ignoro el signo

        int invertido = 0;
        while (num > 0) {
            int digito = num % 10;
            invertido = invertido * 10 + digito;
            num /= 10;
        }

        if (invertido == ((original < 0) ? -original : original)) {
            System.out.println(original + " es capicúa.");
        } else {
            System.out.println(original + " no es capicúa.");
        }

        teclado.close();

    }
}
