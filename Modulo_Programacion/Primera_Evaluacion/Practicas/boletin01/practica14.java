package Primera_Evaluacion.Practicas.boletin01;

import java.util.Scanner;

public class practica14 {
	
	
	 // Ejercicio 14: Escribir un programa que pida dos números y genere un aleatorio entre ellos. 
	// No importa si el primero es mayor que el segundo.


	/*
	1. Pedir dos números por teclado.
	2. Generar un aleatorio entre el primero y el segundo usando Math.random().
	3. Mostrar el número resultante.
	*/


	 public static void main(String[] args) {

	        Scanner teclado = new Scanner(System.in);

	        System.out.print("Introduce el primer número: ");
	        int num1 = teclado.nextInt();
	        
	        System.out.print("Introduce el segundo número: ");
	        int num2 = teclado.nextInt();
	        

	        int aleatorio = (int) (Math.random() * (num2 - num1 + 1)) + num1;
	        System.out.println("Número aleatorio entre " + num1 + " y " + num2 + ": " + aleatorio);


	        teclado.close();
	    }
	
	
	
	
}