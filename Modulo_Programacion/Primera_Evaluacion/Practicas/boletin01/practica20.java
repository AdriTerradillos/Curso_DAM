package Primera_Evaluacion.Practicas.boletin01;

import java.util.Scanner;

public class practica20 {
	
	/**
	 	20. Escribir un programa que nos pida tres números por teclado en cualquier orden y nos los
		muestre en pantalla ordenados de menor a mayor

	 * @param args
	 */
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el primer número: ");
		int numero1 = teclado.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		int numero2 = teclado.nextInt();
		
		System.out.println("Introduce el tercer número: ");
		int numero3 = teclado.nextInt();
		
		
		// genero un Array para guardar dentro los números	
		int[] numeros = {numero1, numero2, numero3};
		
		// mostramos el mensaje por pantalla
		System.out.println("\nNúmeros ordenados de mayor a menor: ");
		
		for (int n : numeros) {
			System.out.println(n);
		}
	
		
		teclado.close();
		
	}
}