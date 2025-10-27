package main.java.Modulo_Programacion.Primera_Evaluacion.Practicas.boletin01;

import java.util.Scanner;

public class practica08 {

    // Ejercicio 8 -> Escribir un programa que reciba el importe de una cantidad a pagar y número de
    // meses, y devuelva el pago mensual.

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el importe total en euros: ");
        double importe = teclado.nextDouble();

        System.out.print("Introduce el número de meses: ");
        int meses = teclado.nextInt();

        double pagoMensual = importe / meses;

        // Forma 1: usando printf
        System.out.printf("El pago mensual será: %.2f euros%n", pagoMensual);

        // Forma 2 (alternativa): usando String.format
        // System.out.println(String.format("El pago mensual será: %.2f euros", pagoMensual));

        teclado.close();

        System.out.println();
        System.out.println("*** Fin del Programa ***");
        System.out.println();
    }
}