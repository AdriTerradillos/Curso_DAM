package main.java.Modulo_Programacion.Primera_Evaluacion.Practicas.boletin04;

import java.util.Scanner;

public class practica01 {


    /**
     1. Escribir un programa que pida un número por teclado y calcule su factorial. Como
     sabes, la factorial de un número se calcula multiplicando ese número por los
     sucesivos factores que obtenemos restando uno hasta llegar a la unidad. Por ejemplo,
     el factorial de 6 (que se representa así 6!) sería este:

     6! = 6*5*4*3*2*1 = 720

     */
	public static void main(String[] args) {

        // Voy a pedir al usuario un número para calcular su factorial
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número entero no negativo:");
        int n = teclado.nextInt();

        if (n < 0) {
            // No puedo calcular factorial de números negativos
            System.out.println("El número no puede ser negativo.");
        } else {
            // Inicializo el factorial en 1 y multiplico sucesivamente hasta n
            int factorial = 1;
            int i = 1;
            while (i <= n) {
                factorial *= i;
                i++;
            }
            System.out.println(n + "! = " + factorial);
        }

        teclado.close();
	    }
		
		
	}
