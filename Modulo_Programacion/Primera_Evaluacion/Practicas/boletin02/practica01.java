package Primera_Evaluacion.Practicas.boletin02;

import java.util.Arrays;
import java.util.Scanner;

public class practica01 {
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingresa la primera palabra: ");
		String palabra1 = teclado.nextLine();
		
		System.out.println("Ingresa la segunda palabra: ");
		String palabra2 = teclado.nextLine();
		
		System.out.println("Ingresa la tercera palabra: ");
		String palabra3 = teclado.nextLine();
		
		
		// guardamos las tres palabras dentro de un Array
		String[] palabras = {palabra1, palabra2, palabra3 };
		
		// ordenamos el array alfabéticamente
		Arrays.sort(palabras);
		
		// mostramos resultado
		System.out.println("\nPalabras ordenadas alfabéticamente: ");
		
		for(String p : palabras) {
			System.out.println(p);
			
		}
		
		
		teclado.close();
	}
	
}