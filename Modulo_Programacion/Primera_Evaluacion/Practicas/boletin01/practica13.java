package Primera_Evaluacion.Practicas.boletin01;

import java.util.Scanner;

public class practica13 {
	
	 // Ejercicio 13: Modificar el programa anterior para no admitir dados con número de caras impar.

	/*
	1. Pedir el número de dados y el número de caras.
	2. Si el número de caras es impar, mostrar error y pedir de nuevo.
	3. Una vez validado, tirar los dados con un bucle for.
	4. Mostrar los resultados en pantalla.
	*/


	 public static void main(String[] args) {

	        Scanner teclado = new Scanner(System.in);

	        int caras;
	        
	        System.out.print("Introduce el número de dados: ");
	        int dados = teclado.nextInt();
	        

	        do {
	            System.out.print("Introduce el número de caras (debe ser par): ");
	            caras = teclado.nextInt();

	            if (caras % 2 != 0) {
	                System.out.println("Error: un dado no puede tener un número impar de caras.");
	            }

	        } while (caras % 2 != 0);
	        System.out.println("Resultados de la tirada:");

	        for (int i = 1; i <= dados; i++) {
	            int resultado = (int) (Math.random() * caras) + 1;
	            System.out.println("Dado " + i + ": " + resultado);
	        }

	    teclado.close();

	    
	    }

	
	
	
	
	
	
}