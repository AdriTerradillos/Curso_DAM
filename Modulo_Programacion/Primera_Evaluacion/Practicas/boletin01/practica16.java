package Primera_Evaluacion.Practicas.boletin01;


public class practica16 {
	
	
    // Ejercicio 16: Escribir un programa que genere seis números aleatorios entre 1 y 49 (simulando una lotería primitiva).
// No nos preocupamos de que se repitan.

/*
1. Usar un bucle for que se repita 6 veces.
2. En cada repetición generar un número aleatorio entre 1 y 49.
3. Mostrar cada número generado.

*/


public static void main(String[] args) {

        System.out.println("Números de la lotería:");


        for (int i = 1; i <= 6; i++) {
            int numero = (int) (Math.random() * 49) + 1;

            System.out.println("Número " + i + ": " + numero);

        }

        
    }
	
}