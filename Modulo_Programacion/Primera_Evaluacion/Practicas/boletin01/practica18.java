package Primera_Evaluacion.Practicas.boletin01;


public class practica18 {
	
	 // Ejercicio 18: Escribir un programa que genere números aleatorios entre 1 y 1000 hasta que salga el 666.
	// Debe indicar cuántos números se generaron antes de llegar al 666.

	/*

	1. Usar un bucle while que repita hasta que salga el número 666.
	2. En cada iteración, generar un número aleatorio entre 1 y 1000.
	3. Contar la cantidad de números generados.
	4. Mostrar un mensaje tétrico cuando salga el 666 indicando cuántos intentos hubo.

	*/

	 public static void main(String[] args) {

	        int numero;
	        int contador = 0;
	        
	        do {
	            numero = (int) (Math.random() * 1000) + 1;
	            contador++;
	            System.out.println("Generado: " + numero);

	        } while (numero != 666);
	        System.out.println("¡Faltan " + contador + " días para el apocalipsis!");


	    }
}