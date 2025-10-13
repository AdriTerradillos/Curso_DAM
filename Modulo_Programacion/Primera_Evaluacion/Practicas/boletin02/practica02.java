package Primera_Evaluacion.Practicas.boletin02;

import java.util.Arrays;
import java.util.Scanner;

public class practica02 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println(" Ingresa la primera palabra: ");
		String palabra1 = teclado.nextLine();
		
		System.out.println(" Ingresa la segunda palabra: ");
		String palabra2 = teclado.nextLine();
		
		System.out.println("Ingresa la tercera palabra: ");
		String palabra3 = teclado.nextLine();
		
		
		// de nuevo, guardamos las palabras dentro de un Array
		String[] palabras = {palabra1, palabra2, palabra3};
		
		// ordnamos Array alfabéticamente
		Arrays.sort(palabras);
		
		// mostramos resultado
		
		System.out.println("\n Palabras ordenadas de la Z a la A: ");
		
		for (int i = palabras.length - 1; i >= 0; i--) {
			System.out.println(palabras[i]);
		}
		
		teclado.close();
	}
}