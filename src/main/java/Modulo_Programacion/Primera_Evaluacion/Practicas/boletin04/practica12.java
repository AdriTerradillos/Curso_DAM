package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin04;

import java.util.Scanner;

public class practica12 {

    /*
        12. Crear un programa que lea un número de año por teclado e indique si es bisiesto o
        no. Un año bisiesto es aquel que es divisible por 4, siempre y cuando no lo sea por
        100. La excepción a esta regla son los años múltiplos de 400, que siempre son
        bisiestos.
     */


    public static void main(String[] args) {

        // Voy a pedir un año y comprobar si es bisiesto
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un año:");
        int anio = teclado.nextInt();

        // Aplico la regla de bisiesto: divisible entre 4 y no entre 100, salvo múltiplos de 400
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println(anio + " es bisiesto.");
        } else {
            System.out.println(anio + " no es bisiesto.");
        }

        teclado.close();
    }
}
