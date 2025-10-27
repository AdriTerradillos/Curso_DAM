package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin04;

import java.util.Scanner;

public class practica07 {


    /*
            7. Decimos que dos números primos son gemelos cuando están separados por un único
            número (el 11 y el 13, el 17 y el 19, el 41 y el 43, etc.). Escribir un programa que calcule
            la primera pareja de primos gemelos por encima del 50.
    */

    public static void main(String[] args) {

        // Voy a buscar la primera pareja de primos gemelos mayor que 50
        Scanner teclado = new Scanner(System.in);

        int numero = 51;
        while (true) {
            boolean esPrimo1 = true;
            int i = 2;
            while (i <= numero / 2) {
                if (numero % i == 0) esPrimo1 = false;
                i++;
            }

            boolean esPrimo2 = true;
            int siguiente = numero + 2;
            int j = 2;
            while (j <= siguiente / 2) {
                if (siguiente % j == 0) esPrimo2 = false;
                j++;
            }

            if (esPrimo1 && esPrimo2) {
                System.out.println("La primera pareja de primos gemelos por encima de 50 es: " + numero + " y " + siguiente);
                break;
            }

            numero++;
        }

        teclado.close();
    }
}
