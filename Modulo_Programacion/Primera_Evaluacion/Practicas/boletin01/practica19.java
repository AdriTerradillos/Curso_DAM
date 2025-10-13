package Primera_Evaluacion.Practicas.boletin01;

import java.util.Scanner;

public class practica19 {
	
	
	// Ejercicio 19: Escribir un programa que pida un número y muestre todos sus divisores.

	/*

	1. Pedir al usuario un número usando Scanner.
	2. Usar un bucle for desde 1 hasta ese número.
	3. Si el número es divisible por el contador (resto 0), mostrarlo como divisor.
	*/
	    
	 public static void main(String[] args) {

	        Scanner teclado = new Scanner(System.in);

	        System.out.print("Introduce un número: ");
	        int num = teclado.nextInt();
	        

	        System.out.println("Divisores de " + num + ":");


	        for (int i = 1; i <= num; i++) {
	            if (num % i == 0) {
	                System.out.println(i);
	            }
	        }

	        
	    teclado.close();

	    }
	
	
	
}