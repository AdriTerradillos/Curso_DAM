package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin02;

import java.util.Scanner;

public class practica07 {

/*

        7. Escribir un programa que pida un número por teclado y nos imprima la tabla de
        multiplicar de dicho número del 1 al 10. Por ejemplo, si introducimos el 74 el
        resultado será algo así:

        74 x 1 = 74
        74 x 2 = 148
        …
        74 x 10 = 740

 */


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // 1. Pido el número
        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();

        // 2. Muestro la tabla del 1 al 10 usando un bucle for
        System.out.println("Tabla de multiplicar del " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        teclado.close();
    }
}
