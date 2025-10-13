package Primera_Evaluacion.Practicas.boletin01;

import java.util.Scanner;

public class practica25 {
	
	/**
	 
	 	25. Escribir un programa que reciba por teclado un número y muestre sucesivamente el
		resultado de ir dividiéndolo por dos sucesivamente hasta llegar a un número igual o menor a
		1. Caso de ser necesario los resultados se mostrarán con dos decimales. Un ejemplo de una
		ejecución correcta después de introducir el número 34 sería esta:
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println(" Introduce el primer número: ");
		double numero = teclado.nextDouble();
		
		System.out.println(" Has introducido el número [ " + numero + " ]");
		
		while (numero > 1) {
			numero = numero / 2;
			System.out.printf("%.2f%n ", numero);
		
		}
		teclado.close();
	}
	
	
}