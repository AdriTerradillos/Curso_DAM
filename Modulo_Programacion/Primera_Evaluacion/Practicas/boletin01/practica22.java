package Primera_Evaluacion.Practicas.boletin01;

import java.util.Random;

public class practica22 {
	
	/**
	 	22. Escribir un programa que genere un número primo aleatorio entre el 10.000.000 y el
		50.000.000
		
	 * @param args
	 
	 */
	
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int numero;
		boolean isPrimo;
		
		do { // generamos números aleatorios
			numero = 10_000_000 + random.nextInt(40_000_001);
			isPrimo = true;
			
			for (int i = 2; i<= Math.sqrt(numero); i++) {
				if (numero % i == 0) {
					isPrimo = false;
					break;
				}
			}
		
		} while(!isPrimo);
		
		System.out.println("Número primo aleatorio: " + numero);
	
	}
	
}