package Primera_Evaluacion.Practicas.boletin01;

import java.util.Scanner;



public class practica21 {
	
	/**
	 	21. Escribir un programa que pida por teclado un número al usuario y calcule si es primo o no

	 * @param args
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println(" Introduce un número: ");
		int numero = teclado.nextInt();
		
		// ¿es un número primo divisible entre 1?
		boolean isPrimo = true;
		
		
		if (numero <= 1) {
			isPrimo = false;
	
		} else {
			for (int i = 2; i <= numero / 2; i++) {
				if (numero % i == 0) {
					isPrimo = false;
					break;
				}
				
			}
		}
		
		if (isPrimo) {
			System.out.println("[ " + numero + " ] es un número primo.");
			
		} else {
			System.out.println("[ " + numero + " ] no es un número primo.");
		}
		
		teclado.close();
		
	}
}