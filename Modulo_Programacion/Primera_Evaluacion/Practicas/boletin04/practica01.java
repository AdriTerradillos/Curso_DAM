package Primera_Evaluacion.Practicas.boletin04;

import java.util.Scanner;

public class practica01 {
	
	public static void main(String[] args) {
		
		 /**
	     * 1. Calcular el factorial de un número introducido por teclado
	     * Ejemplo: 6! = 6*5*4*3*2*1 = 720
	     */


	   Scanner teclado = new Scanner(System.in);

	     System.out.println("Introduce un número entero positivo:");
	      int numero = teclado.nextInt();

//	       genermos variable para almacenar factorial
	       int factorial = 1; 

//	         Comprobamos que el número sea positivo
	       
	        if (numero < 0) {
	            System.out.println("El factorial no está definido para números negativos.");
	        } else {
	            // Calculamos factorial usando un bucle --> anidamos bucle for 
	        	
	            for (int i = 1; i <= numero; i++) {
	                factorial *= i;
	            }

	            // Mostramos el resultado
	            System.out.println("El factorial de " + numero + " es: " + factorial);
	        }

	        teclado.close();
	    }
		
		
	}
