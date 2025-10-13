package Primera_Evaluacion.Practicas.boletin01;

import java.util.Scanner;

public class practica15 {
	
	
	 // Ejercicio 15: Modificar el programa anterior para que si el primer número es mayor que el segundo, se corrija el rango.

	/*
	1. Pedir dos números por teclado.
	2. Si el primero es mayor que el segundo, intercambiarlos.
	3. Generar un aleatorio entre el rango corregido.
	4. Mostrar el número resultante.
	*/


	public static void main(String[] args) {

	        Scanner teclado = new Scanner(System.in);

	        System.out.print("Introduce el primer número: ");
	        int num1 = teclado.nextInt();

	        System.out.print("Introduce el segundo número: ");
	        int num2 = teclado.nextInt();
	        

	        if (num1 > num2) {
	            int temp = num1;
	            num1 = num2;
	            num2 = temp;
	        }
	        

	        int aleatorio = (int) (Math.random() * (num2 - num1 + 1)) + num1;
	        System.out.println("Número aleatorio entre " + num1 + " y " + num2 + ": " + aleatorio);


	    teclado.close();


	    }
	
}