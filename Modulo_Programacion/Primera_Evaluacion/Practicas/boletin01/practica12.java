package Primera_Evaluacion.Practicas.boletin01;

import java.util.Scanner;

public class practica12 {
	
	
	 // Ejercicio 12: Escribir un programa que pida el número de dados y el número de caras, luego muestre la tirada.

	/*
	1. Pedir al usuario cuántos dados quiere tirar.
	2. Pedir también cuántas caras tiene cada dado.
	3. Usar un bucle for para generar los resultados de cada dado.
	4. Mostrar cada número aleatorio por pantalla.
	*/


	 public static void main(String[] args) {

	        Scanner teclado = new Scanner(System.in);

	        System.out.print("Introduce el número de dados: ");
	        int dados = teclado.nextInt();

	        System.out.print("Introduce el número de caras de cada dado: ");
	        int caras = teclado.nextInt();
	        
	        System.out.println("Resultados de la tirada:");


	        for (int i = 1; i <= dados; i++) {
	            int resultado = (int) (Math.random() * caras) + 1;
	            System.out.println("Dado " + i + ": " + resultado);
	        }



	teclado.close();


	    }

	
	
	
	
	
}