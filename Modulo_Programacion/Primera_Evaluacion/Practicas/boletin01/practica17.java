package Primera_Evaluacion.Practicas.boletin01;

public class practica17 {
	
    // Ejercicio 17: Escribir un programa que genere 15 resultados de una quiniela (1, X o 2).
// Si el número aleatorio es 3, se muestra X.



/*
1. Usar un bucle for que se repita 15 veces.
2. Generar un número aleatorio entre 1 y 3.
3. Si el resultado es 3, mostrar "X". Si no, mostrar el número tal cual.

*/

  public static void main(String[] args) {

        System.out.println("Resultados de la quiniela:");


        for (int i = 1; i <= 15; i++) {
            int aleatorio = (int) (Math.random() * 3) + 1;
            String resultado = (aleatorio == 3) ? "X" : String.valueOf(aleatorio);
            System.out.println("Partido " + i + ": " + resultado);

        }

    }
	
  
}