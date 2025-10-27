package main.java.Modulo_Programacion.Primera_Evaluacion.Practicas.boletin03;

import java.util.Scanner;

public class practica14 {

/**
 		14. Modifica el programa que validaba si un NIF era correcto comprobando si la letra que
		incorpora lo es. La forma de hacerlo es la siguiente:
		
 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
		
		System.out.println(" Introdce un NIF: ");
		String nif = teclado.nextLine().toUpperCase();
		
		if (nif.matches("\\d{8}[A-Z")) {
			int numero = Integer.parseInt(nif.substring(0,8));
			char letraCorrecta = LETRAS.charAt(numero % 23);
			char letraIntroducida = nif.charAt(8);
			
			if (letraIntroducida == letraCorrecta) {
				System.out.println(" El NIF es correcto.");
				
			} else {
				System.out.println(" La letra del NIF es incorrecta. Debería ser: " + letraCorrecta);
			}
			
			} else {
				System.out.println(" Formato de NIF inválido.");
			}
		}
	}

