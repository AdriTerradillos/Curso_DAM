package main.java.Modulo_Programacion.Primera_Evaluacion.Practicas.boletin03;

import java.util.Scanner;


public class practica10 {

/**
 		10. Escribe un programa que valide si un NIF español introducido por teclado es correcto.
		La longitud exacta de la cadena ha de ser de 9 caractéres. Los ocho primeros han de
		ser números comprendidos entre el 0 y el 9 y el último una letra que puede estar
		escrita en mayúsculas o minúsculas.
		
 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println(" Introduce un NIF: ");
		String nif = teclado.nextLine();
		
		boolean isCorrect = false;
		
//		compruebo que tiene 9 caracteres --> nif
		if (nif.length() == 9) {
			String numeros = nif.substring(0, 8);
			char caracter = nif.charAt(8);
			
			
//			verifico que los 8 primeros son números y el último es una letra
			if (numeros.matches("\\d{8}") && Character.isLetter(caracter)) {
				isCorrect = true;
				
			}
		} 
		
		if (isCorrect) {
			System.out.println(" El nif " + nif + " es válido.");
			
		} else {
			System.out.println(" El nif " + nif + " es inválido.");
			
		}
		
		System.out.println(" *** Fin del Programa ***");
		teclado.close();
	}
}
