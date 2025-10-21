package Primera_Evaluacion.Practicas.boletin03;

import java.util.Scanner;

public class practica11 {
	
/**
 		11. Mejorar el programa anterior para que detecte si se trata de un NIF o un NIE y nos
		comunique, además de si es válido de que tipo es.

 */

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println(" Introduce un NIF o el NIE: ");
		String identificador = teclado.nextLine();
		
		boolean isCorrect = false;
		
		if (identificador.length() == 9) {
			char primerValor = identificador.charAt(0);
			char ultimoValor = identificador.charAt(8);
			
			if (Character.isLetter(ultimoValor)) {
				
				if (Character.isDigit(primerValor)) {
//					podría ser un NIF
					String numeros = identificador.substring(0, 8);
					
					if (numeros.matches("\\d{8}")) {
						isCorrect = true;
						System.out.println(" Es un NIF correcto. ");
						
					} 
					
				} else if ("XYZxyz".indexOf(primerValor) != -1) {
//					 podría ser el NIE
					String body = identificador.substring(1, 8);
					isCorrect = true;
					System.out.println(" Es un NIE correcto. ");
					
				}
					
				}
			}
		}
	}

