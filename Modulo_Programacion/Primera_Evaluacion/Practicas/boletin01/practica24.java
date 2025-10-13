package Primera_Evaluacion.Practicas.boletin01;

import java.util.Scanner;

public class practica24 {
	
	
	/**
	 
	 	24. Modifica el programa anterior para que sea el usuario quién introduzca dos números y se nos
		muestre los primos que hay entre ambos

	 	
	 
	 */
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println(" Introduce el primer número: ");
		int primerNumero = teclado.nextInt();
		
		System.out.println(" Introduce el segundo número: ");
		int segundoNumero = teclado.nextInt();
		
		System.out.println("\nNúmeros primos entre  [ " + primerNumero + " ] y [ " + segundoNumero + " ]:" );
		
		
		for (int numero = Math.min(primerNumero, segundoNumero); numero <= Math.max(primerNumero, segundoNumero); numero++) {
			boolean isPrimo = true;
			if (numero <= 1) {
				isPrimo = false;
			}
			
			else {
				for (int i = 2; i <= Math.sqrt(numero); i++) {
					if (numero % i == 0) {
						isPrimo = false;
						break;
					}
				}
			}
			
			if(isPrimo) {
				System.out.println(numero + " ");
				
			}
		}
		
		teclado.close();
	}
	
}