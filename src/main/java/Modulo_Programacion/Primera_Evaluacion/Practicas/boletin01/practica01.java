package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin01;

import java.util.Scanner;

public class practica01 {

    /*
    1. Escribir un programa donde se muestren los 10 primeros números enteros
     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Los 10 primeros números enteros son:");

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        teclado.close();
    }
}
